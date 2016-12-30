package com.cong.logiware.constant;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sunil
 */
public interface DomainConstant {

    public static interface TradingPartner {

        String INTTRA = "INTTRA";
        String GTNEXUS = "GTNEXUS";
    }

    public static interface Aes {

        String STATUS_SUBMITTED = "SUBMITTED";
        String STATUS_CANCELLED = "CANCELLED";
        String STATUS_SHIPMEMT_REJECTED = "F R SHIPMENT REJECTED; RESOLVE & RETRANSMIT";
        String STATUS_BLOCK_REJECTED = "F R BLOCK REJECTED; RESOLVE AND RETRANSMIT";
        String STATUS_BATCH_REJECTED = "F R BATCH REJECTED; RESOLVE AND RETRANSMIT";
        String STATUS_SHIPMEMT_CHANGED_VERIFY = "V A SHIPMENT CHANGED; MUST VERIFY";
        String STATUS_SHIPMEMT_CHANGED_WARNING = "W A SHIPMENT CHANGED; MUST CORRECT WARNINGS";
        String STATUS_SHIPMEMT_ADDED_WARNING = "W A SHIPMENT ADDED; MUST CORRECT WARNINGS";
        String STATUS_SHIPMEMT_CHANGED_COMPLIANCE_ALERT = "C A SHIPMENT CHANGED; COMPLIANCE ALERT";
        String STATUS_SHIPMEMT_CHANGED = "A SHIPMENT CHANGED";
        String STATUS_SHIPMEMT_ADDED = "A SHIPMENT ADDED";
        String STATUS_SHIPMEMT_CANCELLED = "A SHIPMENT CANCELLED";
    }

    public static interface BillTo {

        String SHIPPER = "Shipper";
        String FORWARDER = "Forwarder";
        String CONSIGNEE = "Consignee";
        String AGENT = "Agent";
        String THIRD_PARTY = "ThirdParty";
        String NOTIFY_PARTY = "NotifyParty";
        String ANY = "Any";
    }

    public static interface LclBillTo {

        String SHIPPER = "S";
        String FORWARDER = "F";
        String CONSIGNEE = "C";
        String AGENT = "A";
        String THIRD_PARTY = "T";
        String NOTIFY_PARTY = "N";
    }

    public static interface clientType {

        String SHIPPER = "SH";
        String FORWARDER = "FW";
        String CONSIGNEE = "CN";
        String AGENT = "DA";
        String THIRD_PARTY = "TP";
        String NOTIFY_PARTY = "NP";
        String SHIP_TO = "ST";
        String BOOKING_PARTY = "BP";
        String CUSTOM_BROKER = "CB";
        String NOTIFY_PARTY_2 = "NP2";

        String HOUSE_SHIPPER = "HSH";
        String HOUSE_FORWARDER = "HFW";
        String HOUSE_CONSIGNEE = "HCN";
        String HOUSE_AGENT = "HDA";
        String HOUSE_THIRD_PARTY = "HTP";
        String HOUSE_NOTIFY_PARTY = "HNP";
        String HOUSE_SHIP_TO = "HST";
        String HOUSE_CUSTOM_BROKER = "HCB";
        String HOUSE_NOTIFY_PARTY_2 = "HNP2";

        String MASTER_SHIPPER = "MSH";
        String MASTER_FORWARDER = "MFW";
        String MASTER_CONSIGNEE = "MCN";
        String MASTER_AGENT = "MDA";
        String MASTER_THIRD_PARTY = "MTP";
        String MASTER_NOTIFY_PARTY = "MNP";
        String MASTER_SHIP_TO = "MST";
        String MASTER_CUSTOM_BROKER = "MCB";
        String MASTER_NOTIFY_PARTY_2 = "MNP2";

    }

    public static interface PrepaidCollect {

        String PREPAID = "P";
        String COLLECT = "C";
        String BOTH = "Both";
    }

    public static interface Charge {

        String BASIS_LUMP_SUM = "LumpSum";
        String BASIS_PER_CONTAINER = "PerContainer";
        String PREPAID = "P";
    }

    public static interface Menu {

