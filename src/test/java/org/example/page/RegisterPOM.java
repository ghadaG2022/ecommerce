package org.example.page;

import org.example.StepDef.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPOM {
    public WebElement registerlink()
    {
        return Hook.driver.findElement(By.className("ico-register"));
    }
    public WebElement selectgendermale(){return Hook.driver.findElement(By.cssSelector("span[class=\"male\"]"));}
    public WebElement firstnamefield(){return Hook.driver.findElement(By.id("FirstName"));}
    public WebElement lastnamefield(){return Hook.driver.findElement(By.id("LastName"));}
    public WebElement daydropdown(){return Hook.driver.findElement(By.name("DateOfBirthDay"));}
    public WebElement Monthdropdown(){return Hook.driver.findElement(By.name("DateOfBirthMonth"));}
    public WebElement Yeardropdown(){return Hook.driver.findElement(By.name("DateOfBirthYear"));}
    public WebElement emailfield(){return Hook.driver.findElement(By.id("Email"));}

    public WebElement passwordfield(){return Hook.driver.findElement(By.id("Password"));}
    public WebElement confirmpasswordfield(){return Hook.driver.findElement(By.id("ConfirmPassword"));}
    public WebElement submitbutton(){return Hook.driver.findElement(By.id("register-button"));}
    public WebElement sucessmessage(){return Hook.driver.findElement(By.className("result"));}

}

