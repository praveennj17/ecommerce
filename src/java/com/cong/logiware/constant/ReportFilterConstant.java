/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.constant;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author ashishkumar.v
 */
public class ReportFilterConstant {

    public static final Map<String, String> blReportFilterMap = new TreeMap<String, String>();
    public static final Map<String, String> bookingReportFilterMap = new TreeMap<String, String>();
    public static final Map<String, String> airBlReportFilterMap = new TreeMap<String, String>();

    public enum BlReportFilters {

        POLPRINT("polPrint", "POL"),
        PODPRINT("podPrint", "POD"),
        CARRIERNAMEPRINT("carrierNamePrint", "Carrier"),
        NVOPRINT("nvoPrint", "NVO"),
        ETDPRINT("etdPrint", "ETD"),
        ETAPRINT("etaPrint", "ETA"),
        ADDCHARGEPRINT("addChargePrint", "Charge/Sell Amount"),
        ADDCOSTPRINT("addCostPrint", "Cost Amount"),
        BOOKEDBYPRINT("bookedByPrint", "Booked by"),
        DOCRECEIVEDFROMCUSTOMEINRPRINT("docReceivedFromCustomeinrPrint", "Doc Received From Customein"),
        MBLSENTTOLINEPRINT("mblSentToLinePrint", "MBL Sent To Line"),
        HBLSENTTOCUSTOMERPRINT("hblSentToCustomerPrint", "HBL Sent To Customer"),
        ACTUALDEPARTUREPRINT("actualDeparturePrint", "Actual Departure"),
        SSLDOCPRINT("sslDocPrint", "SSL Doc cutt off Date"),
        SSLPRINT("sslPrint", "SSL"),
        CONSIGNEEONMBLPRINT("consigneeOnMBLPrint", "Consignee On MBL"),
        DELIVERYAGENTONHBLPRINT("deliveryAgentOnHBLPrint", "Delivery Agent On HBL"),
        VESSELPRINT("vesselPrint", "Vessel"),
        VOYAGEPRINT("voyagePrint", "Voyage"),
        HOUSENOORIGINALSPRINT("houseNoOriginalsPrint", "House No. Originals"),
        MASTERNOORIGINALSPRINT("masterNoOriginalsPrint", "Master No. Originals"),
        CONFIRMEDONBOARDPRINT("confirmedOnBoardPrint", "Confirmed On Board"),
        DOCORAESCUTOFFPRINT("docOrAesCutOffPrint", "Doc Cut Off Print"),
        CUSTOMERNAMEPRINT("customerNamePrint", "Bill To"),
        SHIPPERNAMEPRINT("shipperNamePrint", "Shipper"),
        FORWARDERNAMEPRINT("forwarderNamePrint", "Forwarder"),
        NOTIFYNAMEPRINT("notifyNamePrint", "Notify"),
        CONSIGNEENAMEPRINT("consigneeNamePrint", "Consignee"),
        TRANSHIPMENTPRINT("transhipmentPrint", "Transhipment"),
        LOGISTICCOORDINATORPRINT("logisticCoordinatorPrint", "Logistic Coordinator"),
        BLBYPRINT("blByPrint", "Bl By"),
        ROLLEDBOOKINGPRINT("rolledBookingPrint", "Rolled Booking Note"),
        FILENUMBERPRINT("fileNumberPrint", "File Number"),
        EXPORTREFERENCEPRINT("exportReferencePrint", "Export Reference"),
        MASTERBLNUMBERPRINT("masterBlNumberPrint", "Master Bl Number"),
        CONTAINERTYPEPRINT("containerTypePrint", "Container Type"),
        CONTAINERNUMBERPRINT("containerNumberPrint", "Container Number"),
        ACTUALARRIVALDATEPRINT("actualArrivalDatePrint", "Actual Arrival Date"),
        LOADDELIVERYPRINT("loadDeliveryPrint", "Load/Delivery Location"),
        MARGINPRINT("marginPrint", "Margin For Charge/Sell"),
        CHARGECODEPRINT("chargeCodePrint", "Charge/Sell Code"),
        ADDITIONALREFERENCEPRINT("additionalReferencePrint", "Additional Reference"),
        FILESTATUSPRINT("fileStatusprint", "File Status"),
        SALESPERSONPRINT("salesPersonPrint", "Sales Person"),
        ASSIGNEDADMINPRINT("assignedAdminPrint", "Assigned Admin"),
        NOOFTEUSPRINT("noOfTEUsPrint", "No&nbsp;of&nbsp;TEUs"),
        NOOFCONTAINERSPRINT("noOfContainersPrint", "No&nbsp;of&nbsp;Container"),
        ACTIVETOADMINPRINT("activeToAdminPrint", "Active-Admin duration"),
        ADMINTOCLOSEDPRINT("adminToClosedPrint", "Admin-Closed duration"),
        APTXNDATEPRINT("apTxnDatePrint", "Ap Txn Date"),
        ARTXNDATEPRINT("arTxnDatePrint", "Ar Send Date"),
        ETDARDIFFPRINT("etdArDiffPrint", "Etd-Ar Sent"),
        APETADIFFPRINT("apEtaDiffPrint", "Ap-Eta Diff"),
        PERCENTOFNETPRINT("percentOfNetPrint", "Percent Of Net"),
        ARSTATUSPRINT("arStatusPrint", "AR-Status"),
        APSTATUSPRINT("apStatusPrint", "AP-Status"),
        HOUSEBLPRINT("houseBlPrint", "House BL Number"),
        LOADDATEPRINT("loadDatePrint", "Load Date"),
        TRUCKERNAMEPRINT("truckerNamePrint", "Trucker Name"),
        TRUCKERPHONENUMBERPRINT("truckerPhoneNumberPrint", "Trucker Phone Number"),
        TRUCKEREMAILPRINT("truckerEmailPrint", "Trucker Email Address"),
        TRUCKERCONTACTNAMEPRINT("truckerContactNamePrint", "Trucker Contact Name"),
        COMPANYISSUEDHBLPRINT("companyIssuedHblPrint", "Company Issued HBL"),
        PREASSIGNEDCONTPRINT("preAssignedContPrint", "Pre Assigned Cont"),
        LATEGATEREQPRINT("lateGateReqPrint", "Late Gate Req"),
        APPROVEDPRINT("approvedPrint", "Approved date"),
        CORRECTIONPRINT("correctionPrint", "Correction"),
        VEHICLEIDPRINT("vehicleIDPrint", "VehicleID"),
        VEHICLEMODELPRINT("vehicleModelPrint", "Vehicle Model"),
        VEHICLEMAKEPRINT("vehicleMakePrint", "Vehicle Make"),
        VEHICLEYEARPRINT("vehicleYearPrint", "Vehicle Year "),
        LIVELOADDATEPRINT("liveLoadDatePrint", "Live Load Date"),
        PICKUPDATEPRINT("pickupDatePrint", "PickUp Date"),
        HBLPREPAIDORCOLLECT("HblPrepaidOrCollect", "Hbl Prepaid or Collect"),
        DROPDATEPRINT("dropDatePrint", "Drop Date"),
        STATUSCHANGEDDATEPRINT("statusChangedDatePrint", "Status Changed Date "),
        CARGORECEIPTPRINT("cargoReceiptPrint", "Cargo Receipt"),
        ETDREASONPRINT("etdReasonPrint", "ETD Reason"),
        ETAREASONPRINT("etaReasonPrint", "ETA Reason"),
        REVISEDETAPRINT("revisedEtaPrint", "Revised ETA"),
        REVISEDETDPRINT("revisedEtdPrint", "Revised ETD"),
        TRANSHIPETDPRINT("transhipEtdPrint", "Tranship ETD"),
        TRANSHIPVESSELPRINT("transhipVesselPrint", "Tranship Vessel"),
        OPTIMUMINVOICEDATEPRINT("optimumInvoiceDatePrint", "Optimum Invoice Date"),
        INVOICEDONTIMEPRINT("invoicedOnTimePrint", "Invoiced On Time"),
        INVOICEDELTAPRINT("invoiceDeltaPrint", "Invoice Delta"),
        INITIALPROFITPRINT("initialProfitPrint", "Initial Profit"),
        FINALPROFITPRINT("finalProfitPrint", "Final Profit"),
        PROFITDELTAPRINT("profitDeltaPrint", "Profit Delta "),
        //match with properties
        CONTAINERPOPRINT("containerPOPrint", "Po# "), //showContPOColumn
        CONTAINERDELIVERYDATEPRINT("containerDeliveryDatePrint", "Delivery Date"), //showContDDateColumn
        CONTAINERLFDPRINT("containerLFDPrint", "LFD "),//showContLFDColumn
        //end match with properties
        PARTIALSHIPMENTPRINT("partialShipmentPrint", "Partial Shipment"),
        CONFIRMONBOARDDATEPRINT("confirmOnBoardDatePrint", "Cob Date"),
        CUSTOMERNOTESPRINT("customerNotesPrint", "Customer Notes"),
        INVOICEDPRINT("invoicedPrint", "Invoice"),
        INVOICEDAMOUNTPRINT("invoicedAmountPrint", "Invoiced Amount"),
        INVOICEAMOUNTPRINT("invoiceAmountPrint", "Invoice Amount"),
        FREIGHTSHIPMENTTYPEPRINT("freightShipmentTypePrint", "Freight Shipment Type"),
        FILETYPEPRINT("fileTypePrint", "File Type"),
        CUSTOMERPOPRINT("customerPoPrint", "Customer Po"),
        ETAATRAILRAMPPRINT("etaAtrailRampPrint", "Eta At RailRamp"),
        PLACEOFRECEIPTPRINT("placeOfReceiptPrint", "PLOR"),
        DESTINATIONPRINT("destinationPrint", "PLOD"),
        SEALNOPRINT("sealNoPrint", "Seal No."),
        CONTAINERWEIGHTPRINT("containerWeightPrint", "Container Weight"),
        //LOADPLANDATEPRINT("LoadPlanDatePrint", "Load Plan Date"),
        // ROLLBOOKINGPRINT("rollBookingPrint", "Rolled Booking"),
        BOOKINGNUMBERPRINT("bookingNumberPrint", "Booking Number"),
        OPTIMALFILECLOSINGDATEPRINT("optimalFileCloseDate", "Optimal File Closing Date"),
        OPTIMALFILECLOSINGDATEDELTAPRINT("optimalFileCloseDateDelta", "Optimal File Closing Date Delta"),
        /**
         * Work Flow status-- *
         */
        BKGREQRECPRINT("bkgReqRecPrint", "Bkg Req.Rec'vd"),
        BKGREQSENTTOCARRIERPRINT("bkgReqSentToCarrierPrint", "Bkg Req.Sent"),
        BKGCONFIRMATIONRECPRINT("bkgConfirmationRecPrint", "Bkg Conf Rec'vd"),
        BKGCONFIRMATIONSENTPRINT("bkgConfirmationSentPrint", "Bkg Conf Sent"),
        BKGCOMPLETEDPRINT("bkgCompletedPrint", "Bkg Completed"),
        SHIPPINGINSTRECPRINT("shippingInstRecPrint", "Shipping Inst.Rec'vd"),
        SHIPPINGINSTSENTTOCARRIERPRINT("shippingInstSentToCarrierPrint", "Shipping Inst Sent"),
        MASTERBLPROOFRECEIVEDPRINT("masterBlProofReceivedPrint", "MBl Proof Rec'vd"),
        MASTERBLPROOFSENTFORAPPROVALPRINT("masterBlProofSentForApprovalPrint", "MBl Proof Sent"),
        MASTERBLPROOFCORRECTEDPRINT("masterBlProofCorrectedPrint", "MBl Proof Corrected"),
        MASTERBLPROOFCOMPLETEDPRINT("masterBlProofCompletedPrint", "MBl Proof Completed"),
        ORIGINBLRECEIVEDFROMCARRIERPRINT("originBlReceivedFromCarrierPrint", "OBl Rec'vd"),
        CONFIRMONBOARDCHKBOXPRINT("confirmOnBoardChkboxPrint", "WorkFlow COB"),
        AUTOMATEDMANIFESTFILINGPRINT("automatedManifestFilingPrint", "AMS"),
        IMPORTSECURITYFILINGPRINT("importSecurityFilingPrint", "ISF"),
        VESSELDEPARTEDPRINT("vesselDepartedPrint", "Vessel Departed"),
        NOTIFICATIONSENTPRINT("notificationSentPrint", "Notification Sent"),
        DOCSSENTPRINT("docsSentPrint", "Docs Sent"),
        ARRIVALNOTICERECPRINT("arrivalNoticeRecPrint", "Arrival Notice Rec'vd"),
        ARRIVALNOTICESENTPRINT("arrivalNoticeSentPrint", "Arrival Notice Sent"),
        VESSELARRIVEDPRINT("vesselArrivedPrint", "Vessel Arrived"),
        DISCHARGENOTICEPRINT("dischargeNoticePrint", "Discharge Notice"),
        CUSTOMSCLEARANCEPRINT("customsClearancePrint", "Customs Clearance"),
        BOOKINGROLLEDPRINT("bookingRolledPrint", "Booking Rolled"),
        AESPRINT("aesPrint", "Aes"),
        ACTIVEDAYS("activeDaysPrint", "Active Days"),
        ADMINDAYS("adminDaysPrint", "Admin Days"),
        DOWNLOADEDDAYS("downloadedDaysPrint", "Downloaded Days"),
        DIPLOMATICSHIPMENT("diplomaticShipmentPrint", "Diplomatic Shipments"),
        COBCONTACTNAMEPRINT("cobContactNamePrint", "COB Contact Name"),
        ORIGINALBLREQUIREDPRINT("originalBlRequiredPrint", "Original Bl Required"),
        CLIENTNAMEPRINT("clientNamePrint", "Client"),
        COBNOTIFICATIONSENTPRINT("cobNotificationSentPrint", "COB Notification Sent"),
        DOWNLOADEDTOACTIVEPRINT("downloadedtoactive", "Downloaded-Active duration"),
        PASSEDARRIVALPRINT("passedArrivalPrint", "Passed Arrival"),
        //        SELLPRINT("sellPrint", "Sell"),
        //        BUYPRINT("buyPrint", "Buy"),
        //        ENTIREMARGINPRINT("entireMarginPrint", "Entire Margin"),
        NETCONTPRINT("netContPrint", "Net Container"),
        AECOMMPRINT("aeCommPrint", "A/E Comm "),
        OHBLISSUEDATDEST("ohblIssuedAtDest", "Ohbl Issued At Dest"),
        HBLBACK("hblBack", "Hbl Back"),
        OHBLLOIRECEIVED("hblLoiReceived", "HBL LOI Received"),
        HBLDESTINATIONFEE("hblDestinationFee", "HBL Destination Fee"),
        PREALERTINVOICETOOVERSEAS("preAlertInvoicetoOverseas", "Pre-Alert + Invoice to Overseas"),
        HOLDCARGOES("holdCargoes", "Hold Cargoes"),
        DOCCUTOFF("docCutOff", "Doc Cut Off"),
        INVOICETOSHIPPER("invoiceToShipper", "Invoice To Shipper"),
        PENDINGBOOKINGREQUEST("pendingBookingRequest", "Pending Booking Request"),
        OHBLISSUED("OHBLIssued", "OHBL Issued");
//        TRANSHIPMENTCOUNTRYPRINT("transhipmentCountryPrint", "Transhipment Country");

