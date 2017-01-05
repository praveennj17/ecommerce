package com.ziletech.app.form;

import com.cong.logiware.struts.LogiwareActionForm;

/**
 *
 * @author Yukti
 */
public class Admin_LoginForm extends LogiwareActionForm{
private String adminName;
    private String password;
 private String errorMessage;

  
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

      @Override
    public String toString() {
        return "Admin_LoginForm{" + "adminName=" + adminName + ", password=" + password + ", errorMessage=" + errorMessage + '}';
    }
}

