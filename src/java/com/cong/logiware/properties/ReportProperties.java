/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReportProperties implements com.cong.logiware.properties.Properties {

    static Properties prop = null;

    private static void init() {
        prop = new Properties();
        try {
            prop.load(ReportProperties.class.getResourceAsStream(REPORT_PROPERTIES));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param property
     * @return
     * geeting property from logisoft properties File...
     */
    public static String getProperty(String property) {
        if (prop == null) {
            init();
        }
        return prop.getProperty(property);
    }
}
