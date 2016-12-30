/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author sankar
 */
public class FileProperties implements com.cong.logiware.properties.Properties {

    private static Properties properties = null;
    public static final String FILE_PATH = "file.path";
    public static final String FILE_DIRECTORY = "file.directory";

    private static void init() {
        properties = new Properties();
        try {
            properties.load(FileProperties.class.getResourceAsStream(FILE_PROPERTIES));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getProperty(String property) {
        if (properties == null) {
            init();
        }
        return properties.getProperty(property);
    }

    public static String getPath() {
        return getProperty(FILE_PATH);
    }

    public static String getDirectory() {
        return getProperty(FILE_DIRECTORY);
    }
}
