package org.example.pages;

import org.example.steoDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
  By loginbtn = By.cssSelector("a[href='/login?returnUrl=%2F']");
  By Email =By.id("Email");
  By password =By.id("Password");
  By login = By.cssSelector("button[class='button-1 login-button']");




    public WebElement login_button_1 (){
        return Hooks.driver.findElement(loginbtn);
    }
    public WebElement Email_field (){
        return Hooks.driver.findElement(Email);
    }
    public WebElement password_field (){
        return Hooks.driver.findElement(password);
    }
    public WebElement login_button_2 (){
        return Hooks.driver.findElement(login);
    }

}
