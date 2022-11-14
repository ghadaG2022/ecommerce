package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.LoginPOM;
import org.example.page.RegisterPOM;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class LoginDef {
    LoginPOM LoginPOMObject = new LoginPOM();
    @Given("user go to login page")
    public void user_go_to_login_page(){
        LoginPOMObject.loginlink().click();


    }


    @When("user login with valid email and password and click login button")
    public void user_login_with_valid_email_and_password(){
        LoginPOMObject.emailinput().sendKeys("111@example.com");
        LoginPOMObject.passwordinput().sendKeys("P@ssw0rd");
        LoginPOMObject.submitbutton().click();
    }

    @Then("user should be able to login")
    public void user_can_login() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert softAsserts = new SoftAssert();
        String Actual=LoginPOMObject.getcurrenturl();
        String Expected="https://demo.nopcommerce.com/";
        softAsserts.assertTrue(Actual.contains(Expected));
      softAsserts.assertTrue(LoginPOMObject.myaccounttab().isDisplayed());
        softAsserts.assertAll();
    }
    @When("user login with invalid email and password and click login button")
    public void user_login_with_invalid_email_and_password_and_click_login_button() throws InterruptedException {
        LoginPOMObject.emailinput().sendKeys("s@1.com");
        LoginPOMObject.passwordinput().sendKeys("123456x");
        LoginPOMObject.submitbutton().click();
        Thread.sleep(3000);
    }

    @Then("user should not be able to login")
    public void user_should_not_be_ble_to_login(){

        SoftAssert softAsserts = new SoftAssert();
        String Actual=LoginPOMObject.errormessage().getText();
        String Expected="Login was unsuccessful";
        softAsserts.assertTrue(Actual.contains(Expected));
        String ActualColor=LoginPOMObject.errormessage().getCssValue("color");
        String eColor="rgba(228, 67, 75, 1)";
        softAsserts.assertTrue(ActualColor.contains(eColor));

    }
}
