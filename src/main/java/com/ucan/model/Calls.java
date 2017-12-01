package com.ucan.model;

import java.math.BigDecimal;
import java.util.Date;

public class Calls {
    private BigDecimal inum;

    private BigDecimal nextinum;

    private BigDecimal previnum;

    private Date startedat;

    private Date startedatutc;

    private BigDecimal channel;

    private Integer primarykey;

    private Boolean outgoing;

    private Boolean internal;

    private Boolean tandem;

    private Boolean nocallend;

    private Boolean nocallstart;

    private Boolean possibleoverlap;

    private Boolean recording;

    private Boolean barreplay;

    private Boolean extradata;

    private Boolean warntoneapplied;

    private Boolean mixed;

    private Boolean parent;

    private Boolean child;

    private Byte startevent;

    private Byte stopevent;

    private Short formatid;

    private Integer length;

    private Short duration;

    private BigDecimal startbyte;

    private String digits;

    private String userfield1;

    private String userfield2;

    private String userfield3;

    private String userfield4;

    private String userfield5;

    private String userfield6;

    private String userfield7;

    private String userfield8;

    private String userfield9;

    private String userfield10;

    private String userfield11;

    private String userfield12;

    private String userfield13;

    private String userfield14;

    private String userfield15;

    private Date lasttagtime;

    private Date itemmodifieddatetime;

    public BigDecimal getInum() {
        return inum;
    }

    public void setInum(BigDecimal inum) {
        this.inum = inum;
    }

    public BigDecimal getNextinum() {
        return nextinum;
    }

    public void setNextinum(BigDecimal nextinum) {
        this.nextinum = nextinum;
    }

    public BigDecimal getPrevinum() {
        return previnum;
    }

    public void setPrevinum(BigDecimal previnum) {
        this.previnum = previnum;
    }

    public Date getStartedat() {
        return startedat;
    }

    public void setStartedat(Date startedat) {
        this.startedat = startedat;
    }

    public Date getStartedatutc() {
        return startedatutc;
    }

    public void setStartedatutc(Date startedatutc) {
        this.startedatutc = startedatutc;
    }

    public BigDecimal getChannel() {
        return channel;
    }

    public void setChannel(BigDecimal channel) {
        this.channel = channel;
    }

    public Integer getPrimarykey() {
        return primarykey;
    }

    public void setPrimarykey(Integer primarykey) {
        this.primarykey = primarykey;
    }

    public Boolean getOutgoing() {
        return outgoing;
    }

    public void setOutgoing(Boolean outgoing) {
        this.outgoing = outgoing;
    }

    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public Boolean getTandem() {
        return tandem;
    }

    public void setTandem(Boolean tandem) {
        this.tandem = tandem;
    }

    public Boolean getNocallend() {
        return nocallend;
    }

    public void setNocallend(Boolean nocallend) {
        this.nocallend = nocallend;
    }

    public Boolean getNocallstart() {
        return nocallstart;
    }

    public void setNocallstart(Boolean nocallstart) {
        this.nocallstart = nocallstart;
    }

    public Boolean getPossibleoverlap() {
        return possibleoverlap;
    }

    public void setPossibleoverlap(Boolean possibleoverlap) {
        this.possibleoverlap = possibleoverlap;
    }

    public Boolean getRecording() {
        return recording;
    }

    public void setRecording(Boolean recording) {
        this.recording = recording;
    }

    public Boolean getBarreplay() {
        return barreplay;
    }

    public void setBarreplay(Boolean barreplay) {
        this.barreplay = barreplay;
    }

    public Boolean getExtradata() {
        return extradata;
    }

    public void setExtradata(Boolean extradata) {
        this.extradata = extradata;
    }

    public Boolean getWarntoneapplied() {
        return warntoneapplied;
    }

    public void setWarntoneapplied(Boolean warntoneapplied) {
        this.warntoneapplied = warntoneapplied;
    }

    public Boolean getMixed() {
        return mixed;
    }

    public void setMixed(Boolean mixed) {
        this.mixed = mixed;
    }

    public Boolean getParent() {
        return parent;
    }

    public void setParent(Boolean parent) {
        this.parent = parent;
    }

