package org.example.page;

import org.example.StepDef.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPOM {
    public WebElement loginlink(){return Hook.driver.findElement(By.className("ico-login"));}
    public WebElement emailinput(){return Hook.driver.findElement(By.id("Email"));}
    public WebElement passwordinput(){return Hook.driver.findElement(By.id("Password"));}
    public WebElement submitbutton(){return Hook.driver.findElement(By.className("login-button"));}

    public String getcurrenturl(){return Hook.driver.getCurrentUrl();}
    public WebElement myaccounttab(){return Hook.driver.findElement(By.className("ico-account"));}

 public WebElement errormessage(){return Hook.driver.findElement(By.className("message-error"));}

}
