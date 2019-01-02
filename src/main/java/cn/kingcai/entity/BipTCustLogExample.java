package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTCustLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTCustLogExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Long value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Long value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Long value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Long value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Long value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Long value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Long> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Long> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Long value1, Long value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Long value1, Long value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFbillnoIsNull() {
            addCriterion("fbillno is null");
            return (Criteria) this;
        }

        public Criteria andFbillnoIsNotNull() {
            addCriterion("fbillno is not null");
            return (Criteria) this;
        }

        public Criteria andFbillnoEqualTo(String value) {
            addCriterion("fbillno =", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoNotEqualTo(String value) {
            addCriterion("fbillno <>", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoGreaterThan(String value) {
            addCriterion("fbillno >", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoGreaterThanOrEqualTo(String value) {
            addCriterion("fbillno >=", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoLessThan(String value) {
            addCriterion("fbillno <", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoLessThanOrEqualTo(String value) {
            addCriterion("fbillno <=", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoLike(String value) {
            addCriterion("fbillno like", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoNotLike(String value) {
            addCriterion("fbillno not like", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoIn(List<String> values) {
            addCriterion("fbillno in", values, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoNotIn(List<String> values) {
            addCriterion("fbillno not in", values, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoBetween(String value1, String value2) {
            addCriterion("fbillno between", value1, value2, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoNotBetween(String value1, String value2) {
            addCriterion("fbillno not between", value1, value2, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusIsNull() {
            addCriterion("fdocumentstatus is null");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusIsNotNull() {
            addCriterion("fdocumentstatus is not null");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusEqualTo(String value) {
            addCriterion("fdocumentstatus =", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusNotEqualTo(String value) {
            addCriterion("fdocumentstatus <>", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusGreaterThan(String value) {
            addCriterion("fdocumentstatus >", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusGreaterThanOrEqualTo(String value) {
            addCriterion("fdocumentstatus >=", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusLessThan(String value) {
            addCriterion("fdocumentstatus <", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusLessThanOrEqualTo(String value) {
            addCriterion("fdocumentstatus <=", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusLike(String value) {
            addCriterion("fdocumentstatus like", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusNotLike(String value) {
            addCriterion("fdocumentstatus not like", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusIn(List<String> values) {
            addCriterion("fdocumentstatus in", values, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusNotIn(List<String> values) {
            addCriterion("fdocumentstatus not in", values, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusBetween(String value1, String value2) {
            addCriterion("fdocumentstatus between", value1, value2, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusNotBetween(String value1, String value2) {
            addCriterion("fdocumentstatus not between", value1, value2, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFBipLogdateIsNull() {
            addCriterion("f_bip_logdate is null");
            return (Criteria) this;
        }

        public Criteria andFBipLogdateIsNotNull() {
            addCriterion("f_bip_logdate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipLogdateEqualTo(Date value) {
            addCriterion("f_bip_logdate =", value, "fBipLogdate");
            return (Criteria) this;
        }

        public Criteria andFBipLogdateNotEqualTo(Date value) {
            addCriterion("f_bip_logdate <>", value, "fBipLogdate");
            return (Criteria) this;
        }

        public Criteria andFBipLogdateGreaterThan(Date value) {
            addCriterion("f_bip_logdate >", value, "fBipLogdate");
            return (Criteria) this;
        }

        public Criteria andFBipLogdateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_logdate >=", value, "fBipLogdate");
            return (Criteria) this;
        }

        public Criteria andFBipLogdateLessThan(Date value) {
            addCriterion("f_bip_logdate <", value, "fBipLogdate");
            return (Criteria) this;
        }

        public Criteria andFBipLogdateLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_logdate <=", value, "fBipLogdate");
            return (Criteria) this;
        }

        public Criteria andFBipLogdateIn(List<Date> values) {
            addCriterion("f_bip_logdate in", values, "fBipLogdate");
            return (Criteria) this;
        }

        public Criteria andFBipLogdateNotIn(List<Date> values) {
            addCriterion("f_bip_logdate not in", values, "fBipLogdate");
            return (Criteria) this;
        }

        public Criteria andFBipLogdateBetween(Date value1, Date value2) {
            addCriterion("f_bip_logdate between", value1, value2, "fBipLogdate");
            return (Criteria) this;
        }

        public Criteria andFBipLogdateNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_logdate not between", value1, value2, "fBipLogdate");
            return (Criteria) this;
        }

        public Criteria andFBipMorningIsNull() {
            addCriterion("f_bip_morning is null");
            return (Criteria) this;
        }

        public Criteria andFBipMorningIsNotNull() {
            addCriterion("f_bip_morning is not null");
            return (Criteria) this;
        }

        public Criteria andFBipMorningEqualTo(String value) {
            addCriterion("f_bip_morning =", value, "fBipMorning");
            return (Criteria) this;
        }

        public Criteria andFBipMorningNotEqualTo(String value) {
            addCriterion("f_bip_morning <>", value, "fBipMorning");
            return (Criteria) this;
        }

        public Criteria andFBipMorningGreaterThan(String value) {
            addCriterion("f_bip_morning >", value, "fBipMorning");
            return (Criteria) this;
        }

        public Criteria andFBipMorningGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_morning >=", value, "fBipMorning");
            return (Criteria) this;
        }

        public Criteria andFBipMorningLessThan(String value) {
            addCriterion("f_bip_morning <", value, "fBipMorning");
            return (Criteria) this;
        }

        public Criteria andFBipMorningLessThanOrEqualTo(String value) {
            addCriterion("f_bip_morning <=", value, "fBipMorning");
            return (Criteria) this;
        }

        public Criteria andFBipMorningLike(String value) {
            addCriterion("f_bip_morning like", value, "fBipMorning");
            return (Criteria) this;
        }

        public Criteria andFBipMorningNotLike(String value) {
            addCriterion("f_bip_morning not like", value, "fBipMorning");
            return (Criteria) this;
        }

        public Criteria andFBipMorningIn(List<String> values) {
            addCriterion("f_bip_morning in", values, "fBipMorning");
            return (Criteria) this;
        }

        public Criteria andFBipMorningNotIn(List<String> values) {
            addCriterion("f_bip_morning not in", values, "fBipMorning");
            return (Criteria) this;
        }

        public Criteria andFBipMorningBetween(String value1, String value2) {
            addCriterion("f_bip_morning between", value1, value2, "fBipMorning");
            return (Criteria) this;
        }

        public Criteria andFBipMorningNotBetween(String value1, String value2) {
            addCriterion("f_bip_morning not between", value1, value2, "fBipMorning");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonIsNull() {
            addCriterion("f_bip_afternoon is null");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonIsNotNull() {
            addCriterion("f_bip_afternoon is not null");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonEqualTo(String value) {
            addCriterion("f_bip_afternoon =", value, "fBipAfternoon");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonNotEqualTo(String value) {
            addCriterion("f_bip_afternoon <>", value, "fBipAfternoon");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonGreaterThan(String value) {
            addCriterion("f_bip_afternoon >", value, "fBipAfternoon");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_afternoon >=", value, "fBipAfternoon");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonLessThan(String value) {
            addCriterion("f_bip_afternoon <", value, "fBipAfternoon");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonLessThanOrEqualTo(String value) {
            addCriterion("f_bip_afternoon <=", value, "fBipAfternoon");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonLike(String value) {
            addCriterion("f_bip_afternoon like", value, "fBipAfternoon");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonNotLike(String value) {
            addCriterion("f_bip_afternoon not like", value, "fBipAfternoon");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonIn(List<String> values) {
            addCriterion("f_bip_afternoon in", values, "fBipAfternoon");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonNotIn(List<String> values) {
            addCriterion("f_bip_afternoon not in", values, "fBipAfternoon");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonBetween(String value1, String value2) {
            addCriterion("f_bip_afternoon between", value1, value2, "fBipAfternoon");
            return (Criteria) this;
        }

        public Criteria andFBipAfternoonNotBetween(String value1, String value2) {
            addCriterion("f_bip_afternoon not between", value1, value2, "fBipAfternoon");
            return (Criteria) this;
        }

        public Criteria andFBipNightIsNull() {
            addCriterion("f_bip_night is null");
            return (Criteria) this;
        }

        public Criteria andFBipNightIsNotNull() {
            addCriterion("f_bip_night is not null");
            return (Criteria) this;
        }

        public Criteria andFBipNightEqualTo(String value) {
            addCriterion("f_bip_night =", value, "fBipNight");
            return (Criteria) this;
        }

        public Criteria andFBipNightNotEqualTo(String value) {
            addCriterion("f_bip_night <>", value, "fBipNight");
            return (Criteria) this;
        }

        public Criteria andFBipNightGreaterThan(String value) {
            addCriterion("f_bip_night >", value, "fBipNight");
            return (Criteria) this;
        }

        public Criteria andFBipNightGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_night >=", value, "fBipNight");
            return (Criteria) this;
        }

        public Criteria andFBipNightLessThan(String value) {
            addCriterion("f_bip_night <", value, "fBipNight");
            return (Criteria) this;
        }

        public Criteria andFBipNightLessThanOrEqualTo(String value) {
            addCriterion("f_bip_night <=", value, "fBipNight");
            return (Criteria) this;
        }

        public Criteria andFBipNightLike(String value) {
            addCriterion("f_bip_night like", value, "fBipNight");
            return (Criteria) this;
        }

        public Criteria andFBipNightNotLike(String value) {
            addCriterion("f_bip_night not like", value, "fBipNight");
            return (Criteria) this;
        }

        public Criteria andFBipNightIn(List<String> values) {
            addCriterion("f_bip_night in", values, "fBipNight");
            return (Criteria) this;
        }

        public Criteria andFBipNightNotIn(List<String> values) {
            addCriterion("f_bip_night not in", values, "fBipNight");
            return (Criteria) this;
        }

        public Criteria andFBipNightBetween(String value1, String value2) {
            addCriterion("f_bip_night between", value1, value2, "fBipNight");
            return (Criteria) this;
        }

        public Criteria andFBipNightNotBetween(String value1, String value2) {
            addCriterion("f_bip_night not between", value1, value2, "fBipNight");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsIsNull() {
            addCriterion("f_bip_details is null");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsIsNotNull() {
            addCriterion("f_bip_details is not null");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsEqualTo(String value) {
            addCriterion("f_bip_details =", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsNotEqualTo(String value) {
            addCriterion("f_bip_details <>", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsGreaterThan(String value) {
            addCriterion("f_bip_details >", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_details >=", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsLessThan(String value) {
            addCriterion("f_bip_details <", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsLessThanOrEqualTo(String value) {
            addCriterion("f_bip_details <=", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsLike(String value) {
            addCriterion("f_bip_details like", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsNotLike(String value) {
            addCriterion("f_bip_details not like", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsIn(List<String> values) {
            addCriterion("f_bip_details in", values, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsNotIn(List<String> values) {
            addCriterion("f_bip_details not in", values, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsBetween(String value1, String value2) {
            addCriterion("f_bip_details between", value1, value2, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsNotBetween(String value1, String value2) {
            addCriterion("f_bip_details not between", value1, value2, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFcreatoridIsNull() {
            addCriterion("fcreatorid is null");
            return (Criteria) this;
        }

        public Criteria andFcreatoridIsNotNull() {
            addCriterion("fcreatorid is not null");
            return (Criteria) this;
        }

        public Criteria andFcreatoridEqualTo(Integer value) {
            addCriterion("fcreatorid =", value, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridNotEqualTo(Integer value) {
            addCriterion("fcreatorid <>", value, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridGreaterThan(Integer value) {
            addCriterion("fcreatorid >", value, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fcreatorid >=", value, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridLessThan(Integer value) {
            addCriterion("fcreatorid <", value, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridLessThanOrEqualTo(Integer value) {
            addCriterion("fcreatorid <=", value, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridIn(List<Integer> values) {
            addCriterion("fcreatorid in", values, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridNotIn(List<Integer> values) {
            addCriterion("fcreatorid not in", values, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridBetween(Integer value1, Integer value2) {
            addCriterion("fcreatorid between", value1, value2, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("fcreatorid not between", value1, value2, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatedateIsNull() {
            addCriterion("fcreatedate is null");
            return (Criteria) this;
        }

        public Criteria andFcreatedateIsNotNull() {
            addCriterion("fcreatedate is not null");
            return (Criteria) this;
        }

        public Criteria andFcreatedateEqualTo(Date value) {
            addCriterion("fcreatedate =", value, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateNotEqualTo(Date value) {
            addCriterion("fcreatedate <>", value, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateGreaterThan(Date value) {
            addCriterion("fcreatedate >", value, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("fcreatedate >=", value, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateLessThan(Date value) {
            addCriterion("fcreatedate <", value, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateLessThanOrEqualTo(Date value) {
            addCriterion("fcreatedate <=", value, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateIn(List<Date> values) {
            addCriterion("fcreatedate in", values, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateNotIn(List<Date> values) {
            addCriterion("fcreatedate not in", values, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateBetween(Date value1, Date value2) {
            addCriterion("fcreatedate between", value1, value2, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateNotBetween(Date value1, Date value2) {
            addCriterion("fcreatedate not between", value1, value2, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFmodifieridIsNull() {
            addCriterion("fmodifierid is null");
            return (Criteria) this;
        }

        public Criteria andFmodifieridIsNotNull() {
            addCriterion("fmodifierid is not null");
            return (Criteria) this;
        }

        public Criteria andFmodifieridEqualTo(Integer value) {
            addCriterion("fmodifierid =", value, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridNotEqualTo(Integer value) {
            addCriterion("fmodifierid <>", value, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridGreaterThan(Integer value) {
            addCriterion("fmodifierid >", value, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fmodifierid >=", value, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridLessThan(Integer value) {
            addCriterion("fmodifierid <", value, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridLessThanOrEqualTo(Integer value) {
            addCriterion("fmodifierid <=", value, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridIn(List<Integer> values) {
            addCriterion("fmodifierid in", values, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridNotIn(List<Integer> values) {
            addCriterion("fmodifierid not in", values, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridBetween(Integer value1, Integer value2) {
            addCriterion("fmodifierid between", value1, value2, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridNotBetween(Integer value1, Integer value2) {
            addCriterion("fmodifierid not between", value1, value2, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifydateIsNull() {
            addCriterion("fmodifydate is null");
            return (Criteria) this;
        }

        public Criteria andFmodifydateIsNotNull() {
            addCriterion("fmodifydate is not null");
            return (Criteria) this;
        }

        public Criteria andFmodifydateEqualTo(Date value) {
            addCriterion("fmodifydate =", value, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateNotEqualTo(Date value) {
            addCriterion("fmodifydate <>", value, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateGreaterThan(Date value) {
            addCriterion("fmodifydate >", value, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("fmodifydate >=", value, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateLessThan(Date value) {
            addCriterion("fmodifydate <", value, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateLessThanOrEqualTo(Date value) {
            addCriterion("fmodifydate <=", value, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateIn(List<Date> values) {
            addCriterion("fmodifydate in", values, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateNotIn(List<Date> values) {
            addCriterion("fmodifydate not in", values, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateBetween(Date value1, Date value2) {
            addCriterion("fmodifydate between", value1, value2, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateNotBetween(Date value1, Date value2) {
            addCriterion("fmodifydate not between", value1, value2, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerIsNull() {
            addCriterion("f_bip_checker is null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerIsNotNull() {
            addCriterion("f_bip_checker is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerEqualTo(Integer value) {
            addCriterion("f_bip_checker =", value, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerNotEqualTo(Integer value) {
            addCriterion("f_bip_checker <>", value, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerGreaterThan(Integer value) {
            addCriterion("f_bip_checker >", value, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_checker >=", value, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerLessThan(Integer value) {
            addCriterion("f_bip_checker <", value, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_checker <=", value, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerIn(List<Integer> values) {
            addCriterion("f_bip_checker in", values, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerNotIn(List<Integer> values) {
            addCriterion("f_bip_checker not in", values, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_checker between", value1, value2, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_checker not between", value1, value2, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeIsNull() {
            addCriterion("f_bip_checktime is null");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeIsNotNull() {
            addCriterion("f_bip_checktime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeEqualTo(Date value) {
            addCriterion("f_bip_checktime =", value, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeNotEqualTo(Date value) {
            addCriterion("f_bip_checktime <>", value, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeGreaterThan(Date value) {
            addCriterion("f_bip_checktime >", value, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_checktime >=", value, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeLessThan(Date value) {
            addCriterion("f_bip_checktime <", value, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_checktime <=", value, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeIn(List<Date> values) {
            addCriterion("f_bip_checktime in", values, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeNotIn(List<Date> values) {
            addCriterion("f_bip_checktime not in", values, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_checktime between", value1, value2, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_checktime not between", value1, value2, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterIsNull() {
            addCriterion("f_bip_billcreater is null");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterIsNotNull() {
            addCriterion("f_bip_billcreater is not null");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterEqualTo(String value) {
            addCriterion("f_bip_billcreater =", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterNotEqualTo(String value) {
            addCriterion("f_bip_billcreater <>", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterGreaterThan(String value) {
            addCriterion("f_bip_billcreater >", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_billcreater >=", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterLessThan(String value) {
            addCriterion("f_bip_billcreater <", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterLessThanOrEqualTo(String value) {
            addCriterion("f_bip_billcreater <=", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterLike(String value) {
            addCriterion("f_bip_billcreater like", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterNotLike(String value) {
            addCriterion("f_bip_billcreater not like", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterIn(List<String> values) {
            addCriterion("f_bip_billcreater in", values, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterNotIn(List<String> values) {
            addCriterion("f_bip_billcreater not in", values, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterBetween(String value1, String value2) {
            addCriterion("f_bip_billcreater between", value1, value2, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterNotBetween(String value1, String value2) {
            addCriterion("f_bip_billcreater not between", value1, value2, "fBipBillcreater");
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