        int FCL = 18;
        int LCL = 2;
        int AIR = 24;
    }

    public static interface BLStatus {

        String MANIFESTED = "manifested";
        String CORRECTED = "corrected";
    }

    public static interface Role {

        String ADMIN = "ADMIN";
        String PUBLIC = "PUBLIC";
    }

    public static interface Module {

        String FCL = "FCL";
        String LCL = "LCL";
        String AIR = "AIR";

        public static interface Section {

            String Quotation = "Quotation";
            String Booking = "Booking";
            String BL = "Bl";
            String SalesOrder = "SalesOrder";
            String PurchaseOrder = "PurchaseOrder";
            String CanadaCustomsInvoice = "CanadaCustomsInvoice";
            String Correction = "Correction";
            String AES = "AES";
        }
    }

    public static interface CostType {

        String FLAT_RATE_PER_CONTAINER = "Flat Rate Per Container";
        String FLAT_RATE_PER_CONTAINER_SIZE = "Flat Rate Per Container Size";
        String PER_CONTAINER = "Per Container";
        String PER_BL = "Per Bl";
    }

    public static interface TypeOfMove {

        String DOOR_TO_DOOR = "DOOR TO DOOR";
        String PORT_TO_PORT = "PORT TO PORT";
        String DOOR_TO_PORT = "DOOR TO PORT";
        String PORT_TO_DOOR = "PORT TO DOOR";
    }

    public static interface Metric {

        String METRIC = "METRIC";
        String IMPERIAL = "IMPERIAL";
        String ENGLISH = "ENGLISH";
    }

    public static interface FileType {

        String EXPORT = "EXPORT";
        String IMPORT = "IMPORT";
        String DOMESTIC = "DOMESTIC";
        String FTF = "FTF";
    }

    public static interface Currency {

        String USD = "USD";
    }

    public static interface BL {

        String ARRIVAL_NOTICE = "Arrival Notice";
        String CARGO_RELEASE = "Cargo Release";
        String CUSTOMS_EXAM_HOLD = "Customs Exam Hold";
        String DELIVERY_ORDER = "Delivery Order";
        String CONSIGNEES_AUTHORITY_TO_MAKE_ENTRY = "Consignees Authority To Make Entry";
        String BILL_OF_LADING = "Bill Of Lading";
        String PRE_ALERT_IMPORT = "Pre Alert Import";

        public static interface Type {

            String BOTH = "BOTH";
            String HOUSE = "HOUSE";
            String MASTER = "MASTER";
        }

        public static class Correction {

            public static Map<String, String> getBlCorrectionCodeMap() {
                Map<String, String> map = new HashMap<>();
                map.put("001", "CHANGE IN BILLING TERMS/PARTY");
                map.put("002", "ADJUST CHARGES - SALES");
                map.put("003", "ADJUST CHARGES - OPERATIONS");
                map.put("004", "ADJUST CHARGES - CUSTOMERS");
                map.put("005", "POST BILLING FEES");
                map.put("006", "WAIVE FEES");
                map.put("007", "CONSOLIDATE BL");
                map.put("008", "VOID PRIOR C/N");
                map.put("009", "DELETE INSURANCE");
                map.put("010", "DELETE STORAGE");
                map.put("011", "CHANGE IN MEASUREMENTS / WEIGHT");
                map.put("012", "VOID A B/L");
                map.put("013", "CONSOLIDATE A B/L");
                map.put("014", "VOID A PRIOR C/N");
                map.put("015", "CHANGE CODES (ACCTG ONLY- DO NOT USE)");
                map.put("016", "CHANGE FOWARDER OR SHIPPER ACCT");
                map.put("017", "MATCH COMPETITOR RATES");
                map.put("018", "ADDING TAXES, COURIER FEES, DELIVERY OUT");
                return map;
            }

