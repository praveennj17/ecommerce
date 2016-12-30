package com.cong.logiware.properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class IMSProperties implements com.cong.logiware.properties.Properties {

    private static Properties prop = null;
    public static final String IMS_USER = "ims.user";
    public static final String IMS_PASSWORD = "ims.password";
    public static final String IMS_CLIENT_KEY = "ims.clientKey";
    public static final String IMS_PRIVATE_KEY = "ims.privateKey";
    
    private static void init() {
        prop = new Properties();
        try {
            prop.load(IMSProperties.class.getResourceAsStream(IMS_PROPERTIES));
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
