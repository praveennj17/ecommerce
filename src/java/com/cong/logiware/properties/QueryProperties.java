package com.cong.logiware.properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Query properties to pass the property and value for query.
 * @author sunil
 */
public class QueryProperties implements com.cong.logiware.properties.Properties {

    static Properties prop = null;

    private static void init() {
        prop = new Properties();
        try {
            prop.load(QueryProperties.class.getResourceAsStream(QUERY_PROPERTIES));
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

    /**
     * @param property
     * @return
     * geeting property from logisoft properties File...
     */
    public static String getQuery(String property) {
        if (prop == null) {
            init();
        }
        return prop.getProperty(property);
    }

    /**
     * Get the Query by property.
     * @param property - property name
     * @param params - runtime values for properties file. ex:  ${0}, ${1} etc
     * @return
     */
    public static String getQuery(String property, String ... params) {
        if (prop == null) {
            init();
        }        
        String query = prop.getProperty(property);
        for (int i = 0; i < params.length; i++) {
            String key = "\\{" + i + "\\}";
            String value = params[i];
            query = query.replaceAll(key, value);
        }
        return query;
    }

    public static void main(String[] args) {
        System.out.println(getQuery("FCL_FILE_NUMBER", new String[]{"123"}));
    }
}
