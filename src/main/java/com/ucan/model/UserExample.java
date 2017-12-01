package com.ucan.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userExample", propOrder = {
    "activate",
    "activateTime",
    "activateUser",
    "address",
    "address1",
    "address2",
    "address3",
    "approveversion",
    "beginDate",
    "birthday",
    "bloodType",
    "cardnumber",
    "careRequirement",
    "city",
    "city2",
    "committee",
    "committee2",
    "custtype",
    "custtype2",
    "deleteTime",
    "deleteUser",
    "education",
    "email",
    "employment",
    "endDate",
    "fcd",
    "fcu",
    "fkLbossCustid",
    "fkLbossCustno",
    "gender",
    "id",
    "idea",
    "isNew",
    "isdeleted",
    "ittcode",
    "lifeService",
    "lmd",
    "lmu",
    "maritalstatus",
    "medicarecode",
    "memorialday",
    "mobilePhone",
    "name",
    "nation",
    "natureaccount",
    "noVoice",
    "orderByClause",
    "positionjob",
    "province",
    "province2",
    "remark",
    "sid",
    "telphone",
    "tempFeild1",
    "tempFeild2",
    "tempFeild3",
    "town",
    "town2",
    "uuid",
    "workunit",
    "zipcode",
    "zipcode2"
})
public class UserExample {

    protected String activate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date activateTime;
    protected String activateUser;
    protected String address;
    protected String address1;
    protected String address2;
    protected String address3;
    protected String approveversion;
    @XmlElement(name = "begin_date")
    protected String beginDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date birthday;
    protected String bloodType;
    protected String cardnumber;
    protected String careRequirement;
    protected String city;
    protected String city2;
    protected String committee;
    protected String committee2;
    protected Long custtype;
    protected Long custtype2;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date deleteTime;
    protected String deleteUser;
    protected String education;
    protected String email;
    protected String employment;
    @XmlElement(name = "end_date")
    protected String endDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date fcd;
    protected String fcu;
    protected Long fkLbossCustid;
    protected String fkLbossCustno;
    protected String gender;
    protected Long id;
    protected String idea;
    protected String isNew;
    protected String isdeleted;
    protected String ittcode;
    protected String lifeService;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date lmd;
    protected String lmu;
    protected String maritalstatus;
    protected String medicarecode;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date memorialday;
    protected String mobilePhone;
    protected String name;
    protected String nation;
    protected String natureaccount;
    protected String noVoice;
    protected String orderByClause;
    protected String positionjob;
    protected String province;
    protected String province2;
    protected String remark;
    protected String sid;
    protected String telphone;
    protected String tempFeild1;
    protected String tempFeild2;
    protected String tempFeild3;
    protected String town;
    protected String town2;
    protected String uuid;
    protected String workunit;
    protected String zipcode;
    protected String zipcode2;

