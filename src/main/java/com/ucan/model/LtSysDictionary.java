package com.ucan.model;

import java.util.Date;

public class LtSysDictionary {
    private Integer id;

    private String code;

    private String name;

    private Date fcd;

    private String fcu;

    private Date lmd;

    private String lmu;

    private String status;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getFcd() {
        return fcd;
    }

    public void setFcd(Date fcd) {
        this.fcd = fcd;
    }

    public String getFcu() {
        return fcu;
    }

    public void setFcu(String fcu) {
        this.fcu = fcu == null ? null : fcu.trim();
    }

    public Date getLmd() {
        return lmd;
    }

    public void setLmd(Date lmd) {
        this.lmd = lmd;
    }

    public String getLmu() {
        return lmu;
    }

    public void setLmu(String lmu) {
        this.lmu = lmu == null ? null : lmu.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}