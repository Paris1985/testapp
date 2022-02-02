package com.toolsqa.common.ui;

import com.toolsqa.common.ui.conf.Driver;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected String url;
    protected WebDriver webDriver;

    public BasePage() {
        webDriver = Driver.getInstance().getWebDriver();
    }

}