            public static Map<String, String> getBlCorrectionTypeMap() {
                Map<String, String> map = new HashMap<>();
                map.put("", "Select Correction Type");
                map.put("A", "Add/Delete/Reduce/Increase charges to the current billed to account");
                map.put("G", "Basic change from prepaid-FF to prepaid-Shipper");
                map.put("M", "Change from prepaid-FF to new prepaid-FF");
                map.put("N", "Change from prepaid-FF to a New prepaid-Shipper");
                map.put("P", "Change from prepaid-FF to a New prepaid-Third Party");
                map.put("U", "Replace Shipper when B/L is not PPD-Shipper (must handle advances)");
                map.put("F", "Basic change from prepaid-Shipper to prepaid-FF  ");
                map.put("J", "Change from prepaid-Shipper to a New prepaid Shipper");
                map.put("K", "Change from prepaid-Shipper to a New prepaid-FF");
                map.put("L", "Change from prepaid-Shipper to a New prepaid-Third Party");
                map.put("T", "Replace FF when B/L is not PPD-FF (must handle Commissions and Due FF)");
                map.put("H", "Basic change from prepaid-Third party to prepaid-FF");
                map.put("I", "Basic change from prepaid-Third party to prepaid-Shipper");
                map.put("V", "Change from prepaid-Third Party to a New Third Party");
                map.put("W", "Change from prepaid-Third Party to a New prepaid-FF");
                map.put("X", "Change from prepaid-Third Party to a New prepaid-Shipper");
                map.put("B", "Basic change from prepaid to collect");
                map.put("C", "Basic change from collect to prepaid-shipper");
                map.put("D", "Basic change from collect to prepaid-FF ");
                map.put("E", "Basic change from collect to prepaid-Third Party");
                map.put("Q", "Change from collect to a New prepaid-Shipper");
                map.put("R", "Change from collect to a New prepaid-FF");
                map.put("S", "Change from collect to a New prepaid-Third Party");
                map.put("Y", "Add Collect charges to a PPD B/L");
                return map;
            }
        }
    }

    public static interface Report {

        public static interface Description {

