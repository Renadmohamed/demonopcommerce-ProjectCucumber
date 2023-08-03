package org.example.steoDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login p02Login = new P02_login();
    SoftAssert softAssert = new SoftAssert();


    @When("user go to login page")
    public void user_go_to_login_page() {
        p02Login.login_button_1().click();


    }

    @And("user login with email {string}")
    public void user_login_with_valid_email(String email_v) {
        p02Login.Email_field().sendKeys(email_v);

    }

    @And("user login with password {string}")
    public void user_login_with_valid_password(String password_v) {
        p02Login.password_field().sendKeys(password_v);

    }

    @Then("user press on login button")
    public void user_press_on_login_button() {
        p02Login.login_button_2().click();
        //happy scenrio and user login
        String url = Hooks.driver.getCurrentUrl();
        if (url.equals("https://demo.nopcommerce.com/")) {
            WebElement tabElement = Hooks.driver.findElement(By.cssSelector("a[class='ico-account']"));
            softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
            System.out.println(Hooks.driver.getCurrentUrl());
            softAssert.assertTrue(tabElement.isDisplayed(), "The 'My account' tab is not visible");
            // to make sure it pass
            boolean displayed = tabElement.isDisplayed();
            if (displayed) {
                System.out.println("PASS");
            }

        } else {
            String text = "Login was unsuccessful";
            String error_message = Hooks.driver.findElement(By.cssSelector("div[class='message-error validation-summary-errors']")).getText();
            softAssert.assertTrue(error_message.contains(text));
            System.out.println(Hooks.driver.getCurrentUrl());
            String RGB = Hooks.driver.findElement(By.cssSelector("div[class='message-error validation-summary-errors']")).getCssValue("color");
            System.out.println(RGB);
            String c = Color.fromString(RGB).asHex();
            System.out.println("Hex code for color:" + c);


        }
        softAssert.assertAll();

    }
}