    /**
     * ��ȡactivate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivate() {
        return activate;
    }

    /**
     * ����activate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivate(String value) {
        this.activate = value;
    }

    /**
     * ��ȡactivateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getActivateTime() {
        return activateTime;
    }

    /**
     * ����activateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivateTime(Date value) {
        this.activateTime = value;
    }

    /**
     * ��ȡactivateUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivateUser() {
        return activateUser;
    }

    /**
     * ����activateUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivateUser(String value) {
        this.activateUser = value;
    }

    /**
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * ��ȡaddress1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * ����address1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * ��ȡaddress2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * ����address2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * ��ȡaddress3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * ����address3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * ��ȡapproveversion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveversion() {
        return approveversion;
    }

    /**
     * ����approveversion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveversion(String value) {
        this.approveversion = value;
    }

    /**
     * ��ȡbeginDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * ����beginDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(String value) {
        this.beginDate = value;
    }

    /**
     * ��ȡbirthday���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * ����birthday���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(Date value) {
        this.birthday = value;
    }

    /**
     * ��ȡbloodType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloodType() {
        return bloodType;
    }

    /**
     * ����bloodType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloodType(String value) {
        this.bloodType = value;
    }

    /**
     * ��ȡcardnumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardnumber() {
        return cardnumber;
    }

    /**
     * ����cardnumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardnumber(String value) {
        this.cardnumber = value;
    }

    /**
     * ��ȡcareRequirement���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareRequirement() {
        return careRequirement;
    }

    /**
     * ����careRequirement���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareRequirement(String value) {
        this.careRequirement = value;
    }

    /**
     * ��ȡcity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * ����city���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * ��ȡcity2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity2() {
        return city2;
    }

    /**
     * ����city2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity2(String value) {
        this.city2 = value;
    }

    /**
     * ��ȡcommittee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommittee() {
        return committee;
    }

    /**
     * ����committee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommittee(String value) {
        this.committee = value;
    }

    /**
     * ��ȡcommittee2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommittee2() {
        return committee2;
    }

    /**
     * ����committee2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommittee2(String value) {
        this.committee2 = value;
    }

    /**
     * ��ȡcusttype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCusttype() {
        return custtype;
    }

    /**
     * ����custtype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCusttype(Long value) {
        this.custtype = value;
    }

    /**
     * ��ȡcusttype2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCusttype2() {
        return custtype2;
    }

    /**
     * ����custtype2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCusttype2(Long value) {
        this.custtype2 = value;
    }

    /**
     * ��ȡdeleteTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * ����deleteTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteTime(Date value) {
        this.deleteTime = value;
    }

    /**
     * ��ȡdeleteUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteUser() {
        return deleteUser;
    }

    /**
     * ����deleteUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteUser(String value) {
        this.deleteUser = value;
    }

    /**
     * ��ȡeducation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducation() {
        return education;
    }

    /**
     * ����education���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducation(String value) {
        this.education = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * ��ȡemployment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployment() {
        return employment;
    }

    /**
     * ����employment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployment(String value) {
        this.employment = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
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
     * ��ȡfkLbossCustid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFkLbossCustid() {
        return fkLbossCustid;
    }

    /**
     * ����fkLbossCustid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFkLbossCustid(Long value) {
        this.fkLbossCustid = value;
    }

    /**
     * ��ȡfkLbossCustno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkLbossCustno() {
        return fkLbossCustno;
    }

    /**
     * ����fkLbossCustno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkLbossCustno(String value) {
        this.fkLbossCustno = value;
    }

    /**
     * ��ȡgender���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * ����gender���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * ��ȡidea���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdea() {
        return idea;
    }

    /**
     * ����idea���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdea(String value) {
        this.idea = value;
    }

    /**
     * ��ȡisNew���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNew() {
        return isNew;
    }

    /**
     * ����isNew���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNew(String value) {
        this.isNew = value;
    }

    /**
     * ��ȡisdeleted���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsdeleted() {
        return isdeleted;
    }

    /**
     * ����isdeleted���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdeleted(String value) {
        this.isdeleted = value;
    }

    /**
     * ��ȡittcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIttcode() {
        return ittcode;
    }

    /**
     * ����ittcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIttcode(String value) {
        this.ittcode = value;
    }

    /**
     * ��ȡlifeService���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeService() {
        return lifeService;
    }

    /**
     * ����lifeService���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeService(String value) {
        this.lifeService = value;
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
     * ��ȡmaritalstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalstatus() {
        return maritalstatus;
    }

    /**
     * ����maritalstatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalstatus(String value) {
        this.maritalstatus = value;
    }

    /**
     * ��ȡmedicarecode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicarecode() {
        return medicarecode;
    }

    /**
     * ����medicarecode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicarecode(String value) {
        this.medicarecode = value;
    }

    /**
     * ��ȡmemorialday���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getMemorialday() {
        return memorialday;
    }

    /**
     * ����memorialday���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemorialday(Date value) {
        this.memorialday = value;
    }

    /**
     * ��ȡmobilePhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * ����mobilePhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡnation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNation() {
        return nation;
    }

    /**
     * ����nation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNation(String value) {
        this.nation = value;
    }

    /**
     * ��ȡnatureaccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureaccount() {
        return natureaccount;
    }

    /**
     * ����natureaccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureaccount(String value) {
        this.natureaccount = value;
    }

    /**
     * ��ȡnoVoice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoVoice() {
        return noVoice;
    }

    /**
     * ����noVoice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoVoice(String value) {
        this.noVoice = value;
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
     * ��ȡpositionjob���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionjob() {
        return positionjob;
    }

    /**
     * ����positionjob���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionjob(String value) {
        this.positionjob = value;
    }

    /**
     * ��ȡprovince���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * ����province���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * ��ȡprovince2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince2() {
        return province2;
    }

    /**
     * ����province2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince2(String value) {
        this.province2 = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * ��ȡsid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSid() {
        return sid;
    }

    /**
     * ����sid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSid(String value) {
        this.sid = value;
    }

    /**
     * ��ȡtelphone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * ����telphone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelphone(String value) {
        this.telphone = value;
    }

    /**
     * ��ȡtempFeild1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempFeild1() {
        return tempFeild1;
    }

    /**
     * ����tempFeild1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempFeild1(String value) {
        this.tempFeild1 = value;
    }

    /**
     * ��ȡtempFeild2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempFeild2() {
        return tempFeild2;
    }

    /**
     * ����tempFeild2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempFeild2(String value) {
        this.tempFeild2 = value;
    }

    /**
     * ��ȡtempFeild3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempFeild3() {
        return tempFeild3;
    }

    /**
     * ����tempFeild3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempFeild3(String value) {
        this.tempFeild3 = value;
    }

    /**
     * ��ȡtown���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * ����town���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * ��ȡtown2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown2() {
        return town2;
    }

    /**
     * ����town2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown2(String value) {
        this.town2 = value;
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
     * ��ȡworkunit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkunit() {
        return workunit;
    }

    /**
     * ����workunit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkunit(String value) {
        this.workunit = value;
    }

    /**
     * ��ȡzipcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * ����zipcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipcode(String value) {
        this.zipcode = value;
    }

    /**
     * ��ȡzipcode2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipcode2() {
        return zipcode2;
    }

    /**
     * ����zipcode2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipcode2(String value) {
        this.zipcode2 = value;
    }

}
