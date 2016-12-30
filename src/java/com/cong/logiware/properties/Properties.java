package com.cong.logiware.properties;

/**
 *
 * @author sunil
 */
public interface Properties {

    String REPORT_PROPERTIES = "/com/cong/logiware/properties/Report.properties";
    String DOMESTIC_PROPERTIES = "/com/cong/logiware/properties/Domestic.properties";
    String LOGIWARE_PROPERTIES = "/com/cong/logiware/properties/LogiwareResource.properties";
    String QUERY_PROPERTIES = "/com/cong/logiware/properties/Query.properties";
    String EMAIL_PROPERTIES = "/com/cong/logiware/properties/Email.properties";
    String IMS_PROPERTIES = "/com/cong/logiware/properties/IMS.properties";
    String QUOTATION_REPORT_FOLDER = "/lclQuotation/";
    String BOOKING_REPORT_FOLDER = "/lclBooking/";
    String BL_REPORT_FOLDER = "/lclBl/";
    String PROFILE_CODE = LogiwareProperties.getProperty("app.profile.code");
    String FILE_PROPERTIES = "/com/cong/logiware/properties/File.properties";
    String XENONFS_PROPERTIES = "/com/cong/logiware/properties/XenonFS.properties";
}
