package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTCustEventmessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTCustEventmessageExample() {
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

        public Criteria andFBipCheckeridIsNull() {
            addCriterion("f_bip_checkerid is null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckeridIsNotNull() {
            addCriterion("f_bip_checkerid is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckeridEqualTo(Integer value) {
            addCriterion("f_bip_checkerid =", value, "fBipCheckerid");
            return (Criteria) this;
        }

        public Criteria andFBipCheckeridNotEqualTo(Integer value) {
            addCriterion("f_bip_checkerid <>", value, "fBipCheckerid");
            return (Criteria) this;
        }

        public Criteria andFBipCheckeridGreaterThan(Integer value) {
            addCriterion("f_bip_checkerid >", value, "fBipCheckerid");
            return (Criteria) this;
        }

        public Criteria andFBipCheckeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_checkerid >=", value, "fBipCheckerid");
            return (Criteria) this;
        }

        public Criteria andFBipCheckeridLessThan(Integer value) {
            addCriterion("f_bip_checkerid <", value, "fBipCheckerid");
            return (Criteria) this;
        }

        public Criteria andFBipCheckeridLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_checkerid <=", value, "fBipCheckerid");
            return (Criteria) this;
        }

        public Criteria andFBipCheckeridIn(List<Integer> values) {
            addCriterion("f_bip_checkerid in", values, "fBipCheckerid");
            return (Criteria) this;
        }

        public Criteria andFBipCheckeridNotIn(List<Integer> values) {
            addCriterion("f_bip_checkerid not in", values, "fBipCheckerid");
            return (Criteria) this;
        }

        public Criteria andFBipCheckeridBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_checkerid between", value1, value2, "fBipCheckerid");
            return (Criteria) this;
        }

        public Criteria andFBipCheckeridNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_checkerid not between", value1, value2, "fBipCheckerid");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateIsNull() {
            addCriterion("f_bip_checkdate is null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateIsNotNull() {
            addCriterion("f_bip_checkdate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateEqualTo(Date value) {
            addCriterion("f_bip_checkdate =", value, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateNotEqualTo(Date value) {
            addCriterion("f_bip_checkdate <>", value, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateGreaterThan(Date value) {
            addCriterion("f_bip_checkdate >", value, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_checkdate >=", value, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateLessThan(Date value) {
            addCriterion("f_bip_checkdate <", value, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_checkdate <=", value, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateIn(List<Date> values) {
            addCriterion("f_bip_checkdate in", values, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateNotIn(List<Date> values) {
            addCriterion("f_bip_checkdate not in", values, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateBetween(Date value1, Date value2) {
            addCriterion("f_bip_checkdate between", value1, value2, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_checkdate not between", value1, value2, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipNameIsNull() {
            addCriterion("f_bip_name is null");
            return (Criteria) this;
        }

        public Criteria andFBipNameIsNotNull() {
            addCriterion("f_bip_name is not null");
            return (Criteria) this;
        }

        public Criteria andFBipNameEqualTo(String value) {
            addCriterion("f_bip_name =", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameNotEqualTo(String value) {
            addCriterion("f_bip_name <>", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameGreaterThan(String value) {
            addCriterion("f_bip_name >", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_name >=", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameLessThan(String value) {
            addCriterion("f_bip_name <", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameLessThanOrEqualTo(String value) {
            addCriterion("f_bip_name <=", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameLike(String value) {
            addCriterion("f_bip_name like", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameNotLike(String value) {
            addCriterion("f_bip_name not like", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameIn(List<String> values) {
            addCriterion("f_bip_name in", values, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameNotIn(List<String> values) {
            addCriterion("f_bip_name not in", values, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameBetween(String value1, String value2) {
            addCriterion("f_bip_name between", value1, value2, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameNotBetween(String value1, String value2) {
            addCriterion("f_bip_name not between", value1, value2, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardIsNull() {
            addCriterion("f_bip_idcard is null");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardIsNotNull() {
            addCriterion("f_bip_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardEqualTo(String value) {
            addCriterion("f_bip_idcard =", value, "fBipIdcard");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardNotEqualTo(String value) {
            addCriterion("f_bip_idcard <>", value, "fBipIdcard");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardGreaterThan(String value) {
            addCriterion("f_bip_idcard >", value, "fBipIdcard");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_idcard >=", value, "fBipIdcard");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardLessThan(String value) {
            addCriterion("f_bip_idcard <", value, "fBipIdcard");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardLessThanOrEqualTo(String value) {
            addCriterion("f_bip_idcard <=", value, "fBipIdcard");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardLike(String value) {
            addCriterion("f_bip_idcard like", value, "fBipIdcard");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardNotLike(String value) {
            addCriterion("f_bip_idcard not like", value, "fBipIdcard");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardIn(List<String> values) {
            addCriterion("f_bip_idcard in", values, "fBipIdcard");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardNotIn(List<String> values) {
            addCriterion("f_bip_idcard not in", values, "fBipIdcard");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardBetween(String value1, String value2) {
            addCriterion("f_bip_idcard between", value1, value2, "fBipIdcard");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardNotBetween(String value1, String value2) {
            addCriterion("f_bip_idcard not between", value1, value2, "fBipIdcard");
            return (Criteria) this;
        }

        public Criteria andFBipNationIsNull() {
            addCriterion("f_bip_nation is null");
            return (Criteria) this;
        }

        public Criteria andFBipNationIsNotNull() {
            addCriterion("f_bip_nation is not null");
            return (Criteria) this;
        }

        public Criteria andFBipNationEqualTo(String value) {
            addCriterion("f_bip_nation =", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationNotEqualTo(String value) {
            addCriterion("f_bip_nation <>", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationGreaterThan(String value) {
            addCriterion("f_bip_nation >", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_nation >=", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationLessThan(String value) {
            addCriterion("f_bip_nation <", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationLessThanOrEqualTo(String value) {
            addCriterion("f_bip_nation <=", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationLike(String value) {
            addCriterion("f_bip_nation like", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationNotLike(String value) {
            addCriterion("f_bip_nation not like", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationIn(List<String> values) {
            addCriterion("f_bip_nation in", values, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationNotIn(List<String> values) {
            addCriterion("f_bip_nation not in", values, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationBetween(String value1, String value2) {
            addCriterion("f_bip_nation between", value1, value2, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationNotBetween(String value1, String value2) {
            addCriterion("f_bip_nation not between", value1, value2, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipSexIsNull() {
            addCriterion("f_bip_sex is null");
            return (Criteria) this;
        }

        public Criteria andFBipSexIsNotNull() {
            addCriterion("f_bip_sex is not null");
            return (Criteria) this;
        }

        public Criteria andFBipSexEqualTo(String value) {
            addCriterion("f_bip_sex =", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexNotEqualTo(String value) {
            addCriterion("f_bip_sex <>", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexGreaterThan(String value) {
            addCriterion("f_bip_sex >", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_sex >=", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexLessThan(String value) {
            addCriterion("f_bip_sex <", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexLessThanOrEqualTo(String value) {
            addCriterion("f_bip_sex <=", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexLike(String value) {
            addCriterion("f_bip_sex like", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexNotLike(String value) {
            addCriterion("f_bip_sex not like", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexIn(List<String> values) {
            addCriterion("f_bip_sex in", values, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexNotIn(List<String> values) {
            addCriterion("f_bip_sex not in", values, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexBetween(String value1, String value2) {
            addCriterion("f_bip_sex between", value1, value2, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexNotBetween(String value1, String value2) {
            addCriterion("f_bip_sex not between", value1, value2, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipTelIsNull() {
            addCriterion("f_bip_tel is null");
            return (Criteria) this;
        }

        public Criteria andFBipTelIsNotNull() {
            addCriterion("f_bip_tel is not null");
            return (Criteria) this;
        }

        public Criteria andFBipTelEqualTo(String value) {
            addCriterion("f_bip_tel =", value, "fBipTel");
            return (Criteria) this;
        }

        public Criteria andFBipTelNotEqualTo(String value) {
            addCriterion("f_bip_tel <>", value, "fBipTel");
            return (Criteria) this;
        }

        public Criteria andFBipTelGreaterThan(String value) {
            addCriterion("f_bip_tel >", value, "fBipTel");
            return (Criteria) this;
        }

        public Criteria andFBipTelGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_tel >=", value, "fBipTel");
            return (Criteria) this;
        }

        public Criteria andFBipTelLessThan(String value) {
            addCriterion("f_bip_tel <", value, "fBipTel");
            return (Criteria) this;
        }

        public Criteria andFBipTelLessThanOrEqualTo(String value) {
            addCriterion("f_bip_tel <=", value, "fBipTel");
            return (Criteria) this;
        }

        public Criteria andFBipTelLike(String value) {
            addCriterion("f_bip_tel like", value, "fBipTel");
            return (Criteria) this;
        }

        public Criteria andFBipTelNotLike(String value) {
            addCriterion("f_bip_tel not like", value, "fBipTel");
            return (Criteria) this;
        }

        public Criteria andFBipTelIn(List<String> values) {
            addCriterion("f_bip_tel in", values, "fBipTel");
            return (Criteria) this;
        }

        public Criteria andFBipTelNotIn(List<String> values) {
            addCriterion("f_bip_tel not in", values, "fBipTel");
            return (Criteria) this;
        }

        public Criteria andFBipTelBetween(String value1, String value2) {
            addCriterion("f_bip_tel between", value1, value2, "fBipTel");
            return (Criteria) this;
        }

        public Criteria andFBipTelNotBetween(String value1, String value2) {
            addCriterion("f_bip_tel not between", value1, value2, "fBipTel");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookIsNull() {
            addCriterion("f_bip_outlook is null");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookIsNotNull() {
            addCriterion("f_bip_outlook is not null");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookEqualTo(String value) {
            addCriterion("f_bip_outlook =", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookNotEqualTo(String value) {
            addCriterion("f_bip_outlook <>", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookGreaterThan(String value) {
            addCriterion("f_bip_outlook >", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_outlook >=", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookLessThan(String value) {
            addCriterion("f_bip_outlook <", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookLessThanOrEqualTo(String value) {
            addCriterion("f_bip_outlook <=", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookLike(String value) {
            addCriterion("f_bip_outlook like", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookNotLike(String value) {
            addCriterion("f_bip_outlook not like", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookIn(List<String> values) {
            addCriterion("f_bip_outlook in", values, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookNotIn(List<String> values) {
            addCriterion("f_bip_outlook not in", values, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookBetween(String value1, String value2) {
            addCriterion("f_bip_outlook between", value1, value2, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookNotBetween(String value1, String value2) {
            addCriterion("f_bip_outlook not between", value1, value2, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressIsNull() {
            addCriterion("f_bip_cardaddress is null");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressIsNotNull() {
            addCriterion("f_bip_cardaddress is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressEqualTo(String value) {
            addCriterion("f_bip_cardaddress =", value, "fBipCardaddress");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressNotEqualTo(String value) {
            addCriterion("f_bip_cardaddress <>", value, "fBipCardaddress");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressGreaterThan(String value) {
            addCriterion("f_bip_cardaddress >", value, "fBipCardaddress");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_cardaddress >=", value, "fBipCardaddress");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressLessThan(String value) {
            addCriterion("f_bip_cardaddress <", value, "fBipCardaddress");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressLessThanOrEqualTo(String value) {
            addCriterion("f_bip_cardaddress <=", value, "fBipCardaddress");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressLike(String value) {
            addCriterion("f_bip_cardaddress like", value, "fBipCardaddress");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressNotLike(String value) {
            addCriterion("f_bip_cardaddress not like", value, "fBipCardaddress");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressIn(List<String> values) {
            addCriterion("f_bip_cardaddress in", values, "fBipCardaddress");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressNotIn(List<String> values) {
            addCriterion("f_bip_cardaddress not in", values, "fBipCardaddress");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressBetween(String value1, String value2) {
            addCriterion("f_bip_cardaddress between", value1, value2, "fBipCardaddress");
            return (Criteria) this;
        }

        public Criteria andFBipCardaddressNotBetween(String value1, String value2) {
            addCriterion("f_bip_cardaddress not between", value1, value2, "fBipCardaddress");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressIsNull() {
            addCriterion("f_bip_nowaddress is null");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressIsNotNull() {
            addCriterion("f_bip_nowaddress is not null");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressEqualTo(String value) {
            addCriterion("f_bip_nowaddress =", value, "fBipNowaddress");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressNotEqualTo(String value) {
            addCriterion("f_bip_nowaddress <>", value, "fBipNowaddress");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressGreaterThan(String value) {
            addCriterion("f_bip_nowaddress >", value, "fBipNowaddress");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_nowaddress >=", value, "fBipNowaddress");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressLessThan(String value) {
            addCriterion("f_bip_nowaddress <", value, "fBipNowaddress");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressLessThanOrEqualTo(String value) {
            addCriterion("f_bip_nowaddress <=", value, "fBipNowaddress");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressLike(String value) {
            addCriterion("f_bip_nowaddress like", value, "fBipNowaddress");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressNotLike(String value) {
            addCriterion("f_bip_nowaddress not like", value, "fBipNowaddress");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressIn(List<String> values) {
            addCriterion("f_bip_nowaddress in", values, "fBipNowaddress");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressNotIn(List<String> values) {
            addCriterion("f_bip_nowaddress not in", values, "fBipNowaddress");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressBetween(String value1, String value2) {
            addCriterion("f_bip_nowaddress between", value1, value2, "fBipNowaddress");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddressNotBetween(String value1, String value2) {
            addCriterion("f_bip_nowaddress not between", value1, value2, "fBipNowaddress");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteIsNull() {
            addCriterion("f_bip_handwrite is null");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteIsNotNull() {
            addCriterion("f_bip_handwrite is not null");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteEqualTo(String value) {
            addCriterion("f_bip_handwrite =", value, "fBipHandwrite");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteNotEqualTo(String value) {
            addCriterion("f_bip_handwrite <>", value, "fBipHandwrite");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteGreaterThan(String value) {
            addCriterion("f_bip_handwrite >", value, "fBipHandwrite");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_handwrite >=", value, "fBipHandwrite");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteLessThan(String value) {
            addCriterion("f_bip_handwrite <", value, "fBipHandwrite");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteLessThanOrEqualTo(String value) {
            addCriterion("f_bip_handwrite <=", value, "fBipHandwrite");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteLike(String value) {
            addCriterion("f_bip_handwrite like", value, "fBipHandwrite");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteNotLike(String value) {
            addCriterion("f_bip_handwrite not like", value, "fBipHandwrite");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteIn(List<String> values) {
            addCriterion("f_bip_handwrite in", values, "fBipHandwrite");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteNotIn(List<String> values) {
            addCriterion("f_bip_handwrite not in", values, "fBipHandwrite");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteBetween(String value1, String value2) {
            addCriterion("f_bip_handwrite between", value1, value2, "fBipHandwrite");
            return (Criteria) this;
        }

        public Criteria andFBipHandwriteNotBetween(String value1, String value2) {
            addCriterion("f_bip_handwrite not between", value1, value2, "fBipHandwrite");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageIsNull() {
            addCriterion("f_bip_headimage is null");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageIsNotNull() {
            addCriterion("f_bip_headimage is not null");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageEqualTo(String value) {
            addCriterion("f_bip_headimage =", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageNotEqualTo(String value) {
            addCriterion("f_bip_headimage <>", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageGreaterThan(String value) {
            addCriterion("f_bip_headimage >", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_headimage >=", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageLessThan(String value) {
            addCriterion("f_bip_headimage <", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_headimage <=", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageLike(String value) {
            addCriterion("f_bip_headimage like", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageNotLike(String value) {
            addCriterion("f_bip_headimage not like", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageIn(List<String> values) {
            addCriterion("f_bip_headimage in", values, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageNotIn(List<String> values) {
            addCriterion("f_bip_headimage not in", values, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageBetween(String value1, String value2) {
            addCriterion("f_bip_headimage between", value1, value2, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageNotBetween(String value1, String value2) {
            addCriterion("f_bip_headimage not between", value1, value2, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageIsNull() {
            addCriterion("f_bip_recentimage is null");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageIsNotNull() {
            addCriterion("f_bip_recentimage is not null");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageEqualTo(String value) {
            addCriterion("f_bip_recentimage =", value, "fBipRecentimage");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageNotEqualTo(String value) {
            addCriterion("f_bip_recentimage <>", value, "fBipRecentimage");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageGreaterThan(String value) {
            addCriterion("f_bip_recentimage >", value, "fBipRecentimage");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_recentimage >=", value, "fBipRecentimage");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageLessThan(String value) {
            addCriterion("f_bip_recentimage <", value, "fBipRecentimage");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_recentimage <=", value, "fBipRecentimage");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageLike(String value) {
            addCriterion("f_bip_recentimage like", value, "fBipRecentimage");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageNotLike(String value) {
            addCriterion("f_bip_recentimage not like", value, "fBipRecentimage");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageIn(List<String> values) {
            addCriterion("f_bip_recentimage in", values, "fBipRecentimage");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageNotIn(List<String> values) {
            addCriterion("f_bip_recentimage not in", values, "fBipRecentimage");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageBetween(String value1, String value2) {
            addCriterion("f_bip_recentimage between", value1, value2, "fBipRecentimage");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimageNotBetween(String value1, String value2) {
            addCriterion("f_bip_recentimage not between", value1, value2, "fBipRecentimage");
            return (Criteria) this;
        }

        public Criteria andFBipTypeIsNull() {
            addCriterion("f_bip_type is null");
            return (Criteria) this;
        }

        public Criteria andFBipTypeIsNotNull() {
            addCriterion("f_bip_type is not null");
            return (Criteria) this;
        }

        public Criteria andFBipTypeEqualTo(Integer value) {
            addCriterion("f_bip_type =", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeNotEqualTo(Integer value) {
            addCriterion("f_bip_type <>", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeGreaterThan(Integer value) {
            addCriterion("f_bip_type >", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_type >=", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeLessThan(Integer value) {
            addCriterion("f_bip_type <", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_type <=", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeIn(List<Integer> values) {
            addCriterion("f_bip_type in", values, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeNotIn(List<Integer> values) {
            addCriterion("f_bip_type not in", values, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_type between", value1, value2, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_type not between", value1, value2, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassIsNull() {
            addCriterion("f_bip_firstclass is null");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassIsNotNull() {
            addCriterion("f_bip_firstclass is not null");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassEqualTo(String value) {
            addCriterion("f_bip_firstclass =", value, "fBipFirstclass");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassNotEqualTo(String value) {
            addCriterion("f_bip_firstclass <>", value, "fBipFirstclass");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassGreaterThan(String value) {
            addCriterion("f_bip_firstclass >", value, "fBipFirstclass");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_firstclass >=", value, "fBipFirstclass");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassLessThan(String value) {
            addCriterion("f_bip_firstclass <", value, "fBipFirstclass");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassLessThanOrEqualTo(String value) {
            addCriterion("f_bip_firstclass <=", value, "fBipFirstclass");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassLike(String value) {
            addCriterion("f_bip_firstclass like", value, "fBipFirstclass");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassNotLike(String value) {
            addCriterion("f_bip_firstclass not like", value, "fBipFirstclass");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassIn(List<String> values) {
            addCriterion("f_bip_firstclass in", values, "fBipFirstclass");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassNotIn(List<String> values) {
            addCriterion("f_bip_firstclass not in", values, "fBipFirstclass");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassBetween(String value1, String value2) {
            addCriterion("f_bip_firstclass between", value1, value2, "fBipFirstclass");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassNotBetween(String value1, String value2) {
            addCriterion("f_bip_firstclass not between", value1, value2, "fBipFirstclass");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassIsNull() {
            addCriterion("f_bip_secondclass is null");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassIsNotNull() {
            addCriterion("f_bip_secondclass is not null");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassEqualTo(String value) {
            addCriterion("f_bip_secondclass =", value, "fBipSecondclass");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassNotEqualTo(String value) {
            addCriterion("f_bip_secondclass <>", value, "fBipSecondclass");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassGreaterThan(String value) {
            addCriterion("f_bip_secondclass >", value, "fBipSecondclass");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_secondclass >=", value, "fBipSecondclass");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassLessThan(String value) {
            addCriterion("f_bip_secondclass <", value, "fBipSecondclass");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassLessThanOrEqualTo(String value) {
            addCriterion("f_bip_secondclass <=", value, "fBipSecondclass");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassLike(String value) {
            addCriterion("f_bip_secondclass like", value, "fBipSecondclass");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassNotLike(String value) {
            addCriterion("f_bip_secondclass not like", value, "fBipSecondclass");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassIn(List<String> values) {
            addCriterion("f_bip_secondclass in", values, "fBipSecondclass");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassNotIn(List<String> values) {
            addCriterion("f_bip_secondclass not in", values, "fBipSecondclass");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassBetween(String value1, String value2) {
            addCriterion("f_bip_secondclass between", value1, value2, "fBipSecondclass");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassNotBetween(String value1, String value2) {
            addCriterion("f_bip_secondclass not between", value1, value2, "fBipSecondclass");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassIsNull() {
            addCriterion("f_bip_thirdclass is null");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassIsNotNull() {
            addCriterion("f_bip_thirdclass is not null");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassEqualTo(String value) {
            addCriterion("f_bip_thirdclass =", value, "fBipThirdclass");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassNotEqualTo(String value) {
            addCriterion("f_bip_thirdclass <>", value, "fBipThirdclass");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassGreaterThan(String value) {
            addCriterion("f_bip_thirdclass >", value, "fBipThirdclass");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_thirdclass >=", value, "fBipThirdclass");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassLessThan(String value) {
            addCriterion("f_bip_thirdclass <", value, "fBipThirdclass");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassLessThanOrEqualTo(String value) {
            addCriterion("f_bip_thirdclass <=", value, "fBipThirdclass");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassLike(String value) {
            addCriterion("f_bip_thirdclass like", value, "fBipThirdclass");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassNotLike(String value) {
            addCriterion("f_bip_thirdclass not like", value, "fBipThirdclass");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassIn(List<String> values) {
            addCriterion("f_bip_thirdclass in", values, "fBipThirdclass");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassNotIn(List<String> values) {
            addCriterion("f_bip_thirdclass not in", values, "fBipThirdclass");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassBetween(String value1, String value2) {
            addCriterion("f_bip_thirdclass between", value1, value2, "fBipThirdclass");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassNotBetween(String value1, String value2) {
            addCriterion("f_bip_thirdclass not between", value1, value2, "fBipThirdclass");
            return (Criteria) this;
        }

        public Criteria andFBipPeoplenumIsNull() {
            addCriterion("f_bip_peoplenum is null");
            return (Criteria) this;
        }

        public Criteria andFBipPeoplenumIsNotNull() {
            addCriterion("f_bip_peoplenum is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPeoplenumEqualTo(Integer value) {
            addCriterion("f_bip_peoplenum =", value, "fBipPeoplenum");
            return (Criteria) this;
        }

        public Criteria andFBipPeoplenumNotEqualTo(Integer value) {
            addCriterion("f_bip_peoplenum <>", value, "fBipPeoplenum");
            return (Criteria) this;
        }

        public Criteria andFBipPeoplenumGreaterThan(Integer value) {
            addCriterion("f_bip_peoplenum >", value, "fBipPeoplenum");
            return (Criteria) this;
        }

        public Criteria andFBipPeoplenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_peoplenum >=", value, "fBipPeoplenum");
            return (Criteria) this;
        }

        public Criteria andFBipPeoplenumLessThan(Integer value) {
            addCriterion("f_bip_peoplenum <", value, "fBipPeoplenum");
            return (Criteria) this;
        }

        public Criteria andFBipPeoplenumLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_peoplenum <=", value, "fBipPeoplenum");
            return (Criteria) this;
        }

        public Criteria andFBipPeoplenumIn(List<Integer> values) {
            addCriterion("f_bip_peoplenum in", values, "fBipPeoplenum");
            return (Criteria) this;
        }

        public Criteria andFBipPeoplenumNotIn(List<Integer> values) {
            addCriterion("f_bip_peoplenum not in", values, "fBipPeoplenum");
            return (Criteria) this;
        }

        public Criteria andFBipPeoplenumBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_peoplenum between", value1, value2, "fBipPeoplenum");
            return (Criteria) this;
        }

        public Criteria andFBipPeoplenumNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_peoplenum not between", value1, value2, "fBipPeoplenum");
            return (Criteria) this;
        }

        public Criteria andFBipUtilnameIsNull() {
            addCriterion("f_bip_utilname is null");
            return (Criteria) this;
        }

        public Criteria andFBipUtilnameIsNotNull() {
            addCriterion("f_bip_utilname is not null");
            return (Criteria) this;
        }

        public Criteria andFBipUtilnameEqualTo(Integer value) {
            addCriterion("f_bip_utilname =", value, "fBipUtilname");
            return (Criteria) this;
        }

        public Criteria andFBipUtilnameNotEqualTo(Integer value) {
            addCriterion("f_bip_utilname <>", value, "fBipUtilname");
            return (Criteria) this;
        }

        public Criteria andFBipUtilnameGreaterThan(Integer value) {
            addCriterion("f_bip_utilname >", value, "fBipUtilname");
            return (Criteria) this;
        }

        public Criteria andFBipUtilnameGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_utilname >=", value, "fBipUtilname");
            return (Criteria) this;
        }

        public Criteria andFBipUtilnameLessThan(Integer value) {
            addCriterion("f_bip_utilname <", value, "fBipUtilname");
            return (Criteria) this;
        }

        public Criteria andFBipUtilnameLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_utilname <=", value, "fBipUtilname");
            return (Criteria) this;
        }

        public Criteria andFBipUtilnameIn(List<Integer> values) {
            addCriterion("f_bip_utilname in", values, "fBipUtilname");
            return (Criteria) this;
        }

        public Criteria andFBipUtilnameNotIn(List<Integer> values) {
            addCriterion("f_bip_utilname not in", values, "fBipUtilname");
            return (Criteria) this;
        }

        public Criteria andFBipUtilnameBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_utilname between", value1, value2, "fBipUtilname");
            return (Criteria) this;
        }

        public Criteria andFBipUtilnameNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_utilname not between", value1, value2, "fBipUtilname");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsIsNull() {
            addCriterion("f_bip_eventdetails is null");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsIsNotNull() {
            addCriterion("f_bip_eventdetails is not null");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsEqualTo(String value) {
            addCriterion("f_bip_eventdetails =", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsNotEqualTo(String value) {
            addCriterion("f_bip_eventdetails <>", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsGreaterThan(String value) {
            addCriterion("f_bip_eventdetails >", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_eventdetails >=", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsLessThan(String value) {
            addCriterion("f_bip_eventdetails <", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsLessThanOrEqualTo(String value) {
            addCriterion("f_bip_eventdetails <=", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsLike(String value) {
            addCriterion("f_bip_eventdetails like", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsNotLike(String value) {
            addCriterion("f_bip_eventdetails not like", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsIn(List<String> values) {
            addCriterion("f_bip_eventdetails in", values, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsNotIn(List<String> values) {
            addCriterion("f_bip_eventdetails not in", values, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsBetween(String value1, String value2) {
            addCriterion("f_bip_eventdetails between", value1, value2, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsNotBetween(String value1, String value2) {
            addCriterion("f_bip_eventdetails not between", value1, value2, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultIsNull() {
            addCriterion("f_bip_eventresult is null");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultIsNotNull() {
            addCriterion("f_bip_eventresult is not null");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultEqualTo(String value) {
            addCriterion("f_bip_eventresult =", value, "fBipEventresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultNotEqualTo(String value) {
            addCriterion("f_bip_eventresult <>", value, "fBipEventresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultGreaterThan(String value) {
            addCriterion("f_bip_eventresult >", value, "fBipEventresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_eventresult >=", value, "fBipEventresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultLessThan(String value) {
            addCriterion("f_bip_eventresult <", value, "fBipEventresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultLessThanOrEqualTo(String value) {
            addCriterion("f_bip_eventresult <=", value, "fBipEventresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultLike(String value) {
            addCriterion("f_bip_eventresult like", value, "fBipEventresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultNotLike(String value) {
            addCriterion("f_bip_eventresult not like", value, "fBipEventresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultIn(List<String> values) {
            addCriterion("f_bip_eventresult in", values, "fBipEventresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultNotIn(List<String> values) {
            addCriterion("f_bip_eventresult not in", values, "fBipEventresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultBetween(String value1, String value2) {
            addCriterion("f_bip_eventresult between", value1, value2, "fBipEventresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventresultNotBetween(String value1, String value2) {
            addCriterion("f_bip_eventresult not between", value1, value2, "fBipEventresult");
            return (Criteria) this;
        }

        public Criteria andFBipCreateorganizationIsNull() {
            addCriterion("f_bip_createorganization is null");
            return (Criteria) this;
        }

        public Criteria andFBipCreateorganizationIsNotNull() {
            addCriterion("f_bip_createorganization is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCreateorganizationEqualTo(Integer value) {
            addCriterion("f_bip_createorganization =", value, "fBipCreateorganization");
            return (Criteria) this;
        }

        public Criteria andFBipCreateorganizationNotEqualTo(Integer value) {
            addCriterion("f_bip_createorganization <>", value, "fBipCreateorganization");
            return (Criteria) this;
        }

        public Criteria andFBipCreateorganizationGreaterThan(Integer value) {
            addCriterion("f_bip_createorganization >", value, "fBipCreateorganization");
            return (Criteria) this;
        }

        public Criteria andFBipCreateorganizationGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_createorganization >=", value, "fBipCreateorganization");
            return (Criteria) this;
        }

        public Criteria andFBipCreateorganizationLessThan(Integer value) {
            addCriterion("f_bip_createorganization <", value, "fBipCreateorganization");
            return (Criteria) this;
        }

        public Criteria andFBipCreateorganizationLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_createorganization <=", value, "fBipCreateorganization");
            return (Criteria) this;
        }

        public Criteria andFBipCreateorganizationIn(List<Integer> values) {
            addCriterion("f_bip_createorganization in", values, "fBipCreateorganization");
            return (Criteria) this;
        }

        public Criteria andFBipCreateorganizationNotIn(List<Integer> values) {
            addCriterion("f_bip_createorganization not in", values, "fBipCreateorganization");
            return (Criteria) this;
        }

        public Criteria andFBipCreateorganizationBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_createorganization between", value1, value2, "fBipCreateorganization");
            return (Criteria) this;
        }

        public Criteria andFBipCreateorganizationNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_createorganization not between", value1, value2, "fBipCreateorganization");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateIsNull() {
            addCriterion("f_bip_birthdate is null");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateIsNotNull() {
            addCriterion("f_bip_birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateEqualTo(Date value) {
            addCriterion("f_bip_birthdate =", value, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateNotEqualTo(Date value) {
            addCriterion("f_bip_birthdate <>", value, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateGreaterThan(Date value) {
            addCriterion("f_bip_birthdate >", value, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_birthdate >=", value, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateLessThan(Date value) {
            addCriterion("f_bip_birthdate <", value, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_birthdate <=", value, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateIn(List<Date> values) {
            addCriterion("f_bip_birthdate in", values, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateNotIn(List<Date> values) {
            addCriterion("f_bip_birthdate not in", values, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateBetween(Date value1, Date value2) {
            addCriterion("f_bip_birthdate between", value1, value2, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_birthdate not between", value1, value2, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyIsNull() {
            addCriterion("f_bip_recepterduty is null");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyIsNotNull() {
            addCriterion("f_bip_recepterduty is not null");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyEqualTo(String value) {
            addCriterion("f_bip_recepterduty =", value, "fBipRecepterduty");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyNotEqualTo(String value) {
            addCriterion("f_bip_recepterduty <>", value, "fBipRecepterduty");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyGreaterThan(String value) {
            addCriterion("f_bip_recepterduty >", value, "fBipRecepterduty");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_recepterduty >=", value, "fBipRecepterduty");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyLessThan(String value) {
            addCriterion("f_bip_recepterduty <", value, "fBipRecepterduty");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyLessThanOrEqualTo(String value) {
            addCriterion("f_bip_recepterduty <=", value, "fBipRecepterduty");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyLike(String value) {
            addCriterion("f_bip_recepterduty like", value, "fBipRecepterduty");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyNotLike(String value) {
            addCriterion("f_bip_recepterduty not like", value, "fBipRecepterduty");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyIn(List<String> values) {
            addCriterion("f_bip_recepterduty in", values, "fBipRecepterduty");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyNotIn(List<String> values) {
            addCriterion("f_bip_recepterduty not in", values, "fBipRecepterduty");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyBetween(String value1, String value2) {
            addCriterion("f_bip_recepterduty between", value1, value2, "fBipRecepterduty");
            return (Criteria) this;
        }

        public Criteria andFBipRecepterdutyNotBetween(String value1, String value2) {
            addCriterion("f_bip_recepterduty not between", value1, value2, "fBipRecepterduty");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanIsNull() {
            addCriterion("f_bip_dutyman is null");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanIsNotNull() {
            addCriterion("f_bip_dutyman is not null");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanEqualTo(String value) {
            addCriterion("f_bip_dutyman =", value, "fBipDutyman");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanNotEqualTo(String value) {
            addCriterion("f_bip_dutyman <>", value, "fBipDutyman");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanGreaterThan(String value) {
            addCriterion("f_bip_dutyman >", value, "fBipDutyman");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_dutyman >=", value, "fBipDutyman");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanLessThan(String value) {
            addCriterion("f_bip_dutyman <", value, "fBipDutyman");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanLessThanOrEqualTo(String value) {
            addCriterion("f_bip_dutyman <=", value, "fBipDutyman");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanLike(String value) {
            addCriterion("f_bip_dutyman like", value, "fBipDutyman");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanNotLike(String value) {
            addCriterion("f_bip_dutyman not like", value, "fBipDutyman");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanIn(List<String> values) {
            addCriterion("f_bip_dutyman in", values, "fBipDutyman");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanNotIn(List<String> values) {
            addCriterion("f_bip_dutyman not in", values, "fBipDutyman");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanBetween(String value1, String value2) {
            addCriterion("f_bip_dutyman between", value1, value2, "fBipDutyman");
            return (Criteria) this;
        }

        public Criteria andFBipDutymanNotBetween(String value1, String value2) {
            addCriterion("f_bip_dutyman not between", value1, value2, "fBipDutyman");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusIsNull() {
            addCriterion("f_bip_dealstatus is null");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusIsNotNull() {
            addCriterion("f_bip_dealstatus is not null");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusEqualTo(String value) {
            addCriterion("f_bip_dealstatus =", value, "fBipDealstatus");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusNotEqualTo(String value) {
            addCriterion("f_bip_dealstatus <>", value, "fBipDealstatus");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusGreaterThan(String value) {
            addCriterion("f_bip_dealstatus >", value, "fBipDealstatus");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_dealstatus >=", value, "fBipDealstatus");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusLessThan(String value) {
            addCriterion("f_bip_dealstatus <", value, "fBipDealstatus");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusLessThanOrEqualTo(String value) {
            addCriterion("f_bip_dealstatus <=", value, "fBipDealstatus");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusLike(String value) {
            addCriterion("f_bip_dealstatus like", value, "fBipDealstatus");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusNotLike(String value) {
            addCriterion("f_bip_dealstatus not like", value, "fBipDealstatus");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusIn(List<String> values) {
            addCriterion("f_bip_dealstatus in", values, "fBipDealstatus");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusNotIn(List<String> values) {
            addCriterion("f_bip_dealstatus not in", values, "fBipDealstatus");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusBetween(String value1, String value2) {
            addCriterion("f_bip_dealstatus between", value1, value2, "fBipDealstatus");
            return (Criteria) this;
        }

        public Criteria andFBipDealstatusNotBetween(String value1, String value2) {
            addCriterion("f_bip_dealstatus not between", value1, value2, "fBipDealstatus");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelIsNull() {
            addCriterion("f_bip_receptertel is null");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelIsNotNull() {
            addCriterion("f_bip_receptertel is not null");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelEqualTo(String value) {
            addCriterion("f_bip_receptertel =", value, "fBipReceptertel");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelNotEqualTo(String value) {
            addCriterion("f_bip_receptertel <>", value, "fBipReceptertel");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelGreaterThan(String value) {
            addCriterion("f_bip_receptertel >", value, "fBipReceptertel");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_receptertel >=", value, "fBipReceptertel");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelLessThan(String value) {
            addCriterion("f_bip_receptertel <", value, "fBipReceptertel");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelLessThanOrEqualTo(String value) {
            addCriterion("f_bip_receptertel <=", value, "fBipReceptertel");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelLike(String value) {
            addCriterion("f_bip_receptertel like", value, "fBipReceptertel");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelNotLike(String value) {
            addCriterion("f_bip_receptertel not like", value, "fBipReceptertel");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelIn(List<String> values) {
            addCriterion("f_bip_receptertel in", values, "fBipReceptertel");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelNotIn(List<String> values) {
            addCriterion("f_bip_receptertel not in", values, "fBipReceptertel");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelBetween(String value1, String value2) {
            addCriterion("f_bip_receptertel between", value1, value2, "fBipReceptertel");
            return (Criteria) this;
        }

        public Criteria andFBipReceptertelNotBetween(String value1, String value2) {
            addCriterion("f_bip_receptertel not between", value1, value2, "fBipReceptertel");
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