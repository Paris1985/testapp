package com.toolsqa.common;

import java.util.Properties;

public class PropertyUtil {
    private Properties prop = new Properties();
    public PropertyUtil() {
        try {
            prop.load(this.getClass().getResourceAsStream("/environment.properties"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public String getProperty(String key) {
       return prop.getProperty(key);
    }
}
