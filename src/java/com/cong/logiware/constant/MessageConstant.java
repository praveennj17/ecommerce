package com.cong.logiware.constant;

/**
 *
 * @author shanmugam
 */
public interface MessageConstant {

    String MESSAGE_PERSISTED_SUCCESSFULLY = "Your work is persited. Please carry on..";
    String MESSAGE_RESTORED_SUCCESSFULLY = "Work is restored successfully. Please carry on..";
    String MESSAGE_SAVED_SUCCESSFULLY = "Saved Successfully";
    String MESSAGE_UPDATED_SUCCESSFULLY = "Updated Successfully";
    String MESSAGE_COPIED_SUCCESSFULLY = "Copied Successfully";
    String ENTER_FIELDS = "Enter the fields";
    String MESSAGE_CHARGE_REMOVED_SUCCESSFULLY = "Charge is removed Successfully";
    String MESSAGE_CONTAINER_REMOVED_SUCCESSFULLY = "Container is removed Successfully";
    String MESSAGE_COST_REMOVED_SUCCESSFULLY = "Cost is removed Successfully";
    String MESSAGE_QUOTATION_CONVERTED_TO_BOOKING = "Quotation is converted to Booking successfully.";
    String MESSAGE_SALES_ORDER_CONVERTED_TO_BOOKING = "Sales Order is converted to Booking successfully.";
    String MESSAGE_QUOTATION_COPIED_SUCCESSFULLY = "Quotation is copied successfully !";
    String MESSAGE_SALES_ORDER_COPIED_SUCCESSFULLY = "Sales Order is copied successfully !";
    String MESSAGE_RECALCULATION = "Recalculation done.";
    String MESSAGE_HAZMAT_REMOVED_SUCCESSFULLY = "Hazmat is removed Successfully.";
    String MESSAGE_CHARGE_IS_COPIED_TO_COST = "Charge is copied to Cost.";
    String MESSAGE_EXISTING_CHARGES_ARE_CLEARED = "Existing charges are cleared.";
    String MESSAGE_RATED_CHARGES_ARE_DELETED = "Rated charges are deleted.";
    String MESSAGE_BOOKING_COPIED_SUCCESSFULLY = "Booking is copied successfully !";
    String MESSAGE_BOOKING_REVERTED_TO_QUOTATION = "Booking Reverted to Quotation successfully.";
    String MESSAGE_BL_IS_MANIFESTED_SUCCESSFULLY = "Bl is manifested successfully.";
    String MESSAGE_BL_AR_SENT_SUCCESSFULLY = "Bl AR sent successfully.";
    String MESSAGE_BOOKING_AR_SENT_SUCCESSFULLY = "AR sent successfully.";
    String MESSAGE_BL_REVERTED_TO_BOOKING = "Bl Reverted to Booking successfully.";
    String MESSAGE_BL_COPIED_SUCCESSFULLY = "Bl is copied successfully !";
    String MESSAGE_PURCHASE_ORDER_COPIED_SUCCESSFULLY = "Purchase Order is copied successfully !";
    String MESSAGE_CANADA_CUSTOMS_INVOICE_COPIED_SUCCESSFULLY = "Canada Customs Invoice is copied successfully !";
    String MESSAGE_UNMANIFESTED_SUCCESSFULLY = "Unmanifested successfully.";
    String MESSAGE_AES_SUBMITTED = "AES Is Submitted To Customs Successfully!";
    String MESSAGE_AES_CANCELLED = "AES Cancelled Successfully!";
    String MESSAGE_AES_CANCELLED_SUBMITTED = "AES Is Cancelled And Submitted To Customs Successfully!";
    String MESSAGE_AES_ERROR_ON_SUBMIT = "Error Occurred While Uploading File Into FTP, Check AES FTP Config In Property Screen!";
    String MESSAGE_SENT_SUCCESSFULLY = "Your mail has been sent successfully";
    String MESSAGE_XML_GENERATED_SUCCESSFULLY = "XML Generated Successfully";
    String MESSAGE_EDI_ERROR_ON_SUBMIT = "Error Occurred While Uploading Into FTP, Check FTP Configuration In Property Screen!";
    String MESSAGE_HTS_REMOVED_SUCCESSFULLY = "HTS is removed Successfully.";
    String MESSAGE_AES_ITN_REMOVED_SUCCESSFULLY = "ITN is removed Successfully.";
    String MESSAGE_SCHEDULEB_REMOVED_SUCCESSFULLY = "ScheduleB is removed Successfully.";
    String MESSAGE_COMMERCIAL_INVOICE_REMOVED_SUCCESSFULLY = "Commercial Invoice is removed Successfully.";
    String MESSAGE_BUDGET_REMOVED_SUCCESSFULLY = "Budget is removed Successfully.";
    String MESSAGE_BILL_TO_REMOVED_SUCCESSFULLY = "Bill To is removed Successfully.";
    String MESSAGE_TRANSHIP_REMOVED_SUCCESSFULLY = "Tranship is removed Successfully.";
    String MESSAGE_PRINT_SENT_SUCCESSFULLY = "Your print has been sent successfully";
    String MESSAGE_DELETED_SUCCESSFULLY = "Deleted Successfully !";
    String MESSAGE_SYNCED_SUCCESSFULLY = "Synced Successfully !";
    String MESSAGE_GLOBAL_REMOVED_SUCCESSFULLY = "Removed Successfully!";
    String MESSAGE_GLOBAL_ADDED_SUCCESSFULLY = "Added Successfully!";
    String MESSAGE_PURCHASE_ORDER_CONVERTED_TO_BOOKING = "Purchase Order is converted to Booking successfully.";
    String MESSAGE_PURCHASE_ORDER_CONVERTED_TO_BL = "Purchase Order is converted to BL successfully.";
    String MESSAGE_AR_SENT = "AR sent to Accounting successfully.";
    String MESSAGE_AC_SENT = "Costs sent to Accounting successfully.";

