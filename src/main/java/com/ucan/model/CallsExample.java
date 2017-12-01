package com.ucan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CallsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andInumIsNull() {
            addCriterion("INum is null");
            return (Criteria) this;
        }

        public Criteria andInumIsNotNull() {
            addCriterion("INum is not null");
            return (Criteria) this;
        }

        public Criteria andInumEqualTo(BigDecimal value) {
            addCriterion("INum =", value, "inum");
            return (Criteria) this;
        }

        public Criteria andInumNotEqualTo(BigDecimal value) {
            addCriterion("INum <>", value, "inum");
            return (Criteria) this;
        }

        public Criteria andInumGreaterThan(BigDecimal value) {
            addCriterion("INum >", value, "inum");
            return (Criteria) this;
        }

        public Criteria andInumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INum >=", value, "inum");
            return (Criteria) this;
        }

        public Criteria andInumLessThan(BigDecimal value) {
            addCriterion("INum <", value, "inum");
            return (Criteria) this;
        }

        public Criteria andInumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INum <=", value, "inum");
            return (Criteria) this;
        }

        public Criteria andInumIn(List<BigDecimal> values) {
            addCriterion("INum in", values, "inum");
            return (Criteria) this;
        }

        public Criteria andInumNotIn(List<BigDecimal> values) {
            addCriterion("INum not in", values, "inum");
            return (Criteria) this;
        }

        public Criteria andInumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INum between", value1, value2, "inum");
            return (Criteria) this;
        }

        public Criteria andInumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INum not between", value1, value2, "inum");
            return (Criteria) this;
        }

        public Criteria andNextinumIsNull() {
            addCriterion("NextINum is null");
            return (Criteria) this;
        }

        public Criteria andNextinumIsNotNull() {
            addCriterion("NextINum is not null");
            return (Criteria) this;
        }

        public Criteria andNextinumEqualTo(BigDecimal value) {
            addCriterion("NextINum =", value, "nextinum");
            return (Criteria) this;
        }

        public Criteria andNextinumNotEqualTo(BigDecimal value) {
            addCriterion("NextINum <>", value, "nextinum");
            return (Criteria) this;
        }

        public Criteria andNextinumGreaterThan(BigDecimal value) {
            addCriterion("NextINum >", value, "nextinum");
            return (Criteria) this;
        }

        public Criteria andNextinumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NextINum >=", value, "nextinum");
            return (Criteria) this;
        }

        public Criteria andNextinumLessThan(BigDecimal value) {
            addCriterion("NextINum <", value, "nextinum");
            return (Criteria) this;
        }

        public Criteria andNextinumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NextINum <=", value, "nextinum");
            return (Criteria) this;
        }

        public Criteria andNextinumIn(List<BigDecimal> values) {
            addCriterion("NextINum in", values, "nextinum");
            return (Criteria) this;
        }

        public Criteria andNextinumNotIn(List<BigDecimal> values) {
            addCriterion("NextINum not in", values, "nextinum");
            return (Criteria) this;
        }

        public Criteria andNextinumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NextINum between", value1, value2, "nextinum");
            return (Criteria) this;
        }

        public Criteria andNextinumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NextINum not between", value1, value2, "nextinum");
            return (Criteria) this;
        }

        public Criteria andPrevinumIsNull() {
            addCriterion("PrevINum is null");
            return (Criteria) this;
        }

        public Criteria andPrevinumIsNotNull() {
            addCriterion("PrevINum is not null");
            return (Criteria) this;
        }

        public Criteria andPrevinumEqualTo(BigDecimal value) {
            addCriterion("PrevINum =", value, "previnum");
            return (Criteria) this;
        }

        public Criteria andPrevinumNotEqualTo(BigDecimal value) {
            addCriterion("PrevINum <>", value, "previnum");
            return (Criteria) this;
        }

        public Criteria andPrevinumGreaterThan(BigDecimal value) {
            addCriterion("PrevINum >", value, "previnum");
            return (Criteria) this;
        }

        public Criteria andPrevinumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PrevINum >=", value, "previnum");
            return (Criteria) this;
        }

        public Criteria andPrevinumLessThan(BigDecimal value) {
            addCriterion("PrevINum <", value, "previnum");
            return (Criteria) this;
        }

        public Criteria andPrevinumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PrevINum <=", value, "previnum");
            return (Criteria) this;
        }

        public Criteria andPrevinumIn(List<BigDecimal> values) {
            addCriterion("PrevINum in", values, "previnum");
            return (Criteria) this;
        }

        public Criteria andPrevinumNotIn(List<BigDecimal> values) {
            addCriterion("PrevINum not in", values, "previnum");
            return (Criteria) this;
        }

        public Criteria andPrevinumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PrevINum between", value1, value2, "previnum");
            return (Criteria) this;
        }

        public Criteria andPrevinumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PrevINum not between", value1, value2, "previnum");
            return (Criteria) this;
        }

        public Criteria andStartedatIsNull() {
            addCriterion("StartedAt is null");
            return (Criteria) this;
        }

        public Criteria andStartedatIsNotNull() {
            addCriterion("StartedAt is not null");
            return (Criteria) this;
        }

        public Criteria andStartedatEqualTo(Date value) {
            addCriterion("StartedAt =", value, "startedat");
            return (Criteria) this;
        }

        public Criteria andStartedatNotEqualTo(Date value) {
            addCriterion("StartedAt <>", value, "startedat");
            return (Criteria) this;
        }

        public Criteria andStartedatGreaterThan(Date value) {
            addCriterion("StartedAt >", value, "startedat");
            return (Criteria) this;
        }

        public Criteria andStartedatGreaterThanOrEqualTo(Date value) {
            addCriterion("StartedAt >=", value, "startedat");
            return (Criteria) this;
        }

        public Criteria andStartedatLessThan(Date value) {
            addCriterion("StartedAt <", value, "startedat");
            return (Criteria) this;
        }

        public Criteria andStartedatLessThanOrEqualTo(Date value) {
            addCriterion("StartedAt <=", value, "startedat");
            return (Criteria) this;
        }

        public Criteria andStartedatIn(List<Date> values) {
            addCriterion("StartedAt in", values, "startedat");
            return (Criteria) this;
        }

        public Criteria andStartedatNotIn(List<Date> values) {
            addCriterion("StartedAt not in", values, "startedat");
            return (Criteria) this;
        }

        public Criteria andStartedatBetween(Date value1, Date value2) {
            addCriterion("StartedAt between", value1, value2, "startedat");
            return (Criteria) this;
        }

        public Criteria andStartedatNotBetween(Date value1, Date value2) {
            addCriterion("StartedAt not between", value1, value2, "startedat");
            return (Criteria) this;
        }

        public Criteria andStartedatutcIsNull() {
            addCriterion("StartedAtUTC is null");
            return (Criteria) this;
        }

        public Criteria andStartedatutcIsNotNull() {
            addCriterion("StartedAtUTC is not null");
            return (Criteria) this;
        }

        public Criteria andStartedatutcEqualTo(Date value) {
            addCriterion("StartedAtUTC =", value, "startedatutc");
            return (Criteria) this;
        }

        public Criteria andStartedatutcNotEqualTo(Date value) {
            addCriterion("StartedAtUTC <>", value, "startedatutc");
            return (Criteria) this;
        }

        public Criteria andStartedatutcGreaterThan(Date value) {
            addCriterion("StartedAtUTC >", value, "startedatutc");
            return (Criteria) this;
        }

        public Criteria andStartedatutcGreaterThanOrEqualTo(Date value) {
            addCriterion("StartedAtUTC >=", value, "startedatutc");
            return (Criteria) this;
        }

        public Criteria andStartedatutcLessThan(Date value) {
            addCriterion("StartedAtUTC <", value, "startedatutc");
            return (Criteria) this;
        }

        public Criteria andStartedatutcLessThanOrEqualTo(Date value) {
            addCriterion("StartedAtUTC <=", value, "startedatutc");
            return (Criteria) this;
        }

        public Criteria andStartedatutcIn(List<Date> values) {
            addCriterion("StartedAtUTC in", values, "startedatutc");
            return (Criteria) this;
        }

        public Criteria andStartedatutcNotIn(List<Date> values) {
            addCriterion("StartedAtUTC not in", values, "startedatutc");
            return (Criteria) this;
        }

        public Criteria andStartedatutcBetween(Date value1, Date value2) {
            addCriterion("StartedAtUTC between", value1, value2, "startedatutc");
            return (Criteria) this;
        }

        public Criteria andStartedatutcNotBetween(Date value1, Date value2) {
            addCriterion("StartedAtUTC not between", value1, value2, "startedatutc");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("Channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("Channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(BigDecimal value) {
            addCriterion("Channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(BigDecimal value) {
            addCriterion("Channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(BigDecimal value) {
            addCriterion("Channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(BigDecimal value) {
            addCriterion("Channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<BigDecimal> values) {
            addCriterion("Channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<BigDecimal> values) {
            addCriterion("Channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andPrimarykeyIsNull() {
            addCriterion("PrimaryKey is null");
            return (Criteria) this;
        }

        public Criteria andPrimarykeyIsNotNull() {
            addCriterion("PrimaryKey is not null");
            return (Criteria) this;
        }

        public Criteria andPrimarykeyEqualTo(Integer value) {
            addCriterion("PrimaryKey =", value, "primarykey");
            return (Criteria) this;
        }

        public Criteria andPrimarykeyNotEqualTo(Integer value) {
            addCriterion("PrimaryKey <>", value, "primarykey");
            return (Criteria) this;
        }

        public Criteria andPrimarykeyGreaterThan(Integer value) {
            addCriterion("PrimaryKey >", value, "primarykey");
            return (Criteria) this;
        }

        public Criteria andPrimarykeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrimaryKey >=", value, "primarykey");
            return (Criteria) this;
        }

        public Criteria andPrimarykeyLessThan(Integer value) {
            addCriterion("PrimaryKey <", value, "primarykey");
            return (Criteria) this;
        }

        public Criteria andPrimarykeyLessThanOrEqualTo(Integer value) {
            addCriterion("PrimaryKey <=", value, "primarykey");
            return (Criteria) this;
        }

        public Criteria andPrimarykeyIn(List<Integer> values) {
            addCriterion("PrimaryKey in", values, "primarykey");
            return (Criteria) this;
        }

        public Criteria andPrimarykeyNotIn(List<Integer> values) {
            addCriterion("PrimaryKey not in", values, "primarykey");
            return (Criteria) this;
        }

        public Criteria andPrimarykeyBetween(Integer value1, Integer value2) {
            addCriterion("PrimaryKey between", value1, value2, "primarykey");
            return (Criteria) this;
        }

        public Criteria andPrimarykeyNotBetween(Integer value1, Integer value2) {
            addCriterion("PrimaryKey not between", value1, value2, "primarykey");
            return (Criteria) this;
        }

        public Criteria andOutgoingIsNull() {
            addCriterion("Outgoing is null");
            return (Criteria) this;
        }

        public Criteria andOutgoingIsNotNull() {
            addCriterion("Outgoing is not null");
            return (Criteria) this;
        }

        public Criteria andOutgoingEqualTo(Boolean value) {
            addCriterion("Outgoing =", value, "outgoing");
            return (Criteria) this;
        }

        public Criteria andOutgoingNotEqualTo(Boolean value) {
            addCriterion("Outgoing <>", value, "outgoing");
            return (Criteria) this;
        }

        public Criteria andOutgoingGreaterThan(Boolean value) {
            addCriterion("Outgoing >", value, "outgoing");
            return (Criteria) this;
        }

        public Criteria andOutgoingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Outgoing >=", value, "outgoing");
            return (Criteria) this;
        }

        public Criteria andOutgoingLessThan(Boolean value) {
            addCriterion("Outgoing <", value, "outgoing");
            return (Criteria) this;
        }

        public Criteria andOutgoingLessThanOrEqualTo(Boolean value) {
            addCriterion("Outgoing <=", value, "outgoing");
            return (Criteria) this;
        }

        public Criteria andOutgoingIn(List<Boolean> values) {
            addCriterion("Outgoing in", values, "outgoing");
            return (Criteria) this;
        }

        public Criteria andOutgoingNotIn(List<Boolean> values) {
            addCriterion("Outgoing not in", values, "outgoing");
            return (Criteria) this;
        }

        public Criteria andOutgoingBetween(Boolean value1, Boolean value2) {
            addCriterion("Outgoing between", value1, value2, "outgoing");
            return (Criteria) this;
        }

        public Criteria andOutgoingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Outgoing not between", value1, value2, "outgoing");
            return (Criteria) this;
        }

        public Criteria andInternalIsNull() {
            addCriterion("Internal is null");
            return (Criteria) this;
        }

        public Criteria andInternalIsNotNull() {
            addCriterion("Internal is not null");
            return (Criteria) this;
        }

        public Criteria andInternalEqualTo(Boolean value) {
            addCriterion("Internal =", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotEqualTo(Boolean value) {
            addCriterion("Internal <>", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalGreaterThan(Boolean value) {
            addCriterion("Internal >", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Internal >=", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalLessThan(Boolean value) {
            addCriterion("Internal <", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalLessThanOrEqualTo(Boolean value) {
            addCriterion("Internal <=", value, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalIn(List<Boolean> values) {
            addCriterion("Internal in", values, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotIn(List<Boolean> values) {
            addCriterion("Internal not in", values, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalBetween(Boolean value1, Boolean value2) {
            addCriterion("Internal between", value1, value2, "internal");
            return (Criteria) this;
        }

        public Criteria andInternalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Internal not between", value1, value2, "internal");
            return (Criteria) this;
        }

        public Criteria andTandemIsNull() {
            addCriterion("Tandem is null");
            return (Criteria) this;
        }

        public Criteria andTandemIsNotNull() {
            addCriterion("Tandem is not null");
            return (Criteria) this;
        }

        public Criteria andTandemEqualTo(Boolean value) {
            addCriterion("Tandem =", value, "tandem");
            return (Criteria) this;
        }

        public Criteria andTandemNotEqualTo(Boolean value) {
            addCriterion("Tandem <>", value, "tandem");
            return (Criteria) this;
        }

        public Criteria andTandemGreaterThan(Boolean value) {
            addCriterion("Tandem >", value, "tandem");
            return (Criteria) this;
        }

        public Criteria andTandemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Tandem >=", value, "tandem");
            return (Criteria) this;
        }

        public Criteria andTandemLessThan(Boolean value) {
            addCriterion("Tandem <", value, "tandem");
            return (Criteria) this;
        }

        public Criteria andTandemLessThanOrEqualTo(Boolean value) {
            addCriterion("Tandem <=", value, "tandem");
            return (Criteria) this;
        }

        public Criteria andTandemIn(List<Boolean> values) {
            addCriterion("Tandem in", values, "tandem");
            return (Criteria) this;
        }

        public Criteria andTandemNotIn(List<Boolean> values) {
            addCriterion("Tandem not in", values, "tandem");
            return (Criteria) this;
        }

        public Criteria andTandemBetween(Boolean value1, Boolean value2) {
            addCriterion("Tandem between", value1, value2, "tandem");
            return (Criteria) this;
        }

        public Criteria andTandemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Tandem not between", value1, value2, "tandem");
            return (Criteria) this;
        }

        public Criteria andNocallendIsNull() {
            addCriterion("NoCallEnd is null");
            return (Criteria) this;
        }

        public Criteria andNocallendIsNotNull() {
            addCriterion("NoCallEnd is not null");
            return (Criteria) this;
        }

        public Criteria andNocallendEqualTo(Boolean value) {
            addCriterion("NoCallEnd =", value, "nocallend");
            return (Criteria) this;
        }

        public Criteria andNocallendNotEqualTo(Boolean value) {
            addCriterion("NoCallEnd <>", value, "nocallend");
            return (Criteria) this;
        }

        public Criteria andNocallendGreaterThan(Boolean value) {
            addCriterion("NoCallEnd >", value, "nocallend");
            return (Criteria) this;
        }

        public Criteria andNocallendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("NoCallEnd >=", value, "nocallend");
            return (Criteria) this;
        }

        public Criteria andNocallendLessThan(Boolean value) {
            addCriterion("NoCallEnd <", value, "nocallend");
            return (Criteria) this;
        }

        public Criteria andNocallendLessThanOrEqualTo(Boolean value) {
            addCriterion("NoCallEnd <=", value, "nocallend");
            return (Criteria) this;
        }

        public Criteria andNocallendIn(List<Boolean> values) {
            addCriterion("NoCallEnd in", values, "nocallend");
            return (Criteria) this;
        }

        public Criteria andNocallendNotIn(List<Boolean> values) {
            addCriterion("NoCallEnd not in", values, "nocallend");
            return (Criteria) this;
        }

        public Criteria andNocallendBetween(Boolean value1, Boolean value2) {
            addCriterion("NoCallEnd between", value1, value2, "nocallend");
            return (Criteria) this;
        }

        public Criteria andNocallendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("NoCallEnd not between", value1, value2, "nocallend");
            return (Criteria) this;
        }

        public Criteria andNocallstartIsNull() {
            addCriterion("NoCallStart is null");
            return (Criteria) this;
        }

        public Criteria andNocallstartIsNotNull() {
            addCriterion("NoCallStart is not null");
            return (Criteria) this;
        }

        public Criteria andNocallstartEqualTo(Boolean value) {
            addCriterion("NoCallStart =", value, "nocallstart");
            return (Criteria) this;
        }

        public Criteria andNocallstartNotEqualTo(Boolean value) {
            addCriterion("NoCallStart <>", value, "nocallstart");
            return (Criteria) this;
        }

        public Criteria andNocallstartGreaterThan(Boolean value) {
            addCriterion("NoCallStart >", value, "nocallstart");
            return (Criteria) this;
        }

        public Criteria andNocallstartGreaterThanOrEqualTo(Boolean value) {
            addCriterion("NoCallStart >=", value, "nocallstart");
            return (Criteria) this;
        }

        public Criteria andNocallstartLessThan(Boolean value) {
            addCriterion("NoCallStart <", value, "nocallstart");
            return (Criteria) this;
        }

        public Criteria andNocallstartLessThanOrEqualTo(Boolean value) {
            addCriterion("NoCallStart <=", value, "nocallstart");
            return (Criteria) this;
        }

        public Criteria andNocallstartIn(List<Boolean> values) {
            addCriterion("NoCallStart in", values, "nocallstart");
            return (Criteria) this;
        }

        public Criteria andNocallstartNotIn(List<Boolean> values) {
            addCriterion("NoCallStart not in", values, "nocallstart");
            return (Criteria) this;
        }

        public Criteria andNocallstartBetween(Boolean value1, Boolean value2) {
            addCriterion("NoCallStart between", value1, value2, "nocallstart");
            return (Criteria) this;
        }

        public Criteria andNocallstartNotBetween(Boolean value1, Boolean value2) {
            addCriterion("NoCallStart not between", value1, value2, "nocallstart");
            return (Criteria) this;
        }

        public Criteria andPossibleoverlapIsNull() {
            addCriterion("PossibleOverlap is null");
            return (Criteria) this;
        }

        public Criteria andPossibleoverlapIsNotNull() {
            addCriterion("PossibleOverlap is not null");
            return (Criteria) this;
        }

        public Criteria andPossibleoverlapEqualTo(Boolean value) {
            addCriterion("PossibleOverlap =", value, "possibleoverlap");
            return (Criteria) this;
        }

        public Criteria andPossibleoverlapNotEqualTo(Boolean value) {
            addCriterion("PossibleOverlap <>", value, "possibleoverlap");
            return (Criteria) this;
        }

        public Criteria andPossibleoverlapGreaterThan(Boolean value) {
            addCriterion("PossibleOverlap >", value, "possibleoverlap");
            return (Criteria) this;
        }

        public Criteria andPossibleoverlapGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PossibleOverlap >=", value, "possibleoverlap");
            return (Criteria) this;
        }

        public Criteria andPossibleoverlapLessThan(Boolean value) {
            addCriterion("PossibleOverlap <", value, "possibleoverlap");
            return (Criteria) this;
        }

        public Criteria andPossibleoverlapLessThanOrEqualTo(Boolean value) {
            addCriterion("PossibleOverlap <=", value, "possibleoverlap");
            return (Criteria) this;
        }

        public Criteria andPossibleoverlapIn(List<Boolean> values) {
            addCriterion("PossibleOverlap in", values, "possibleoverlap");
            return (Criteria) this;
        }

        public Criteria andPossibleoverlapNotIn(List<Boolean> values) {
            addCriterion("PossibleOverlap not in", values, "possibleoverlap");
            return (Criteria) this;
        }

        public Criteria andPossibleoverlapBetween(Boolean value1, Boolean value2) {
            addCriterion("PossibleOverlap between", value1, value2, "possibleoverlap");
            return (Criteria) this;
        }

        public Criteria andPossibleoverlapNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PossibleOverlap not between", value1, value2, "possibleoverlap");
            return (Criteria) this;
        }

        public Criteria andRecordingIsNull() {
            addCriterion("Recording is null");
            return (Criteria) this;
        }

        public Criteria andRecordingIsNotNull() {
            addCriterion("Recording is not null");
            return (Criteria) this;
        }

        public Criteria andRecordingEqualTo(Boolean value) {
            addCriterion("Recording =", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingNotEqualTo(Boolean value) {
            addCriterion("Recording <>", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingGreaterThan(Boolean value) {
            addCriterion("Recording >", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Recording >=", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingLessThan(Boolean value) {
            addCriterion("Recording <", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingLessThanOrEqualTo(Boolean value) {
            addCriterion("Recording <=", value, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingIn(List<Boolean> values) {
            addCriterion("Recording in", values, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingNotIn(List<Boolean> values) {
            addCriterion("Recording not in", values, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingBetween(Boolean value1, Boolean value2) {
            addCriterion("Recording between", value1, value2, "recording");
            return (Criteria) this;
        }

        public Criteria andRecordingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Recording not between", value1, value2, "recording");
            return (Criteria) this;
        }

        public Criteria andBarreplayIsNull() {
            addCriterion("BarReplay is null");
            return (Criteria) this;
        }

        public Criteria andBarreplayIsNotNull() {
            addCriterion("BarReplay is not null");
            return (Criteria) this;
        }

        public Criteria andBarreplayEqualTo(Boolean value) {
            addCriterion("BarReplay =", value, "barreplay");
            return (Criteria) this;
        }

        public Criteria andBarreplayNotEqualTo(Boolean value) {
            addCriterion("BarReplay <>", value, "barreplay");
            return (Criteria) this;
        }

        public Criteria andBarreplayGreaterThan(Boolean value) {
            addCriterion("BarReplay >", value, "barreplay");
            return (Criteria) this;
        }

        public Criteria andBarreplayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("BarReplay >=", value, "barreplay");
            return (Criteria) this;
        }

        public Criteria andBarreplayLessThan(Boolean value) {
            addCriterion("BarReplay <", value, "barreplay");
            return (Criteria) this;
        }

        public Criteria andBarreplayLessThanOrEqualTo(Boolean value) {
            addCriterion("BarReplay <=", value, "barreplay");
            return (Criteria) this;
        }

        public Criteria andBarreplayIn(List<Boolean> values) {
            addCriterion("BarReplay in", values, "barreplay");
            return (Criteria) this;
        }

        public Criteria andBarreplayNotIn(List<Boolean> values) {
            addCriterion("BarReplay not in", values, "barreplay");
            return (Criteria) this;
        }

        public Criteria andBarreplayBetween(Boolean value1, Boolean value2) {
            addCriterion("BarReplay between", value1, value2, "barreplay");
            return (Criteria) this;
        }

        public Criteria andBarreplayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("BarReplay not between", value1, value2, "barreplay");
            return (Criteria) this;
        }

        public Criteria andExtradataIsNull() {
            addCriterion("ExtraData is null");
            return (Criteria) this;
        }

        public Criteria andExtradataIsNotNull() {
            addCriterion("ExtraData is not null");
            return (Criteria) this;
        }

        public Criteria andExtradataEqualTo(Boolean value) {
            addCriterion("ExtraData =", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataNotEqualTo(Boolean value) {
            addCriterion("ExtraData <>", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataGreaterThan(Boolean value) {
            addCriterion("ExtraData >", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ExtraData >=", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataLessThan(Boolean value) {
            addCriterion("ExtraData <", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataLessThanOrEqualTo(Boolean value) {
            addCriterion("ExtraData <=", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataIn(List<Boolean> values) {
            addCriterion("ExtraData in", values, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataNotIn(List<Boolean> values) {
            addCriterion("ExtraData not in", values, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataBetween(Boolean value1, Boolean value2) {
            addCriterion("ExtraData between", value1, value2, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ExtraData not between", value1, value2, "extradata");
            return (Criteria) this;
        }

        public Criteria andWarntoneappliedIsNull() {
            addCriterion("WarnToneApplied is null");
            return (Criteria) this;
        }

        public Criteria andWarntoneappliedIsNotNull() {
            addCriterion("WarnToneApplied is not null");
            return (Criteria) this;
        }

        public Criteria andWarntoneappliedEqualTo(Boolean value) {
            addCriterion("WarnToneApplied =", value, "warntoneapplied");
            return (Criteria) this;
        }

        public Criteria andWarntoneappliedNotEqualTo(Boolean value) {
            addCriterion("WarnToneApplied <>", value, "warntoneapplied");
            return (Criteria) this;
        }

        public Criteria andWarntoneappliedGreaterThan(Boolean value) {
            addCriterion("WarnToneApplied >", value, "warntoneapplied");
            return (Criteria) this;
        }

        public Criteria andWarntoneappliedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("WarnToneApplied >=", value, "warntoneapplied");
            return (Criteria) this;
        }

        public Criteria andWarntoneappliedLessThan(Boolean value) {
            addCriterion("WarnToneApplied <", value, "warntoneapplied");
            return (Criteria) this;
        }

        public Criteria andWarntoneappliedLessThanOrEqualTo(Boolean value) {
            addCriterion("WarnToneApplied <=", value, "warntoneapplied");
            return (Criteria) this;
        }

        public Criteria andWarntoneappliedIn(List<Boolean> values) {
            addCriterion("WarnToneApplied in", values, "warntoneapplied");
            return (Criteria) this;
        }

        public Criteria andWarntoneappliedNotIn(List<Boolean> values) {
            addCriterion("WarnToneApplied not in", values, "warntoneapplied");
            return (Criteria) this;
        }

        public Criteria andWarntoneappliedBetween(Boolean value1, Boolean value2) {
            addCriterion("WarnToneApplied between", value1, value2, "warntoneapplied");
            return (Criteria) this;
        }

        public Criteria andWarntoneappliedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("WarnToneApplied not between", value1, value2, "warntoneapplied");
            return (Criteria) this;
        }

        public Criteria andMixedIsNull() {
            addCriterion("Mixed is null");
            return (Criteria) this;
        }

        public Criteria andMixedIsNotNull() {
            addCriterion("Mixed is not null");
            return (Criteria) this;
        }

        public Criteria andMixedEqualTo(Boolean value) {
            addCriterion("Mixed =", value, "mixed");
            return (Criteria) this;
        }

        public Criteria andMixedNotEqualTo(Boolean value) {
            addCriterion("Mixed <>", value, "mixed");
            return (Criteria) this;
        }

        public Criteria andMixedGreaterThan(Boolean value) {
            addCriterion("Mixed >", value, "mixed");
            return (Criteria) this;
        }

        public Criteria andMixedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Mixed >=", value, "mixed");
            return (Criteria) this;
        }

        public Criteria andMixedLessThan(Boolean value) {
            addCriterion("Mixed <", value, "mixed");
            return (Criteria) this;
        }

        public Criteria andMixedLessThanOrEqualTo(Boolean value) {
            addCriterion("Mixed <=", value, "mixed");
            return (Criteria) this;
        }

        public Criteria andMixedIn(List<Boolean> values) {
            addCriterion("Mixed in", values, "mixed");
            return (Criteria) this;
        }

        public Criteria andMixedNotIn(List<Boolean> values) {
            addCriterion("Mixed not in", values, "mixed");
            return (Criteria) this;
        }

        public Criteria andMixedBetween(Boolean value1, Boolean value2) {
            addCriterion("Mixed between", value1, value2, "mixed");
            return (Criteria) this;
        }

        public Criteria andMixedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Mixed not between", value1, value2, "mixed");
            return (Criteria) this;
        }

        public Criteria andParentIsNull() {
            addCriterion("Parent is null");
            return (Criteria) this;
        }

        public Criteria andParentIsNotNull() {
            addCriterion("Parent is not null");
            return (Criteria) this;
        }

        public Criteria andParentEqualTo(Boolean value) {
            addCriterion("Parent =", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotEqualTo(Boolean value) {
            addCriterion("Parent <>", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThan(Boolean value) {
            addCriterion("Parent >", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Parent >=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThan(Boolean value) {
            addCriterion("Parent <", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThanOrEqualTo(Boolean value) {
            addCriterion("Parent <=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentIn(List<Boolean> values) {
            addCriterion("Parent in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotIn(List<Boolean> values) {
            addCriterion("Parent not in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentBetween(Boolean value1, Boolean value2) {
            addCriterion("Parent between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Parent not between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andChildIsNull() {
            addCriterion("Child is null");
            return (Criteria) this;
        }

        public Criteria andChildIsNotNull() {
            addCriterion("Child is not null");
            return (Criteria) this;
        }

        public Criteria andChildEqualTo(Boolean value) {
            addCriterion("Child =", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotEqualTo(Boolean value) {
            addCriterion("Child <>", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildGreaterThan(Boolean value) {
            addCriterion("Child >", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Child >=", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildLessThan(Boolean value) {
            addCriterion("Child <", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildLessThanOrEqualTo(Boolean value) {
            addCriterion("Child <=", value, "child");
            return (Criteria) this;
        }

        public Criteria andChildIn(List<Boolean> values) {
            addCriterion("Child in", values, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotIn(List<Boolean> values) {
            addCriterion("Child not in", values, "child");
            return (Criteria) this;
        }

        public Criteria andChildBetween(Boolean value1, Boolean value2) {
            addCriterion("Child between", value1, value2, "child");
            return (Criteria) this;
        }

        public Criteria andChildNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Child not between", value1, value2, "child");
            return (Criteria) this;
        }

        public Criteria andStarteventIsNull() {
            addCriterion("StartEvent is null");
            return (Criteria) this;
        }

        public Criteria andStarteventIsNotNull() {
            addCriterion("StartEvent is not null");
            return (Criteria) this;
        }

        public Criteria andStarteventEqualTo(Byte value) {
            addCriterion("StartEvent =", value, "startevent");
            return (Criteria) this;
        }

        public Criteria andStarteventNotEqualTo(Byte value) {
            addCriterion("StartEvent <>", value, "startevent");
            return (Criteria) this;
        }

        public Criteria andStarteventGreaterThan(Byte value) {
            addCriterion("StartEvent >", value, "startevent");
            return (Criteria) this;
        }

        public Criteria andStarteventGreaterThanOrEqualTo(Byte value) {
            addCriterion("StartEvent >=", value, "startevent");
            return (Criteria) this;
        }

        public Criteria andStarteventLessThan(Byte value) {
            addCriterion("StartEvent <", value, "startevent");
            return (Criteria) this;
        }

        public Criteria andStarteventLessThanOrEqualTo(Byte value) {
            addCriterion("StartEvent <=", value, "startevent");
            return (Criteria) this;
        }

        public Criteria andStarteventIn(List<Byte> values) {
            addCriterion("StartEvent in", values, "startevent");
            return (Criteria) this;
        }

        public Criteria andStarteventNotIn(List<Byte> values) {
            addCriterion("StartEvent not in", values, "startevent");
            return (Criteria) this;
        }

        public Criteria andStarteventBetween(Byte value1, Byte value2) {
            addCriterion("StartEvent between", value1, value2, "startevent");
            return (Criteria) this;
        }

        public Criteria andStarteventNotBetween(Byte value1, Byte value2) {
            addCriterion("StartEvent not between", value1, value2, "startevent");
            return (Criteria) this;
        }

        public Criteria andStopeventIsNull() {
            addCriterion("StopEvent is null");
            return (Criteria) this;
        }

        public Criteria andStopeventIsNotNull() {
            addCriterion("StopEvent is not null");
            return (Criteria) this;
        }

        public Criteria andStopeventEqualTo(Byte value) {
            addCriterion("StopEvent =", value, "stopevent");
            return (Criteria) this;
        }

        public Criteria andStopeventNotEqualTo(Byte value) {
            addCriterion("StopEvent <>", value, "stopevent");
            return (Criteria) this;
        }

        public Criteria andStopeventGreaterThan(Byte value) {
            addCriterion("StopEvent >", value, "stopevent");
            return (Criteria) this;
        }

        public Criteria andStopeventGreaterThanOrEqualTo(Byte value) {
            addCriterion("StopEvent >=", value, "stopevent");
            return (Criteria) this;
        }

        public Criteria andStopeventLessThan(Byte value) {
            addCriterion("StopEvent <", value, "stopevent");
            return (Criteria) this;
        }

        public Criteria andStopeventLessThanOrEqualTo(Byte value) {
            addCriterion("StopEvent <=", value, "stopevent");
            return (Criteria) this;
        }

        public Criteria andStopeventIn(List<Byte> values) {
            addCriterion("StopEvent in", values, "stopevent");
            return (Criteria) this;
        }

        public Criteria andStopeventNotIn(List<Byte> values) {
            addCriterion("StopEvent not in", values, "stopevent");
            return (Criteria) this;
        }

        public Criteria andStopeventBetween(Byte value1, Byte value2) {
            addCriterion("StopEvent between", value1, value2, "stopevent");
            return (Criteria) this;
        }

        public Criteria andStopeventNotBetween(Byte value1, Byte value2) {
            addCriterion("StopEvent not between", value1, value2, "stopevent");
            return (Criteria) this;
        }

        public Criteria andFormatidIsNull() {
            addCriterion("FormatId is null");
            return (Criteria) this;
        }

        public Criteria andFormatidIsNotNull() {
            addCriterion("FormatId is not null");
            return (Criteria) this;
        }

        public Criteria andFormatidEqualTo(Short value) {
            addCriterion("FormatId =", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotEqualTo(Short value) {
            addCriterion("FormatId <>", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidGreaterThan(Short value) {
            addCriterion("FormatId >", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidGreaterThanOrEqualTo(Short value) {
            addCriterion("FormatId >=", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLessThan(Short value) {
            addCriterion("FormatId <", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLessThanOrEqualTo(Short value) {
            addCriterion("FormatId <=", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidIn(List<Short> values) {
            addCriterion("FormatId in", values, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotIn(List<Short> values) {
            addCriterion("FormatId not in", values, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidBetween(Short value1, Short value2) {
            addCriterion("FormatId between", value1, value2, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotBetween(Short value1, Short value2) {
            addCriterion("FormatId not between", value1, value2, "formatid");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("Length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("Length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("Length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("Length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("Length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("Length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("Length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("Length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("Length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("Length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("Length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("Length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("Duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("Duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Short value) {
            addCriterion("Duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Short value) {
            addCriterion("Duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Short value) {
            addCriterion("Duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Short value) {
            addCriterion("Duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Short value) {
            addCriterion("Duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Short value) {
            addCriterion("Duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Short> values) {
            addCriterion("Duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Short> values) {
            addCriterion("Duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Short value1, Short value2) {
            addCriterion("Duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Short value1, Short value2) {
            addCriterion("Duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andStartbyteIsNull() {
            addCriterion("StartByte is null");
            return (Criteria) this;
        }

        public Criteria andStartbyteIsNotNull() {
            addCriterion("StartByte is not null");
            return (Criteria) this;
        }

        public Criteria andStartbyteEqualTo(BigDecimal value) {
            addCriterion("StartByte =", value, "startbyte");
            return (Criteria) this;
        }

        public Criteria andStartbyteNotEqualTo(BigDecimal value) {
            addCriterion("StartByte <>", value, "startbyte");
            return (Criteria) this;
        }

        public Criteria andStartbyteGreaterThan(BigDecimal value) {
            addCriterion("StartByte >", value, "startbyte");
            return (Criteria) this;
        }

        public Criteria andStartbyteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("StartByte >=", value, "startbyte");
            return (Criteria) this;
        }

        public Criteria andStartbyteLessThan(BigDecimal value) {
            addCriterion("StartByte <", value, "startbyte");
            return (Criteria) this;
        }

        public Criteria andStartbyteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("StartByte <=", value, "startbyte");
            return (Criteria) this;
        }

        public Criteria andStartbyteIn(List<BigDecimal> values) {
            addCriterion("StartByte in", values, "startbyte");
            return (Criteria) this;
        }

        public Criteria andStartbyteNotIn(List<BigDecimal> values) {
            addCriterion("StartByte not in", values, "startbyte");
            return (Criteria) this;
        }

        public Criteria andStartbyteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StartByte between", value1, value2, "startbyte");
            return (Criteria) this;
        }

        public Criteria andStartbyteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("StartByte not between", value1, value2, "startbyte");
            return (Criteria) this;
        }

        public Criteria andDigitsIsNull() {
            addCriterion("Digits is null");
            return (Criteria) this;
        }

        public Criteria andDigitsIsNotNull() {
            addCriterion("Digits is not null");
            return (Criteria) this;
        }

        public Criteria andDigitsEqualTo(String value) {
            addCriterion("Digits =", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsNotEqualTo(String value) {
            addCriterion("Digits <>", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsGreaterThan(String value) {
            addCriterion("Digits >", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsGreaterThanOrEqualTo(String value) {
            addCriterion("Digits >=", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsLessThan(String value) {
            addCriterion("Digits <", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsLessThanOrEqualTo(String value) {
            addCriterion("Digits <=", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsLike(String value) {
            addCriterion("Digits like", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsNotLike(String value) {
            addCriterion("Digits not like", value, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsIn(List<String> values) {
            addCriterion("Digits in", values, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsNotIn(List<String> values) {
            addCriterion("Digits not in", values, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsBetween(String value1, String value2) {
            addCriterion("Digits between", value1, value2, "digits");
            return (Criteria) this;
        }

        public Criteria andDigitsNotBetween(String value1, String value2) {
            addCriterion("Digits not between", value1, value2, "digits");
            return (Criteria) this;
        }

        public Criteria andUserfield1IsNull() {
            addCriterion("UserField1 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield1IsNotNull() {
            addCriterion("UserField1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield1EqualTo(String value) {
            addCriterion("UserField1 =", value, "userfield1");
            return (Criteria) this;
        }

        public Criteria andUserfield1NotEqualTo(String value) {
            addCriterion("UserField1 <>", value, "userfield1");
            return (Criteria) this;
        }

        public Criteria andUserfield1GreaterThan(String value) {
            addCriterion("UserField1 >", value, "userfield1");
            return (Criteria) this;
        }

        public Criteria andUserfield1GreaterThanOrEqualTo(String value) {
            addCriterion("UserField1 >=", value, "userfield1");
            return (Criteria) this;
        }

        public Criteria andUserfield1LessThan(String value) {
            addCriterion("UserField1 <", value, "userfield1");
            return (Criteria) this;
        }

        public Criteria andUserfield1LessThanOrEqualTo(String value) {
            addCriterion("UserField1 <=", value, "userfield1");
            return (Criteria) this;
        }

        public Criteria andUserfield1Like(String value) {
            addCriterion("UserField1 like", value, "userfield1");
            return (Criteria) this;
        }

        public Criteria andUserfield1NotLike(String value) {
            addCriterion("UserField1 not like", value, "userfield1");
            return (Criteria) this;
        }

        public Criteria andUserfield1In(List<String> values) {
            addCriterion("UserField1 in", values, "userfield1");
            return (Criteria) this;
        }

        public Criteria andUserfield1NotIn(List<String> values) {
            addCriterion("UserField1 not in", values, "userfield1");
            return (Criteria) this;
        }

        public Criteria andUserfield1Between(String value1, String value2) {
            addCriterion("UserField1 between", value1, value2, "userfield1");
            return (Criteria) this;
        }

        public Criteria andUserfield1NotBetween(String value1, String value2) {
            addCriterion("UserField1 not between", value1, value2, "userfield1");
            return (Criteria) this;
        }

        public Criteria andUserfield2IsNull() {
            addCriterion("UserField2 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield2IsNotNull() {
            addCriterion("UserField2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield2EqualTo(String value) {
            addCriterion("UserField2 =", value, "userfield2");
            return (Criteria) this;
        }

        public Criteria andUserfield2NotEqualTo(String value) {
            addCriterion("UserField2 <>", value, "userfield2");
            return (Criteria) this;
        }

        public Criteria andUserfield2GreaterThan(String value) {
            addCriterion("UserField2 >", value, "userfield2");
            return (Criteria) this;
        }

        public Criteria andUserfield2GreaterThanOrEqualTo(String value) {
            addCriterion("UserField2 >=", value, "userfield2");
            return (Criteria) this;
        }

        public Criteria andUserfield2LessThan(String value) {
            addCriterion("UserField2 <", value, "userfield2");
            return (Criteria) this;
        }

        public Criteria andUserfield2LessThanOrEqualTo(String value) {
            addCriterion("UserField2 <=", value, "userfield2");
            return (Criteria) this;
        }

        public Criteria andUserfield2Like(String value) {
            addCriterion("UserField2 like", value, "userfield2");
            return (Criteria) this;
        }

        public Criteria andUserfield2NotLike(String value) {
            addCriterion("UserField2 not like", value, "userfield2");
            return (Criteria) this;
        }

        public Criteria andUserfield2In(List<String> values) {
            addCriterion("UserField2 in", values, "userfield2");
            return (Criteria) this;
        }

        public Criteria andUserfield2NotIn(List<String> values) {
            addCriterion("UserField2 not in", values, "userfield2");
            return (Criteria) this;
        }

        public Criteria andUserfield2Between(String value1, String value2) {
            addCriterion("UserField2 between", value1, value2, "userfield2");
            return (Criteria) this;
        }

        public Criteria andUserfield2NotBetween(String value1, String value2) {
            addCriterion("UserField2 not between", value1, value2, "userfield2");
            return (Criteria) this;
        }

        public Criteria andUserfield3IsNull() {
            addCriterion("UserField3 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield3IsNotNull() {
            addCriterion("UserField3 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield3EqualTo(String value) {
            addCriterion("UserField3 =", value, "userfield3");
            return (Criteria) this;
        }

        public Criteria andUserfield3NotEqualTo(String value) {
            addCriterion("UserField3 <>", value, "userfield3");
            return (Criteria) this;
        }

        public Criteria andUserfield3GreaterThan(String value) {
            addCriterion("UserField3 >", value, "userfield3");
            return (Criteria) this;
        }

        public Criteria andUserfield3GreaterThanOrEqualTo(String value) {
            addCriterion("UserField3 >=", value, "userfield3");
            return (Criteria) this;
        }

        public Criteria andUserfield3LessThan(String value) {
            addCriterion("UserField3 <", value, "userfield3");
            return (Criteria) this;
        }

        public Criteria andUserfield3LessThanOrEqualTo(String value) {
            addCriterion("UserField3 <=", value, "userfield3");
            return (Criteria) this;
        }

        public Criteria andUserfield3Like(String value) {
            addCriterion("UserField3 like", value, "userfield3");
            return (Criteria) this;
        }

        public Criteria andUserfield3NotLike(String value) {
            addCriterion("UserField3 not like", value, "userfield3");
            return (Criteria) this;
        }

        public Criteria andUserfield3In(List<String> values) {
            addCriterion("UserField3 in", values, "userfield3");
            return (Criteria) this;
        }

        public Criteria andUserfield3NotIn(List<String> values) {
            addCriterion("UserField3 not in", values, "userfield3");
            return (Criteria) this;
        }

        public Criteria andUserfield3Between(String value1, String value2) {
            addCriterion("UserField3 between", value1, value2, "userfield3");
            return (Criteria) this;
        }

        public Criteria andUserfield3NotBetween(String value1, String value2) {
            addCriterion("UserField3 not between", value1, value2, "userfield3");
            return (Criteria) this;
        }

        public Criteria andUserfield4IsNull() {
            addCriterion("UserField4 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield4IsNotNull() {
            addCriterion("UserField4 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield4EqualTo(String value) {
            addCriterion("UserField4 =", value, "userfield4");
            return (Criteria) this;
        }

        public Criteria andUserfield4NotEqualTo(String value) {
            addCriterion("UserField4 <>", value, "userfield4");
            return (Criteria) this;
        }

        public Criteria andUserfield4GreaterThan(String value) {
            addCriterion("UserField4 >", value, "userfield4");
            return (Criteria) this;
        }

        public Criteria andUserfield4GreaterThanOrEqualTo(String value) {
            addCriterion("UserField4 >=", value, "userfield4");
            return (Criteria) this;
        }

        public Criteria andUserfield4LessThan(String value) {
            addCriterion("UserField4 <", value, "userfield4");
            return (Criteria) this;
        }

        public Criteria andUserfield4LessThanOrEqualTo(String value) {
            addCriterion("UserField4 <=", value, "userfield4");
            return (Criteria) this;
        }

        public Criteria andUserfield4Like(String value) {
            addCriterion("UserField4 like", value, "userfield4");
            return (Criteria) this;
        }

        public Criteria andUserfield4NotLike(String value) {
            addCriterion("UserField4 not like", value, "userfield4");
            return (Criteria) this;
        }

        public Criteria andUserfield4In(List<String> values) {
            addCriterion("UserField4 in", values, "userfield4");
            return (Criteria) this;
        }

        public Criteria andUserfield4NotIn(List<String> values) {
            addCriterion("UserField4 not in", values, "userfield4");
            return (Criteria) this;
        }

        public Criteria andUserfield4Between(String value1, String value2) {
            addCriterion("UserField4 between", value1, value2, "userfield4");
            return (Criteria) this;
        }

        public Criteria andUserfield4NotBetween(String value1, String value2) {
            addCriterion("UserField4 not between", value1, value2, "userfield4");
            return (Criteria) this;
        }

        public Criteria andUserfield5IsNull() {
            addCriterion("UserField5 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield5IsNotNull() {
            addCriterion("UserField5 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield5EqualTo(String value) {
            addCriterion("UserField5 =", value, "userfield5");
            return (Criteria) this;
        }

        public Criteria andUserfield5NotEqualTo(String value) {
            addCriterion("UserField5 <>", value, "userfield5");
            return (Criteria) this;
        }

        public Criteria andUserfield5GreaterThan(String value) {
            addCriterion("UserField5 >", value, "userfield5");
            return (Criteria) this;
        }

        public Criteria andUserfield5GreaterThanOrEqualTo(String value) {
            addCriterion("UserField5 >=", value, "userfield5");
            return (Criteria) this;
        }

        public Criteria andUserfield5LessThan(String value) {
            addCriterion("UserField5 <", value, "userfield5");
            return (Criteria) this;
        }

        public Criteria andUserfield5LessThanOrEqualTo(String value) {
            addCriterion("UserField5 <=", value, "userfield5");
            return (Criteria) this;
        }

        public Criteria andUserfield5Like(String value) {
            addCriterion("UserField5 like", value, "userfield5");
            return (Criteria) this;
        }

        public Criteria andUserfield5NotLike(String value) {
            addCriterion("UserField5 not like", value, "userfield5");
            return (Criteria) this;
        }

        public Criteria andUserfield5In(List<String> values) {
            addCriterion("UserField5 in", values, "userfield5");
            return (Criteria) this;
        }

        public Criteria andUserfield5NotIn(List<String> values) {
            addCriterion("UserField5 not in", values, "userfield5");
            return (Criteria) this;
        }

        public Criteria andUserfield5Between(String value1, String value2) {
            addCriterion("UserField5 between", value1, value2, "userfield5");
            return (Criteria) this;
        }

        public Criteria andUserfield5NotBetween(String value1, String value2) {
            addCriterion("UserField5 not between", value1, value2, "userfield5");
            return (Criteria) this;
        }

        public Criteria andUserfield6IsNull() {
            addCriterion("UserField6 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield6IsNotNull() {
            addCriterion("UserField6 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield6EqualTo(String value) {
            addCriterion("UserField6 =", value, "userfield6");
            return (Criteria) this;
        }

        public Criteria andUserfield6NotEqualTo(String value) {
            addCriterion("UserField6 <>", value, "userfield6");
            return (Criteria) this;
        }

        public Criteria andUserfield6GreaterThan(String value) {
            addCriterion("UserField6 >", value, "userfield6");
            return (Criteria) this;
        }

        public Criteria andUserfield6GreaterThanOrEqualTo(String value) {
            addCriterion("UserField6 >=", value, "userfield6");
            return (Criteria) this;
        }

        public Criteria andUserfield6LessThan(String value) {
            addCriterion("UserField6 <", value, "userfield6");
            return (Criteria) this;
        }

        public Criteria andUserfield6LessThanOrEqualTo(String value) {
            addCriterion("UserField6 <=", value, "userfield6");
            return (Criteria) this;
        }

        public Criteria andUserfield6Like(String value) {
            addCriterion("UserField6 like", value, "userfield6");
            return (Criteria) this;
        }

        public Criteria andUserfield6NotLike(String value) {
            addCriterion("UserField6 not like", value, "userfield6");
            return (Criteria) this;
        }

        public Criteria andUserfield6In(List<String> values) {
            addCriterion("UserField6 in", values, "userfield6");
            return (Criteria) this;
        }

        public Criteria andUserfield6NotIn(List<String> values) {
            addCriterion("UserField6 not in", values, "userfield6");
            return (Criteria) this;
        }

        public Criteria andUserfield6Between(String value1, String value2) {
            addCriterion("UserField6 between", value1, value2, "userfield6");
            return (Criteria) this;
        }

        public Criteria andUserfield6NotBetween(String value1, String value2) {
            addCriterion("UserField6 not between", value1, value2, "userfield6");
            return (Criteria) this;
        }

        public Criteria andUserfield7IsNull() {
            addCriterion("UserField7 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield7IsNotNull() {
            addCriterion("UserField7 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield7EqualTo(String value) {
            addCriterion("UserField7 =", value, "userfield7");
            return (Criteria) this;
        }

        public Criteria andUserfield7NotEqualTo(String value) {
            addCriterion("UserField7 <>", value, "userfield7");
            return (Criteria) this;
        }

        public Criteria andUserfield7GreaterThan(String value) {
            addCriterion("UserField7 >", value, "userfield7");
            return (Criteria) this;
        }

        public Criteria andUserfield7GreaterThanOrEqualTo(String value) {
            addCriterion("UserField7 >=", value, "userfield7");
            return (Criteria) this;
        }

        public Criteria andUserfield7LessThan(String value) {
            addCriterion("UserField7 <", value, "userfield7");
            return (Criteria) this;
        }

        public Criteria andUserfield7LessThanOrEqualTo(String value) {
            addCriterion("UserField7 <=", value, "userfield7");
            return (Criteria) this;
        }

        public Criteria andUserfield7Like(String value) {
            addCriterion("UserField7 like", value, "userfield7");
            return (Criteria) this;
        }

        public Criteria andUserfield7NotLike(String value) {
            addCriterion("UserField7 not like", value, "userfield7");
            return (Criteria) this;
        }

        public Criteria andUserfield7In(List<String> values) {
            addCriterion("UserField7 in", values, "userfield7");
            return (Criteria) this;
        }

        public Criteria andUserfield7NotIn(List<String> values) {
            addCriterion("UserField7 not in", values, "userfield7");
            return (Criteria) this;
        }

        public Criteria andUserfield7Between(String value1, String value2) {
            addCriterion("UserField7 between", value1, value2, "userfield7");
            return (Criteria) this;
        }

        public Criteria andUserfield7NotBetween(String value1, String value2) {
            addCriterion("UserField7 not between", value1, value2, "userfield7");
            return (Criteria) this;
        }

        public Criteria andUserfield8IsNull() {
            addCriterion("UserField8 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield8IsNotNull() {
            addCriterion("UserField8 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield8EqualTo(String value) {
            addCriterion("UserField8 =", value, "userfield8");
            return (Criteria) this;
        }

        public Criteria andUserfield8NotEqualTo(String value) {
            addCriterion("UserField8 <>", value, "userfield8");
            return (Criteria) this;
        }

        public Criteria andUserfield8GreaterThan(String value) {
            addCriterion("UserField8 >", value, "userfield8");
            return (Criteria) this;
        }

        public Criteria andUserfield8GreaterThanOrEqualTo(String value) {
            addCriterion("UserField8 >=", value, "userfield8");
            return (Criteria) this;
        }

        public Criteria andUserfield8LessThan(String value) {
            addCriterion("UserField8 <", value, "userfield8");
            return (Criteria) this;
        }

        public Criteria andUserfield8LessThanOrEqualTo(String value) {
            addCriterion("UserField8 <=", value, "userfield8");
            return (Criteria) this;
        }

        public Criteria andUserfield8Like(String value) {
            addCriterion("UserField8 like", value, "userfield8");
            return (Criteria) this;
        }

        public Criteria andUserfield8NotLike(String value) {
            addCriterion("UserField8 not like", value, "userfield8");
            return (Criteria) this;
        }

        public Criteria andUserfield8In(List<String> values) {
            addCriterion("UserField8 in", values, "userfield8");
            return (Criteria) this;
        }

        public Criteria andUserfield8NotIn(List<String> values) {
            addCriterion("UserField8 not in", values, "userfield8");
            return (Criteria) this;
        }

        public Criteria andUserfield8Between(String value1, String value2) {
            addCriterion("UserField8 between", value1, value2, "userfield8");
            return (Criteria) this;
        }

        public Criteria andUserfield8NotBetween(String value1, String value2) {
            addCriterion("UserField8 not between", value1, value2, "userfield8");
            return (Criteria) this;
        }

        public Criteria andUserfield9IsNull() {
            addCriterion("UserField9 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield9IsNotNull() {
            addCriterion("UserField9 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield9EqualTo(String value) {
            addCriterion("UserField9 =", value, "userfield9");
            return (Criteria) this;
        }

        public Criteria andUserfield9NotEqualTo(String value) {
            addCriterion("UserField9 <>", value, "userfield9");
            return (Criteria) this;
        }

        public Criteria andUserfield9GreaterThan(String value) {
            addCriterion("UserField9 >", value, "userfield9");
            return (Criteria) this;
        }

        public Criteria andUserfield9GreaterThanOrEqualTo(String value) {
            addCriterion("UserField9 >=", value, "userfield9");
            return (Criteria) this;
        }

        public Criteria andUserfield9LessThan(String value) {
            addCriterion("UserField9 <", value, "userfield9");
            return (Criteria) this;
        }

        public Criteria andUserfield9LessThanOrEqualTo(String value) {
            addCriterion("UserField9 <=", value, "userfield9");
            return (Criteria) this;
        }

        public Criteria andUserfield9Like(String value) {
            addCriterion("UserField9 like", value, "userfield9");
            return (Criteria) this;
        }

        public Criteria andUserfield9NotLike(String value) {
            addCriterion("UserField9 not like", value, "userfield9");
            return (Criteria) this;
        }

        public Criteria andUserfield9In(List<String> values) {
            addCriterion("UserField9 in", values, "userfield9");
            return (Criteria) this;
        }

        public Criteria andUserfield9NotIn(List<String> values) {
            addCriterion("UserField9 not in", values, "userfield9");
            return (Criteria) this;
        }

        public Criteria andUserfield9Between(String value1, String value2) {
            addCriterion("UserField9 between", value1, value2, "userfield9");
            return (Criteria) this;
        }

        public Criteria andUserfield9NotBetween(String value1, String value2) {
            addCriterion("UserField9 not between", value1, value2, "userfield9");
            return (Criteria) this;
        }

        public Criteria andUserfield10IsNull() {
            addCriterion("UserField10 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield10IsNotNull() {
            addCriterion("UserField10 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield10EqualTo(String value) {
            addCriterion("UserField10 =", value, "userfield10");
            return (Criteria) this;
        }

        public Criteria andUserfield10NotEqualTo(String value) {
            addCriterion("UserField10 <>", value, "userfield10");
            return (Criteria) this;
        }

        public Criteria andUserfield10GreaterThan(String value) {
            addCriterion("UserField10 >", value, "userfield10");
            return (Criteria) this;
        }

        public Criteria andUserfield10GreaterThanOrEqualTo(String value) {
            addCriterion("UserField10 >=", value, "userfield10");
            return (Criteria) this;
        }

        public Criteria andUserfield10LessThan(String value) {
            addCriterion("UserField10 <", value, "userfield10");
            return (Criteria) this;
        }

        public Criteria andUserfield10LessThanOrEqualTo(String value) {
            addCriterion("UserField10 <=", value, "userfield10");
            return (Criteria) this;
        }

        public Criteria andUserfield10Like(String value) {
            addCriterion("UserField10 like", value, "userfield10");
            return (Criteria) this;
        }

        public Criteria andUserfield10NotLike(String value) {
            addCriterion("UserField10 not like", value, "userfield10");
            return (Criteria) this;
        }

        public Criteria andUserfield10In(List<String> values) {
            addCriterion("UserField10 in", values, "userfield10");
            return (Criteria) this;
        }

        public Criteria andUserfield10NotIn(List<String> values) {
            addCriterion("UserField10 not in", values, "userfield10");
            return (Criteria) this;
        }

        public Criteria andUserfield10Between(String value1, String value2) {
            addCriterion("UserField10 between", value1, value2, "userfield10");
            return (Criteria) this;
        }

        public Criteria andUserfield10NotBetween(String value1, String value2) {
            addCriterion("UserField10 not between", value1, value2, "userfield10");
            return (Criteria) this;
        }

        public Criteria andUserfield11IsNull() {
            addCriterion("UserField11 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield11IsNotNull() {
            addCriterion("UserField11 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield11EqualTo(String value) {
            addCriterion("UserField11 =", value, "userfield11");
            return (Criteria) this;
        }

        public Criteria andUserfield11NotEqualTo(String value) {
            addCriterion("UserField11 <>", value, "userfield11");
            return (Criteria) this;
        }

        public Criteria andUserfield11GreaterThan(String value) {
            addCriterion("UserField11 >", value, "userfield11");
            return (Criteria) this;
        }

        public Criteria andUserfield11GreaterThanOrEqualTo(String value) {
            addCriterion("UserField11 >=", value, "userfield11");
            return (Criteria) this;
        }

        public Criteria andUserfield11LessThan(String value) {
            addCriterion("UserField11 <", value, "userfield11");
            return (Criteria) this;
        }

        public Criteria andUserfield11LessThanOrEqualTo(String value) {
            addCriterion("UserField11 <=", value, "userfield11");
            return (Criteria) this;
        }

        public Criteria andUserfield11Like(String value) {
            addCriterion("UserField11 like", value, "userfield11");
            return (Criteria) this;
        }

        public Criteria andUserfield11NotLike(String value) {
            addCriterion("UserField11 not like", value, "userfield11");
            return (Criteria) this;
        }

        public Criteria andUserfield11In(List<String> values) {
            addCriterion("UserField11 in", values, "userfield11");
            return (Criteria) this;
        }

        public Criteria andUserfield11NotIn(List<String> values) {
            addCriterion("UserField11 not in", values, "userfield11");
            return (Criteria) this;
        }

        public Criteria andUserfield11Between(String value1, String value2) {
            addCriterion("UserField11 between", value1, value2, "userfield11");
            return (Criteria) this;
        }

        public Criteria andUserfield11NotBetween(String value1, String value2) {
            addCriterion("UserField11 not between", value1, value2, "userfield11");
            return (Criteria) this;
        }

        public Criteria andUserfield12IsNull() {
            addCriterion("UserField12 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield12IsNotNull() {
            addCriterion("UserField12 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield12EqualTo(String value) {
            addCriterion("UserField12 =", value, "userfield12");
            return (Criteria) this;
        }

        public Criteria andUserfield12NotEqualTo(String value) {
            addCriterion("UserField12 <>", value, "userfield12");
            return (Criteria) this;
        }

        public Criteria andUserfield12GreaterThan(String value) {
            addCriterion("UserField12 >", value, "userfield12");
            return (Criteria) this;
        }

        public Criteria andUserfield12GreaterThanOrEqualTo(String value) {
            addCriterion("UserField12 >=", value, "userfield12");
            return (Criteria) this;
        }

        public Criteria andUserfield12LessThan(String value) {
            addCriterion("UserField12 <", value, "userfield12");
            return (Criteria) this;
        }

        public Criteria andUserfield12LessThanOrEqualTo(String value) {
            addCriterion("UserField12 <=", value, "userfield12");
            return (Criteria) this;
        }

        public Criteria andUserfield12Like(String value) {
            addCriterion("UserField12 like", value, "userfield12");
            return (Criteria) this;
        }

        public Criteria andUserfield12NotLike(String value) {
            addCriterion("UserField12 not like", value, "userfield12");
            return (Criteria) this;
        }

        public Criteria andUserfield12In(List<String> values) {
            addCriterion("UserField12 in", values, "userfield12");
            return (Criteria) this;
        }

        public Criteria andUserfield12NotIn(List<String> values) {
            addCriterion("UserField12 not in", values, "userfield12");
            return (Criteria) this;
        }

        public Criteria andUserfield12Between(String value1, String value2) {
            addCriterion("UserField12 between", value1, value2, "userfield12");
            return (Criteria) this;
        }

        public Criteria andUserfield12NotBetween(String value1, String value2) {
            addCriterion("UserField12 not between", value1, value2, "userfield12");
            return (Criteria) this;
        }

        public Criteria andUserfield13IsNull() {
            addCriterion("UserField13 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield13IsNotNull() {
            addCriterion("UserField13 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield13EqualTo(String value) {
            addCriterion("UserField13 =", value, "userfield13");
            return (Criteria) this;
        }

        public Criteria andUserfield13NotEqualTo(String value) {
            addCriterion("UserField13 <>", value, "userfield13");
            return (Criteria) this;
        }

        public Criteria andUserfield13GreaterThan(String value) {
            addCriterion("UserField13 >", value, "userfield13");
            return (Criteria) this;
        }

        public Criteria andUserfield13GreaterThanOrEqualTo(String value) {
            addCriterion("UserField13 >=", value, "userfield13");
            return (Criteria) this;
        }

        public Criteria andUserfield13LessThan(String value) {
            addCriterion("UserField13 <", value, "userfield13");
            return (Criteria) this;
        }

        public Criteria andUserfield13LessThanOrEqualTo(String value) {
            addCriterion("UserField13 <=", value, "userfield13");
            return (Criteria) this;
        }

        public Criteria andUserfield13Like(String value) {
            addCriterion("UserField13 like", value, "userfield13");
            return (Criteria) this;
        }

        public Criteria andUserfield13NotLike(String value) {
            addCriterion("UserField13 not like", value, "userfield13");
            return (Criteria) this;
        }

        public Criteria andUserfield13In(List<String> values) {
            addCriterion("UserField13 in", values, "userfield13");
            return (Criteria) this;
        }

        public Criteria andUserfield13NotIn(List<String> values) {
            addCriterion("UserField13 not in", values, "userfield13");
            return (Criteria) this;
        }

        public Criteria andUserfield13Between(String value1, String value2) {
            addCriterion("UserField13 between", value1, value2, "userfield13");
            return (Criteria) this;
        }

        public Criteria andUserfield13NotBetween(String value1, String value2) {
            addCriterion("UserField13 not between", value1, value2, "userfield13");
            return (Criteria) this;
        }

        public Criteria andUserfield14IsNull() {
            addCriterion("UserField14 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield14IsNotNull() {
            addCriterion("UserField14 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield14EqualTo(String value) {
            addCriterion("UserField14 =", value, "userfield14");
            return (Criteria) this;
        }

        public Criteria andUserfield14NotEqualTo(String value) {
            addCriterion("UserField14 <>", value, "userfield14");
            return (Criteria) this;
        }

        public Criteria andUserfield14GreaterThan(String value) {
            addCriterion("UserField14 >", value, "userfield14");
            return (Criteria) this;
        }

        public Criteria andUserfield14GreaterThanOrEqualTo(String value) {
            addCriterion("UserField14 >=", value, "userfield14");
            return (Criteria) this;
        }

        public Criteria andUserfield14LessThan(String value) {
            addCriterion("UserField14 <", value, "userfield14");
            return (Criteria) this;
        }

        public Criteria andUserfield14LessThanOrEqualTo(String value) {
            addCriterion("UserField14 <=", value, "userfield14");
            return (Criteria) this;
        }

        public Criteria andUserfield14Like(String value) {
            addCriterion("UserField14 like", value, "userfield14");
            return (Criteria) this;
        }

        public Criteria andUserfield14NotLike(String value) {
            addCriterion("UserField14 not like", value, "userfield14");
            return (Criteria) this;
        }

        public Criteria andUserfield14In(List<String> values) {
            addCriterion("UserField14 in", values, "userfield14");
            return (Criteria) this;
        }

        public Criteria andUserfield14NotIn(List<String> values) {
            addCriterion("UserField14 not in", values, "userfield14");
            return (Criteria) this;
        }

        public Criteria andUserfield14Between(String value1, String value2) {
            addCriterion("UserField14 between", value1, value2, "userfield14");
            return (Criteria) this;
        }

        public Criteria andUserfield14NotBetween(String value1, String value2) {
            addCriterion("UserField14 not between", value1, value2, "userfield14");
            return (Criteria) this;
        }

        public Criteria andUserfield15IsNull() {
            addCriterion("UserField15 is null");
            return (Criteria) this;
        }

        public Criteria andUserfield15IsNotNull() {
            addCriterion("UserField15 is not null");
            return (Criteria) this;
        }

        public Criteria andUserfield15EqualTo(String value) {
            addCriterion("UserField15 =", value, "userfield15");
            return (Criteria) this;
        }

        public Criteria andUserfield15NotEqualTo(String value) {
            addCriterion("UserField15 <>", value, "userfield15");
            return (Criteria) this;
        }

        public Criteria andUserfield15GreaterThan(String value) {
            addCriterion("UserField15 >", value, "userfield15");
            return (Criteria) this;
        }

        public Criteria andUserfield15GreaterThanOrEqualTo(String value) {
            addCriterion("UserField15 >=", value, "userfield15");
            return (Criteria) this;
        }

        public Criteria andUserfield15LessThan(String value) {
            addCriterion("UserField15 <", value, "userfield15");
            return (Criteria) this;
        }

        public Criteria andUserfield15LessThanOrEqualTo(String value) {
            addCriterion("UserField15 <=", value, "userfield15");
            return (Criteria) this;
        }

        public Criteria andUserfield15Like(String value) {
            addCriterion("UserField15 like", value, "userfield15");
            return (Criteria) this;
        }

        public Criteria andUserfield15NotLike(String value) {
            addCriterion("UserField15 not like", value, "userfield15");
            return (Criteria) this;
        }

        public Criteria andUserfield15In(List<String> values) {
            addCriterion("UserField15 in", values, "userfield15");
            return (Criteria) this;
        }

        public Criteria andUserfield15NotIn(List<String> values) {
            addCriterion("UserField15 not in", values, "userfield15");
            return (Criteria) this;
        }

        public Criteria andUserfield15Between(String value1, String value2) {
            addCriterion("UserField15 between", value1, value2, "userfield15");
            return (Criteria) this;
        }

        public Criteria andUserfield15NotBetween(String value1, String value2) {
            addCriterion("UserField15 not between", value1, value2, "userfield15");
            return (Criteria) this;
        }

        public Criteria andLasttagtimeIsNull() {
            addCriterion("LastTagTime is null");
            return (Criteria) this;
        }

        public Criteria andLasttagtimeIsNotNull() {
            addCriterion("LastTagTime is not null");
            return (Criteria) this;
        }

        public Criteria andLasttagtimeEqualTo(Date value) {
            addCriterion("LastTagTime =", value, "lasttagtime");
            return (Criteria) this;
        }

        public Criteria andLasttagtimeNotEqualTo(Date value) {
            addCriterion("LastTagTime <>", value, "lasttagtime");
            return (Criteria) this;
        }

        public Criteria andLasttagtimeGreaterThan(Date value) {
            addCriterion("LastTagTime >", value, "lasttagtime");
            return (Criteria) this;
        }

        public Criteria andLasttagtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastTagTime >=", value, "lasttagtime");
            return (Criteria) this;
        }

        public Criteria andLasttagtimeLessThan(Date value) {
            addCriterion("LastTagTime <", value, "lasttagtime");
            return (Criteria) this;
        }

        public Criteria andLasttagtimeLessThanOrEqualTo(Date value) {
            addCriterion("LastTagTime <=", value, "lasttagtime");
            return (Criteria) this;
        }

        public Criteria andLasttagtimeIn(List<Date> values) {
            addCriterion("LastTagTime in", values, "lasttagtime");
            return (Criteria) this;
        }

        public Criteria andLasttagtimeNotIn(List<Date> values) {
            addCriterion("LastTagTime not in", values, "lasttagtime");
            return (Criteria) this;
        }

        public Criteria andLasttagtimeBetween(Date value1, Date value2) {
            addCriterion("LastTagTime between", value1, value2, "lasttagtime");
            return (Criteria) this;
        }

        public Criteria andLasttagtimeNotBetween(Date value1, Date value2) {
            addCriterion("LastTagTime not between", value1, value2, "lasttagtime");
            return (Criteria) this;
        }

        public Criteria andItemmodifieddatetimeIsNull() {
            addCriterion("ItemModifiedDateTime is null");
            return (Criteria) this;
        }

        public Criteria andItemmodifieddatetimeIsNotNull() {
            addCriterion("ItemModifiedDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andItemmodifieddatetimeEqualTo(Date value) {
            addCriterion("ItemModifiedDateTime =", value, "itemmodifieddatetime");
            return (Criteria) this;
        }

        public Criteria andItemmodifieddatetimeNotEqualTo(Date value) {
            addCriterion("ItemModifiedDateTime <>", value, "itemmodifieddatetime");
            return (Criteria) this;
        }

        public Criteria andItemmodifieddatetimeGreaterThan(Date value) {
            addCriterion("ItemModifiedDateTime >", value, "itemmodifieddatetime");
            return (Criteria) this;
        }

        public Criteria andItemmodifieddatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ItemModifiedDateTime >=", value, "itemmodifieddatetime");
            return (Criteria) this;
        }

        public Criteria andItemmodifieddatetimeLessThan(Date value) {
            addCriterion("ItemModifiedDateTime <", value, "itemmodifieddatetime");
            return (Criteria) this;
        }

        public Criteria andItemmodifieddatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ItemModifiedDateTime <=", value, "itemmodifieddatetime");
            return (Criteria) this;
        }

        public Criteria andItemmodifieddatetimeIn(List<Date> values) {
            addCriterion("ItemModifiedDateTime in", values, "itemmodifieddatetime");
            return (Criteria) this;
        }

        public Criteria andItemmodifieddatetimeNotIn(List<Date> values) {
            addCriterion("ItemModifiedDateTime not in", values, "itemmodifieddatetime");
            return (Criteria) this;
        }

        public Criteria andItemmodifieddatetimeBetween(Date value1, Date value2) {
            addCriterion("ItemModifiedDateTime between", value1, value2, "itemmodifieddatetime");
            return (Criteria) this;
        }

        public Criteria andItemmodifieddatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ItemModifiedDateTime not between", value1, value2, "itemmodifieddatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}