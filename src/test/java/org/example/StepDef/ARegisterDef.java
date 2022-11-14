package org.example.StepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.RegisterPOM;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class ARegisterDef {
    RegisterPOM RegisterPOMObject = new RegisterPOM();

    @Given("user go to register page")
    public void goRegisterPage() {
        System.out.println("This is a test before start coding");
        RegisterPOMObject.registerlink().click();
    }


    @When("user select gender type")
    public void user_select_gender_type() {
        RegisterPOMObject.selectgendermale().click();

    }

    @When("user enter first name \"automation\" and last name \"tester")
    public void user_enter_first_last_name() {
        RegisterPOMObject.firstnamefield().sendKeys("automation");
        RegisterPOMObject.lastnamefield().sendKeys("tester");

    }

    @When("user enter date of birth")
    public void user_enter_date_of_birth() {
        Select daydropdown = new Select(RegisterPOMObject.daydropdown());
        daydropdown.selectByIndex(1);
        Select monthdropdown = new Select(RegisterPOMObject.Monthdropdown());
        monthdropdown.selectByIndex(1);
        Select yeardropdown = new Select(RegisterPOMObject.Yeardropdown());
        yeardropdown.selectByIndex(1);

    }

    @When("user enter email \"test@example.com\" field")
    public void user_enter_email_field() {
        RegisterPOMObject.emailfield().sendKeys("1111@example.com");

    }

    @When("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void user_enter_passwords() {
        RegisterPOMObject.passwordfield().sendKeys("P@ssw0rd");
        RegisterPOMObject.confirmpasswordfield().sendKeys("P@ssw0rd");


    }

    @When("user clicks on register button")
    public void user_click_register_button() {
        RegisterPOMObject.submitbutton().click();
    }

    @Then("success message is displayed")
    public void succes_message() {
        SoftAssert softAsserts = new SoftAssert();
        String Expected=RegisterPOMObject.sucessmessage().getText();
        String ActualColor=RegisterPOMObject.sucessmessage().getCssValue("color");
        String ExpectedColor="rgba(76, 177, 124, 1)";
        softAsserts.assertTrue(ActualColor.contains(ExpectedColor));
        String Actual ="Your registration completed";

        softAsserts.assertTrue(Expected.contains(Actual));

        softAsserts.assertAll();

    }

}