package org.example.page;

import org.example.StepDef.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPom {
    public void navigatetohomepagex(){
        Hook.driver.get("https://demo.nopcommerce.com/");
    }
    public WebElement searchinput(){return Hook.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));}
    public WebElement submit(){return Hook.driver.findElement(By.cssSelector("form[id=\"small-search-box-form\"]>button"));}
    public String url(){return Hook.driver.getCurrentUrl();}
    public List<WebElement> products(){return Hook.driver.findElements(By.cssSelector("h2[class=\"product-title\"]>a"));}
    public WebElement product(){return Hook.driver.findElement(By.cssSelector("h2[class=\"product-title\"]>a"));}
    public WebElement sku(){return Hook.driver.findElement(By.cssSelector("div[class=sku]>span:nth-child(2)"));}
}
