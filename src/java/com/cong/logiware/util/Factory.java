/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.util;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public interface Factory<T extends Object> extends Serializable {

    public T create();
    
}
