package com.ucan.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "b2BOrderExample", propOrder = {
    "accountno",
    "accountsDate",
    "approvestate",
    "appuserStatus",
    "beginBalance",
    "caseDesc",
    "changeOrderNo",
    "contact",
    "count",
    "currentServicePrice",
    "cusTel",
    "custType",
    "distinct",
    "endBalance",
    "fcd",
    "fcu",
    "firstServiceContent",
    "fkCustomerId",
    "fkFirstSupplyId",
    "fkLastSupplyId",
    "fkServiceId",
    "fkServiceId1",
    "fkServiceId2",
    "fkServiceUserId",
    "fkTaskId",
    "fkTopSupplyId",
    "followDate",
    "gmtPayment",
    "lastServiceContent",
    "lmd",
    "lmu",
    "newOrder",
    "orderByClause",
    "orderDate",
    "orderEnddate",
    "orderNo",
    "orderRela",
    "orderSource",
    "orderStates",
    "otherType",
    "payAmount",
    "payWay",
    "phoneNo",
    "preferentialNo",
    "preferentialType",
    "rebate",
    "remarkTag",
    "reserveDate",
    "serviceCount",
    "serviceEndTime",
    "serviceStartTime",
    "serviceStatus",
    "serviceTag",
    "supplierStatus",
    "templatefield1",
    "templatefield2",
    "templatefield3",
    "templatefield4",
    "transactionId",
    "type",
    "uuid",
    "workflowStates",
    "year"
})
public class B2BOrderExample {

    protected String accountno;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date accountsDate;
    protected String approvestate;
    protected String appuserStatus;
    protected BigDecimal beginBalance;
    protected String caseDesc;
    protected String changeOrderNo;
    protected String contact;
    protected Integer count;
    protected BigDecimal currentServicePrice;
    protected String cusTel;
    protected String custType;
    protected boolean distinct;
    protected BigDecimal endBalance;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date fcd;
    protected String fcu;
    protected String firstServiceContent;
    protected String fkCustomerId;
    protected String fkFirstSupplyId;
    protected String fkLastSupplyId;
    protected String fkServiceId;
    protected Long fkServiceId1;
    protected Long fkServiceId2;
    protected String fkServiceUserId;
    protected String fkTaskId;
    protected String fkTopSupplyId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date followDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date gmtPayment;
    protected String lastServiceContent;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date lmd;
    protected String lmu;
    protected String newOrder;
    protected String orderByClause;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date orderDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date orderEnddate;
    protected String orderNo;
    protected String orderRela;
    protected String orderSource;
    protected String orderStates;
    protected String otherType;
    protected BigDecimal payAmount;
    protected String payWay;
    protected String phoneNo;
    protected String preferentialNo;
    protected String preferentialType;
    protected BigDecimal rebate;
    protected String remarkTag;
    protected String reserveDate;
    protected BigDecimal serviceCount;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date serviceEndTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date serviceStartTime;
    protected String serviceStatus;
    protected String serviceTag;
    protected String supplierStatus;
    protected String templatefield1;
    protected String templatefield2;
    protected String templatefield3;
    protected String templatefield4;
    protected String transactionId;
    protected String type;
    protected String uuid;
    protected String workflowStates;
    protected String year;

    /**
     * ��ȡaccountno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountno() {
        return accountno;
    }

    /**
     * ����accountno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountno(String value) {
        this.accountno = value;
    }

    /**
     * ��ȡaccountsDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAccountsDate() {
        return accountsDate;
    }

    /**
     * ����accountsDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountsDate(Date value) {
        this.accountsDate = value;
    }

    /**
     * ��ȡapprovestate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovestate() {
        return approvestate;
    }

    /**
     * ����approvestate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovestate(String value) {
        this.approvestate = value;
    }

    /**
     * ��ȡappuserStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppuserStatus() {
        return appuserStatus;
    }

    /**
     * ����appuserStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppuserStatus(String value) {
        this.appuserStatus = value;
    }

    /**
     * ��ȡbeginBalance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeginBalance() {
        return beginBalance;
    }

    /**
     * ����beginBalance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeginBalance(BigDecimal value) {
        this.beginBalance = value;
    }

    /**
     * ��ȡcaseDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseDesc() {
        return caseDesc;
    }

    /**
     * ����caseDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseDesc(String value) {
        this.caseDesc = value;
    }

    /**
     * ��ȡchangeOrderNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeOrderNo() {
        return changeOrderNo;
    }

    /**
     * ����changeOrderNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeOrderNo(String value) {
        this.changeOrderNo = value;
    }

    /**
     * ��ȡcontact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * ����contact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * ��ȡcount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * ����count���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * ��ȡcurrentServicePrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentServicePrice() {
        return currentServicePrice;
    }

    /**
     * ����currentServicePrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentServicePrice(BigDecimal value) {
        this.currentServicePrice = value;
    }

    /**
     * ��ȡcusTel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusTel() {
        return cusTel;
    }

    /**
     * ����cusTel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusTel(String value) {
        this.cusTel = value;
    }

    /**
     * ��ȡcustType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * ����custType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * ��ȡdistinct���Ե�ֵ��
     * 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * ����distinct���Ե�ֵ��
     * 
     */
    public void setDistinct(boolean value) {
        this.distinct = value;
    }

