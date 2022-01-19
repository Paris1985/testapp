package com.toolsqa.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.IOException;
import java.util.Properties;

public class WebDriverFactory {

    enum DriverEnum{
        FIREFOX, CHROME, MSEDGE, IE
    }
    public static WebDriver getDriver(DriverEnum driver){
        WebDriver webDriver = null;
        switch (driver){
            case FIREFOX:
                break;
            case CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                webDriver = new ChromeDriver(chromeOptions);
                break;
            case IE:
                break;
            case MSEDGE:
            default:
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("start-maximized");
                webDriver = new EdgeDriver(edgeOptions);
                break;
        }

        return webDriver;
    }
}
