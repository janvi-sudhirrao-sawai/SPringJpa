package com.project.SPringJpa.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="members")
public class Members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="mid")
    private String mid;
    private String mname;
    private String mgender;
    private int mage;
    private String mmobile;
    
    @Column(name="mjoin_year")
    private int mjoinyear;

    
    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMgender() {
        return mgender;
    }

    public void setMgender(String mgender) {
        this.mgender = mgender;
    }

    public int getMage() {
        return mage;
    }

    public void setMage(int mage) {
        this.mage = mage;
    }

    public String getMmobile() {
        return mmobile;
    }

    public void setMmobile(String mmobile) {
        this.mmobile = mmobile;
    }

    public int getMjoin_year() {
        return mjoinyear;
    }

    public void setMjoin_year(int mjoinyear) {
        this.mjoinyear = mjoinyear;
    }
}