            String MASTER_BL = "Master BL";
            String MASTER_EXPRESS_RELEASE_BL = "Master Express Release BL";
            String HOUSE_PROOF_BL = "House Proof BL";
            String HOUSE_PROOF_RATED_BL = "House Proof Rated BL";
            String HOUSE_ORIGINAL_BL = "House Original BL";
            String HOUSE_ORIGINAL_RATED_BL = "House Original Rated BL";
            String HOUSE_NON_NEGOTIABLE_BL = "House Non Negotiable BL";
            String HOUSE_NON_NEGOTIABLE_RATED_BL = "House Non Negotiable Rated BL";
            String HOUSE_EXPRESS_RELEASE_BL = "House Express Release BL";
            String HOUSE_EXPRESS_RELEASE_RATED_BL = "House Express Release Rated BL";
            String HOUSE_BL = "House BL";
            // List reports which are editable.
            String COST_SHEET = "Cost Sheet";
            String FREIGHT_INVOICE = "Freight Invoice";
            String FREIGHT_INVOICE_3 = "Freight Invoice 3";
            String FREIGHT_INVOICE_3_SHIPPER = "Freight Invoice 3 Shipper";
            String FREIGHT_INVOICE_3_AGENT = "Freight Invoice 3 Agent";
            String FREIGHT_INVOICE_3_CONSIGNEE = "Freight Invoice 3 Consignee";
            String FREIGHT_INVOICE_3_FORWARDER = "Freight Invoice 3 Forwarder";
            String FREIGHT_INVOICE_3_NOTIFY_PARTY = "Freight Invoice 3 Notify Party";
            String FREIGHT_INVOICE_3_THIRD_PARTY = "Freight Invoice 3 Third Party";
            String FREIGHT_INVOICE_3_PROOF = "Freight Invoice 3 Proof";
            String FREIGHT_INVOICE_IMPORT_3_SHIPPER = "Freight Invoice Import 3 Shipper";
            String FREIGHT_INVOICE_IMPORT_3_AGENT = "Freight Invoice Import 3 Agent";
            String FREIGHT_INVOICE_IMPORT_3_CONSIGNEE = "Freight Invoice Import 3 Consignee";
            String FREIGHT_INVOICE_IMPORT_3_FORWARDER = "Freight Invoice Import 3 Forwarder";
            String FREIGHT_INVOICE_IMPORT_3_NOTIFY_PARTY = "Freight Invoice Import 3 Notify Party";
            String FREIGHT_INVOICE_IMPORT_3_THIRD_PARTY = "Freight Invoice Import 3 Third Party";
            String FREIGHT_INVOICE_IMPORT_3_PROOF = "Freight Invoice Import 3 Proof";
            String FREIGHT_INVOICE_BL_FORMAT = "Freight Invoice Bl Format";
            String FREIGHT_INVOICE_BL_FORMAT_PROOF = "Freight Invoice Bl Format Proof";
            String FREIGHT_INVOICE_STANDARD_FORMAT = "Freight Invoice Standard Format";
            String FREIGHT_INVOICE_STANDARD_FORMAT_PROOF = "Freight Invoice Standard Format Proof";
            String CERTIFICATE_OF_ORIGIN = "Certificate of origin";
            String CO_CHILE_PERU_COL_DR = "CO-Chile/Peru/Col/DR";
            String PACKING_LIST_2 = "Packing List 2";
            String CERTIFICATE_OF_ORIGIN_SAVANNAH_STAMP = "Certificate of origin SAVANNAH STAMP";
            String CERTIFICATE_OF_ORIGIN_NAFTA = "Certificate of origin NAFTA";
            String CERTIFICATE_OF_ORIGIN_SAVANNAH = "Certificate of origin SAVANNAH";
            String CERTIFICATE_OF_KILN_DRY = "Certificate Of Kiln Dry";
            String SOLE_BILL_OF_EXCHANGE = "Sole Bill of Exchange";
            String PRE_ALERT = "Pre Alert";
            String BENEFICIARY_CERTIFICATE = "Beneficiary Certificate";
            String BANK_DRAFT_FIRST_OF_EXCHANGE = "Bank Draft First of Exchange";
            String CERTIFICATE_OF_ORIGIN_ISRAEL_STAMP = "Certificate Of Origin Israel Stamp";
            String COMMERCIAL_INVOICE_NIGERIA = "Commercial Invoice Nigeria";
            String CERTIFICATE_OF_ORIGIN_SOUTH_AFRICA = "Certificate Of Origin South Africa";
            String DOCK_RECEIPT = "Dock Receipt";
            String PICKUP_ORDER = "Pickup Order";
            String BANK_DRAFT = "Bank Draft";
            String TRUCKER_DOCK_RECEIPT = "Trucker Dock Receipt";
            String DELIVERY_ORDER_3 = "Delivery Order 3";
//            String BANK_DRAFT_SECOND_OF_EXCHANGE = "Bank Draft Second of Exchange";
            String LETTER_OF_TRANSMITTAL = "Letter of Transmittal";
            String FORWARD_CARGO_RECEIPT = "Forward Cargo Receipt";
            String FORWARDER_CARGO_RECEIPT = "Forwarder Cargo Receipt";
            String COMMERCIAL_INVOICE = "Commercial Invoice";
            String COMMERCIAL_INVOICE_FORMAT_2 = "Commercial Invoice Format 2";
            String COMMERCIAL_INVOICE_FORMAT_3 = "Commercial Invoice Format 3";
            String COMMERCIAL_INVOICE_FORMAT_4 = "Commercial Invoice Format 4";
            String DECLARATION_OF_NON_WOOD_PACKING_MATERIAL = "Declaration of Non Wood Packing Material";
            String DECLARATION_OF_WOOD_PACKING = "Declaration Of Wood Packing";
            String PACKING_LIST = "Packing List";
            String CERTIFICATE_OF_QUALITY_AND_CONFORMITY = "Certificate of Quality and Conformity";
            String CERTIFICATE_OF_QUALITY_VERSION_1 = "Certificate of Quality Version 1";
            String CERTIFICATE_OF_QUALITY_VERSION_2 = "Certificate of Quality Version 2";
            String AES_CONFIRMATION = "AES Confirmation";
            String CERTIFICATE_OF_ORIGIN_PRITABLE = "Certificate of Origin Printable";
            String CERTIFICATE_OF_ORIGIN_DATA_ONLY = "Certificate of Origin - Data Only";
            String ISRAEL_CERTIFICATE_OF_ORIGIN = "Israel Certificate of Origin";
            String KOREA_FREE_TRADE_CERTIFICATE_OF_ORIGIN = "Korea Free Trade Certificate Of Origin";
            String AUSTRALIA_CERTIFICATE_OF_ORIGIN = "Australia Certificate Of Origin";
            String QUALITY_CERTIFICATE_FOR_PERU = "Quality Certificate For Peru";
            String INTENT_FOR_VEHICLE_EXPORTS = "Intent For Vehicle Exports";
            String HBL_PRINT_FORM_FORMAT = "HBL Print Form Format";
            String IMO_DANGEROUS_GOODS_DECLARATION = "Imo Dangerous Goods Declaration";
            String IMO_DANGEROUS_GOODS_DECLARATION_2 = "Imo Dangerous Goods Declaration 2";
            String BOOKING_CONFIRMATION_3 = "Booking Confirmation 3";
            String DOCK_RECEIPT_2 = "Dock receipt 2";
            String BOOKING_CONFIRMATION_3_FOR_BL = "Booking Confirmation 3 For Bl";
            String DOCK_RECEIPT_2_FOR_BL = "Dock Receipt 2 For Bl";
            String LABEL = "Label";
            String CHILE_CERTIFICATE_OF_ORIGIN = "Chile Certificate Of Origin";
            String CAFTA_CERTIFICATE_OF_ORIGIN = "CAFTA Certificate Of Origin";
            String SHIPPER_LETTER_OF_INSTRUCTIONS = "Shipper Letter of Instructions";
            String SHIPPING_ORDER = "Shipping Order";

