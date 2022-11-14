package org.example.page;

import org.example.StepDef.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CuurenciesPOM {
    public void navigatetohomepage(){
        Hook.driver.get("https://demo.nopcommerce.com/");
    }

    public WebElement currencydropdown(){return Hook.driver.findElement(By.id("customerCurrency"));}
    public List<WebElement> prices(){return Hook.driver.findElements(By.className("actual-price"));}
}
