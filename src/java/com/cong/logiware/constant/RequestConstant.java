/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.constant;

/**
 *
 * @author sunil
 */
public interface RequestConstant {
    //prompt
    String INFO = "info";
    String ERROR = "error";
    String ERRORS = "errors";
    String MESSAGE = "message";
    String FATAL = "fatal";
    String ALERT = "alert";
    String SCRIPT = "script";
    //tags
    String COLUMN = "column";
    String COLUMNS = "columns";
    String TABLE = "table";
    String QUERY = "query";
    // pages
    String RELOAD_PARENT_WITH_URL = "reloadParentWithURL";
    String REFRESH_PARENT = "refreshParent";
    String DISABLE_PAGE = "disablePage";
    String REFRESH = "refresh";
    String REFRESH_BL_Type = "refreshBLType";
    
    String USER_NAME = "userName";
    String PASSWORD = "password";
    String ITEM_ID = "itemId";
    String EMAIL_PAGE = "emailPage";
    String BULK_EMAIL_PAGE = "bulkemailPage";
    String PRINT_PAGE = "printPage";
    String EMAIL_TO_TP = "emailToTp";
    // FCL
    String FCL_QUOTATION_CHARGE_ID = "fcl_quotation_charge_id";
    String FCL_BOOKING_CHARGE_ID = "fcl_booking_charge_id";
    String FCL_BL_CHARGE_ID = "fcl_bl_charge_id";
    String FCL_BL_CONTAINER_ID = "fcl_bl_container_id";

    // LCL
    String LCL_QUOTATION_CHARGE_ID = "lcl_quotation_charge_id";
    String LCL_BOOKING_CHARGE_ID = "lcl_booking_charge_id";
    String LCL_BL_CHARGE_ID = "lcl_bl_charge_id";

    // AIR
    String AIR_QUOTATION_CHARGE_ID = "air_quotation_charge_id";
    String AIR_BOOKING_CHARGE_ID = "air_booking_charge_id";
    String AIR_BL_CHARGE_ID = "air_bl_charge_id";

    //SALES ORDER
    String SALES_ORDER_CHARGE_ID = "sales_order_charge_id";

    String HAZMAT_ID = "hazmat_id";
    String HTS_ID = "hts_id";
    String AES_ITN_ID = "aes_itn_id";
    String SCHEDULEB_ID = "scheduleb_id";
    String COMMERCIAL_INVOICE_ID = "commercial_invoice_id";
    String OUT_OF_GAUGE_ID = "outofgauge_id";
    String ID = "id";

    String FILE_NUMBER = "fileNumber";
    String MODULE = "module";
    String SUB_MODULE = "subModule";

    //Resources
    String FILE_NUMBER_IN_USE = "filenumber.inuse";
    String COMMODITY = "commodity";
    
    //
    String SEARCH_CRITERIA = "search_criteria";
    String SEARCH_VALUE = "search_value";
}