            //BL- IMPORTS
            String ARRIVAL_NOTICE = "Arrival Notice";
            String ARRIVAL_NOTICE_2 = "Arrival Notice 2";
            String ARRIVAL_NOTICE_FORMAT_2 = "Arrival Notice Format 2";
            String CARGO_RELEASE = "Cargo Release";
            String CUSTOMS_EXAM_HOLD = "Customs Exam Hold";
            String DELIVERY_ORDER = "Delivery Order";
            String GENERAL_ORDER_ALERT = "General Order Alert";
            String DELIVERY_ORDER_2 = "Delivery Order 2";
            String CONSIGNEES_AUTHORITY_TO_MAKE_ENTRY = "Consignees Authority To Make Entry";
            String BILL_OF_LADING = "Bill Of Lading";
            String PRE_ALERT_IMPORT = "Pre Alert Import";
            String FREIGHT_INVOICE_IMPORT_3 = "Freight Invoice Import 3";
            String FREIGHT_INVOICE_BL_FORMAT_IMPORT = "Freight Invoice Bl Format Import";
            String FREIGHT_INVOICE_STANDARD_FORMAT_IMPORT = "Freight Invoice Standard Format Import";
            String STRAIGHT_BL = "Straight Bl";
            String WORK_OR_TRUCK_ORDER = "Work Or Truck Order";
            String INSPECTION_OR_FUMIGATION_ORDER = "Inspection Or Fumigation Order";
            String HOUSE_PROOF_BL_IMPORT = "House Proof BL Import";
            String HOUSE_PROOF_RATED_BL_IMPORT = "House Proof Rated BL Import";
            String HOUSE_ORIGINAL_BL_IMPORT = "House Original BL Import";
            String HOUSE_ORIGINAL_RATED_BL_IMPORT = "House Original Rated BL Import";
            String HOUSE_NON_NEGOTIABLE_BL_IMPORT = "House Non Negotiable BL Import";
            String HOUSE_NON_NEGOTIABLE_RATED_BL_IMPORT = "House Non Negotiable Rated BL Import";
            String HOUSE_EXPRESS_RELEASE_BL_IMPORT = "House Express Release BL Import";
            String HOUSE_EXPRESS_RELEASE_RATED_BL_IMPORT = "House Express Release Rated BL Import";
            String EUTR_DUE_DILIGENCE_ASSESMENT = "EUTR Due Diligence Assesment";
            String MASTER_BL_IMPORT = "Master Bl Import";
            String CARGO_MANIFEST = "Cargo Manifest";
            String SAILING_CONFIRMATION = "Sailing Confirmation";
            String CARRIER_CERTIFICATE = "Carrier Certificate";
//            String PRE_ARRIVAL_NOTICE = "Pre Arrival Notice";
            String PRE_ALERT_INFO = "Pre Alert Info";
            //SALES ORDER
            String SALES_ORDER = "Sales Order";
            String CANADIAN_CUSTOMS_INVOICE_VERSION_1 = "Canadian Customs Invoice Version 1";
            String CANADIAN_CUSTOMS_INVOICE_VERSION_2 = "Canadian Customs Invoice Version 2";
            String CANADIAN_CUSTOMS_INVOICE = "Canadian Customs Invoice";
            String SALES_ORDER_OR_ESTIMATE_OR_TERMS_AND_CONDITIONS = "Sales Order Or Estimate Or Terms And Conditions";
            String SALES_ORDER_INVOICE = "Sales Order Invoice";
            //PURCHASE ORDER
            String PURCHASE_ORDER = "Purchase Order";
            String PO_CANADIAN_CUSTOMS_INVOICE_NORTH_BOUND = "PO Canadian Customs Invoice North Bound";
            String PO_CANADIAN_CUSTOMS_INVOICE_SOUTH_BOUND = "PO Canadian Customs Invoice South Bound";
            String PURCHASE_ORDER_PAN = "Purchase Order PAN";
            //CCI
            String CANADIAN_CUSTOMS_INVOICE_NORTH_BOUND = "Canadian Customs Invoice North Bound";
            String CANADIAN_CUSTOMS_INVOICE_SOUTH_BOUND = "Canadian Customs Invoice South Bound";
            /* Quotation Reports Constants */
            String QUOTATION = "Quotation";
            String QUOTATION_BREAK_BULK = "Quotation Break Bulk";
            String MULTI_CARRIER_QUOTATION = "Multi Carrier Quotation";
            String SINGLE_FCL_QUOTATION = "Single FCL Quotation";
            /*  Booking Reports Constants */
            String WORK_ORDER = "Work Order";
            String WAREHOUSE_ORDER = "Warehouse Order";
            String REFERENCE_NUMBER = "Reference Number";
            String BOOKING_COST_SHEET = "Booking Cost Sheet";
            String BOOKING_CONFIRMATION = "Booking Confirmation";
            String BOOKING_CONFIRMATION_2 = "Booking Confirmation 2";
            String DELIVERY_INSTRUCTIONS = "Delivery Instructions";
            String DELIVERY_PICKUP_ORDER = "Delivery Pickup Order";
            String BOOKING_INVOICE = "Booking Invoice";
            String FCL_BOOKING_FORM = "FCL Booking Form";
            String AIR_BOOKING_FORM = "Air Booking Form";
            //Bundle
            String QUOTATION_BUNDLE_PREVIEW = "Quotation Bundle Preview";
            String BOOKING_BUNDLE_PREVIEW = "Booking Bundle Preview";
            String BL_BUNDLE_PREVIEW = "Bl Bundle Preview";
            String BOOKING_CONFIRMATION_FOR_BL = "Booking Confirmation For Bl";
            String BOOKING_CONFIRMATION_BL_IMPORT = "Booking Confirmation For Bl";
            String WORK_ORDER_FOR_BL = "Work Order For Bl";
            String WARE_HOUSE_ORDER_FOR_BL = "Ware House Order For Bl";
            String REFERENCE_DOCUMENT_FOR_BL = "Reference Document For Bl";
            String DELIVERY_ORDER_FOR_BL = "Delivery Order For Bl";
            String DOCK_RECEIPT_FOR_BL = "Dock Receipt For Bl";
            String CORRECTION_CREDIT = "Correction Credit";
            String CORRECTION_DEBIT = "Correction Debit";
            String INSPECTION_OR_FUMIGATION_ORDER_BL = "Inspection Or Fumigation Order Bl";
            /* Air Module BL*/
            String MASTER_AIR_WAY_BILL = "Master Air Way Bill";
            String MASTER_AIR_WAY_BILL_DATA_ONLY = "Master Air Way Bill - Data Only";
            String HOUSE_AIR_WAY_BILL = "House Air Way Bill";
            String HOUSE_AIR_WAY_BILL_DATA_ONLY = "House Air Way Bill - Data Only";
            String TRANSFER_TO_INDIRECT_CARRIER = "Transfer to Indirect Carrier";
            String TSA_SHIPPER = "TSA Shipper";
            String CONSENT_TO_SCREEN = "Consent to Screen";
            String CONSOLIDATED_MANIFEST = "Consolidated Manifest";
            String BOOKING_CONFIRMATION_BL = "Booking Confirmation Bl";
            String WORK_ORDER_BL = "Work Order Bl";
            String WAREHOUSE_ORDER_BL = "Warehouse Order Bl";
            String SHIPPER_DECLARATION_FOR_DANGEROUS_GOODS = "Shipper Declaration For Dangerous Goods";
            String LOADING_GUIDE = "Loading Guide";
            String CONSOLIDATED_NOTIFICATION = "Consolidated Notification";
            String DELIVERY_PICKUP_ORDER_FOR_BL = "Delivery Pickup Order For Bl";
            String HBL_REPORT = "HBL Report";
            String HBL_REPORT_DATA_ONLY = "HBL Report Data Only";
            String CANADIAN_CERTIFICATE_OF_ORIGIN_TORONTO = "Canadian Certificate of Origin Toronto";
            String NO_WOOD_PACKING_DECLARATION = "No Wood Packing Declaration";
            String CANADIAN_CERTIFICATE_OF_ORIGIN_MONTREAL = "Canadian Certificate of Origin Montreal";
            String NAFTA_CERTIFICATE_OF_ORIGIN = "NAFTA Certificate Of Origin";
            String WAREHOUSE_RECEIPT = "Warehouse Receipt";
            String COLOMBIA_CERTIFICATE_OF_ORIGIN = "Colombia Certificate Of Origin";
            /* Fcl Custom*/
            String CUSTOM_AMS = "AMS";
            String CUSTOM_ISF = "ISF";
            String CUSTOM_7501 = "7501";
            String CUSTOM_3461 = "3461";
            String AIR_ARIVAL_NOTICE = "Arrival Notice";
            String AIR_CONSIGNEES_AUTHORITY_TO_MAKE_ENTRY = "Consignees Authority To Make Entry";
            String AIR_ARIVAL_NOTICE_2 = "Arrival Notice 2";

