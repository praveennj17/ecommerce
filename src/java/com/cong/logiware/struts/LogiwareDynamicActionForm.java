/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.struts;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sunil
 */
public class LogiwareDynamicActionForm extends LogiwareActionForm {

    private final Map values = new HashMap();
    private int count;
    private String page;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Map getValues() {
        return values;
    }

    public void setValue(String key, Object value) {
        values.put(key, value);
    }

    public Object getValue(String key) {
        return values.get(key);
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

}
