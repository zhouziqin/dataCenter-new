package com.ucan.model;

import java.math.BigDecimal;
import java.util.Date;

public class PointConfig {
    private BigDecimal id;

    private String longitude;

    private String dimension;

    private Date fcd;

    private String fcu;

    private Date lmd;

    private String lmu;

    private String status;

    private String type;

    private String foreignId;

    private String tempFeild1;

    private String tempFeild2;

    private String aredId;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension == null ? null : dimension.trim();
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

    public String getForeignId() {
        return foreignId;
    }

    public void setForeignId(String foreignId) {
        this.foreignId = foreignId == null ? null : foreignId.trim();
    }

    public String getTempFeild1() {
        return tempFeild1;
    }

    public void setTempFeild1(String tempFeild1) {
        this.tempFeild1 = tempFeild1 == null ? null : tempFeild1.trim();
    }

    public String getTempFeild2() {
        return tempFeild2;
    }

    public void setTempFeild2(String tempFeild2) {
        this.tempFeild2 = tempFeild2 == null ? null : tempFeild2.trim();
    }

    public String getAredId() {
        return aredId;
    }

    public void setAredId(String aredId) {
        this.aredId = aredId == null ? null : aredId.trim();
    }
}