            /* Lcl */
            String ISF_CONFIRMATION = "ISF Confirmation";
            String SHIPPING_INSTRUCTIONS = "Shipping Instructions";

            String STRIPPING_TALLY = "Stripping Tally";
            String CONCISE_STRIPPING_TALLY = "Concise Stripping Tally";
            String TRUCKER_OUTBOUND_DELIVERY = "Trucker OutBound Delivery";
            String EXPORT_LOADING_GUIDE = "Export Loading Guide";
            String OCEAN_MANIFEST = "Ocean Manifest";
            String UNIT_EXCEPTIONS_LIST = "Unit Exceptions List";
            String HAZARDOUS_BL_FORM = "Hazardous Bl Form";
            String CFS_INSTRUCTIONS_FORM = "CFS Instructions Form";
            String INSPECTION_CONTROL_FORM = "Inspection Control Form";
            String VOYAGE_NOTIFICATION = "Voyage Notification";
            String PROFIT_LOSS = "Profit/Loss";
            String EXCEPTION_ALARM = "Exception/Alarm";
            String PRE_ADVICE = "Pre Advice";
            String STATUS_UPDATE = "Status Update";
            String SEGREGATION_REPORT = "Segregation Report";

            String FREIGHT_INVOICE_SHIPPER = "Freight Invoice Shipper";
            String FREIGHT_INVOICE_AGENT = "Freight Invoice Agent";
            String FREIGHT_INVOICE_CONSIGNEE = "Freight Invoice Consignee";
            String FREIGHT_INVOICE_FORWARDER = "Freight Invoice Forwarder";
            String FREIGHT_INVOICE_NOTIFY_PARTY = "Freight Invoice Notify Party";
            String FREIGHT_INVOICE_THIRD_PARTY = "Freight Invoice Third Party";
            String COB_NOTIFICATION = "COB Notification";
            String CONFIRM_ON_BOARD = "Confirm On Board";

