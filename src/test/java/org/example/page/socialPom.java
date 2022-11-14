package org.example.page;

import org.example.StepDef.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class socialPom {
    public void navigatetohomepagex(){
        Hook.driver.get("https://demo.nopcommerce.com/");
    }
    public WebElement fbsocialicon() {return Hook.driver.findElement(By.linkText("Facebook"));}
    public WebElement twittersocialicon(){return Hook.driver.findElement(By.linkText("Twitter"));}
    public WebElement rsssocialicon(){return Hook.driver.findElement(By.linkText("RSS"));}
    public WebElement youtubeocialicon(){return Hook.driver.findElement(By.linkText("YouTube"));}
    public String getcurrenturl(){
        WebDriverWait wait = new WebDriverWait(Hook.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
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
