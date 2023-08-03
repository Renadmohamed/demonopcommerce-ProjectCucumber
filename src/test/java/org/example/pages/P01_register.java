package org.example.pages;
import org.example.steoDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    // Register button

    By Register_btn = By.cssSelector("a[href='/register?returnUrl=%2F']");

    //Your Personal Details
    By Gender_field =By.cssSelector("label[for='gender-female']");
    By Firstname_field= By.id("FirstName");
    By Lastname_field= By.id("LastName");
    By Dateofbirth_Day_field= By.cssSelector("select[name='DateOfBirthDay']");
    By Dateofbirth_Month_field= By.cssSelector("select[name='DateOfBirthMonth']");
    By Dateofbirth_Year_field= By.cssSelector("select[name='DateOfBirthYear']");
    By Email_field= By.cssSelector("input[id='Email']");

    //Company Details
    By Company_name_field= By.id("Company");

    //Options
    By Newsletter_check= By.id("Newsletter");

    //Your Password
    By Password_field= By.cssSelector("input[id='Password']");
    By Confirm_passwordfield= By.cssSelector("input[id='ConfirmPassword']");
    // Register button to go to homepage
    By Register_button= By.id("register-button");



    public WebElement Register_button_1 (){
        return Hooks.driver.findElement(Register_btn);
    }
    public WebElement Gender (){
        return Hooks.driver.findElement(Gender_field);
    }
    public WebElement Firstname (){
        return Hooks.driver.findElement(Firstname_field);
    }
    public WebElement Lastname (){
        return Hooks.driver.findElement(Lastname_field);
    }
    public WebElement Dateofbirth_Day (){
        return Hooks.driver.findElement(Dateofbirth_Day_field);
    }   public WebElement Dateofbirth_Month (){
        return Hooks.driver.findElement(Dateofbirth_Month_field);
    }   public WebElement Dateofbirth_Year(){
        return Hooks.driver.findElement(Dateofbirth_Year_field);
    }   public WebElement Email (){
        return Hooks.driver.findElement(Email_field);
    }   public WebElement Company_name (){
        return Hooks.driver.findElement(Company_name_field);
    }   public WebElement Newsletter (){
        return Hooks.driver.findElement(Newsletter_check);
    }   public WebElement Password_f(){
        return Hooks.driver.findElement(Password_field);
    }   public WebElement Confirm_pass (){
        return Hooks.driver.findElement(Confirm_passwordfield);
    }   public WebElement Register_button_2 (){
        return Hooks.driver.findElement(Register_button);
    }



}
