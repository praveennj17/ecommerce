package com.ziletech.app.form;

import com.cong.logiware.struts.LogiwareActionForm;

/**
 *
 * @author Yukti
 */
public class AdminProductForm extends LogiwareActionForm
{

   
private String category;
private String name;
private String description;
private int price;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   

 @Override
    public String toString() {
        return "AdminProductForm{" + "category=" + category + ", name=" + name + ", description=" + description + ", price=" + price + '}';
    }
}
