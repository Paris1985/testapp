package com.toolsqa.common.util;

import java.util.Properties;

public class PropertyUtil {
    private Properties prop = new Properties();
    public PropertyUtil() {
        try {
            prop.load(this.getClass().getResourceAsStream("/properties/env/environment.properties"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public String getProperty(String key) {
       return prop.getProperty(key);
    }
}
