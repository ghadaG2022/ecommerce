package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.wishlistPOM;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class wishlist {
    wishlistPOM obj4=new wishlistPOM();
    @Given("user in home page3")
    public void go_homepage(){
        obj4.navigatetohomepagex();

    }

    @When("user click add to wishlist")
    public void addtowishlist() throws InterruptedException {
        Thread.sleep(1000);
        obj4.wishlisticon().click();


    }
    @Then("sucsmessage should be showing")
    public void showsucess(){
       WebElement sucessmessage=obj4.sucessM();
        SoftAssert softAsserts = new SoftAssert();
        softAsserts.assertTrue(sucessmessage.isDisplayed());
        String ExpectedColor = "rgba(75, 176, 122, 1)";
        String Actual=sucessmessage.getCssValue("background-color");
        System.out.println(Actual);
        //softAsserts.assertTrue(Actual.equals(ExpectedColor));
        softAsserts.assertAll();
    }

    @Then("quantity bigger than zero")
    public void biggerzero(){
     obj4.close().click();
     obj4.whishlistlink().click();
     String quantity=obj4.quantity().getAttribute("value");
        int q=Integer.parseInt(quantity);
        SoftAssert softAsserts = new SoftAssert();
        softAsserts.assertTrue(q>0);
        softAsserts.assertAll();





    }
}
