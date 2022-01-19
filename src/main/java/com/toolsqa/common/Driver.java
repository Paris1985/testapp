package com.toolsqa.common;

import org.openqa.selenium.WebDriver;


import java.io.IOException;
import java.util.Properties;

public final class Driver {

    private final static Driver browser = new Driver();
    private WebDriver webDriver;

    private Driver(){
        initWebDriver();
    }
    public static Driver getInstance(){
        return browser;
    }
    public WebDriver getWebDriver(){
        return webDriver;
    }
    private void initWebDriver() {
        Properties prop = new Properties();
        try {

            prop.load(this.getClass().getResourceAsStream("/browserconfig.properties"));
            prop.forEach((k, v)->System.setProperty((String) k, (String) v));
            System.setProperty(prop.getProperty("web.driver.prop"), prop.getProperty("web.driver.path"));
            String browser = prop.getProperty("web.driver.browser");
            webDriver = WebDriverFactory.getDriver(WebDriverFactory.DriverEnum.valueOf(browser.toUpperCase()));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
