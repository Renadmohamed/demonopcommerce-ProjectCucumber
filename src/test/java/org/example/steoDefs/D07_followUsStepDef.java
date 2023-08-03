package org.example.steoDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage p03HomePage = new P03_homePage();

    private String  mainWindow;
    SoftAssert softAssert =new SoftAssert();

    @Given("user in the homePage")
    public void userInTheHomePage() {
        mainWindow=Hooks.driver.getWindowHandle();
    }

    @When("user click on facebook link")
    public void user_opens_facebook_link() {
        p03HomePage.Facebook().click();

    }
    @Then("Facebook link is opened in new tab {string}")
    public void isOpenedInNewTab(String ExpectedUrl) {
        ArrayList<String> windowHandles = new ArrayList <> (Hooks.driver.getWindowHandles());
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println(windowHandles.size());
        for(String windowHandle:windowHandles ) {
            if (!windowHandle.equals(mainWindow))
            {
                Hooks.driver.switchTo().window(windowHandles.get(1));
                break;
            }
        }
        Assert.assertEquals(ExpectedUrl,Hooks.driver.getCurrentUrl());

    }


    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        p03HomePage.Twitter().click();



    }

    @Then("Twitter link is opened in new tab {string}")
    public void twitterLinkIsOpenedInNewTab(String ExpectedUrl) {

        ArrayList<String> windowHandles = new ArrayList <> (Hooks.driver.getWindowHandles());
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println(windowHandles.size());
        for(String windowHandle:windowHandles ) {
            if (!windowHandle.equals(mainWindow))
            {
                Hooks.driver.switchTo().window(windowHandles.get(1));

                break;
            }
        }
        Assert.assertEquals(ExpectedUrl,Hooks.driver.getCurrentUrl());

    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        p03HomePage.Third().click();
    }

    @Then("RSS link is opened in new tab{string}")
    public void rssLinkIsOpenedInNewTab(String ExpectedUrl) {
        ArrayList<String> windowHandles = new ArrayList <> (Hooks.driver.getWindowHandles());
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println(windowHandles.size());
        for(String windowHandle:windowHandles ) {
            if (!windowHandle.equals(mainWindow))
            {
                Hooks.driver.switchTo().window(windowHandles.get(1));
                break;
            }
        }
        Assert.assertEquals(ExpectedUrl,Hooks.driver.getCurrentUrl());



    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        p03HomePage.YoutubeI().click();
    }

    @Then("Youtube link is opened in new tab {string}")
    public void youtubeLinkIsOpenedInNewTab(String ExpectedUrl) {
        ArrayList<String> windowHandles = new ArrayList <> (Hooks.driver.getWindowHandles());
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println(windowHandles.size());
        for(String windowHandle:windowHandles ) {
            if (!windowHandle.equals(mainWindow))
            {
                Hooks.driver.switchTo().window(windowHandles.get(1));
                break;

            }
        }
        Assert.assertEquals(ExpectedUrl,Hooks.driver.getCurrentUrl());
    }



    @Then("Facebook link is opened in new tab {string} user back to home page and open twitter {string}")
    public void facebookLinkIsOpenedInNewTabUserBackToHomePageAndOpenTwitter(String facebooklink, String twitterlink) {
        p03HomePage.Facebook().click();
        ArrayList<String> windowHandles = new ArrayList <> (Hooks.driver.getWindowHandles());
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        if (!Hooks.driver.getWindowHandle().equals(mainWindow))
            // Hooks.driver.switchTo().window(windowHandles.get(0));
            Hooks.driver.navigate().back();
        p03HomePage.Twitter().click();
        System.out.println(windowHandles.size());


    }



}
