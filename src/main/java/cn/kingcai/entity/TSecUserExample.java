package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSecUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSecUserExample() {
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

        public Criteria andFuseridIsNull() {
            addCriterion("fuserid is null");
            return (Criteria) this;
        }

        public Criteria andFuseridIsNotNull() {
            addCriterion("fuserid is not null");
            return (Criteria) this;
        }

        public Criteria andFuseridEqualTo(Integer value) {
            addCriterion("fuserid =", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridNotEqualTo(Integer value) {
            addCriterion("fuserid <>", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridGreaterThan(Integer value) {
            addCriterion("fuserid >", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuserid >=", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridLessThan(Integer value) {
            addCriterion("fuserid <", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridLessThanOrEqualTo(Integer value) {
            addCriterion("fuserid <=", value, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridIn(List<Integer> values) {
            addCriterion("fuserid in", values, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridNotIn(List<Integer> values) {
            addCriterion("fuserid not in", values, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridBetween(Integer value1, Integer value2) {
            addCriterion("fuserid between", value1, value2, "fuserid");
            return (Criteria) this;
        }

        public Criteria andFuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("fuserid not between", value1, value2, "fuserid");
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

        public Criteria andFprimarygroupIsNull() {
            addCriterion("fprimarygroup is null");
            return (Criteria) this;
        }

        public Criteria andFprimarygroupIsNotNull() {
            addCriterion("fprimarygroup is not null");
            return (Criteria) this;
        }

        public Criteria andFprimarygroupEqualTo(Integer value) {
            addCriterion("fprimarygroup =", value, "fprimarygroup");
            return (Criteria) this;
        }

        public Criteria andFprimarygroupNotEqualTo(Integer value) {
            addCriterion("fprimarygroup <>", value, "fprimarygroup");
            return (Criteria) this;
        }

        public Criteria andFprimarygroupGreaterThan(Integer value) {
            addCriterion("fprimarygroup >", value, "fprimarygroup");
            return (Criteria) this;
        }

        public Criteria andFprimarygroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("fprimarygroup >=", value, "fprimarygroup");
            return (Criteria) this;
        }

        public Criteria andFprimarygroupLessThan(Integer value) {
            addCriterion("fprimarygroup <", value, "fprimarygroup");
            return (Criteria) this;
        }

        public Criteria andFprimarygroupLessThanOrEqualTo(Integer value) {
            addCriterion("fprimarygroup <=", value, "fprimarygroup");
            return (Criteria) this;
        }

        public Criteria andFprimarygroupIn(List<Integer> values) {
            addCriterion("fprimarygroup in", values, "fprimarygroup");
            return (Criteria) this;
        }

        public Criteria andFprimarygroupNotIn(List<Integer> values) {
            addCriterion("fprimarygroup not in", values, "fprimarygroup");
            return (Criteria) this;
        }

        public Criteria andFprimarygroupBetween(Integer value1, Integer value2) {
            addCriterion("fprimarygroup between", value1, value2, "fprimarygroup");
            return (Criteria) this;
        }

        public Criteria andFprimarygroupNotBetween(Integer value1, Integer value2) {
            addCriterion("fprimarygroup not between", value1, value2, "fprimarygroup");
            return (Criteria) this;
        }

        public Criteria andFdescriptionIsNull() {
            addCriterion("fdescription is null");
            return (Criteria) this;
        }

        public Criteria andFdescriptionIsNotNull() {
            addCriterion("fdescription is not null");
            return (Criteria) this;
        }

        public Criteria andFdescriptionEqualTo(String value) {
            addCriterion("fdescription =", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionNotEqualTo(String value) {
            addCriterion("fdescription <>", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionGreaterThan(String value) {
            addCriterion("fdescription >", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("fdescription >=", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionLessThan(String value) {
            addCriterion("fdescription <", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionLessThanOrEqualTo(String value) {
            addCriterion("fdescription <=", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionLike(String value) {
            addCriterion("fdescription like", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionNotLike(String value) {
            addCriterion("fdescription not like", value, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionIn(List<String> values) {
            addCriterion("fdescription in", values, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionNotIn(List<String> values) {
            addCriterion("fdescription not in", values, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionBetween(String value1, String value2) {
            addCriterion("fdescription between", value1, value2, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFdescriptionNotBetween(String value1, String value2) {
            addCriterion("fdescription not between", value1, value2, "fdescription");
            return (Criteria) this;
        }

        public Criteria andFempidIsNull() {
            addCriterion("fempid is null");
            return (Criteria) this;
        }

        public Criteria andFempidIsNotNull() {
            addCriterion("fempid is not null");
            return (Criteria) this;
        }

        public Criteria andFempidEqualTo(Integer value) {
            addCriterion("fempid =", value, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidNotEqualTo(Integer value) {
            addCriterion("fempid <>", value, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidGreaterThan(Integer value) {
            addCriterion("fempid >", value, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fempid >=", value, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidLessThan(Integer value) {
            addCriterion("fempid <", value, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidLessThanOrEqualTo(Integer value) {
            addCriterion("fempid <=", value, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidIn(List<Integer> values) {
            addCriterion("fempid in", values, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidNotIn(List<Integer> values) {
            addCriterion("fempid not in", values, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidBetween(Integer value1, Integer value2) {
            addCriterion("fempid between", value1, value2, "fempid");
            return (Criteria) this;
        }

        public Criteria andFempidNotBetween(Integer value1, Integer value2) {
            addCriterion("fempid not between", value1, value2, "fempid");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNull() {
            addCriterion("ftype is null");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNotNull() {
            addCriterion("ftype is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeEqualTo(String value) {
            addCriterion("ftype =", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotEqualTo(String value) {
            addCriterion("ftype <>", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThan(String value) {
            addCriterion("ftype >", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ftype >=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThan(String value) {
            addCriterion("ftype <", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThanOrEqualTo(String value) {
            addCriterion("ftype <=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLike(String value) {
            addCriterion("ftype like", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotLike(String value) {
            addCriterion("ftype not like", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeIn(List<String> values) {
            addCriterion("ftype in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotIn(List<String> values) {
            addCriterion("ftype not in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeBetween(String value1, String value2) {
            addCriterion("ftype between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotBetween(String value1, String value2) {
            addCriterion("ftype not between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFpasswordIsNull() {
            addCriterion("fpassword is null");
            return (Criteria) this;
        }

        public Criteria andFpasswordIsNotNull() {
            addCriterion("fpassword is not null");
            return (Criteria) this;
        }

        public Criteria andFpasswordEqualTo(String value) {
            addCriterion("fpassword =", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordNotEqualTo(String value) {
            addCriterion("fpassword <>", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordGreaterThan(String value) {
            addCriterion("fpassword >", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("fpassword >=", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordLessThan(String value) {
            addCriterion("fpassword <", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordLessThanOrEqualTo(String value) {
            addCriterion("fpassword <=", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordLike(String value) {
            addCriterion("fpassword like", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordNotLike(String value) {
            addCriterion("fpassword not like", value, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordIn(List<String> values) {
            addCriterion("fpassword in", values, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordNotIn(List<String> values) {
            addCriterion("fpassword not in", values, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordBetween(String value1, String value2) {
            addCriterion("fpassword between", value1, value2, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFpasswordNotBetween(String value1, String value2) {
            addCriterion("fpassword not between", value1, value2, "fpassword");
            return (Criteria) this;
        }

        public Criteria andFislockIsNull() {
            addCriterion("fislock is null");
            return (Criteria) this;
        }

        public Criteria andFislockIsNotNull() {
            addCriterion("fislock is not null");
            return (Criteria) this;
        }

        public Criteria andFislockEqualTo(String value) {
            addCriterion("fislock =", value, "fislock");
            return (Criteria) this;
        }

        public Criteria andFislockNotEqualTo(String value) {
            addCriterion("fislock <>", value, "fislock");
            return (Criteria) this;
        }

        public Criteria andFislockGreaterThan(String value) {
            addCriterion("fislock >", value, "fislock");
            return (Criteria) this;
        }

        public Criteria andFislockGreaterThanOrEqualTo(String value) {
            addCriterion("fislock >=", value, "fislock");
            return (Criteria) this;
        }

        public Criteria andFislockLessThan(String value) {
            addCriterion("fislock <", value, "fislock");
            return (Criteria) this;
        }

        public Criteria andFislockLessThanOrEqualTo(String value) {
            addCriterion("fislock <=", value, "fislock");
            return (Criteria) this;
        }

        public Criteria andFislockLike(String value) {
            addCriterion("fislock like", value, "fislock");
            return (Criteria) this;
        }

        public Criteria andFislockNotLike(String value) {
            addCriterion("fislock not like", value, "fislock");
            return (Criteria) this;
        }

        public Criteria andFislockIn(List<String> values) {
            addCriterion("fislock in", values, "fislock");
            return (Criteria) this;
        }

        public Criteria andFislockNotIn(List<String> values) {
            addCriterion("fislock not in", values, "fislock");
            return (Criteria) this;
        }

        public Criteria andFislockBetween(String value1, String value2) {
            addCriterion("fislock between", value1, value2, "fislock");
            return (Criteria) this;
        }

        public Criteria andFislockNotBetween(String value1, String value2) {
            addCriterion("fislock not between", value1, value2, "fislock");
            return (Criteria) this;
        }

        public Criteria andFunlocktimeIsNull() {
            addCriterion("funlocktime is null");
            return (Criteria) this;
        }

        public Criteria andFunlocktimeIsNotNull() {
            addCriterion("funlocktime is not null");
            return (Criteria) this;
        }

        public Criteria andFunlocktimeEqualTo(Date value) {
            addCriterion("funlocktime =", value, "funlocktime");
            return (Criteria) this;
        }

        public Criteria andFunlocktimeNotEqualTo(Date value) {
            addCriterion("funlocktime <>", value, "funlocktime");
            return (Criteria) this;
        }

        public Criteria andFunlocktimeGreaterThan(Date value) {
            addCriterion("funlocktime >", value, "funlocktime");
            return (Criteria) this;
        }

        public Criteria andFunlocktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("funlocktime >=", value, "funlocktime");
            return (Criteria) this;
        }

        public Criteria andFunlocktimeLessThan(Date value) {
            addCriterion("funlocktime <", value, "funlocktime");
            return (Criteria) this;
        }

        public Criteria andFunlocktimeLessThanOrEqualTo(Date value) {
            addCriterion("funlocktime <=", value, "funlocktime");
            return (Criteria) this;
        }

        public Criteria andFunlocktimeIn(List<Date> values) {
            addCriterion("funlocktime in", values, "funlocktime");
            return (Criteria) this;
        }

        public Criteria andFunlocktimeNotIn(List<Date> values) {
            addCriterion("funlocktime not in", values, "funlocktime");
            return (Criteria) this;
        }

        public Criteria andFunlocktimeBetween(Date value1, Date value2) {
            addCriterion("funlocktime between", value1, value2, "funlocktime");
            return (Criteria) this;
        }

        public Criteria andFunlocktimeNotBetween(Date value1, Date value2) {
            addCriterion("funlocktime not between", value1, value2, "funlocktime");
            return (Criteria) this;
        }

        public Criteria andFpwdvaliddateIsNull() {
            addCriterion("fpwdvaliddate is null");
            return (Criteria) this;
        }

        public Criteria andFpwdvaliddateIsNotNull() {
            addCriterion("fpwdvaliddate is not null");
            return (Criteria) this;
        }

        public Criteria andFpwdvaliddateEqualTo(Date value) {
            addCriterion("fpwdvaliddate =", value, "fpwdvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdvaliddateNotEqualTo(Date value) {
            addCriterion("fpwdvaliddate <>", value, "fpwdvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdvaliddateGreaterThan(Date value) {
            addCriterion("fpwdvaliddate >", value, "fpwdvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdvaliddateGreaterThanOrEqualTo(Date value) {
            addCriterion("fpwdvaliddate >=", value, "fpwdvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdvaliddateLessThan(Date value) {
            addCriterion("fpwdvaliddate <", value, "fpwdvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdvaliddateLessThanOrEqualTo(Date value) {
            addCriterion("fpwdvaliddate <=", value, "fpwdvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdvaliddateIn(List<Date> values) {
            addCriterion("fpwdvaliddate in", values, "fpwdvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdvaliddateNotIn(List<Date> values) {
            addCriterion("fpwdvaliddate not in", values, "fpwdvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdvaliddateBetween(Date value1, Date value2) {
            addCriterion("fpwdvaliddate between", value1, value2, "fpwdvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdvaliddateNotBetween(Date value1, Date value2) {
            addCriterion("fpwdvaliddate not between", value1, value2, "fpwdvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdmodifyvaliddateIsNull() {
            addCriterion("fpwdmodifyvaliddate is null");
            return (Criteria) this;
        }

        public Criteria andFpwdmodifyvaliddateIsNotNull() {
            addCriterion("fpwdmodifyvaliddate is not null");
            return (Criteria) this;
        }

        public Criteria andFpwdmodifyvaliddateEqualTo(Date value) {
            addCriterion("fpwdmodifyvaliddate =", value, "fpwdmodifyvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdmodifyvaliddateNotEqualTo(Date value) {
            addCriterion("fpwdmodifyvaliddate <>", value, "fpwdmodifyvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdmodifyvaliddateGreaterThan(Date value) {
            addCriterion("fpwdmodifyvaliddate >", value, "fpwdmodifyvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdmodifyvaliddateGreaterThanOrEqualTo(Date value) {
            addCriterion("fpwdmodifyvaliddate >=", value, "fpwdmodifyvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdmodifyvaliddateLessThan(Date value) {
            addCriterion("fpwdmodifyvaliddate <", value, "fpwdmodifyvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdmodifyvaliddateLessThanOrEqualTo(Date value) {
            addCriterion("fpwdmodifyvaliddate <=", value, "fpwdmodifyvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdmodifyvaliddateIn(List<Date> values) {
            addCriterion("fpwdmodifyvaliddate in", values, "fpwdmodifyvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdmodifyvaliddateNotIn(List<Date> values) {
            addCriterion("fpwdmodifyvaliddate not in", values, "fpwdmodifyvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdmodifyvaliddateBetween(Date value1, Date value2) {
            addCriterion("fpwdmodifyvaliddate between", value1, value2, "fpwdmodifyvaliddate");
            return (Criteria) this;
        }

        public Criteria andFpwdmodifyvaliddateNotBetween(Date value1, Date value2) {
            addCriterion("fpwdmodifyvaliddate not between", value1, value2, "fpwdmodifyvaliddate");
            return (Criteria) this;
        }

        public Criteria andFissystemgenIsNull() {
            addCriterion("fissystemgen is null");
            return (Criteria) this;
        }

        public Criteria andFissystemgenIsNotNull() {
            addCriterion("fissystemgen is not null");
            return (Criteria) this;
        }

        public Criteria andFissystemgenEqualTo(String value) {
            addCriterion("fissystemgen =", value, "fissystemgen");
            return (Criteria) this;
        }

        public Criteria andFissystemgenNotEqualTo(String value) {
            addCriterion("fissystemgen <>", value, "fissystemgen");
            return (Criteria) this;
        }

        public Criteria andFissystemgenGreaterThan(String value) {
            addCriterion("fissystemgen >", value, "fissystemgen");
            return (Criteria) this;
        }

        public Criteria andFissystemgenGreaterThanOrEqualTo(String value) {
            addCriterion("fissystemgen >=", value, "fissystemgen");
            return (Criteria) this;
        }

        public Criteria andFissystemgenLessThan(String value) {
            addCriterion("fissystemgen <", value, "fissystemgen");
            return (Criteria) this;
        }

        public Criteria andFissystemgenLessThanOrEqualTo(String value) {
            addCriterion("fissystemgen <=", value, "fissystemgen");
            return (Criteria) this;
        }

        public Criteria andFissystemgenLike(String value) {
            addCriterion("fissystemgen like", value, "fissystemgen");
            return (Criteria) this;
        }

        public Criteria andFissystemgenNotLike(String value) {
            addCriterion("fissystemgen not like", value, "fissystemgen");
            return (Criteria) this;
        }

        public Criteria andFissystemgenIn(List<String> values) {
            addCriterion("fissystemgen in", values, "fissystemgen");
            return (Criteria) this;
        }

        public Criteria andFissystemgenNotIn(List<String> values) {
            addCriterion("fissystemgen not in", values, "fissystemgen");
            return (Criteria) this;
        }

        public Criteria andFissystemgenBetween(String value1, String value2) {
            addCriterion("fissystemgen between", value1, value2, "fissystemgen");
            return (Criteria) this;
        }

        public Criteria andFissystemgenNotBetween(String value1, String value2) {
            addCriterion("fissystemgen not between", value1, value2, "fissystemgen");
            return (Criteria) this;
        }

        public Criteria andFlogincountIsNull() {
            addCriterion("flogincount is null");
            return (Criteria) this;
        }

        public Criteria andFlogincountIsNotNull() {
            addCriterion("flogincount is not null");
            return (Criteria) this;
        }

        public Criteria andFlogincountEqualTo(Integer value) {
            addCriterion("flogincount =", value, "flogincount");
            return (Criteria) this;
        }

        public Criteria andFlogincountNotEqualTo(Integer value) {
            addCriterion("flogincount <>", value, "flogincount");
            return (Criteria) this;
        }

        public Criteria andFlogincountGreaterThan(Integer value) {
            addCriterion("flogincount >", value, "flogincount");
            return (Criteria) this;
        }

        public Criteria andFlogincountGreaterThanOrEqualTo(Integer value) {
            addCriterion("flogincount >=", value, "flogincount");
            return (Criteria) this;
        }

        public Criteria andFlogincountLessThan(Integer value) {
            addCriterion("flogincount <", value, "flogincount");
            return (Criteria) this;
        }

        public Criteria andFlogincountLessThanOrEqualTo(Integer value) {
            addCriterion("flogincount <=", value, "flogincount");
            return (Criteria) this;
        }

        public Criteria andFlogincountIn(List<Integer> values) {
            addCriterion("flogincount in", values, "flogincount");
            return (Criteria) this;
        }

        public Criteria andFlogincountNotIn(List<Integer> values) {
            addCriterion("flogincount not in", values, "flogincount");
            return (Criteria) this;
        }

        public Criteria andFlogincountBetween(Integer value1, Integer value2) {
            addCriterion("flogincount between", value1, value2, "flogincount");
            return (Criteria) this;
        }

        public Criteria andFlogincountNotBetween(Integer value1, Integer value2) {
            addCriterion("flogincount not between", value1, value2, "flogincount");
            return (Criteria) this;
        }

        public Criteria andFerrorcountIsNull() {
            addCriterion("ferrorcount is null");
            return (Criteria) this;
        }

        public Criteria andFerrorcountIsNotNull() {
            addCriterion("ferrorcount is not null");
            return (Criteria) this;
        }

        public Criteria andFerrorcountEqualTo(Integer value) {
            addCriterion("ferrorcount =", value, "ferrorcount");
            return (Criteria) this;
        }

        public Criteria andFerrorcountNotEqualTo(Integer value) {
            addCriterion("ferrorcount <>", value, "ferrorcount");
            return (Criteria) this;
        }

        public Criteria andFerrorcountGreaterThan(Integer value) {
            addCriterion("ferrorcount >", value, "ferrorcount");
            return (Criteria) this;
        }

        public Criteria andFerrorcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ferrorcount >=", value, "ferrorcount");
            return (Criteria) this;
        }

        public Criteria andFerrorcountLessThan(Integer value) {
            addCriterion("ferrorcount <", value, "ferrorcount");
            return (Criteria) this;
        }

        public Criteria andFerrorcountLessThanOrEqualTo(Integer value) {
            addCriterion("ferrorcount <=", value, "ferrorcount");
            return (Criteria) this;
        }

        public Criteria andFerrorcountIn(List<Integer> values) {
            addCriterion("ferrorcount in", values, "ferrorcount");
            return (Criteria) this;
        }

        public Criteria andFerrorcountNotIn(List<Integer> values) {
            addCriterion("ferrorcount not in", values, "ferrorcount");
            return (Criteria) this;
        }

        public Criteria andFerrorcountBetween(Integer value1, Integer value2) {
            addCriterion("ferrorcount between", value1, value2, "ferrorcount");
            return (Criteria) this;
        }

        public Criteria andFerrorcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ferrorcount not between", value1, value2, "ferrorcount");
            return (Criteria) this;
        }

        public Criteria andFsidIsNull() {
            addCriterion("fsid is null");
            return (Criteria) this;
        }

        public Criteria andFsidIsNotNull() {
            addCriterion("fsid is not null");
            return (Criteria) this;
        }

        public Criteria andFsidEqualTo(String value) {
            addCriterion("fsid =", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidNotEqualTo(String value) {
            addCriterion("fsid <>", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidGreaterThan(String value) {
            addCriterion("fsid >", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidGreaterThanOrEqualTo(String value) {
            addCriterion("fsid >=", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidLessThan(String value) {
            addCriterion("fsid <", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidLessThanOrEqualTo(String value) {
            addCriterion("fsid <=", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidLike(String value) {
            addCriterion("fsid like", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidNotLike(String value) {
            addCriterion("fsid not like", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidIn(List<String> values) {
            addCriterion("fsid in", values, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidNotIn(List<String> values) {
            addCriterion("fsid not in", values, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidBetween(String value1, String value2) {
            addCriterion("fsid between", value1, value2, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidNotBetween(String value1, String value2) {
            addCriterion("fsid not between", value1, value2, "fsid");
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

        public Criteria andFcreateorgIsNull() {
            addCriterion("fcreateorg is null");
            return (Criteria) this;
        }

        public Criteria andFcreateorgIsNotNull() {
            addCriterion("fcreateorg is not null");
            return (Criteria) this;
        }

        public Criteria andFcreateorgEqualTo(Integer value) {
            addCriterion("fcreateorg =", value, "fcreateorg");
            return (Criteria) this;
        }

        public Criteria andFcreateorgNotEqualTo(Integer value) {
            addCriterion("fcreateorg <>", value, "fcreateorg");
            return (Criteria) this;
        }

        public Criteria andFcreateorgGreaterThan(Integer value) {
            addCriterion("fcreateorg >", value, "fcreateorg");
            return (Criteria) this;
        }

        public Criteria andFcreateorgGreaterThanOrEqualTo(Integer value) {
            addCriterion("fcreateorg >=", value, "fcreateorg");
            return (Criteria) this;
        }

        public Criteria andFcreateorgLessThan(Integer value) {
            addCriterion("fcreateorg <", value, "fcreateorg");
            return (Criteria) this;
        }

        public Criteria andFcreateorgLessThanOrEqualTo(Integer value) {
            addCriterion("fcreateorg <=", value, "fcreateorg");
            return (Criteria) this;
        }

        public Criteria andFcreateorgIn(List<Integer> values) {
            addCriterion("fcreateorg in", values, "fcreateorg");
            return (Criteria) this;
        }

        public Criteria andFcreateorgNotIn(List<Integer> values) {
            addCriterion("fcreateorg not in", values, "fcreateorg");
            return (Criteria) this;
        }

        public Criteria andFcreateorgBetween(Integer value1, Integer value2) {
            addCriterion("fcreateorg between", value1, value2, "fcreateorg");
            return (Criteria) this;
        }

        public Criteria andFcreateorgNotBetween(Integer value1, Integer value2) {
            addCriterion("fcreateorg not between", value1, value2, "fcreateorg");
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

        public Criteria andFlinkobjectIsNull() {
            addCriterion("flinkobject is null");
            return (Criteria) this;
        }

        public Criteria andFlinkobjectIsNotNull() {
            addCriterion("flinkobject is not null");
            return (Criteria) this;
        }

        public Criteria andFlinkobjectEqualTo(Integer value) {
            addCriterion("flinkobject =", value, "flinkobject");
            return (Criteria) this;
        }

        public Criteria andFlinkobjectNotEqualTo(Integer value) {
            addCriterion("flinkobject <>", value, "flinkobject");
            return (Criteria) this;
        }

        public Criteria andFlinkobjectGreaterThan(Integer value) {
            addCriterion("flinkobject >", value, "flinkobject");
            return (Criteria) this;
        }

        public Criteria andFlinkobjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("flinkobject >=", value, "flinkobject");
            return (Criteria) this;
        }

        public Criteria andFlinkobjectLessThan(Integer value) {
            addCriterion("flinkobject <", value, "flinkobject");
            return (Criteria) this;
        }

        public Criteria andFlinkobjectLessThanOrEqualTo(Integer value) {
            addCriterion("flinkobject <=", value, "flinkobject");
            return (Criteria) this;
        }

        public Criteria andFlinkobjectIn(List<Integer> values) {
            addCriterion("flinkobject in", values, "flinkobject");
            return (Criteria) this;
        }

        public Criteria andFlinkobjectNotIn(List<Integer> values) {
            addCriterion("flinkobject not in", values, "flinkobject");
            return (Criteria) this;
        }

        public Criteria andFlinkobjectBetween(Integer value1, Integer value2) {
            addCriterion("flinkobject between", value1, value2, "flinkobject");
            return (Criteria) this;
        }

        public Criteria andFlinkobjectNotBetween(Integer value1, Integer value2) {
            addCriterion("flinkobject not between", value1, value2, "flinkobject");
            return (Criteria) this;
        }

        public Criteria andFmemoIsNull() {
            addCriterion("fmemo is null");
            return (Criteria) this;
        }

        public Criteria andFmemoIsNotNull() {
            addCriterion("fmemo is not null");
            return (Criteria) this;
        }

        public Criteria andFmemoEqualTo(String value) {
            addCriterion("fmemo =", value, "fmemo");
            return (Criteria) this;
        }

        public Criteria andFmemoNotEqualTo(String value) {
            addCriterion("fmemo <>", value, "fmemo");
            return (Criteria) this;
        }

        public Criteria andFmemoGreaterThan(String value) {
            addCriterion("fmemo >", value, "fmemo");
            return (Criteria) this;
        }

        public Criteria andFmemoGreaterThanOrEqualTo(String value) {
            addCriterion("fmemo >=", value, "fmemo");
            return (Criteria) this;
        }

        public Criteria andFmemoLessThan(String value) {
            addCriterion("fmemo <", value, "fmemo");
            return (Criteria) this;
        }

        public Criteria andFmemoLessThanOrEqualTo(String value) {
            addCriterion("fmemo <=", value, "fmemo");
            return (Criteria) this;
        }

        public Criteria andFmemoLike(String value) {
            addCriterion("fmemo like", value, "fmemo");
            return (Criteria) this;
        }

        public Criteria andFmemoNotLike(String value) {
            addCriterion("fmemo not like", value, "fmemo");
            return (Criteria) this;
        }

        public Criteria andFmemoIn(List<String> values) {
            addCriterion("fmemo in", values, "fmemo");
            return (Criteria) this;
        }

        public Criteria andFmemoNotIn(List<String> values) {
            addCriterion("fmemo not in", values, "fmemo");
            return (Criteria) this;
        }

        public Criteria andFmemoBetween(String value1, String value2) {
            addCriterion("fmemo between", value1, value2, "fmemo");
            return (Criteria) this;
        }

        public Criteria andFmemoNotBetween(String value1, String value2) {
            addCriterion("fmemo not between", value1, value2, "fmemo");
            return (Criteria) this;
        }

        public Criteria andFmbaccontIsNull() {
            addCriterion("fmbaccont is null");
            return (Criteria) this;
        }

        public Criteria andFmbaccontIsNotNull() {
            addCriterion("fmbaccont is not null");
            return (Criteria) this;
        }

        public Criteria andFmbaccontEqualTo(String value) {
            addCriterion("fmbaccont =", value, "fmbaccont");
            return (Criteria) this;
        }

        public Criteria andFmbaccontNotEqualTo(String value) {
            addCriterion("fmbaccont <>", value, "fmbaccont");
            return (Criteria) this;
        }

        public Criteria andFmbaccontGreaterThan(String value) {
            addCriterion("fmbaccont >", value, "fmbaccont");
            return (Criteria) this;
        }

        public Criteria andFmbaccontGreaterThanOrEqualTo(String value) {
            addCriterion("fmbaccont >=", value, "fmbaccont");
            return (Criteria) this;
        }

        public Criteria andFmbaccontLessThan(String value) {
            addCriterion("fmbaccont <", value, "fmbaccont");
            return (Criteria) this;
        }

        public Criteria andFmbaccontLessThanOrEqualTo(String value) {
            addCriterion("fmbaccont <=", value, "fmbaccont");
            return (Criteria) this;
        }

        public Criteria andFmbaccontLike(String value) {
            addCriterion("fmbaccont like", value, "fmbaccont");
            return (Criteria) this;
        }

        public Criteria andFmbaccontNotLike(String value) {
            addCriterion("fmbaccont not like", value, "fmbaccont");
            return (Criteria) this;
        }

        public Criteria andFmbaccontIn(List<String> values) {
            addCriterion("fmbaccont in", values, "fmbaccont");
            return (Criteria) this;
        }

        public Criteria andFmbaccontNotIn(List<String> values) {
            addCriterion("fmbaccont not in", values, "fmbaccont");
            return (Criteria) this;
        }

        public Criteria andFmbaccontBetween(String value1, String value2) {
            addCriterion("fmbaccont between", value1, value2, "fmbaccont");
            return (Criteria) this;
        }

        public Criteria andFmbaccontNotBetween(String value1, String value2) {
            addCriterion("fmbaccont not between", value1, value2, "fmbaccont");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenIsNull() {
            addCriterion("faccesstoken is null");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenIsNotNull() {
            addCriterion("faccesstoken is not null");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenEqualTo(String value) {
            addCriterion("faccesstoken =", value, "faccesstoken");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenNotEqualTo(String value) {
            addCriterion("faccesstoken <>", value, "faccesstoken");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenGreaterThan(String value) {
            addCriterion("faccesstoken >", value, "faccesstoken");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenGreaterThanOrEqualTo(String value) {
            addCriterion("faccesstoken >=", value, "faccesstoken");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenLessThan(String value) {
            addCriterion("faccesstoken <", value, "faccesstoken");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenLessThanOrEqualTo(String value) {
            addCriterion("faccesstoken <=", value, "faccesstoken");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenLike(String value) {
            addCriterion("faccesstoken like", value, "faccesstoken");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenNotLike(String value) {
            addCriterion("faccesstoken not like", value, "faccesstoken");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenIn(List<String> values) {
            addCriterion("faccesstoken in", values, "faccesstoken");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenNotIn(List<String> values) {
            addCriterion("faccesstoken not in", values, "faccesstoken");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenBetween(String value1, String value2) {
            addCriterion("faccesstoken between", value1, value2, "faccesstoken");
            return (Criteria) this;
        }

        public Criteria andFaccesstokenNotBetween(String value1, String value2) {
            addCriterion("faccesstoken not between", value1, value2, "faccesstoken");
            return (Criteria) this;
        }

        public Criteria andFtokensecretIsNull() {
            addCriterion("ftokensecret is null");
            return (Criteria) this;
        }

        public Criteria andFtokensecretIsNotNull() {
            addCriterion("ftokensecret is not null");
            return (Criteria) this;
        }

        public Criteria andFtokensecretEqualTo(String value) {
            addCriterion("ftokensecret =", value, "ftokensecret");
            return (Criteria) this;
        }

        public Criteria andFtokensecretNotEqualTo(String value) {
            addCriterion("ftokensecret <>", value, "ftokensecret");
            return (Criteria) this;
        }

        public Criteria andFtokensecretGreaterThan(String value) {
            addCriterion("ftokensecret >", value, "ftokensecret");
            return (Criteria) this;
        }

        public Criteria andFtokensecretGreaterThanOrEqualTo(String value) {
            addCriterion("ftokensecret >=", value, "ftokensecret");
            return (Criteria) this;
        }

        public Criteria andFtokensecretLessThan(String value) {
            addCriterion("ftokensecret <", value, "ftokensecret");
            return (Criteria) this;
        }

        public Criteria andFtokensecretLessThanOrEqualTo(String value) {
            addCriterion("ftokensecret <=", value, "ftokensecret");
            return (Criteria) this;
        }

        public Criteria andFtokensecretLike(String value) {
            addCriterion("ftokensecret like", value, "ftokensecret");
            return (Criteria) this;
        }

        public Criteria andFtokensecretNotLike(String value) {
            addCriterion("ftokensecret not like", value, "ftokensecret");
            return (Criteria) this;
        }

        public Criteria andFtokensecretIn(List<String> values) {
            addCriterion("ftokensecret in", values, "ftokensecret");
            return (Criteria) this;
        }

        public Criteria andFtokensecretNotIn(List<String> values) {
            addCriterion("ftokensecret not in", values, "ftokensecret");
            return (Criteria) this;
        }

        public Criteria andFtokensecretBetween(String value1, String value2) {
            addCriterion("ftokensecret between", value1, value2, "ftokensecret");
            return (Criteria) this;
        }

        public Criteria andFtokensecretNotBetween(String value1, String value2) {
            addCriterion("ftokensecret not between", value1, value2, "ftokensecret");
            return (Criteria) this;
        }

        public Criteria andFweibouseridIsNull() {
            addCriterion("fweibouserid is null");
            return (Criteria) this;
        }

        public Criteria andFweibouseridIsNotNull() {
            addCriterion("fweibouserid is not null");
            return (Criteria) this;
        }

        public Criteria andFweibouseridEqualTo(String value) {
            addCriterion("fweibouserid =", value, "fweibouserid");
            return (Criteria) this;
        }

        public Criteria andFweibouseridNotEqualTo(String value) {
            addCriterion("fweibouserid <>", value, "fweibouserid");
            return (Criteria) this;
        }

        public Criteria andFweibouseridGreaterThan(String value) {
            addCriterion("fweibouserid >", value, "fweibouserid");
            return (Criteria) this;
        }

        public Criteria andFweibouseridGreaterThanOrEqualTo(String value) {
            addCriterion("fweibouserid >=", value, "fweibouserid");
            return (Criteria) this;
        }

        public Criteria andFweibouseridLessThan(String value) {
            addCriterion("fweibouserid <", value, "fweibouserid");
            return (Criteria) this;
        }

        public Criteria andFweibouseridLessThanOrEqualTo(String value) {
            addCriterion("fweibouserid <=", value, "fweibouserid");
            return (Criteria) this;
        }

        public Criteria andFweibouseridLike(String value) {
            addCriterion("fweibouserid like", value, "fweibouserid");
            return (Criteria) this;
        }

        public Criteria andFweibouseridNotLike(String value) {
            addCriterion("fweibouserid not like", value, "fweibouserid");
            return (Criteria) this;
        }

        public Criteria andFweibouseridIn(List<String> values) {
            addCriterion("fweibouserid in", values, "fweibouserid");
            return (Criteria) this;
        }

        public Criteria andFweibouseridNotIn(List<String> values) {
            addCriterion("fweibouserid not in", values, "fweibouserid");
            return (Criteria) this;
        }

        public Criteria andFweibouseridBetween(String value1, String value2) {
            addCriterion("fweibouserid between", value1, value2, "fweibouserid");
            return (Criteria) this;
        }

        public Criteria andFweibouseridNotBetween(String value1, String value2) {
            addCriterion("fweibouserid not between", value1, value2, "fweibouserid");
            return (Criteria) this;
        }

        public Criteria andFregstateIsNull() {
            addCriterion("fregstate is null");
            return (Criteria) this;
        }

        public Criteria andFregstateIsNotNull() {
            addCriterion("fregstate is not null");
            return (Criteria) this;
        }

        public Criteria andFregstateEqualTo(String value) {
            addCriterion("fregstate =", value, "fregstate");
            return (Criteria) this;
        }

        public Criteria andFregstateNotEqualTo(String value) {
            addCriterion("fregstate <>", value, "fregstate");
            return (Criteria) this;
        }

        public Criteria andFregstateGreaterThan(String value) {
            addCriterion("fregstate >", value, "fregstate");
            return (Criteria) this;
        }

        public Criteria andFregstateGreaterThanOrEqualTo(String value) {
            addCriterion("fregstate >=", value, "fregstate");
            return (Criteria) this;
        }

        public Criteria andFregstateLessThan(String value) {
            addCriterion("fregstate <", value, "fregstate");
            return (Criteria) this;
        }

        public Criteria andFregstateLessThanOrEqualTo(String value) {
            addCriterion("fregstate <=", value, "fregstate");
            return (Criteria) this;
        }

        public Criteria andFregstateLike(String value) {
            addCriterion("fregstate like", value, "fregstate");
            return (Criteria) this;
        }

        public Criteria andFregstateNotLike(String value) {
            addCriterion("fregstate not like", value, "fregstate");
            return (Criteria) this;
        }

        public Criteria andFregstateIn(List<String> values) {
            addCriterion("fregstate in", values, "fregstate");
            return (Criteria) this;
        }

        public Criteria andFregstateNotIn(List<String> values) {
            addCriterion("fregstate not in", values, "fregstate");
            return (Criteria) this;
        }

        public Criteria andFregstateBetween(String value1, String value2) {
            addCriterion("fregstate between", value1, value2, "fregstate");
            return (Criteria) this;
        }

        public Criteria andFregstateNotBetween(String value1, String value2) {
            addCriterion("fregstate not between", value1, value2, "fregstate");
            return (Criteria) this;
        }

        public Criteria andFuseraccountIsNull() {
            addCriterion("fuseraccount is null");
            return (Criteria) this;
        }

        public Criteria andFuseraccountIsNotNull() {
            addCriterion("fuseraccount is not null");
            return (Criteria) this;
        }

        public Criteria andFuseraccountEqualTo(String value) {
            addCriterion("fuseraccount =", value, "fuseraccount");
            return (Criteria) this;
        }

        public Criteria andFuseraccountNotEqualTo(String value) {
            addCriterion("fuseraccount <>", value, "fuseraccount");
            return (Criteria) this;
        }

        public Criteria andFuseraccountGreaterThan(String value) {
            addCriterion("fuseraccount >", value, "fuseraccount");
            return (Criteria) this;
        }

        public Criteria andFuseraccountGreaterThanOrEqualTo(String value) {
            addCriterion("fuseraccount >=", value, "fuseraccount");
            return (Criteria) this;
        }

        public Criteria andFuseraccountLessThan(String value) {
            addCriterion("fuseraccount <", value, "fuseraccount");
            return (Criteria) this;
        }

        public Criteria andFuseraccountLessThanOrEqualTo(String value) {
            addCriterion("fuseraccount <=", value, "fuseraccount");
            return (Criteria) this;
        }

        public Criteria andFuseraccountLike(String value) {
            addCriterion("fuseraccount like", value, "fuseraccount");
            return (Criteria) this;
        }

        public Criteria andFuseraccountNotLike(String value) {
            addCriterion("fuseraccount not like", value, "fuseraccount");
            return (Criteria) this;
        }

        public Criteria andFuseraccountIn(List<String> values) {
            addCriterion("fuseraccount in", values, "fuseraccount");
            return (Criteria) this;
        }

        public Criteria andFuseraccountNotIn(List<String> values) {
            addCriterion("fuseraccount not in", values, "fuseraccount");
            return (Criteria) this;
        }

        public Criteria andFuseraccountBetween(String value1, String value2) {
            addCriterion("fuseraccount between", value1, value2, "fuseraccount");
            return (Criteria) this;
        }

        public Criteria andFuseraccountNotBetween(String value1, String value2) {
            addCriterion("fuseraccount not between", value1, value2, "fuseraccount");
            return (Criteria) this;
        }

        public Criteria andFphoneIsNull() {
            addCriterion("fphone is null");
            return (Criteria) this;
        }

        public Criteria andFphoneIsNotNull() {
            addCriterion("fphone is not null");
            return (Criteria) this;
        }

        public Criteria andFphoneEqualTo(String value) {
            addCriterion("fphone =", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotEqualTo(String value) {
            addCriterion("fphone <>", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneGreaterThan(String value) {
            addCriterion("fphone >", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneGreaterThanOrEqualTo(String value) {
            addCriterion("fphone >=", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLessThan(String value) {
            addCriterion("fphone <", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLessThanOrEqualTo(String value) {
            addCriterion("fphone <=", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLike(String value) {
            addCriterion("fphone like", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotLike(String value) {
            addCriterion("fphone not like", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneIn(List<String> values) {
            addCriterion("fphone in", values, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotIn(List<String> values) {
            addCriterion("fphone not in", values, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneBetween(String value1, String value2) {
            addCriterion("fphone between", value1, value2, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotBetween(String value1, String value2) {
            addCriterion("fphone not between", value1, value2, "fphone");
            return (Criteria) this;
        }

        public Criteria andFdomainuserIsNull() {
            addCriterion("fdomainuser is null");
            return (Criteria) this;
        }

        public Criteria andFdomainuserIsNotNull() {
            addCriterion("fdomainuser is not null");
            return (Criteria) this;
        }

        public Criteria andFdomainuserEqualTo(String value) {
            addCriterion("fdomainuser =", value, "fdomainuser");
            return (Criteria) this;
        }

        public Criteria andFdomainuserNotEqualTo(String value) {
            addCriterion("fdomainuser <>", value, "fdomainuser");
            return (Criteria) this;
        }

        public Criteria andFdomainuserGreaterThan(String value) {
            addCriterion("fdomainuser >", value, "fdomainuser");
            return (Criteria) this;
        }

        public Criteria andFdomainuserGreaterThanOrEqualTo(String value) {
            addCriterion("fdomainuser >=", value, "fdomainuser");
            return (Criteria) this;
        }

        public Criteria andFdomainuserLessThan(String value) {
            addCriterion("fdomainuser <", value, "fdomainuser");
            return (Criteria) this;
        }

        public Criteria andFdomainuserLessThanOrEqualTo(String value) {
            addCriterion("fdomainuser <=", value, "fdomainuser");
            return (Criteria) this;
        }

        public Criteria andFdomainuserLike(String value) {
            addCriterion("fdomainuser like", value, "fdomainuser");
            return (Criteria) this;
        }

        public Criteria andFdomainuserNotLike(String value) {
            addCriterion("fdomainuser not like", value, "fdomainuser");
            return (Criteria) this;
        }

        public Criteria andFdomainuserIn(List<String> values) {
            addCriterion("fdomainuser in", values, "fdomainuser");
            return (Criteria) this;
        }

        public Criteria andFdomainuserNotIn(List<String> values) {
            addCriterion("fdomainuser not in", values, "fdomainuser");
            return (Criteria) this;
        }

        public Criteria andFdomainuserBetween(String value1, String value2) {
            addCriterion("fdomainuser between", value1, value2, "fdomainuser");
            return (Criteria) this;
        }

        public Criteria andFdomainuserNotBetween(String value1, String value2) {
            addCriterion("fdomainuser not between", value1, value2, "fdomainuser");
            return (Criteria) this;
        }

        public Criteria andFusertypeIsNull() {
            addCriterion("fusertype is null");
            return (Criteria) this;
        }

        public Criteria andFusertypeIsNotNull() {
            addCriterion("fusertype is not null");
            return (Criteria) this;
        }

        public Criteria andFusertypeEqualTo(String value) {
            addCriterion("fusertype =", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeNotEqualTo(String value) {
            addCriterion("fusertype <>", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeGreaterThan(String value) {
            addCriterion("fusertype >", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeGreaterThanOrEqualTo(String value) {
            addCriterion("fusertype >=", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeLessThan(String value) {
            addCriterion("fusertype <", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeLessThanOrEqualTo(String value) {
            addCriterion("fusertype <=", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeLike(String value) {
            addCriterion("fusertype like", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeNotLike(String value) {
            addCriterion("fusertype not like", value, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeIn(List<String> values) {
            addCriterion("fusertype in", values, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeNotIn(List<String> values) {
            addCriterion("fusertype not in", values, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeBetween(String value1, String value2) {
            addCriterion("fusertype between", value1, value2, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFusertypeNotBetween(String value1, String value2) {
            addCriterion("fusertype not between", value1, value2, "fusertype");
            return (Criteria) this;
        }

        public Criteria andFemailIsNull() {
            addCriterion("femail is null");
            return (Criteria) this;
        }

        public Criteria andFemailIsNotNull() {
            addCriterion("femail is not null");
            return (Criteria) this;
        }

        public Criteria andFemailEqualTo(String value) {
            addCriterion("femail =", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailNotEqualTo(String value) {
            addCriterion("femail <>", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailGreaterThan(String value) {
            addCriterion("femail >", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailGreaterThanOrEqualTo(String value) {
            addCriterion("femail >=", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailLessThan(String value) {
            addCriterion("femail <", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailLessThanOrEqualTo(String value) {
            addCriterion("femail <=", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailLike(String value) {
            addCriterion("femail like", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailNotLike(String value) {
            addCriterion("femail not like", value, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailIn(List<String> values) {
            addCriterion("femail in", values, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailNotIn(List<String> values) {
            addCriterion("femail not in", values, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailBetween(String value1, String value2) {
            addCriterion("femail between", value1, value2, "femail");
            return (Criteria) this;
        }

        public Criteria andFemailNotBetween(String value1, String value2) {
            addCriterion("femail not between", value1, value2, "femail");
            return (Criteria) this;
        }

        public Criteria andFdynamicpasswordidIsNull() {
            addCriterion("fdynamicpasswordid is null");
            return (Criteria) this;
        }

        public Criteria andFdynamicpasswordidIsNotNull() {
            addCriterion("fdynamicpasswordid is not null");
            return (Criteria) this;
        }

        public Criteria andFdynamicpasswordidEqualTo(Integer value) {
            addCriterion("fdynamicpasswordid =", value, "fdynamicpasswordid");
            return (Criteria) this;
        }

        public Criteria andFdynamicpasswordidNotEqualTo(Integer value) {
            addCriterion("fdynamicpasswordid <>", value, "fdynamicpasswordid");
            return (Criteria) this;
        }

        public Criteria andFdynamicpasswordidGreaterThan(Integer value) {
            addCriterion("fdynamicpasswordid >", value, "fdynamicpasswordid");
            return (Criteria) this;
        }

        public Criteria andFdynamicpasswordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fdynamicpasswordid >=", value, "fdynamicpasswordid");
            return (Criteria) this;
        }

        public Criteria andFdynamicpasswordidLessThan(Integer value) {
            addCriterion("fdynamicpasswordid <", value, "fdynamicpasswordid");
            return (Criteria) this;
        }

        public Criteria andFdynamicpasswordidLessThanOrEqualTo(Integer value) {
            addCriterion("fdynamicpasswordid <=", value, "fdynamicpasswordid");
            return (Criteria) this;
        }

        public Criteria andFdynamicpasswordidIn(List<Integer> values) {
            addCriterion("fdynamicpasswordid in", values, "fdynamicpasswordid");
            return (Criteria) this;
        }

        public Criteria andFdynamicpasswordidNotIn(List<Integer> values) {
            addCriterion("fdynamicpasswordid not in", values, "fdynamicpasswordid");
            return (Criteria) this;
        }

        public Criteria andFdynamicpasswordidBetween(Integer value1, Integer value2) {
            addCriterion("fdynamicpasswordid between", value1, value2, "fdynamicpasswordid");
            return (Criteria) this;
        }

        public Criteria andFdynamicpasswordidNotBetween(Integer value1, Integer value2) {
            addCriterion("fdynamicpasswordid not between", value1, value2, "fdynamicpasswordid");
            return (Criteria) this;
        }

        public Criteria andFsocialidIsNull() {
            addCriterion("fsocialid is null");
            return (Criteria) this;
        }

        public Criteria andFsocialidIsNotNull() {
            addCriterion("fsocialid is not null");
            return (Criteria) this;
        }

        public Criteria andFsocialidEqualTo(String value) {
            addCriterion("fsocialid =", value, "fsocialid");
            return (Criteria) this;
        }

        public Criteria andFsocialidNotEqualTo(String value) {
            addCriterion("fsocialid <>", value, "fsocialid");
            return (Criteria) this;
        }

        public Criteria andFsocialidGreaterThan(String value) {
            addCriterion("fsocialid >", value, "fsocialid");
            return (Criteria) this;
        }

        public Criteria andFsocialidGreaterThanOrEqualTo(String value) {
            addCriterion("fsocialid >=", value, "fsocialid");
            return (Criteria) this;
        }

        public Criteria andFsocialidLessThan(String value) {
            addCriterion("fsocialid <", value, "fsocialid");
            return (Criteria) this;
        }

        public Criteria andFsocialidLessThanOrEqualTo(String value) {
            addCriterion("fsocialid <=", value, "fsocialid");
            return (Criteria) this;
        }

        public Criteria andFsocialidLike(String value) {
            addCriterion("fsocialid like", value, "fsocialid");
            return (Criteria) this;
        }

        public Criteria andFsocialidNotLike(String value) {
            addCriterion("fsocialid not like", value, "fsocialid");
            return (Criteria) this;
        }

        public Criteria andFsocialidIn(List<String> values) {
            addCriterion("fsocialid in", values, "fsocialid");
            return (Criteria) this;
        }

        public Criteria andFsocialidNotIn(List<String> values) {
            addCriterion("fsocialid not in", values, "fsocialid");
            return (Criteria) this;
        }

        public Criteria andFsocialidBetween(String value1, String value2) {
            addCriterion("fsocialid between", value1, value2, "fsocialid");
            return (Criteria) this;
        }

        public Criteria andFsocialidNotBetween(String value1, String value2) {
            addCriterion("fsocialid not between", value1, value2, "fsocialid");
            return (Criteria) this;
        }

        public Criteria andFenableuseridIsNull() {
            addCriterion("fenableuserid is null");
            return (Criteria) this;
        }

        public Criteria andFenableuseridIsNotNull() {
            addCriterion("fenableuserid is not null");
            return (Criteria) this;
        }

        public Criteria andFenableuseridEqualTo(Integer value) {
            addCriterion("fenableuserid =", value, "fenableuserid");
            return (Criteria) this;
        }

        public Criteria andFenableuseridNotEqualTo(Integer value) {
            addCriterion("fenableuserid <>", value, "fenableuserid");
            return (Criteria) this;
        }

        public Criteria andFenableuseridGreaterThan(Integer value) {
            addCriterion("fenableuserid >", value, "fenableuserid");
            return (Criteria) this;
        }

        public Criteria andFenableuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fenableuserid >=", value, "fenableuserid");
            return (Criteria) this;
        }

        public Criteria andFenableuseridLessThan(Integer value) {
            addCriterion("fenableuserid <", value, "fenableuserid");
            return (Criteria) this;
        }

        public Criteria andFenableuseridLessThanOrEqualTo(Integer value) {
            addCriterion("fenableuserid <=", value, "fenableuserid");
            return (Criteria) this;
        }

        public Criteria andFenableuseridIn(List<Integer> values) {
            addCriterion("fenableuserid in", values, "fenableuserid");
            return (Criteria) this;
        }

        public Criteria andFenableuseridNotIn(List<Integer> values) {
            addCriterion("fenableuserid not in", values, "fenableuserid");
            return (Criteria) this;
        }

        public Criteria andFenableuseridBetween(Integer value1, Integer value2) {
            addCriterion("fenableuserid between", value1, value2, "fenableuserid");
            return (Criteria) this;
        }

        public Criteria andFenableuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("fenableuserid not between", value1, value2, "fenableuserid");
            return (Criteria) this;
        }

        public Criteria andFenabletimeIsNull() {
            addCriterion("fenabletime is null");
            return (Criteria) this;
        }

        public Criteria andFenabletimeIsNotNull() {
            addCriterion("fenabletime is not null");
            return (Criteria) this;
        }

        public Criteria andFenabletimeEqualTo(Date value) {
            addCriterion("fenabletime =", value, "fenabletime");
            return (Criteria) this;
        }

        public Criteria andFenabletimeNotEqualTo(Date value) {
            addCriterion("fenabletime <>", value, "fenabletime");
            return (Criteria) this;
        }

        public Criteria andFenabletimeGreaterThan(Date value) {
            addCriterion("fenabletime >", value, "fenabletime");
            return (Criteria) this;
        }

        public Criteria andFenabletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fenabletime >=", value, "fenabletime");
            return (Criteria) this;
        }

        public Criteria andFenabletimeLessThan(Date value) {
            addCriterion("fenabletime <", value, "fenabletime");
            return (Criteria) this;
        }

        public Criteria andFenabletimeLessThanOrEqualTo(Date value) {
            addCriterion("fenabletime <=", value, "fenabletime");
            return (Criteria) this;
        }

        public Criteria andFenabletimeIn(List<Date> values) {
            addCriterion("fenabletime in", values, "fenabletime");
            return (Criteria) this;
        }

        public Criteria andFenabletimeNotIn(List<Date> values) {
            addCriterion("fenabletime not in", values, "fenabletime");
            return (Criteria) this;
        }

        public Criteria andFenabletimeBetween(Date value1, Date value2) {
            addCriterion("fenabletime between", value1, value2, "fenabletime");
            return (Criteria) this;
        }

        public Criteria andFenabletimeNotBetween(Date value1, Date value2) {
            addCriterion("fenabletime not between", value1, value2, "fenabletime");
            return (Criteria) this;
        }

        public Criteria andFdisableuseridIsNull() {
            addCriterion("fdisableuserid is null");
            return (Criteria) this;
        }

        public Criteria andFdisableuseridIsNotNull() {
            addCriterion("fdisableuserid is not null");
            return (Criteria) this;
        }

        public Criteria andFdisableuseridEqualTo(Integer value) {
            addCriterion("fdisableuserid =", value, "fdisableuserid");
            return (Criteria) this;
        }

        public Criteria andFdisableuseridNotEqualTo(Integer value) {
            addCriterion("fdisableuserid <>", value, "fdisableuserid");
            return (Criteria) this;
        }

        public Criteria andFdisableuseridGreaterThan(Integer value) {
            addCriterion("fdisableuserid >", value, "fdisableuserid");
            return (Criteria) this;
        }

        public Criteria andFdisableuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fdisableuserid >=", value, "fdisableuserid");
            return (Criteria) this;
        }

        public Criteria andFdisableuseridLessThan(Integer value) {
            addCriterion("fdisableuserid <", value, "fdisableuserid");
            return (Criteria) this;
        }

        public Criteria andFdisableuseridLessThanOrEqualTo(Integer value) {
            addCriterion("fdisableuserid <=", value, "fdisableuserid");
            return (Criteria) this;
        }

        public Criteria andFdisableuseridIn(List<Integer> values) {
            addCriterion("fdisableuserid in", values, "fdisableuserid");
            return (Criteria) this;
        }

        public Criteria andFdisableuseridNotIn(List<Integer> values) {
            addCriterion("fdisableuserid not in", values, "fdisableuserid");
            return (Criteria) this;
        }

        public Criteria andFdisableuseridBetween(Integer value1, Integer value2) {
            addCriterion("fdisableuserid between", value1, value2, "fdisableuserid");
            return (Criteria) this;
        }

        public Criteria andFdisableuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("fdisableuserid not between", value1, value2, "fdisableuserid");
            return (Criteria) this;
        }

        public Criteria andFdisabletimeIsNull() {
            addCriterion("fdisabletime is null");
            return (Criteria) this;
        }

        public Criteria andFdisabletimeIsNotNull() {
            addCriterion("fdisabletime is not null");
            return (Criteria) this;
        }

        public Criteria andFdisabletimeEqualTo(Date value) {
            addCriterion("fdisabletime =", value, "fdisabletime");
            return (Criteria) this;
        }

        public Criteria andFdisabletimeNotEqualTo(Date value) {
            addCriterion("fdisabletime <>", value, "fdisabletime");
            return (Criteria) this;
        }

        public Criteria andFdisabletimeGreaterThan(Date value) {
            addCriterion("fdisabletime >", value, "fdisabletime");
            return (Criteria) this;
        }

        public Criteria andFdisabletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fdisabletime >=", value, "fdisabletime");
            return (Criteria) this;
        }

        public Criteria andFdisabletimeLessThan(Date value) {
            addCriterion("fdisabletime <", value, "fdisabletime");
            return (Criteria) this;
        }

        public Criteria andFdisabletimeLessThanOrEqualTo(Date value) {
            addCriterion("fdisabletime <=", value, "fdisabletime");
            return (Criteria) this;
        }

        public Criteria andFdisabletimeIn(List<Date> values) {
            addCriterion("fdisabletime in", values, "fdisabletime");
            return (Criteria) this;
        }

        public Criteria andFdisabletimeNotIn(List<Date> values) {
            addCriterion("fdisabletime not in", values, "fdisabletime");
            return (Criteria) this;
        }

        public Criteria andFdisabletimeBetween(Date value1, Date value2) {
            addCriterion("fdisabletime between", value1, value2, "fdisabletime");
            return (Criteria) this;
        }

        public Criteria andFdisabletimeNotBetween(Date value1, Date value2) {
            addCriterion("fdisabletime not between", value1, value2, "fdisabletime");
            return (Criteria) this;
        }

        public Criteria andFappgroupIsNull() {
            addCriterion("fappgroup is null");
            return (Criteria) this;
        }

        public Criteria andFappgroupIsNotNull() {
            addCriterion("fappgroup is not null");
            return (Criteria) this;
        }

        public Criteria andFappgroupEqualTo(String value) {
            addCriterion("fappgroup =", value, "fappgroup");
            return (Criteria) this;
        }

        public Criteria andFappgroupNotEqualTo(String value) {
            addCriterion("fappgroup <>", value, "fappgroup");
            return (Criteria) this;
        }

        public Criteria andFappgroupGreaterThan(String value) {
            addCriterion("fappgroup >", value, "fappgroup");
            return (Criteria) this;
        }

        public Criteria andFappgroupGreaterThanOrEqualTo(String value) {
            addCriterion("fappgroup >=", value, "fappgroup");
            return (Criteria) this;
        }

        public Criteria andFappgroupLessThan(String value) {
            addCriterion("fappgroup <", value, "fappgroup");
            return (Criteria) this;
        }

        public Criteria andFappgroupLessThanOrEqualTo(String value) {
            addCriterion("fappgroup <=", value, "fappgroup");
            return (Criteria) this;
        }

        public Criteria andFappgroupLike(String value) {
            addCriterion("fappgroup like", value, "fappgroup");
            return (Criteria) this;
        }

        public Criteria andFappgroupNotLike(String value) {
            addCriterion("fappgroup not like", value, "fappgroup");
            return (Criteria) this;
        }

        public Criteria andFappgroupIn(List<String> values) {
            addCriterion("fappgroup in", values, "fappgroup");
            return (Criteria) this;
        }

        public Criteria andFappgroupNotIn(List<String> values) {
            addCriterion("fappgroup not in", values, "fappgroup");
            return (Criteria) this;
        }

        public Criteria andFappgroupBetween(String value1, String value2) {
            addCriterion("fappgroup between", value1, value2, "fappgroup");
            return (Criteria) this;
        }

        public Criteria andFappgroupNotBetween(String value1, String value2) {
            addCriterion("fappgroup not between", value1, value2, "fappgroup");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidIsNull() {
            addCriterion("fkdpassportid is null");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidIsNotNull() {
            addCriterion("fkdpassportid is not null");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidEqualTo(String value) {
            addCriterion("fkdpassportid =", value, "fkdpassportid");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidNotEqualTo(String value) {
            addCriterion("fkdpassportid <>", value, "fkdpassportid");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidGreaterThan(String value) {
            addCriterion("fkdpassportid >", value, "fkdpassportid");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidGreaterThanOrEqualTo(String value) {
            addCriterion("fkdpassportid >=", value, "fkdpassportid");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidLessThan(String value) {
            addCriterion("fkdpassportid <", value, "fkdpassportid");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidLessThanOrEqualTo(String value) {
            addCriterion("fkdpassportid <=", value, "fkdpassportid");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidLike(String value) {
            addCriterion("fkdpassportid like", value, "fkdpassportid");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidNotLike(String value) {
            addCriterion("fkdpassportid not like", value, "fkdpassportid");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidIn(List<String> values) {
            addCriterion("fkdpassportid in", values, "fkdpassportid");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidNotIn(List<String> values) {
            addCriterion("fkdpassportid not in", values, "fkdpassportid");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidBetween(String value1, String value2) {
            addCriterion("fkdpassportid between", value1, value2, "fkdpassportid");
            return (Criteria) this;
        }

        public Criteria andFkdpassportidNotBetween(String value1, String value2) {
            addCriterion("fkdpassportid not between", value1, value2, "fkdpassportid");
            return (Criteria) this;
        }

        public Criteria andFsexIsNull() {
            addCriterion("fsex is null");
            return (Criteria) this;
        }

        public Criteria andFsexIsNotNull() {
            addCriterion("fsex is not null");
            return (Criteria) this;
        }

        public Criteria andFsexEqualTo(String value) {
            addCriterion("fsex =", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotEqualTo(String value) {
            addCriterion("fsex <>", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexGreaterThan(String value) {
            addCriterion("fsex >", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexGreaterThanOrEqualTo(String value) {
            addCriterion("fsex >=", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexLessThan(String value) {
            addCriterion("fsex <", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexLessThanOrEqualTo(String value) {
            addCriterion("fsex <=", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexLike(String value) {
            addCriterion("fsex like", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotLike(String value) {
            addCriterion("fsex not like", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexIn(List<String> values) {
            addCriterion("fsex in", values, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotIn(List<String> values) {
            addCriterion("fsex not in", values, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexBetween(String value1, String value2) {
            addCriterion("fsex between", value1, value2, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotBetween(String value1, String value2) {
            addCriterion("fsex not between", value1, value2, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsignetpathIsNull() {
            addCriterion("fsignetpath is null");
            return (Criteria) this;
        }

        public Criteria andFsignetpathIsNotNull() {
            addCriterion("fsignetpath is not null");
            return (Criteria) this;
        }

        public Criteria andFsignetpathEqualTo(String value) {
            addCriterion("fsignetpath =", value, "fsignetpath");
            return (Criteria) this;
        }

        public Criteria andFsignetpathNotEqualTo(String value) {
            addCriterion("fsignetpath <>", value, "fsignetpath");
            return (Criteria) this;
        }

        public Criteria andFsignetpathGreaterThan(String value) {
            addCriterion("fsignetpath >", value, "fsignetpath");
            return (Criteria) this;
        }

        public Criteria andFsignetpathGreaterThanOrEqualTo(String value) {
            addCriterion("fsignetpath >=", value, "fsignetpath");
            return (Criteria) this;
        }

        public Criteria andFsignetpathLessThan(String value) {
            addCriterion("fsignetpath <", value, "fsignetpath");
            return (Criteria) this;
        }

        public Criteria andFsignetpathLessThanOrEqualTo(String value) {
            addCriterion("fsignetpath <=", value, "fsignetpath");
            return (Criteria) this;
        }

        public Criteria andFsignetpathLike(String value) {
            addCriterion("fsignetpath like", value, "fsignetpath");
            return (Criteria) this;
        }

        public Criteria andFsignetpathNotLike(String value) {
            addCriterion("fsignetpath not like", value, "fsignetpath");
            return (Criteria) this;
        }

        public Criteria andFsignetpathIn(List<String> values) {
            addCriterion("fsignetpath in", values, "fsignetpath");
            return (Criteria) this;
        }

        public Criteria andFsignetpathNotIn(List<String> values) {
            addCriterion("fsignetpath not in", values, "fsignetpath");
            return (Criteria) this;
        }

        public Criteria andFsignetpathBetween(String value1, String value2) {
            addCriterion("fsignetpath between", value1, value2, "fsignetpath");
            return (Criteria) this;
        }

        public Criteria andFsignetpathNotBetween(String value1, String value2) {
            addCriterion("fsignetpath not between", value1, value2, "fsignetpath");
            return (Criteria) this;
        }

        public Criteria andFfaceuidIsNull() {
            addCriterion("ffaceuid is null");
            return (Criteria) this;
        }

        public Criteria andFfaceuidIsNotNull() {
            addCriterion("ffaceuid is not null");
            return (Criteria) this;
        }

        public Criteria andFfaceuidEqualTo(String value) {
            addCriterion("ffaceuid =", value, "ffaceuid");
            return (Criteria) this;
        }

        public Criteria andFfaceuidNotEqualTo(String value) {
            addCriterion("ffaceuid <>", value, "ffaceuid");
            return (Criteria) this;
        }

        public Criteria andFfaceuidGreaterThan(String value) {
            addCriterion("ffaceuid >", value, "ffaceuid");
            return (Criteria) this;
        }

        public Criteria andFfaceuidGreaterThanOrEqualTo(String value) {
            addCriterion("ffaceuid >=", value, "ffaceuid");
            return (Criteria) this;
        }

        public Criteria andFfaceuidLessThan(String value) {
            addCriterion("ffaceuid <", value, "ffaceuid");
            return (Criteria) this;
        }

        public Criteria andFfaceuidLessThanOrEqualTo(String value) {
            addCriterion("ffaceuid <=", value, "ffaceuid");
            return (Criteria) this;
        }

        public Criteria andFfaceuidLike(String value) {
            addCriterion("ffaceuid like", value, "ffaceuid");
            return (Criteria) this;
        }

        public Criteria andFfaceuidNotLike(String value) {
            addCriterion("ffaceuid not like", value, "ffaceuid");
            return (Criteria) this;
        }

        public Criteria andFfaceuidIn(List<String> values) {
            addCriterion("ffaceuid in", values, "ffaceuid");
            return (Criteria) this;
        }

        public Criteria andFfaceuidNotIn(List<String> values) {
            addCriterion("ffaceuid not in", values, "ffaceuid");
            return (Criteria) this;
        }

        public Criteria andFfaceuidBetween(String value1, String value2) {
            addCriterion("ffaceuid between", value1, value2, "ffaceuid");
            return (Criteria) this;
        }

        public Criteria andFfaceuidNotBetween(String value1, String value2) {
            addCriterion("ffaceuid not between", value1, value2, "ffaceuid");
            return (Criteria) this;
        }

        public Criteria andFislockterminalIsNull() {
            addCriterion("fislockterminal is null");
            return (Criteria) this;
        }

        public Criteria andFislockterminalIsNotNull() {
            addCriterion("fislockterminal is not null");
            return (Criteria) this;
        }

        public Criteria andFislockterminalEqualTo(String value) {
            addCriterion("fislockterminal =", value, "fislockterminal");
            return (Criteria) this;
        }

        public Criteria andFislockterminalNotEqualTo(String value) {
            addCriterion("fislockterminal <>", value, "fislockterminal");
            return (Criteria) this;
        }

        public Criteria andFislockterminalGreaterThan(String value) {
            addCriterion("fislockterminal >", value, "fislockterminal");
            return (Criteria) this;
        }

        public Criteria andFislockterminalGreaterThanOrEqualTo(String value) {
            addCriterion("fislockterminal >=", value, "fislockterminal");
            return (Criteria) this;
        }

        public Criteria andFislockterminalLessThan(String value) {
            addCriterion("fislockterminal <", value, "fislockterminal");
            return (Criteria) this;
        }

        public Criteria andFislockterminalLessThanOrEqualTo(String value) {
            addCriterion("fislockterminal <=", value, "fislockterminal");
            return (Criteria) this;
        }

        public Criteria andFislockterminalLike(String value) {
            addCriterion("fislockterminal like", value, "fislockterminal");
            return (Criteria) this;
        }

        public Criteria andFislockterminalNotLike(String value) {
            addCriterion("fislockterminal not like", value, "fislockterminal");
            return (Criteria) this;
        }

        public Criteria andFislockterminalIn(List<String> values) {
            addCriterion("fislockterminal in", values, "fislockterminal");
            return (Criteria) this;
        }

        public Criteria andFislockterminalNotIn(List<String> values) {
            addCriterion("fislockterminal not in", values, "fislockterminal");
            return (Criteria) this;
        }

        public Criteria andFislockterminalBetween(String value1, String value2) {
            addCriterion("fislockterminal between", value1, value2, "fislockterminal");
            return (Criteria) this;
        }

        public Criteria andFislockterminalNotBetween(String value1, String value2) {
            addCriterion("fislockterminal not between", value1, value2, "fislockterminal");
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