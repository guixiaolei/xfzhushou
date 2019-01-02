package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTPetitionbureauExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTPetitionbureauExample() {
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

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFmasteridIsNull() {
            addCriterion("fmasterid is null");
            return (Criteria) this;
        }

        public Criteria andFmasteridIsNotNull() {
            addCriterion("fmasterid is not null");
            return (Criteria) this;
        }

        public Criteria andFmasteridEqualTo(Integer value) {
            addCriterion("fmasterid =", value, "fmasterid");
            return (Criteria) this;
        }

        public Criteria andFmasteridNotEqualTo(Integer value) {
            addCriterion("fmasterid <>", value, "fmasterid");
            return (Criteria) this;
        }

        public Criteria andFmasteridGreaterThan(Integer value) {
            addCriterion("fmasterid >", value, "fmasterid");
            return (Criteria) this;
        }

        public Criteria andFmasteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fmasterid >=", value, "fmasterid");
            return (Criteria) this;
        }

        public Criteria andFmasteridLessThan(Integer value) {
            addCriterion("fmasterid <", value, "fmasterid");
            return (Criteria) this;
        }

        public Criteria andFmasteridLessThanOrEqualTo(Integer value) {
            addCriterion("fmasterid <=", value, "fmasterid");
            return (Criteria) this;
        }

        public Criteria andFmasteridIn(List<Integer> values) {
            addCriterion("fmasterid in", values, "fmasterid");
            return (Criteria) this;
        }

        public Criteria andFmasteridNotIn(List<Integer> values) {
            addCriterion("fmasterid not in", values, "fmasterid");
            return (Criteria) this;
        }

        public Criteria andFmasteridBetween(Integer value1, Integer value2) {
            addCriterion("fmasterid between", value1, value2, "fmasterid");
            return (Criteria) this;
        }

        public Criteria andFmasteridNotBetween(Integer value1, Integer value2) {
            addCriterion("fmasterid not between", value1, value2, "fmasterid");
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

        public Criteria andFforbidstatusIsNull() {
            addCriterion("fforbidstatus is null");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusIsNotNull() {
            addCriterion("fforbidstatus is not null");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusEqualTo(String value) {
            addCriterion("fforbidstatus =", value, "fforbidstatus");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusNotEqualTo(String value) {
            addCriterion("fforbidstatus <>", value, "fforbidstatus");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusGreaterThan(String value) {
            addCriterion("fforbidstatus >", value, "fforbidstatus");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusGreaterThanOrEqualTo(String value) {
            addCriterion("fforbidstatus >=", value, "fforbidstatus");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusLessThan(String value) {
            addCriterion("fforbidstatus <", value, "fforbidstatus");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusLessThanOrEqualTo(String value) {
            addCriterion("fforbidstatus <=", value, "fforbidstatus");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusLike(String value) {
            addCriterion("fforbidstatus like", value, "fforbidstatus");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusNotLike(String value) {
            addCriterion("fforbidstatus not like", value, "fforbidstatus");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusIn(List<String> values) {
            addCriterion("fforbidstatus in", values, "fforbidstatus");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusNotIn(List<String> values) {
            addCriterion("fforbidstatus not in", values, "fforbidstatus");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusBetween(String value1, String value2) {
            addCriterion("fforbidstatus between", value1, value2, "fforbidstatus");
            return (Criteria) this;
        }

        public Criteria andFforbidstatusNotBetween(String value1, String value2) {
            addCriterion("fforbidstatus not between", value1, value2, "fforbidstatus");
            return (Criteria) this;
        }

        public Criteria andFnumberIsNull() {
            addCriterion("fnumber is null");
            return (Criteria) this;
        }

        public Criteria andFnumberIsNotNull() {
            addCriterion("fnumber is not null");
            return (Criteria) this;
        }

        public Criteria andFnumberEqualTo(String value) {
            addCriterion("fnumber =", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotEqualTo(String value) {
            addCriterion("fnumber <>", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberGreaterThan(String value) {
            addCriterion("fnumber >", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberGreaterThanOrEqualTo(String value) {
            addCriterion("fnumber >=", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLessThan(String value) {
            addCriterion("fnumber <", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLessThanOrEqualTo(String value) {
            addCriterion("fnumber <=", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLike(String value) {
            addCriterion("fnumber like", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotLike(String value) {
            addCriterion("fnumber not like", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberIn(List<String> values) {
            addCriterion("fnumber in", values, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotIn(List<String> values) {
            addCriterion("fnumber not in", values, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberBetween(String value1, String value2) {
            addCriterion("fnumber between", value1, value2, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotBetween(String value1, String value2) {
            addCriterion("fnumber not between", value1, value2, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFcreateorgidIsNull() {
            addCriterion("fcreateorgid is null");
            return (Criteria) this;
        }

        public Criteria andFcreateorgidIsNotNull() {
            addCriterion("fcreateorgid is not null");
            return (Criteria) this;
        }

        public Criteria andFcreateorgidEqualTo(Integer value) {
            addCriterion("fcreateorgid =", value, "fcreateorgid");
            return (Criteria) this;
        }

        public Criteria andFcreateorgidNotEqualTo(Integer value) {
            addCriterion("fcreateorgid <>", value, "fcreateorgid");
            return (Criteria) this;
        }

        public Criteria andFcreateorgidGreaterThan(Integer value) {
            addCriterion("fcreateorgid >", value, "fcreateorgid");
            return (Criteria) this;
        }

        public Criteria andFcreateorgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fcreateorgid >=", value, "fcreateorgid");
            return (Criteria) this;
        }

        public Criteria andFcreateorgidLessThan(Integer value) {
            addCriterion("fcreateorgid <", value, "fcreateorgid");
            return (Criteria) this;
        }

        public Criteria andFcreateorgidLessThanOrEqualTo(Integer value) {
            addCriterion("fcreateorgid <=", value, "fcreateorgid");
            return (Criteria) this;
        }

        public Criteria andFcreateorgidIn(List<Integer> values) {
            addCriterion("fcreateorgid in", values, "fcreateorgid");
            return (Criteria) this;
        }

        public Criteria andFcreateorgidNotIn(List<Integer> values) {
            addCriterion("fcreateorgid not in", values, "fcreateorgid");
            return (Criteria) this;
        }

        public Criteria andFcreateorgidBetween(Integer value1, Integer value2) {
            addCriterion("fcreateorgid between", value1, value2, "fcreateorgid");
            return (Criteria) this;
        }

        public Criteria andFcreateorgidNotBetween(Integer value1, Integer value2) {
            addCriterion("fcreateorgid not between", value1, value2, "fcreateorgid");
            return (Criteria) this;
        }

        public Criteria andFuseorgidIsNull() {
            addCriterion("fuseorgid is null");
            return (Criteria) this;
        }

        public Criteria andFuseorgidIsNotNull() {
            addCriterion("fuseorgid is not null");
            return (Criteria) this;
        }

        public Criteria andFuseorgidEqualTo(Integer value) {
            addCriterion("fuseorgid =", value, "fuseorgid");
            return (Criteria) this;
        }

        public Criteria andFuseorgidNotEqualTo(Integer value) {
            addCriterion("fuseorgid <>", value, "fuseorgid");
            return (Criteria) this;
        }

        public Criteria andFuseorgidGreaterThan(Integer value) {
            addCriterion("fuseorgid >", value, "fuseorgid");
            return (Criteria) this;
        }

        public Criteria andFuseorgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuseorgid >=", value, "fuseorgid");
            return (Criteria) this;
        }

        public Criteria andFuseorgidLessThan(Integer value) {
            addCriterion("fuseorgid <", value, "fuseorgid");
            return (Criteria) this;
        }

        public Criteria andFuseorgidLessThanOrEqualTo(Integer value) {
            addCriterion("fuseorgid <=", value, "fuseorgid");
            return (Criteria) this;
        }

        public Criteria andFuseorgidIn(List<Integer> values) {
            addCriterion("fuseorgid in", values, "fuseorgid");
            return (Criteria) this;
        }

        public Criteria andFuseorgidNotIn(List<Integer> values) {
            addCriterion("fuseorgid not in", values, "fuseorgid");
            return (Criteria) this;
        }

        public Criteria andFuseorgidBetween(Integer value1, Integer value2) {
            addCriterion("fuseorgid between", value1, value2, "fuseorgid");
            return (Criteria) this;
        }

        public Criteria andFuseorgidNotBetween(Integer value1, Integer value2) {
            addCriterion("fuseorgid not between", value1, value2, "fuseorgid");
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

        public Criteria andFforbidstatus1IsNull() {
            addCriterion("fforbidstatus1 is null");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1IsNotNull() {
            addCriterion("fforbidstatus1 is not null");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1EqualTo(String value) {
            addCriterion("fforbidstatus1 =", value, "fforbidstatus1");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1NotEqualTo(String value) {
            addCriterion("fforbidstatus1 <>", value, "fforbidstatus1");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1GreaterThan(String value) {
            addCriterion("fforbidstatus1 >", value, "fforbidstatus1");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1GreaterThanOrEqualTo(String value) {
            addCriterion("fforbidstatus1 >=", value, "fforbidstatus1");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1LessThan(String value) {
            addCriterion("fforbidstatus1 <", value, "fforbidstatus1");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1LessThanOrEqualTo(String value) {
            addCriterion("fforbidstatus1 <=", value, "fforbidstatus1");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1Like(String value) {
            addCriterion("fforbidstatus1 like", value, "fforbidstatus1");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1NotLike(String value) {
            addCriterion("fforbidstatus1 not like", value, "fforbidstatus1");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1In(List<String> values) {
            addCriterion("fforbidstatus1 in", values, "fforbidstatus1");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1NotIn(List<String> values) {
            addCriterion("fforbidstatus1 not in", values, "fforbidstatus1");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1Between(String value1, String value2) {
            addCriterion("fforbidstatus1 between", value1, value2, "fforbidstatus1");
            return (Criteria) this;
        }

        public Criteria andFforbidstatus1NotBetween(String value1, String value2) {
            addCriterion("fforbidstatus1 not between", value1, value2, "fforbidstatus1");
            return (Criteria) this;
        }

        public Criteria andFBipUseridIsNull() {
            addCriterion("f_bip_userid is null");
            return (Criteria) this;
        }

        public Criteria andFBipUseridIsNotNull() {
            addCriterion("f_bip_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFBipUseridEqualTo(Integer value) {
            addCriterion("f_bip_userid =", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridNotEqualTo(Integer value) {
            addCriterion("f_bip_userid <>", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridGreaterThan(Integer value) {
            addCriterion("f_bip_userid >", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_userid >=", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridLessThan(Integer value) {
            addCriterion("f_bip_userid <", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_userid <=", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridIn(List<Integer> values) {
            addCriterion("f_bip_userid in", values, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridNotIn(List<Integer> values) {
            addCriterion("f_bip_userid not in", values, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_userid between", value1, value2, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_userid not between", value1, value2, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipDateIsNull() {
            addCriterion("f_bip_date is null");
            return (Criteria) this;
        }

        public Criteria andFBipDateIsNotNull() {
            addCriterion("f_bip_date is not null");
            return (Criteria) this;
        }

        public Criteria andFBipDateEqualTo(Date value) {
            addCriterion("f_bip_date =", value, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateNotEqualTo(Date value) {
            addCriterion("f_bip_date <>", value, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateGreaterThan(Date value) {
            addCriterion("f_bip_date >", value, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_date >=", value, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateLessThan(Date value) {
            addCriterion("f_bip_date <", value, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_date <=", value, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateIn(List<Date> values) {
            addCriterion("f_bip_date in", values, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateNotIn(List<Date> values) {
            addCriterion("f_bip_date not in", values, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateBetween(Date value1, Date value2) {
            addCriterion("f_bip_date between", value1, value2, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_date not between", value1, value2, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
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