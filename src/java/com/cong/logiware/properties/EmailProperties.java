package com.cong.logiware.properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EmailProperties implements com.cong.logiware.properties.Properties {

    private static Properties prop = null;
    public static final String GMAIL_SMTP_HOST = "gmail.smtp.host";
    public static final String GMAIL_SMTP_PORT = "gmail.smtp.port";
    public static final String NOTIFICATION_MAIL_FROM = "notification.mail.from";
    public static final String NOTIFICATION_MAIL_PWD = "notification.mail.password";
    public static final String ALTERNATE_MAIL_FROM = "alternate.mail.from";
    public static final String ALTERNATE_MAIL_PWD = "alternate.mail.password";
    public static final String REPORT_MAIL_FROM = "report.mail.from";
    public static final String REPORT_MAIL_PWD = "report.mail.password";
    public static final String YAHOO_SMTP_HOST = "yahoo.smtp.host";
    public static final String YAHOO_SMTP_PORT = "yahoo.smtp.port";
    public static final String ALERT_MAIL_FROM = "alert.mail.from";
    public static final String ALERT_MAIL_PWD = "alert.mail.password";
    
    private static void init() {
        prop = new Properties();
        try {
            prop.load(EmailProperties.class.getResourceAsStream(EMAIL_PROPERTIES));
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