            String ARRIVAL_NOTICE_2_FOR_BL = "Arrival Notice 2 For Bl";
            String TSA_LETTER = "TSA Letter";

        }

        public static interface ReportTemplate {

            String CERTIFICATE_OF_KILN_DRY = "CERTIFICATE_OF_KILN_DRY";
            String CERTIFICATE_OF_ORIGIN = "CERTIFICATE_OF_ORIGIN";
            String CERTIFICATE_OF_ORIGIN_SAVANNAH_STAMP = "CERTIFICATE_OF_ORIGIN_SAVANNAH_STAMP";
            String CERTIFICATE_OF_ORIGIN_SAVANNAH = "CERTIFICATE_OF_ORIGIN_SAVANNAH";
            String PRE_ALERT = "PRE_ALERT";
            String CERTIFICATE_OF_QUALITY_VERSION_1 = "CERTIFICATE_OF_QUALITY_VERSION_1";
            String CERTIFICATE_OF_QUALITY_VERSION_2 = "CERTIFICATE_OF_QUALITY_VERSION_2";
            String STRAIGHT_BL = "STRAIGHT_BL";
            String COMMERCIAL_INVOICE = "COMMERCIAL_INVOICE";
            String COMMERCIAL_INVOICE_FORMAT_2 = "COMMERCIAL_INVOICE_FORMAT_2";
            String COMMERCIAL_INVOICE_FORMAT_3 = "COMMERCIAL_INVOICE_FORMAT_3";
            String PACKING_LIST = "PACKING_LIST";
            String DECLARATION_OF_NON_WOOD_PACKING_MATERIAL = "DECLARATION_OF_NON_WOOD_PACKING_MATERIAL";
            String BENEFICIARY_CERTIFICATE = "BENEFICIARY_CERTIFICATE";
        }
    }

