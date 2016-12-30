package com.cong.logiware.properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DomesticProperties implements com.cong.logiware.properties.Properties {

    private static Properties prop = null;
   
    
    private static void init() {
        prop = new Properties();
        try {
            prop.load(DomesticProperties.class.getResourceAsStream(DOMESTIC_PROPERTIES));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param property
     * @return
     * Getting property from Email properties File...
     */
    public static String getProperty(String property) {
        if (prop == null) {
            init();
        }
        return prop.getProperty(property);
    }
}
