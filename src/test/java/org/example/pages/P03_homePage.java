package org.example.pages;

import org.example.steoDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_homePage {

    By Search_field =By.id("small-searchterms");
    By Search_btn = By.cssSelector("button[class='button-1 search-box-button']");
    By Facebook_btn=By.cssSelector("a[href='http://www.facebook.com/nopCommerce']");

    By twitter_btn=By.cssSelector("a[href='https://twitter.com/nopCommerce']");

    By third_icon=By.cssSelector("a[href='/news/rss/1']");
    By youtube_btn=By.cssSelector("a[href='http://www.youtube.com/user/nopCommerce']");




    public WebElement Search (){return Hooks.driver.findElement(Search_field);}
    public WebElement Search_button (){
        return Hooks.driver.findElement(Search_btn);
    }
    public WebElement Facebook (){
        return Hooks.driver.findElement(Facebook_btn);
    }
    public WebElement Twitter (){
        return Hooks.driver.findElement(twitter_btn);
    }
    public WebElement Third(){return Hooks.driver.findElement(third_icon);

    }
    public WebElement YoutubeI (){return Hooks.driver.findElement(youtube_btn);

    }


}