    public static interface SpecialEquipment {

        String STANDARD_DRY_CARGO = "Standard Dry Cargo";
    }

    public static interface Label {

        public static interface ChargeCode {

            // String Print_Quote_Bkg = "Print Quote/Bkg";
            String QUICKBOOKS_AR_ACCOUNT = "Quickbooks AR Account";
            String QUICKBOOKS_AP_ACCOUNT = "Quickbooks AP Account";
            String QUICKBOOKS_INVITEM = "Quickbooks INVITEM";
        }
    }

    public static interface CostCode {

        String Ocean = "OFR";
        String Inland = "INLAND";
        String Insurance = "INSURANCE";
    }

    public static interface FileStatus {

        String CANCELLED = "cancelled";
        String RE_INSTATED = "re-instated";
        String OPEN = "open";
    }

    public static interface CodeType {

        public static interface Division {

            int id = 42;

            public static interface Label {

                String CITY = "City";
                String STATE_CODE = "State Code";
                String COUNTRY = "Country";
            }
        }
    }

    public static interface Client {

        public static enum Type {

            S("Shipper"), F("Forwarder"), N("NVOCC"), C("Consignee"), SS("SteamShipline"),
            A("Agent"), AI("Import Agent"), AE("Export Agent"), V("Vendor"), B("Bank"), O("Others");
            private String description;

            Type(String description) {
                this.description = description;
            }

            public String getDescription() {
                return description;
            }
        }
    }

    public static interface QuickBooks {

        int NOT_READY = 0;
        int READY = 1;
        int SENT = 2;
        int PARTIAL = 3;
    }

    public static interface ValidateUsingChargeCode {

        String[] CUCTBA_CHARGE_CODE_VALIDATE = {"INLAND", "INLFRT", "DRAY", "DRPK", "INTMDL", "INC", "DRII", "DROPFEE"};
        String[] SHOW_ORIGIN_CHARGE_CODE_VALIDATE = {"INC", "INLFRT", "INLFRT1", "INLFRT2", "INLFRT3", "DRAY", "INTMDL", "INLAND", "DROPFEE", "DRPK"};
    }
}
