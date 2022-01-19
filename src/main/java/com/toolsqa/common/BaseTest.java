package com.toolsqa.common;

import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver webDriver;

    public BaseTest() {
        webDriver = Driver.getInstance().getWebDriver();
    }

    public void  close() {
        if( webDriver != null ) {
            webDriver.quit();
        }
    }

    public void setUrl(String url) {
        if( webDriver != null ) {
            webDriver.get(url);
        }
    }
}
