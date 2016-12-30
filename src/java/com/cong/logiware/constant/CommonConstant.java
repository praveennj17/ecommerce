package com.cong.logiware.constant;

/**
 *
 * @author shanmugam
 */
public interface CommonConstant extends SpecialCharacterConstant{

    String SUCCESS = "success";
    String FAILURE = "failure";
    String NOERROR = "noerror";
    String DISPLAY = "display";
    String EDIT = "edit";
    String EMPTY = "";
    String SPACE = " ";
    String RECALCULATE = "Recalculate";
    String ITEM = "Add Item";
    String PRODUCT = "Add Product";
    String SAVE = "save";
    String SYNC = "sync";
    String SAVE_CCI_TO_ADD_ITEMS = "Save CCI to add items";
    String COPY="Copy";
    String REPORT_TYPE="reportType";
    String FCL = "Fcl";
    String LCL = "Lcl";
    String Y = "Y";
    String N = "N";
    String ON = "ON";
    String S_ON = "on";
    String S_OFF = "off";
    String ADDRESS = "AddrL1";
    String CITY = "City";
    String STATE = "State";
    String PHONE = "Phone";
    String FAX = "Fax";
    String COMPANY_NAME = "CompanyName";
    String TRUE = "true";
    String FALSE = "false";
    String YES = "YES";
    String NO = "NO";
    String BOTH = "BOTH";
    String S_YES = "yes";
    String S_NO = "no";
    String S_BOTH = "both";
    String S_HOUSE = "house";
    String S_MASTER = "master";
    String FORMAT_1 = "FORMAT 1";
    String FORMAT_2 = "FORMAT 2";
    String PENDING = "pending";
    String COMPLETED = "completed";
    String EDIPROPERTIES = "/com/gp/cong/struts/edi.properties";
    String CLEAR = "clear";
    String SEARCH = "search";
    String DELETE = "delete";
    String UPDATE = "update";
    String ADD = "add";
    String FILE_SYNCED = "File Synced";
    String ROLE_NAME_SALES = "SALES";
    String ROLE_NAME_ADMIN = "ADMIN";
    String ROLE_NAME_SUPERVISOR = "SUPERVISOR";
    String ROLE_NAME_CUSTOMER = "CUSTOMER";
    String TRAINING = "training";
    String T = "T";
    String DOWNLOAD = "download";
    String PREVIEW = "preview";
    
    enum FREIGHT_TYPE {
        FCL,LCL,AIR
    }
}
