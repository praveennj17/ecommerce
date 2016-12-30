/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.properties;

import java.io.IOException;

/**
 *
 * @author Prakash S
 */
public class XenonFSProperties implements com.cong.logiware.properties.Properties {

    private static java.util.Properties properties = null;
    public static final String XENONFS_URL = "xenonfs.url";
    public static final String XENONFS_USER_NAME = "xenonfs.username";
    public static final String XENONFS_PASSWORD = "xenonfs.password";
    public static final String XENONFS_TRACE = "xenonfs.trace";

    private static void init() {
        properties = new java.util.Properties();
        try {
            properties.load(XenonFSProperties.class.getResourceAsStream(XENONFS_PROPERTIES));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param property
     * @return Getting property from XenonFS Properties File...
     */
    public static String getProperty(String property) {
        if (properties == null) {
            init();
        }
        return properties.getProperty(property);
    }

}