    public Boolean getChild() {
        return child;
    }

    public void setChild(Boolean child) {
        this.child = child;
    }

    public Byte getStartevent() {
        return startevent;
    }

    public void setStartevent(Byte startevent) {
        this.startevent = startevent;
    }

    public Byte getStopevent() {
        return stopevent;
    }

    public void setStopevent(Byte stopevent) {
        this.stopevent = stopevent;
    }

    public Short getFormatid() {
        return formatid;
    }

    public void setFormatid(Short formatid) {
        this.formatid = formatid;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Short getDuration() {
        return duration;
    }

    public void setDuration(Short duration) {
        this.duration = duration;
    }

    public BigDecimal getStartbyte() {
        return startbyte;
    }

    public void setStartbyte(BigDecimal startbyte) {
        this.startbyte = startbyte;
    }

    public String getDigits() {
        return digits;
    }

    public void setDigits(String digits) {
        this.digits = digits == null ? null : digits.trim();
    }

    public String getUserfield1() {
        return userfield1;
    }

    public void setUserfield1(String userfield1) {
        this.userfield1 = userfield1 == null ? null : userfield1.trim();
    }

    public String getUserfield2() {
        return userfield2;
    }

    public void setUserfield2(String userfield2) {
        this.userfield2 = userfield2 == null ? null : userfield2.trim();
    }

    public String getUserfield3() {
        return userfield3;
    }

    public void setUserfield3(String userfield3) {
        this.userfield3 = userfield3 == null ? null : userfield3.trim();
    }

    public String getUserfield4() {
        return userfield4;
    }

    public void setUserfield4(String userfield4) {
        this.userfield4 = userfield4 == null ? null : userfield4.trim();
    }

    public String getUserfield5() {
        return userfield5;
    }

    public void setUserfield5(String userfield5) {
        this.userfield5 = userfield5 == null ? null : userfield5.trim();
    }

    public String getUserfield6() {
        return userfield6;
    }

    public void setUserfield6(String userfield6) {
        this.userfield6 = userfield6 == null ? null : userfield6.trim();
    }

    public String getUserfield7() {
        return userfield7;
    }

    public void setUserfield7(String userfield7) {
        this.userfield7 = userfield7 == null ? null : userfield7.trim();
    }

    public String getUserfield8() {
        return userfield8;
    }

    public void setUserfield8(String userfield8) {
        this.userfield8 = userfield8 == null ? null : userfield8.trim();
    }

    public String getUserfield9() {
        return userfield9;
    }

    public void setUserfield9(String userfield9) {
        this.userfield9 = userfield9 == null ? null : userfield9.trim();
    }

    public String getUserfield10() {
        return userfield10;
    }

    public void setUserfield10(String userfield10) {
        this.userfield10 = userfield10 == null ? null : userfield10.trim();
    }

    public String getUserfield11() {
        return userfield11;
    }

    public void setUserfield11(String userfield11) {
        this.userfield11 = userfield11 == null ? null : userfield11.trim();
    }

    public String getUserfield12() {
        return userfield12;
    }

    public void setUserfield12(String userfield12) {
        this.userfield12 = userfield12 == null ? null : userfield12.trim();
    }

    public String getUserfield13() {
        return userfield13;
    }

    public void setUserfield13(String userfield13) {
        this.userfield13 = userfield13 == null ? null : userfield13.trim();
    }

    public String getUserfield14() {
        return userfield14;
    }

    public void setUserfield14(String userfield14) {
        this.userfield14 = userfield14 == null ? null : userfield14.trim();
    }

    public String getUserfield15() {
        return userfield15;
    }

    public void setUserfield15(String userfield15) {
        this.userfield15 = userfield15 == null ? null : userfield15.trim();
    }

    public Date getLasttagtime() {
        return lasttagtime;
    }

    public void setLasttagtime(Date lasttagtime) {
        this.lasttagtime = lasttagtime;
    }

    public Date getItemmodifieddatetime() {
        return itemmodifieddatetime;
    }

    public void setItemmodifieddatetime(Date itemmodifieddatetime) {
        this.itemmodifieddatetime = itemmodifieddatetime;
    }
}