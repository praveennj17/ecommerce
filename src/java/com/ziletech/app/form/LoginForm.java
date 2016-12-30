package com.ziletech.app.form;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author admin
 */
public class LoginForm extends ActionForm {

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
