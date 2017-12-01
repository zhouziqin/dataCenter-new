
package com.ucan.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workorder", propOrder = {
    "currentnode",
    "currentseatid",
    "fcd",
    "fcu",
    "fkcustomeruuid",
    "fktaskid",
    "lmd",
    "lmu",
    "phoneNo",
    "templatefield1",
    "templatefield2",
    "templatefield3",
    "templatefield4",
    "total",
    "totalPages",
    "workorderid",
    "workorderno",
    "workorderparam",
    "workorderstates"
})
public class Workorder {

    protected String currentnode;
    protected String currentseatid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fcd;
    protected String fcu;
    protected String fkcustomeruuid;
    protected String fktaskid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lmd;
    protected String lmu;
    protected String phoneNo;
    protected String templatefield1;
    protected String templatefield2;
    protected String templatefield3;
    protected String templatefield4;
    protected long total;
    protected Integer totalPages;
    protected String workorderid;
    protected String workorderno;
    protected String workorderparam;
    protected String workorderstates;

    /**
     * ��ȡcurrentnode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentnode() {
        return currentnode;
    }

    /**
     * ����currentnode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentnode(String value) {
        this.currentnode = value;
    }

    /**
     * ��ȡcurrentseatid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentseatid() {
        return currentseatid;
    }

    /**
     * ����currentseatid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentseatid(String value) {
        this.currentseatid = value;
    }

    /**
     * ��ȡfcd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFcd() {
        return fcd;
    }

    /**
     * ����fcd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFcd(XMLGregorianCalendar value) {
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
     * ��ȡfkcustomeruuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkcustomeruuid() {
        return fkcustomeruuid;
    }

    /**
     * ����fkcustomeruuid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkcustomeruuid(String value) {
        this.fkcustomeruuid = value;
    }

    /**
     * ��ȡfktaskid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFktaskid() {
        return fktaskid;
    }

    /**
     * ����fktaskid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFktaskid(String value) {
        this.fktaskid = value;
    }

    /**
     * ��ȡlmd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLmd() {
        return lmd;
    }

    /**
     * ����lmd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLmd(XMLGregorianCalendar value) {
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
     * ��ȡtotal���Ե�ֵ��
     * 
     */
    public long getTotal() {
        return total;
    }

    /**
     * ����total���Ե�ֵ��
     * 
     */
    public void setTotal(long value) {
        this.total = value;
    }

    /**
     * ��ȡtotalPages���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * ����totalPages���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPages(Integer value) {
        this.totalPages = value;
    }

    /**
     * ��ȡworkorderid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkorderid() {
        return workorderid;
    }

    /**
     * ����workorderid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkorderid(String value) {
        this.workorderid = value;
    }

    /**
     * ��ȡworkorderno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkorderno() {
        return workorderno;
    }

    /**
     * ����workorderno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkorderno(String value) {
        this.workorderno = value;
    }

    /**
     * ��ȡworkorderparam���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkorderparam() {
        return workorderparam;
    }

    /**
     * ����workorderparam���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkorderparam(String value) {
        this.workorderparam = value;
    }

    /**
     * ��ȡworkorderstates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkorderstates() {
        return workorderstates;
    }

    /**
     * ����workorderstates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkorderstates(String value) {
        this.workorderstates = value;
    }

}
