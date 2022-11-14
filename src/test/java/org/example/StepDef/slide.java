package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.slidePOM;
import org.testng.asserts.SoftAssert;

public class slide {
    slidePOM x=new slidePOM();
    @Given("user in home page4")
    public void user_inhome(){
        x.navigatetohomepagex();
    }

    @When("click on first slide")
    public void clickslide(){
        x.Firstslide().click();
    }

    @When("click on second slide")
    public void clicksecondslide(){
        x.Firstslide().click();
    }

    @Then("new tab will open")
    public void tabopen(){
        String Actual= x.getcurrenturl();
        String xpected="https://demo.nopcommerce.com/nokia-lumia-1020";
        SoftAssert softAsserts = new SoftAssert();
        softAsserts.assertTrue(Actual.equals(xpected));
        softAsserts.assertAll();
    }

}
