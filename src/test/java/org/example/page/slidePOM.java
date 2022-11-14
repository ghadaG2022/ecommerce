package org.example.page;

import org.example.StepDef.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class slidePOM {
    public void navigatetohomepagex(){
        Hook.driver.get("https://demo.nopcommerce.com/");
    }
    public WebElement Firstslide()
    {
        WebDriverWait firstResult = new WebDriverWait(Hook.driver, Duration.ofSeconds(10));
        firstResult.until(ExpectedConditions.attributeToBe(By.cssSelector("div[class=\"nivoSlider\"]>a:nth-child(1)"),"display","block"));
        return Hook.driver.findElement(By.cssSelector("div[class=\"nivoSlider\"]>a:nth-child(1)"));

    }
    public WebElement Secondslide()
    {
        WebDriverWait firstResult = new WebDriverWait(Hook.driver, Duration.ofSeconds(10));
        firstResult.until(ExpectedConditions.attributeToBe(By.cssSelector("div[class=\"nivoSlider\"]>a:nth-child(2)"),"display","block"));
        return Hook.driver.findElement(By.cssSelector("div[class=\"nivoSlider\"]>a:nth-child(2)"));

    }
    public String getcurrenturl(){
        ArrayList<String> tabs = new ArrayList<>(Hook.driver.getWindowHandles());
        if (tabs.size()==2) {
            Hook.driver.switchTo().window(tabs.get(1));
            return Hook.driver.getCurrentUrl();
        }
        else {
            return Hook.driver.getCurrentUrl();
        }

    }


}
