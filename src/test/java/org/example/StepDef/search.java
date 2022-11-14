package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.SearchPom;
import org.testng.asserts.SoftAssert;

public class search {
    SearchPom xx=new SearchPom();
    @When("^insert product \"([^\"]*)\" insearch$")
    public void navigate_to_page(String page) throws Throwable
    {
           xx.searchinput().sendKeys(page);
           xx.submit().click();
    }
    @Then("^url contains \"([^\"]*)\" after submit$")
      public void checkurl(String page){
     String currenturl=xx.url();
     String Expected =page ;
        SoftAssert softAsserts = new SoftAssert();
        softAsserts.assertTrue(currenturl.contains(Expected));
        softAsserts.assertAll();

    }

    @Then("all products contain \"([^\"]*)\"$")
     public void checkproductname(String page)
    {
        int count =xx.products().size();
        for(int i=0;i<count;i++){
            String text=xx.products().get(i).getText().toLowerCase();
            SoftAssert softAsserts = new SoftAssert();
            softAsserts.assertTrue(text.contains(page));
            softAsserts.assertAll();

        }



    }
    @When("^insert productsku \"([^\"]*)\" insearch$")
    public void searchbysku(String page){
        xx.searchinput().sendKeys(page);
        xx.submit().click();


    }

    @When("click link")
            public void click() throws InterruptedException {
        xx.product().click();

    }

    @Then("product contains in description \"([^\"]*)\"$")
    public void xx2(String page){
        String sku=xx.sku().getText();
        System.out.println(sku);
        SoftAssert softAsserts = new SoftAssert();
        softAsserts.assertTrue(sku.equals(page));
        softAsserts.assertAll();

    }



}
