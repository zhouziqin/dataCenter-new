package com.ucan.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PointConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointConfigExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("LONGITUDE like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("LONGITUDE not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andDimensionIsNull() {
            addCriterion("DIMENSION is null");
            return (Criteria) this;
        }

        public Criteria andDimensionIsNotNull() {
            addCriterion("DIMENSION is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionEqualTo(String value) {
            addCriterion("DIMENSION =", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotEqualTo(String value) {
            addCriterion("DIMENSION <>", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionGreaterThan(String value) {
            addCriterion("DIMENSION >", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionGreaterThanOrEqualTo(String value) {
            addCriterion("DIMENSION >=", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionLessThan(String value) {
            addCriterion("DIMENSION <", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionLessThanOrEqualTo(String value) {
            addCriterion("DIMENSION <=", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionLike(String value) {
            addCriterion("DIMENSION like", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotLike(String value) {
            addCriterion("DIMENSION not like", value, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionIn(List<String> values) {
            addCriterion("DIMENSION in", values, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotIn(List<String> values) {
            addCriterion("DIMENSION not in", values, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionBetween(String value1, String value2) {
            addCriterion("DIMENSION between", value1, value2, "dimension");
            return (Criteria) this;
        }

        public Criteria andDimensionNotBetween(String value1, String value2) {
            addCriterion("DIMENSION not between", value1, value2, "dimension");
            return (Criteria) this;
        }

        public Criteria andFcdIsNull() {
            addCriterion("FCD is null");
            return (Criteria) this;
        }

        public Criteria andFcdIsNotNull() {
            addCriterion("FCD is not null");
            return (Criteria) this;
        }

        public Criteria andFcdEqualTo(Date value) {
            addCriterion("FCD =", value, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdNotEqualTo(Date value) {
            addCriterion("FCD <>", value, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdGreaterThan(Date value) {
            addCriterion("FCD >", value, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdGreaterThanOrEqualTo(Date value) {
            addCriterion("FCD >=", value, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdLessThan(Date value) {
            addCriterion("FCD <", value, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdLessThanOrEqualTo(Date value) {
            addCriterion("FCD <=", value, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdIn(List<Date> values) {
            addCriterion("FCD in", values, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdNotIn(List<Date> values) {
            addCriterion("FCD not in", values, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdBetween(Date value1, Date value2) {
            addCriterion("FCD between", value1, value2, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcdNotBetween(Date value1, Date value2) {
            addCriterion("FCD not between", value1, value2, "fcd");
            return (Criteria) this;
        }

        public Criteria andFcuIsNull() {
            addCriterion("FCU is null");
            return (Criteria) this;
        }

        public Criteria andFcuIsNotNull() {
            addCriterion("FCU is not null");
            return (Criteria) this;
        }

        public Criteria andFcuEqualTo(String value) {
            addCriterion("FCU =", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuNotEqualTo(String value) {
            addCriterion("FCU <>", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuGreaterThan(String value) {
            addCriterion("FCU >", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuGreaterThanOrEqualTo(String value) {
            addCriterion("FCU >=", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuLessThan(String value) {
            addCriterion("FCU <", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuLessThanOrEqualTo(String value) {
            addCriterion("FCU <=", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuLike(String value) {
            addCriterion("FCU like", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuNotLike(String value) {
            addCriterion("FCU not like", value, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuIn(List<String> values) {
            addCriterion("FCU in", values, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuNotIn(List<String> values) {
            addCriterion("FCU not in", values, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuBetween(String value1, String value2) {
            addCriterion("FCU between", value1, value2, "fcu");
            return (Criteria) this;
        }

        public Criteria andFcuNotBetween(String value1, String value2) {
            addCriterion("FCU not between", value1, value2, "fcu");
            return (Criteria) this;
        }

        public Criteria andLmdIsNull() {
            addCriterion("LMD is null");
            return (Criteria) this;
        }

        public Criteria andLmdIsNotNull() {
            addCriterion("LMD is not null");
            return (Criteria) this;
        }

        public Criteria andLmdEqualTo(Date value) {
            addCriterion("LMD =", value, "lmd");
            return (Criteria) this;
        }

        public Criteria andLmdNotEqualTo(Date value) {
            addCriterion("LMD <>", value, "lmd");
            return (Criteria) this;
        }

        public Criteria andLmdGreaterThan(Date value) {
            addCriterion("LMD >", value, "lmd");
            return (Criteria) this;
        }

        public Criteria andLmdGreaterThanOrEqualTo(Date value) {
            addCriterion("LMD >=", value, "lmd");
            return (Criteria) this;
        }

        public Criteria andLmdLessThan(Date value) {
            addCriterion("LMD <", value, "lmd");
            return (Criteria) this;
        }

        public Criteria andLmdLessThanOrEqualTo(Date value) {
            addCriterion("LMD <=", value, "lmd");
            return (Criteria) this;
        }

        public Criteria andLmdIn(List<Date> values) {
            addCriterion("LMD in", values, "lmd");
            return (Criteria) this;
        }

        public Criteria andLmdNotIn(List<Date> values) {
            addCriterion("LMD not in", values, "lmd");
            return (Criteria) this;
        }

        public Criteria andLmdBetween(Date value1, Date value2) {
            addCriterion("LMD between", value1, value2, "lmd");
            return (Criteria) this;
        }

        public Criteria andLmdNotBetween(Date value1, Date value2) {
            addCriterion("LMD not between", value1, value2, "lmd");
            return (Criteria) this;
        }

        public Criteria andLmuIsNull() {
            addCriterion("LMU is null");
            return (Criteria) this;
        }

        public Criteria andLmuIsNotNull() {
            addCriterion("LMU is not null");
            return (Criteria) this;
        }

        public Criteria andLmuEqualTo(String value) {
            addCriterion("LMU =", value, "lmu");
            return (Criteria) this;
        }

        public Criteria andLmuNotEqualTo(String value) {
            addCriterion("LMU <>", value, "lmu");
            return (Criteria) this;
        }

        public Criteria andLmuGreaterThan(String value) {
            addCriterion("LMU >", value, "lmu");
            return (Criteria) this;
        }

        public Criteria andLmuGreaterThanOrEqualTo(String value) {
            addCriterion("LMU >=", value, "lmu");
            return (Criteria) this;
        }

        public Criteria andLmuLessThan(String value) {
            addCriterion("LMU <", value, "lmu");
            return (Criteria) this;
        }

        public Criteria andLmuLessThanOrEqualTo(String value) {
            addCriterion("LMU <=", value, "lmu");
            return (Criteria) this;
        }

        public Criteria andLmuLike(String value) {
            addCriterion("LMU like", value, "lmu");
            return (Criteria) this;
        }

        public Criteria andLmuNotLike(String value) {
            addCriterion("LMU not like", value, "lmu");
            return (Criteria) this;
        }

        public Criteria andLmuIn(List<String> values) {
            addCriterion("LMU in", values, "lmu");
            return (Criteria) this;
        }

        public Criteria andLmuNotIn(List<String> values) {
            addCriterion("LMU not in", values, "lmu");
            return (Criteria) this;
        }

        public Criteria andLmuBetween(String value1, String value2) {
            addCriterion("LMU between", value1, value2, "lmu");
            return (Criteria) this;
        }

        public Criteria andLmuNotBetween(String value1, String value2) {
            addCriterion("LMU not between", value1, value2, "lmu");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andForeignIdIsNull() {
            addCriterion("FOREIGN_ID is null");
            return (Criteria) this;
        }

        public Criteria andForeignIdIsNotNull() {
            addCriterion("FOREIGN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andForeignIdEqualTo(String value) {
            addCriterion("FOREIGN_ID =", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdNotEqualTo(String value) {
            addCriterion("FOREIGN_ID <>", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdGreaterThan(String value) {
            addCriterion("FOREIGN_ID >", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdGreaterThanOrEqualTo(String value) {
            addCriterion("FOREIGN_ID >=", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdLessThan(String value) {
            addCriterion("FOREIGN_ID <", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdLessThanOrEqualTo(String value) {
            addCriterion("FOREIGN_ID <=", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdLike(String value) {
            addCriterion("FOREIGN_ID like", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdNotLike(String value) {
            addCriterion("FOREIGN_ID not like", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdIn(List<String> values) {
            addCriterion("FOREIGN_ID in", values, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdNotIn(List<String> values) {
            addCriterion("FOREIGN_ID not in", values, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdBetween(String value1, String value2) {
            addCriterion("FOREIGN_ID between", value1, value2, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdNotBetween(String value1, String value2) {
            addCriterion("FOREIGN_ID not between", value1, value2, "foreignId");
            return (Criteria) this;
        }

        public Criteria andTempFeild1IsNull() {
            addCriterion("TEMP_FEILD1 is null");
            return (Criteria) this;
        }

        public Criteria andTempFeild1IsNotNull() {
            addCriterion("TEMP_FEILD1 is not null");
            return (Criteria) this;
        }

        public Criteria andTempFeild1EqualTo(String value) {
            addCriterion("TEMP_FEILD1 =", value, "tempFeild1");
            return (Criteria) this;
        }

        public Criteria andTempFeild1NotEqualTo(String value) {
            addCriterion("TEMP_FEILD1 <>", value, "tempFeild1");
            return (Criteria) this;
        }

        public Criteria andTempFeild1GreaterThan(String value) {
            addCriterion("TEMP_FEILD1 >", value, "tempFeild1");
            return (Criteria) this;
        }

        public Criteria andTempFeild1GreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_FEILD1 >=", value, "tempFeild1");
            return (Criteria) this;
        }

        public Criteria andTempFeild1LessThan(String value) {
            addCriterion("TEMP_FEILD1 <", value, "tempFeild1");
            return (Criteria) this;
        }

        public Criteria andTempFeild1LessThanOrEqualTo(String value) {
            addCriterion("TEMP_FEILD1 <=", value, "tempFeild1");
            return (Criteria) this;
        }

        public Criteria andTempFeild1Like(String value) {
            addCriterion("TEMP_FEILD1 like", value, "tempFeild1");
            return (Criteria) this;
        }

        public Criteria andTempFeild1NotLike(String value) {
            addCriterion("TEMP_FEILD1 not like", value, "tempFeild1");
            return (Criteria) this;
        }

        public Criteria andTempFeild1In(List<String> values) {
            addCriterion("TEMP_FEILD1 in", values, "tempFeild1");
            return (Criteria) this;
        }

        public Criteria andTempFeild1NotIn(List<String> values) {
            addCriterion("TEMP_FEILD1 not in", values, "tempFeild1");
            return (Criteria) this;
        }

        public Criteria andTempFeild1Between(String value1, String value2) {
            addCriterion("TEMP_FEILD1 between", value1, value2, "tempFeild1");
            return (Criteria) this;
        }

        public Criteria andTempFeild1NotBetween(String value1, String value2) {
            addCriterion("TEMP_FEILD1 not between", value1, value2, "tempFeild1");
            return (Criteria) this;
        }

        public Criteria andTempFeild2IsNull() {
            addCriterion("TEMP_FEILD2 is null");
            return (Criteria) this;
        }

        public Criteria andTempFeild2IsNotNull() {
            addCriterion("TEMP_FEILD2 is not null");
            return (Criteria) this;
        }

        public Criteria andTempFeild2EqualTo(String value) {
            addCriterion("TEMP_FEILD2 =", value, "tempFeild2");
            return (Criteria) this;
        }

        public Criteria andTempFeild2NotEqualTo(String value) {
            addCriterion("TEMP_FEILD2 <>", value, "tempFeild2");
            return (Criteria) this;
        }

        public Criteria andTempFeild2GreaterThan(String value) {
            addCriterion("TEMP_FEILD2 >", value, "tempFeild2");
            return (Criteria) this;
        }

        public Criteria andTempFeild2GreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_FEILD2 >=", value, "tempFeild2");
            return (Criteria) this;
        }

        public Criteria andTempFeild2LessThan(String value) {
            addCriterion("TEMP_FEILD2 <", value, "tempFeild2");
            return (Criteria) this;
        }

        public Criteria andTempFeild2LessThanOrEqualTo(String value) {
            addCriterion("TEMP_FEILD2 <=", value, "tempFeild2");
            return (Criteria) this;
        }

        public Criteria andTempFeild2Like(String value) {
            addCriterion("TEMP_FEILD2 like", value, "tempFeild2");
            return (Criteria) this;
        }

        public Criteria andTempFeild2NotLike(String value) {
            addCriterion("TEMP_FEILD2 not like", value, "tempFeild2");
            return (Criteria) this;
        }

        public Criteria andTempFeild2In(List<String> values) {
            addCriterion("TEMP_FEILD2 in", values, "tempFeild2");
            return (Criteria) this;
        }

        public Criteria andTempFeild2NotIn(List<String> values) {
            addCriterion("TEMP_FEILD2 not in", values, "tempFeild2");
            return (Criteria) this;
        }

        public Criteria andTempFeild2Between(String value1, String value2) {
            addCriterion("TEMP_FEILD2 between", value1, value2, "tempFeild2");
            return (Criteria) this;
        }

        public Criteria andTempFeild2NotBetween(String value1, String value2) {
            addCriterion("TEMP_FEILD2 not between", value1, value2, "tempFeild2");
            return (Criteria) this;
        }

        public Criteria andAredIdIsNull() {
            addCriterion("ARED_ID is null");
            return (Criteria) this;
        }

        public Criteria andAredIdIsNotNull() {
            addCriterion("ARED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAredIdEqualTo(String value) {
            addCriterion("ARED_ID =", value, "aredId");
            return (Criteria) this;
        }

        public Criteria andAredIdNotEqualTo(String value) {
            addCriterion("ARED_ID <>", value, "aredId");
            return (Criteria) this;
        }

        public Criteria andAredIdGreaterThan(String value) {
            addCriterion("ARED_ID >", value, "aredId");
            return (Criteria) this;
        }

        public Criteria andAredIdGreaterThanOrEqualTo(String value) {
            addCriterion("ARED_ID >=", value, "aredId");
            return (Criteria) this;
        }

        public Criteria andAredIdLessThan(String value) {
            addCriterion("ARED_ID <", value, "aredId");
            return (Criteria) this;
        }

        public Criteria andAredIdLessThanOrEqualTo(String value) {
            addCriterion("ARED_ID <=", value, "aredId");
            return (Criteria) this;
        }

        public Criteria andAredIdLike(String value) {
            addCriterion("ARED_ID like", value, "aredId");
            return (Criteria) this;
        }

        public Criteria andAredIdNotLike(String value) {
            addCriterion("ARED_ID not like", value, "aredId");
            return (Criteria) this;
        }

        public Criteria andAredIdIn(List<String> values) {
            addCriterion("ARED_ID in", values, "aredId");
            return (Criteria) this;
        }

        public Criteria andAredIdNotIn(List<String> values) {
            addCriterion("ARED_ID not in", values, "aredId");
            return (Criteria) this;
        }

        public Criteria andAredIdBetween(String value1, String value2) {
            addCriterion("ARED_ID between", value1, value2, "aredId");
            return (Criteria) this;
        }

        public Criteria andAredIdNotBetween(String value1, String value2) {
            addCriterion("ARED_ID not between", value1, value2, "aredId");
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