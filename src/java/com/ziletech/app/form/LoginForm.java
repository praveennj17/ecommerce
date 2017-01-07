package com.ziletech.app.form;

import com.cong.logiware.struts.LogiwareActionForm;

/**
 *
 * @author admin
 */
public class LoginForm extends LogiwareActionForm {

    private String userName;
    private String password;
    private String errorMessage;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        return "LoginForm{" + "userName=" + userName + ", password=" + password + '}';
    }
    
}
