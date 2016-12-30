package com.cong.logiware.constant;

/**
 *
 * @author shanmugam
 */
public interface CodeTypeConstant {

    int COST_CODE = 36;
    int COMMODITY_CODE = 4;
    int COMMODITY_DESC = 4;
    int STATE = 10;
    int SALES_CODE = 23;
    int TYPE_OF_MOVE = 48;
    int SPECIAL_EQUIPMENT = 41;
    int FREQUENCY_OF_SERVICE = 50;
    int TRANSPORTATION_MODE = 49;
    int CURRENCY = 32;
    int COST_TYPE = 37;
    int VESSEL = 14;
    int BL_CLAUSE = 21;
    int DIVISION = 42;
    int COUNTRY_CODES = 11;
    int PREDEFINE_REMARKS = 108;    
    int D_D_REMARKS = 112;
    int WEIGHT_RANGE = 31;
    //AES
    int AES_LICENSE_CODE = 54;
    int AES_COMMODITY_CODE = 55;
    int AES_EXPORT_CODE = 56;
    int AES_STATE_CODE = 57;
    int AES_UNIT_OF_MEASURE_CODE = 58;
    int EQUIPMENT_TYPE = 59;
    int CLIENT_TYPE = 60;
    int TRANSACTION_STATUS = 61;
    int SUB_LEDGER = 62;
    int TRANSACTION_TYPE = 63;
    int WEIGHT_UNITS = 65;
    int MEASURE_UNITS = 66;
    int SHIPMENT_TYPE = 64;
    int UNIT_TYPE = 38;
    int SERVICE = 53;
    int PACK_COMPOSITION = 67;
    int PACKAGING_TYPE = 68;
    int PACKING_GROUP = 69;
    int BILL_TO_PARTY = 70;
    int IMO_CLASS_CODE = 71;
    int CUSTOMER_ACCOUNT_TYPE = 73;
    int AES_VEHICLE_CODE = 75;
    int INPUT_TYPE = 76;
    int EDI_COMPANY = 78;
    int EDI_MESSAGE_TYPE = 77;
    int AES_TYPE_OF_MOVE = 79;
    int NEWS = 80;
    int MESSAGE_OF_THE_DAY = 81;
    int REGION_CODES = 19;
    //Sales Order
    int STATUS_CODES = 82;
    int PAYMENT_TERMS = 83;
    int INCO_TERMS = 84;
    int PROFILE = 85;
    int PRODUCT = 86;
    int COMMENT_CODES = 39;
    int EDI_CODES = 87;
    int EXPORT_REFERENCE_TYPE = 88;
    int PRINT_REPORT_TITLE = 90;
    int PAYMENT_REMITTANCE_ADDRESS = 94;
    int CUSTOMER_PORTAL_NEWS = 95;
    int CUSTOMER_PORTAL_MESSAGE_OF_THE_DAY = 96;
    int REPORT_DEFAULT_VALUE = 97;
    int FILE_STATUS = 99;
    //Sales Order - PAN
    int PRODUCT_OPTION = 103;
    int PRODUCT_COST_TYPE = 104;
    int SO_PO_CLAUSE = 114;
    //-- End --
    int INVOICE_PAYABLE = 105;
    int AES_CONSIGNEE_TYPE = 113;
    int AES_INBOUND_TYPE = 116;
    int FILE_TYPE=117;
    int FREIGHT_SHIPMENT_TYPE=118;
    int CODE_INFO = 129;
    int NOTES = 28;
    
    /* CodeType get by Code like Case*/
    
    String FUEL_CLAUSE_CODE = "FuelClause";
    String HAZARDOUS_CLAUSE_CODE = "HazClause";
    String BOOKING_CLAUSE_CODE = "BookingClause";
    String D_D_REMARKS_CODE = "D&D Remarks";
    
    /* Key Constant*/
    String FUEL_CLAUSE_KEY = "fuelClause";
    String BOOKING_CLAUSE_KEY = "bookingClause";
    String HAZARDOUS_CLAUSE_KEY = "hazClause";

    String AIR_SERVICE = "Air Service";
    String AIR_FREQUENCY_OF_SERVICE = "Frequency Of Service";
    String AIR_ULD_TYPE = "Air ULD Type";
    String AIR_COST_TYPE = "Air Cost Type";
    String AIR_MARKUP_TYPE = "Air Markup Type";
    String OHBL_STATUS = "OHBL status";
}
