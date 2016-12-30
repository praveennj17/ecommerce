package com.cong.logiware.properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LogiwareProperties implements com.cong.logiware.properties.Properties {

    public static final String COMPANY = "app.company";   
    static Properties prop = null;

    private static void init() {
        prop = new Properties();
        try {
            prop.load(LogiwareProperties.class.getResourceAsStream(LOGIWARE_PROPERTIES));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param property
     * @return
     * getting property from logisoft properties File...
     */
    public static String getProperty(String property) {
        if (prop == null) {
            init();
        }
        return prop.getProperty(property);
    }
}
