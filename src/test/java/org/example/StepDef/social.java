package org.example.StepDef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.LoginPOM;
import org.example.page.socialPom;
import org.testng.asserts.SoftAssert;

public class social {
    socialPom Object2 = new socialPom();
    @Given("user in home page2")
    public void user_in_home_page(){
        Object2.navigatetohomepagex();

    }
    @When("user click facebook icon")
    public void click_fb_icon() throws InterruptedException {
        Object2.fbsocialicon().click();


    }

    @Then("new tab with facebook should be opened")
     public void new_tab_for_fb(){
       String Actual= Object2.getcurrenturl();
       String xpected="https://www.facebook.com/nopCommerce";
        SoftAssert softAsserts = new SoftAssert();
        softAsserts.assertTrue(Actual.equals(xpected));
        softAsserts.assertAll();

    }

    @When("user click twitter icon")
    public void click_twitter() throws InterruptedException {
        Object2.twittersocialicon().click();




    }

    @Then("new tab with twitter should be opened")
    public void open_twitter(){
        String Actual= Object2.getcurrenturl();
        String xpected="https://twitter.com/nopCommerce";
        SoftAssert softAsserts = new SoftAssert();
        softAsserts.assertTrue(Actual.equals(xpected));
        softAsserts.assertAll();

    }

    @When("user click rssicon")
    public void click_rss() throws InterruptedException {
        Object2.rsssocialicon().click();

    }

    @Then("new tab with rss shoud be opened")
    public void open_rss(){
        String Actual= Object2.getcurrenturl();
        String xpected="https://demo.nopcommerce.com/new-online-store-is-open";
        SoftAssert softAsserts = new SoftAssert();
        softAsserts.assertTrue(Actual.equals(xpected));
    }

@When("user click youtubeicon")
    public void open_youtube() throws InterruptedException {
    Object2.youtubeocialicon().click();

}
@Then("new tab with youtube should be opened")
    public void youtube_should_be_opened(){
    String Actual= Object2.getcurrenturl();
    String xpected="https://www.youtube.com/user/nopCommerce";
    SoftAssert softAsserts = new SoftAssert();
    softAsserts.assertTrue(Actual.equals(xpected));
    softAsserts.assertAll();
}
}