        private final String value;
        private final String displayName;

        private BlReportFilters(String value, String displayName) {
            this.value = value;
            this.displayName = displayName;
        }

        public String getValue() {
            return value;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    public enum BookingReportFilters {

        FILTER_01("bookedByPrint", "Booked By");

        private final String value;
        private final String displayName;

        private BookingReportFilters(String value, String displayName) {
            this.value = value;
            this.displayName = displayName;
        }

        public String getValue() {
            return value;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    public enum AirBlReportFilters {

        FILENUMBER("fileNumberPrint", "File Number"),
        SUBNUMBER("subNumberPrint", "Sub Number"),
        BOOKINGNUMBER("bookingNumberPrint", "Booking Number"),
        REFERENCENUMBER("referenceNumberPrint", "Reference Number"),
        BLNUMBER("blNumberPrint", "Bl Number"),
        MASTERBLNUMBER("masterBlNumberPrint", "Master Bl Number"),
        PONUMBER("poNumberPrint", "PO Number"),
        ORIGIN("originPrint", "Origin"),
        DESTINATION("destinationPrint", "Destination"),
        POL("polPrint", "POL"),
        POD("podPrint", "POD"),
        CARRIER("carrierPrint", "Carrier"),
        ETA("etaPrint", "ETA"),
        ETD("etdPrint", "ETD"),
        DESTINATIONCOUNTRY("destinationCountryPrint", "Destination Country"),
        FORWARDERREFERENCE("forwarderReferencePrint", "Forwarder Reference"),
        MASTERSHIPPER("masterShipperPrint", "Master Shipper"),
        SHIPPER("shipperPrint", "Shipper"),
        FORWARDER("forwarderPrint", "Forwarder"),
        CONSIGNEE("consigneePrint", "Consignee"),
        COMMODITIES("commoditiesPrint", "Commodities"),
        PACKAGES("packagesPrint", "Packages"),
        QUANTITY("quantityPrint", "Quantity"),
        ACTUALKGS("actualKgsPrint", "Actual Kgs"),
        ACTUALLBS("actualLbsPrint", "Actual Lbs"),
        VOLUMETRICKGS("volumetricKgsPrint", "Volumetric Kgs"),
        VOLUMETRICLBS("volumetricLbsPrint", "Volumetric Lbs"),
        FILETYPE("fileTypePrint", "File Type"),
        BLTYPE("blTypePrint", "Bl Type"),
        BLBY("blByPrint", "Bl By"),
        BLDATE("blDatePrint", "Bl Date"),
        ACTUALDEPARTURE("actualDeparturePrint", "Actual Departure"),
        ACTUALARRIVAL("actualArrivalPrint", "Actual Arrival"),
        CREATEDBY("createdByPrint", "Created By"),
        CREATEDDATE("createdDatePrint", "Created Date"),
        CLIENT("clientPrint", "Client"),
        CLIENTTYPE("clientTypePrint", "Client Type"),
        THIRDPARTY("thirdPartyPrint", "Third Party"),
        NOTIFYPARTY("notifyPartyPrint", "Notify Party"),
        AGENT("agentPrint", "Agent"),
        AESITN("aesItnPrint", "AES ITN"),
        INCOTERMS("incoTermsPrint", "Inco Terms"),
        TERMSCODE("termsCodePrint", "Terms Code"),
        LOADPLANDELIVERYDATE("loadDeliveryDatePrint", "Load Plan Delivery Date"),
        DELIVERYPLANDELIVERYDATE("deliveryDatePrint", "Delivery Plan Delivery Date"),
        COMMERCIALINVOICENUMBER("commercialinvoicenumberPrint", "Commercial Invoice Number"),
        COMMERCIALINVOICEDATE("commercialinvoicedatePrint", "Commercial Invoice Date"),
        STATUS("statusPrint", "Status"),
        DELIVERYDATE("deliverydatePrint", "Delivery Date"),
        DOCSRELEASEDATE("docsreleasedatePrint", "Docs Release Date"),
        INCOTERMSDETAILS("incotermsdetailsPrint", "Incoterms Details"),
        FINALDELIVERYDATE("finaldeliverydatePrint", "Final Delivery Date"),
        FLIGHT("flightprint", "Flight"),
        CUSTOMSCLEAREDDDATE("customsclearedddatePrint", "Customs Cleared Date"),
        PREALERTSENT("preAlertSent", "Pre Alert Sent"),
        DEBITNOTESENT("debitNoteSent", "Debit Note Sent"),
        ASKFORDN("askForDN", "Ask for DN");

        private final String value;
        private final String displayName;

        private AirBlReportFilters(String value, String displayName) {
            this.value = value;
            this.displayName = displayName;
        }

        public String getValue() {
            return value;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    static {
        for (BlReportFilters f : BlReportFilters.values()) {
            blReportFilterMap.put(f.getValue(), f.getDisplayName());
        }
        for (BookingReportFilters f : BookingReportFilters.values()) {
            bookingReportFilterMap.put(f.getValue(), f.getDisplayName());
        }
        for (AirBlReportFilters f : AirBlReportFilters.values()) {
            airBlReportFilterMap.put(f.getValue(), f.getDisplayName());
        }
    }

}
