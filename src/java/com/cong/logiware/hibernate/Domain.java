package com.cong.logiware.hibernate;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public interface Domain extends Serializable, Cloneable {

    public Long getId();

    public void setId(Long id);    
}
