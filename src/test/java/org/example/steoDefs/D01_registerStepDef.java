package org.example.steoDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register=new P01_register();

    @When("user go to register page")
    public void user_go_to_register_page() {
        register.Register_button_1().click();

    }
    @And("user select gender type")
    public void user_select_gender_type() {
        register.Gender().click();

    }
    @And("user enter first name {string}")
    public void user_enter_first_name(String firstname) {
        register.Firstname().sendKeys(firstname);

    }
    @And("last name {string}")
    public void last_name(String lastname) {
        register.Lastname().sendKeys(lastname);

    }
    @And("user enter date of birth")
    public void user_enter_date_of_birth() {
        Select day=new Select( register.Dateofbirth_Day());
        day.selectByVisibleText("21");
        Select month=new Select(  register.Dateofbirth_Month());
        month.selectByVisibleText("July");
        Select year=new Select(  register.Dateofbirth_Year());
        year.selectByVisibleText("2000");



    }

    @And("user enter email {string} field")
    public void user_enter_email_field(String email) {
        register.Email().sendKeys(email);


    }

    @And("user fills Password fields {string}")
    public void user_fills_password_fields(String password) {
      register.Password_f().sendKeys(password);

    }
    @And("user fills Confirm Password fields {string}")
    public void user_fills_confirm_password_fields(String con_pass) {
       register.Confirm_pass().sendKeys(con_pass);
    }
    @Then("user clicks on register button")
    public void user_clicks_on_register_button() {
        register.Register_button_2().click();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(Hooks.driver.findElement(By.cssSelector("div[class='result']")).getText(),"Your registration completed");
        System.out.println("1 assert pass");
        softAssert.assertAll();
        String RGB= Hooks.driver.findElement(By.cssSelector("div[class='result']")).getCssValue("color");
        System.out.println(RGB);
        String c = Color.fromString(RGB).asHex();
        System.out.println("Hex code for color:" + c);









    }




}
