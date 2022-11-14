package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.CuurenciesPOM;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class curriency {
    CuurenciesPOM CuurenciesPOMobject=new CuurenciesPOM();
    @Given("user go to home page")
    public void user_go_to_home_page(){
        CuurenciesPOMobject.navigatetohomepage();
    }

    @When("user select euro")
    public void user_select_euro(){
        Select currencydropdown1 = new Select(CuurenciesPOMobject.currencydropdown());
        currencydropdown1.selectByIndex(1);
    }

    @Then("4 products in euro will be displayed")
    public void euro_products_displayed(){



        for (int i=0; i<CuurenciesPOMobject.prices().size();i++){
            SoftAssert softAsserts = new SoftAssert();
            String Actual=CuurenciesPOMobject.prices().get(i).getText();
            String Expected="€";
            softAsserts.assertTrue(Actual.contains(Expected));
        }
    }
}
