package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.hoverPOM;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class hover {
    hoverPOM hoverPOMObject=new hoverPOM();
    String subMenuText;

@Given("user in home page")
    public void useer_in_home_page(){
    hoverPOMObject.navigatetohomepage();
}

@When("user hover to computer")
    public void hover_computer() throws InterruptedException {
    hoverPOMObject.gotocomputerTab();
    Thread.sleep(3000);
}

@When("user select Desktops")
    public void select_desktop(){

    List<WebElement>subMenu=hoverPOMObject.movetosubcategory();
    int count = subMenu.size();
    int min = 0;
    int max = count-1;
    int selectedSubCategory =  (int)Math.floor(Math.random()*(max-min+1)+min);
    subMenuText =subMenu.get(selectedSubCategory ).getText();
    subMenu.get(selectedSubCategory ).click();

}

@Then("user should go to desktop page")
    public void gotocorrectpage() throws InterruptedException {
    Thread.sleep(3000);
    SoftAssert softAsserts = new SoftAssert();
    String Actual=hoverPOMObject.tabname().getText();
    softAsserts.assertTrue(Actual.equals(subMenuText));


}

}
