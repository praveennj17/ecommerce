package com.ziletech.app.form;

import com.cong.logiware.struts.LogiwareActionForm;

/**
 *
 * @author Yukti
 */
public class Admin_ProductForm extends LogiwareActionForm {

    private String category;
    private String name;
    private String price;
    private String description;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Admin_ProductForm{" + "category=" + category + ", name=" + name + ", price=" + price + ", description=" + description + '}';
    }
}
