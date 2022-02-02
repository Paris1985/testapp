package com.toolsqa.pages;

import com.toolsqa.common.ui.BasePage;


import com.toolsqa.common.util.PageWait;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import java.time.Duration;


public class LoginPage extends BasePage {

    private String logoutXpath = "//*[@id=\"post-8\"]/div/div/nav/ul/li[6]/a";

    public LoginPage() {
        url = "https://shop.demoqa.com/my-account/";
    }

    public void login(String username, String password) {
        WebElement usernameTxt = webDriver.findElement(By.id("username"));
        usernameTxt.sendKeys(username);
        WebElement passwordTxt = webDriver.findElement(By.id("password"));
        passwordTxt.sendKeys(password);
        WebElement submitBtn = webDriver.findElement(By.name("login"));
        submitBtn.click();
    }

    public String getLoginConfirmation() {
        WebElement webElement = PageWait.getInstance().waitForElementExist(By.xpath(logoutXpath),
                Duration.ofSeconds(20));
        return webElement.getText();
    }

    public String getLoginConfirmation1() {

        WebElement webElement = PageWait.getInstance().waitForElementExist(By.xpath(logoutXpath),
                Duration.ofSeconds(20),
                Duration.ofSeconds(5),
                NoSuchElementException.class);
        return webElement.getText();
    }
}
