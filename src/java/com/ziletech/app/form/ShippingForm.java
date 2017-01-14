package com.ziletech.app.form;

import com.cong.logiware.struts.LogiwareActionForm;

/**
 *
 * @author sks
 */
public class ShippingForm extends LogiwareActionForm {

    private String fullName;
    private String mobilenumber;
    private int pincode;
    private String enterAddressAddressLine1;
    private String enterAddressAddressLine2;
    private String towncity;
    private String state;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getEnterAddressAddressLine1() {
        return enterAddressAddressLine1;
    }

    public void setEnterAddressAddressLine1(String enterAddressAddressLine1) {
        this.enterAddressAddressLine1 = enterAddressAddressLine1;
    }

    public String getEnterAddressAddressLine2() {
        return enterAddressAddressLine2;
    }

    public void setEnterAddressAddressLine2(String enterAddressAddressLine2) {
        this.enterAddressAddressLine2 = enterAddressAddressLine2;
    }

    public String getTowncity() {
        return towncity;
    }

    public void setTowncity(String towncity) {
        this.towncity = towncity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
