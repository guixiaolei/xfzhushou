package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTFocusleadershipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTFocusleadershipExample() {
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

        public Criteria andFforbiddateIsNull() {
            addCriterion("fforbiddate is null");
            return (Criteria) this;
        }

        public Criteria andFforbiddateIsNotNull() {
            addCriterion("fforbiddate is not null");
            return (Criteria) this;
        }

        public Criteria andFforbiddateEqualTo(Date value) {
            addCriterion("fforbiddate =", value, "fforbiddate");
            return (Criteria) this;
        }

        public Criteria andFforbiddateNotEqualTo(Date value) {
            addCriterion("fforbiddate <>", value, "fforbiddate");
            return (Criteria) this;
        }

        public Criteria andFforbiddateGreaterThan(Date value) {
            addCriterion("fforbiddate >", value, "fforbiddate");
            return (Criteria) this;
        }

        public Criteria andFforbiddateGreaterThanOrEqualTo(Date value) {
            addCriterion("fforbiddate >=", value, "fforbiddate");
            return (Criteria) this;
        }

        public Criteria andFforbiddateLessThan(Date value) {
            addCriterion("fforbiddate <", value, "fforbiddate");
            return (Criteria) this;
        }

        public Criteria andFforbiddateLessThanOrEqualTo(Date value) {
            addCriterion("fforbiddate <=", value, "fforbiddate");
            return (Criteria) this;
        }

        public Criteria andFforbiddateIn(List<Date> values) {
            addCriterion("fforbiddate in", values, "fforbiddate");
            return (Criteria) this;
        }

        public Criteria andFforbiddateNotIn(List<Date> values) {
            addCriterion("fforbiddate not in", values, "fforbiddate");
            return (Criteria) this;
        }

        public Criteria andFforbiddateBetween(Date value1, Date value2) {
            addCriterion("fforbiddate between", value1, value2, "fforbiddate");
            return (Criteria) this;
        }

        public Criteria andFforbiddateNotBetween(Date value1, Date value2) {
            addCriterion("fforbiddate not between", value1, value2, "fforbiddate");
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

        public Criteria andFapprovedateIsNull() {
            addCriterion("fapprovedate is null");
            return (Criteria) this;
        }

        public Criteria andFapprovedateIsNotNull() {
            addCriterion("fapprovedate is not null");
            return (Criteria) this;
        }

        public Criteria andFapprovedateEqualTo(Date value) {
            addCriterion("fapprovedate =", value, "fapprovedate");
            return (Criteria) this;
        }

        public Criteria andFapprovedateNotEqualTo(Date value) {
            addCriterion("fapprovedate <>", value, "fapprovedate");
            return (Criteria) this;
        }

        public Criteria andFapprovedateGreaterThan(Date value) {
            addCriterion("fapprovedate >", value, "fapprovedate");
            return (Criteria) this;
        }

        public Criteria andFapprovedateGreaterThanOrEqualTo(Date value) {
            addCriterion("fapprovedate >=", value, "fapprovedate");
            return (Criteria) this;
        }

        public Criteria andFapprovedateLessThan(Date value) {
            addCriterion("fapprovedate <", value, "fapprovedate");
            return (Criteria) this;
        }

        public Criteria andFapprovedateLessThanOrEqualTo(Date value) {
            addCriterion("fapprovedate <=", value, "fapprovedate");
            return (Criteria) this;
        }

        public Criteria andFapprovedateIn(List<Date> values) {
            addCriterion("fapprovedate in", values, "fapprovedate");
            return (Criteria) this;
        }

        public Criteria andFapprovedateNotIn(List<Date> values) {
            addCriterion("fapprovedate not in", values, "fapprovedate");
            return (Criteria) this;
        }

        public Criteria andFapprovedateBetween(Date value1, Date value2) {
            addCriterion("fapprovedate between", value1, value2, "fapprovedate");
            return (Criteria) this;
        }

        public Criteria andFapprovedateNotBetween(Date value1, Date value2) {
            addCriterion("fapprovedate not between", value1, value2, "fapprovedate");
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

        public Criteria andFBipDisableidIsNull() {
            addCriterion("f_bip_disableid is null");
            return (Criteria) this;
        }

        public Criteria andFBipDisableidIsNotNull() {
            addCriterion("f_bip_disableid is not null");
            return (Criteria) this;
        }

        public Criteria andFBipDisableidEqualTo(Integer value) {
            addCriterion("f_bip_disableid =", value, "fBipDisableid");
            return (Criteria) this;
        }

        public Criteria andFBipDisableidNotEqualTo(Integer value) {
            addCriterion("f_bip_disableid <>", value, "fBipDisableid");
            return (Criteria) this;
        }

        public Criteria andFBipDisableidGreaterThan(Integer value) {
            addCriterion("f_bip_disableid >", value, "fBipDisableid");
            return (Criteria) this;
        }

        public Criteria andFBipDisableidGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_disableid >=", value, "fBipDisableid");
            return (Criteria) this;
        }

        public Criteria andFBipDisableidLessThan(Integer value) {
            addCriterion("f_bip_disableid <", value, "fBipDisableid");
            return (Criteria) this;
        }

        public Criteria andFBipDisableidLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_disableid <=", value, "fBipDisableid");
            return (Criteria) this;
        }

        public Criteria andFBipDisableidIn(List<Integer> values) {
            addCriterion("f_bip_disableid in", values, "fBipDisableid");
            return (Criteria) this;
        }

        public Criteria andFBipDisableidNotIn(List<Integer> values) {
            addCriterion("f_bip_disableid not in", values, "fBipDisableid");
            return (Criteria) this;
        }

        public Criteria andFBipDisableidBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_disableid between", value1, value2, "fBipDisableid");
            return (Criteria) this;
        }

        public Criteria andFBipDisableidNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_disableid not between", value1, value2, "fBipDisableid");
            return (Criteria) this;
        }

        public Criteria andFBipAuditoridIsNull() {
            addCriterion("f_bip_auditorid is null");
            return (Criteria) this;
        }

        public Criteria andFBipAuditoridIsNotNull() {
            addCriterion("f_bip_auditorid is not null");
            return (Criteria) this;
        }

        public Criteria andFBipAuditoridEqualTo(Integer value) {
            addCriterion("f_bip_auditorid =", value, "fBipAuditorid");
            return (Criteria) this;
        }

        public Criteria andFBipAuditoridNotEqualTo(Integer value) {
            addCriterion("f_bip_auditorid <>", value, "fBipAuditorid");
            return (Criteria) this;
        }

        public Criteria andFBipAuditoridGreaterThan(Integer value) {
            addCriterion("f_bip_auditorid >", value, "fBipAuditorid");
            return (Criteria) this;
        }

        public Criteria andFBipAuditoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_auditorid >=", value, "fBipAuditorid");
            return (Criteria) this;
        }

        public Criteria andFBipAuditoridLessThan(Integer value) {
            addCriterion("f_bip_auditorid <", value, "fBipAuditorid");
            return (Criteria) this;
        }

        public Criteria andFBipAuditoridLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_auditorid <=", value, "fBipAuditorid");
            return (Criteria) this;
        }

        public Criteria andFBipAuditoridIn(List<Integer> values) {
            addCriterion("f_bip_auditorid in", values, "fBipAuditorid");
            return (Criteria) this;
        }

        public Criteria andFBipAuditoridNotIn(List<Integer> values) {
            addCriterion("f_bip_auditorid not in", values, "fBipAuditorid");
            return (Criteria) this;
        }

        public Criteria andFBipAuditoridBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_auditorid between", value1, value2, "fBipAuditorid");
            return (Criteria) this;
        }

        public Criteria andFBipAuditoridNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_auditorid not between", value1, value2, "fBipAuditorid");
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