    /**
     * ��ȡendBalance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndBalance() {
        return endBalance;
    }

    /**
     * ����endBalance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndBalance(BigDecimal value) {
        this.endBalance = value;
    }

    /**
     * ��ȡfcd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFcd() {
        return fcd;
    }

    /**
     * ����fcd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcd(Date value) {
        this.fcd = value;
    }

    /**
     * ��ȡfcu���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcu() {
        return fcu;
    }

    /**
     * ����fcu���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcu(String value) {
        this.fcu = value;
    }

    /**
     * ��ȡfirstServiceContent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstServiceContent() {
        return firstServiceContent;
    }

    /**
     * ����firstServiceContent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstServiceContent(String value) {
        this.firstServiceContent = value;
    }

    /**
     * ��ȡfkCustomerId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkCustomerId() {
        return fkCustomerId;
    }

    /**
     * ����fkCustomerId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkCustomerId(String value) {
        this.fkCustomerId = value;
    }

    /**
     * ��ȡfkFirstSupplyId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkFirstSupplyId() {
        return fkFirstSupplyId;
    }

    /**
     * ����fkFirstSupplyId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkFirstSupplyId(String value) {
        this.fkFirstSupplyId = value;
    }

    /**
     * ��ȡfkLastSupplyId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkLastSupplyId() {
        return fkLastSupplyId;
    }

    /**
     * ����fkLastSupplyId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkLastSupplyId(String value) {
        this.fkLastSupplyId = value;
    }

    /**
     * ��ȡfkServiceId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkServiceId() {
        return fkServiceId;
    }

    /**
     * ����fkServiceId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkServiceId(String value) {
        this.fkServiceId = value;
    }

    /**
     * ��ȡfkServiceId1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFkServiceId1() {
        return fkServiceId1;
    }

    /**
     * ����fkServiceId1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFkServiceId1(Long value) {
        this.fkServiceId1 = value;
    }

    /**
     * ��ȡfkServiceId2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFkServiceId2() {
        return fkServiceId2;
    }

    /**
     * ����fkServiceId2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFkServiceId2(Long value) {
        this.fkServiceId2 = value;
    }

    /**
     * ��ȡfkServiceUserId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkServiceUserId() {
        return fkServiceUserId;
    }

    /**
     * ����fkServiceUserId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkServiceUserId(String value) {
        this.fkServiceUserId = value;
    }

    /**
     * ��ȡfkTaskId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkTaskId() {
        return fkTaskId;
    }

    /**
     * ����fkTaskId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkTaskId(String value) {
        this.fkTaskId = value;
    }

    /**
     * ��ȡfkTopSupplyId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkTopSupplyId() {
        return fkTopSupplyId;
    }

    /**
     * ����fkTopSupplyId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkTopSupplyId(String value) {
        this.fkTopSupplyId = value;
    }

    /**
     * ��ȡfollowDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFollowDate() {
        return followDate;
    }

    /**
     * ����followDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowDate(Date value) {
        this.followDate = value;
    }

    /**
     * ��ȡgmtPayment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getGmtPayment() {
        return gmtPayment;
    }

    /**
     * ����gmtPayment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmtPayment(Date value) {
        this.gmtPayment = value;
    }

    /**
     * ��ȡlastServiceContent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastServiceContent() {
        return lastServiceContent;
    }

    /**
     * ����lastServiceContent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastServiceContent(String value) {
        this.lastServiceContent = value;
    }

    /**
     * ��ȡlmd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLmd() {
        return lmd;
    }

    /**
     * ����lmd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLmd(Date value) {
        this.lmd = value;
    }

    /**
     * ��ȡlmu���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmu() {
        return lmu;
    }

    /**
     * ����lmu���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLmu(String value) {
        this.lmu = value;
    }

    /**
     * ��ȡnewOrder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewOrder() {
        return newOrder;
    }

    /**
     * ����newOrder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewOrder(String value) {
        this.newOrder = value;
    }

    /**
     * ��ȡorderByClause���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * ����orderByClause���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderByClause(String value) {
        this.orderByClause = value;
    }

    /**
     * ��ȡorderDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * ����orderDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(Date value) {
        this.orderDate = value;
    }

    /**
     * ��ȡorderEnddate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getOrderEnddate() {
        return orderEnddate;
    }

    /**
     * ����orderEnddate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderEnddate(Date value) {
        this.orderEnddate = value;
    }

    /**
     * ��ȡorderNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * ����orderNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * ��ȡorderRela���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderRela() {
        return orderRela;
    }

    /**
     * ����orderRela���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderRela(String value) {
        this.orderRela = value;
    }

    /**
     * ��ȡorderSource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSource() {
        return orderSource;
    }

    /**
     * ����orderSource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSource(String value) {
        this.orderSource = value;
    }

    /**
     * ��ȡorderStates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStates() {
        return orderStates;
    }

    /**
     * ����orderStates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStates(String value) {
        this.orderStates = value;
    }

    /**
     * ��ȡotherType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherType() {
        return otherType;
    }

    /**
     * ����otherType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherType(String value) {
        this.otherType = value;
    }

    /**
     * ��ȡpayAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * ����payAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayAmount(BigDecimal value) {
        this.payAmount = value;
    }

    /**
     * ��ȡpayWay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayWay() {
        return payWay;
    }

    /**
     * ����payWay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayWay(String value) {
        this.payWay = value;
    }

    /**
     * ��ȡphoneNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * ����phoneNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNo(String value) {
        this.phoneNo = value;
    }

    /**
     * ��ȡpreferentialNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferentialNo() {
        return preferentialNo;
    }

    /**
     * ����preferentialNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferentialNo(String value) {
        this.preferentialNo = value;
    }

    /**
     * ��ȡpreferentialType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferentialType() {
        return preferentialType;
    }

    /**
     * ����preferentialType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferentialType(String value) {
        this.preferentialType = value;
    }

    /**
     * ��ȡrebate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRebate() {
        return rebate;
    }

    /**
     * ����rebate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRebate(BigDecimal value) {
        this.rebate = value;
    }

    /**
     * ��ȡremarkTag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkTag() {
        return remarkTag;
    }

    /**
     * ����remarkTag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkTag(String value) {
        this.remarkTag = value;
    }

    /**
     * ��ȡreserveDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveDate() {
        return reserveDate;
    }

    /**
     * ����reserveDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveDate(String value) {
        this.reserveDate = value;
    }

    /**
     * ��ȡserviceCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceCount() {
        return serviceCount;
    }

    /**
     * ����serviceCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceCount(BigDecimal value) {
        this.serviceCount = value;
    }

    /**
     * ��ȡserviceEndTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getServiceEndTime() {
        return serviceEndTime;
    }

    /**
     * ����serviceEndTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceEndTime(Date value) {
        this.serviceEndTime = value;
    }

    /**
     * ��ȡserviceStartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getServiceStartTime() {
        return serviceStartTime;
    }

    /**
     * ����serviceStartTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStartTime(Date value) {
        this.serviceStartTime = value;
    }

    /**
     * ��ȡserviceStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * ����serviceStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * ��ȡserviceTag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTag() {
        return serviceTag;
    }

    /**
     * ����serviceTag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTag(String value) {
        this.serviceTag = value;
    }

    /**
     * ��ȡsupplierStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierStatus() {
        return supplierStatus;
    }

    /**
     * ����supplierStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierStatus(String value) {
        this.supplierStatus = value;
    }

    /**
     * ��ȡtemplatefield1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplatefield1() {
        return templatefield1;
    }

    /**
     * ����templatefield1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplatefield1(String value) {
        this.templatefield1 = value;
    }

    /**
     * ��ȡtemplatefield2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplatefield2() {
        return templatefield2;
    }

    /**
     * ����templatefield2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplatefield2(String value) {
        this.templatefield2 = value;
    }

    /**
     * ��ȡtemplatefield3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplatefield3() {
        return templatefield3;
    }

    /**
     * ����templatefield3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplatefield3(String value) {
        this.templatefield3 = value;
    }

    /**
     * ��ȡtemplatefield4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplatefield4() {
        return templatefield4;
    }

    /**
     * ����templatefield4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplatefield4(String value) {
        this.templatefield4 = value;
    }

    /**
     * ��ȡtransactionId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * ����transactionId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * ��ȡuuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * ����uuid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * ��ȡworkflowStates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowStates() {
        return workflowStates;
    }

    /**
     * ����workflowStates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowStates(String value) {
        this.workflowStates = value;
    }

    /**
     * ��ȡyear���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * ����year���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

}
