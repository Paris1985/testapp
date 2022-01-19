package com.toolsqa.common;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected String url;
    protected WebDriver webDriver;

    public BasePage() {
        webDriver = Driver.getInstance().getWebDriver();
    }

}
