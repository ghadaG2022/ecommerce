package org.example.page;

import org.example.StepDef.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class hoverPOM {
    Actions action = new Actions(Hook.driver);
    public void gotocomputerTab() {

        WebElement ele = Hook.driver.findElement(By.cssSelector("div[class=\"header-menu\"] > ul>li >a"));
        action.moveToElement(ele).perform();

}

    public void navigatetohomepage(){
        Hook.driver.get("https://demo.nopcommerce.com/");
    }

public List<WebElement> movetosubcategory(){
    List<WebElement>  subMenu = Hook.driver.findElements(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/ul/li"));
    return subMenu;
}

public WebElement tabname(){return Hook.driver.findElement(By.cssSelector("div[class=\"page-title\"]>h1"));}


}