    String ERROR_QUOTATION_NOT_SAVED = "Quotation is not saved yet.";
    String ERROR_FINALIZE_BEFORE_CONVERSION = "Please finalize Quotation before conversion.";
    String ERROR_QUOTATION_WITHOUT_CHARGE = "Oops ! Quotation does not have any charge.";
    String ERROR_SALES_ORDER_WITHOUT_CHARGE = "Oops ! Sales order does not have any charge.";
    String ERROR_SELECT_CONTAINER_BEFORE_CONVERSION = "Please select the container before conversion.";
    String ERROR_BOOKING_NOT_SAVED = "Booking is not saved yet.";
    String ERROR_BOOKING_WITHOUT_CHARGE = "Oops ! Booking does not have any charge.";
    String ERROR_MANIFESTING_FAILED = "Manifesting failed";
    String ERROR_ROLE_NOT_EXIST = "Role does not Exist.";
    String ERROR_PASSWORD_NOT_MATCHING = "Password and Retype Password Must Match.";
    String ERROR_LOGIN_NAME_ALREADY_EXIST = "Login Name is already Exist.";
    String ERROR_ROLE_ALREADY_EXIST = "Role is already Exist.";
    String ERROR_SELECTED_CARRIER_IS_NOT_VALID = "Selected carrier is not valid to send EDI to either Inttra or GT Nexus";
    String ERROR_UNMANIFESTING_FAILED = "Unmanifesting failed !";
    String ERROR_RATED_QUOTE_WITHOUT_RATED_CHARGE = "Rated Quote should have rated charges.";
    String ERROR_RATED_BOOKING_WITHOUT_RATED_CHARGE = "Rated Booking should have rated charges.";
    String ERROR_RATED_SALES_ORDER_WITHOUT_RATED_CHARGE = "Rated salesOrder should have rated charges.";
    String ERROR_PURCHASE_ORDER_WITHOUT_CHARGE = "Purchase Order must have Product";
    String ERROR_BOOKING_NOT_COMPLETED = "Booking is not completed.";
    String ERROR_SALES_ORDER_NOT_SAVED = "Sales Order is not saved yet.";
    String ERROR_AR_NO_PARTY = "No bill to party selected.";
    String ERROR_AR_NO_CHARGE = "No unsend charge found.";
    String ERROR_AC_NO_COST = "No unsend cost found.";
    String ERROR_AC_NO_VENDOR = "Vendor is empty for some costs.";
    String ERROR_AR_NO_SHIPPER = "Selected bill to party - Shipper is empty.";
    String ERROR_AR_NO_CONSIGNEE = "Selected bill to party - Consignee is empty.";
    String ERROR_AR_NO_NOTIFY_PARTY = "Selected bill to party - Notify Party is empty.";
    String ERROR_AR_NO_FORWARDER = "Selected bill to party - Forwarder is empty.";
    String ERROR_AR_NO_AGENT = "Selected bill to party - Agent is empty.";
    String ERROR_AR_NO_THIRD_PARTY = "Selected bill to party - Third Party is empty.";

    String INFO_QUOTE_CONVERTED_TO = "This Quotation has been converted to ";
    String INFO_BOOKING_CONVERTED_TO_BL = "This Booking has been converted to BL.";
    String INFO_BL_IS_MANIFESTED = "BL is manifested.";
    String INFO_BL_AR_SENT = "Bl AR Sent.";
    String INFO_NO_RATES_FOUND = "No rates found. Please try other combination.";
    String INFO_ACCOUNTING_NOT_CONFIGURED = "Accounting is not configured.";
}
