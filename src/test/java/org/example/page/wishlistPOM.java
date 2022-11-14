package org.example.page;

import io.netty.handler.timeout.ReadTimeoutException;
import org.example.StepDef.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class wishlistPOM {
    public WebElement sucessM(){
        WebElement firstResult = new WebDriverWait(Hook.driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.className("success")));
        return firstResult;
    }

    public void navigatetohomepagex(){
        Hook.driver.get("https://demo.nopcommerce.com/");
    }
    public WebElement wishlisticon() throws InterruptedException {
       WebElement product=Hook.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
       return product;

    }
    public WebElement close(){
        WebElement close= new WebDriverWait(Hook.driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class=\"close\"]")));
        return close;
    }


        public WebElement whishlistlink() {return Hook.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));}
    public WebElement quantity() {return Hook.driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));}

}
