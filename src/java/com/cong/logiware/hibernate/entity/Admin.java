package com.cong.logiware.hibernate.entity;

import com.cong.logiware.hibernate.Domain;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author Yukti
 */
@Entity
@Table(name = "admin_login")
public class Admin implements Domain {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
      @Column(name = "adminName")
    private String adminName;
    @Column(name = "password")
    private String password;
    public Admin() {
    }

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
 @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", adminName=" + adminName + ", password=" + password + '}';
    }
}