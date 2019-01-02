package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTFieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTFieldExample() {
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

        public Criteria andFBipUseridIsNull() {
            addCriterion("f_bip_userid is null");
            return (Criteria) this;
        }

        public Criteria andFBipUseridIsNotNull() {
            addCriterion("f_bip_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFBipUseridEqualTo(String value) {
            addCriterion("f_bip_userid =", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridNotEqualTo(String value) {
            addCriterion("f_bip_userid <>", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridGreaterThan(String value) {
            addCriterion("f_bip_userid >", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_userid >=", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridLessThan(String value) {
            addCriterion("f_bip_userid <", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridLessThanOrEqualTo(String value) {
            addCriterion("f_bip_userid <=", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridLike(String value) {
            addCriterion("f_bip_userid like", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridNotLike(String value) {
            addCriterion("f_bip_userid not like", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridIn(List<String> values) {
            addCriterion("f_bip_userid in", values, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridNotIn(List<String> values) {
            addCriterion("f_bip_userid not in", values, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridBetween(String value1, String value2) {
            addCriterion("f_bip_userid between", value1, value2, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridNotBetween(String value1, String value2) {
            addCriterion("f_bip_userid not between", value1, value2, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventIsNull() {
            addCriterion("f_bip_detailsevent is null");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventIsNotNull() {
            addCriterion("f_bip_detailsevent is not null");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventEqualTo(String value) {
            addCriterion("f_bip_detailsevent =", value, "fBipDetailsevent");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventNotEqualTo(String value) {
            addCriterion("f_bip_detailsevent <>", value, "fBipDetailsevent");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventGreaterThan(String value) {
            addCriterion("f_bip_detailsevent >", value, "fBipDetailsevent");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_detailsevent >=", value, "fBipDetailsevent");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventLessThan(String value) {
            addCriterion("f_bip_detailsevent <", value, "fBipDetailsevent");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventLessThanOrEqualTo(String value) {
            addCriterion("f_bip_detailsevent <=", value, "fBipDetailsevent");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventLike(String value) {
            addCriterion("f_bip_detailsevent like", value, "fBipDetailsevent");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventNotLike(String value) {
            addCriterion("f_bip_detailsevent not like", value, "fBipDetailsevent");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventIn(List<String> values) {
            addCriterion("f_bip_detailsevent in", values, "fBipDetailsevent");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventNotIn(List<String> values) {
            addCriterion("f_bip_detailsevent not in", values, "fBipDetailsevent");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventBetween(String value1, String value2) {
            addCriterion("f_bip_detailsevent between", value1, value2, "fBipDetailsevent");
            return (Criteria) this;
        }

        public Criteria andFBipDetailseventNotBetween(String value1, String value2) {
            addCriterion("f_bip_detailsevent not between", value1, value2, "fBipDetailsevent");
            return (Criteria) this;
        }

        public Criteria andFBipImageIsNull() {
            addCriterion("f_bip_image is null");
            return (Criteria) this;
        }

        public Criteria andFBipImageIsNotNull() {
            addCriterion("f_bip_image is not null");
            return (Criteria) this;
        }

        public Criteria andFBipImageEqualTo(String value) {
            addCriterion("f_bip_image =", value, "fBipImage");
            return (Criteria) this;
        }

        public Criteria andFBipImageNotEqualTo(String value) {
            addCriterion("f_bip_image <>", value, "fBipImage");
            return (Criteria) this;
        }

        public Criteria andFBipImageGreaterThan(String value) {
            addCriterion("f_bip_image >", value, "fBipImage");
            return (Criteria) this;
        }

        public Criteria andFBipImageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_image >=", value, "fBipImage");
            return (Criteria) this;
        }

        public Criteria andFBipImageLessThan(String value) {
            addCriterion("f_bip_image <", value, "fBipImage");
            return (Criteria) this;
        }

        public Criteria andFBipImageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_image <=", value, "fBipImage");
            return (Criteria) this;
        }

        public Criteria andFBipImageLike(String value) {
            addCriterion("f_bip_image like", value, "fBipImage");
            return (Criteria) this;
        }

        public Criteria andFBipImageNotLike(String value) {
            addCriterion("f_bip_image not like", value, "fBipImage");
            return (Criteria) this;
        }

        public Criteria andFBipImageIn(List<String> values) {
            addCriterion("f_bip_image in", values, "fBipImage");
            return (Criteria) this;
        }

        public Criteria andFBipImageNotIn(List<String> values) {
            addCriterion("f_bip_image not in", values, "fBipImage");
            return (Criteria) this;
        }

        public Criteria andFBipImageBetween(String value1, String value2) {
            addCriterion("f_bip_image between", value1, value2, "fBipImage");
            return (Criteria) this;
        }

        public Criteria andFBipImageNotBetween(String value1, String value2) {
            addCriterion("f_bip_image not between", value1, value2, "fBipImage");
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

        public Criteria andFBipAddressIsNull() {
            addCriterion("f_bip_address is null");
            return (Criteria) this;
        }

        public Criteria andFBipAddressIsNotNull() {
            addCriterion("f_bip_address is not null");
            return (Criteria) this;
        }

        public Criteria andFBipAddressEqualTo(String value) {
            addCriterion("f_bip_address =", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressNotEqualTo(String value) {
            addCriterion("f_bip_address <>", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressGreaterThan(String value) {
            addCriterion("f_bip_address >", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_address >=", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressLessThan(String value) {
            addCriterion("f_bip_address <", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressLessThanOrEqualTo(String value) {
            addCriterion("f_bip_address <=", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressLike(String value) {
            addCriterion("f_bip_address like", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressNotLike(String value) {
            addCriterion("f_bip_address not like", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressIn(List<String> values) {
            addCriterion("f_bip_address in", values, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressNotIn(List<String> values) {
            addCriterion("f_bip_address not in", values, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressBetween(String value1, String value2) {
            addCriterion("f_bip_address between", value1, value2, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressNotBetween(String value1, String value2) {
            addCriterion("f_bip_address not between", value1, value2, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterIsNull() {
            addCriterion("f_bip_register is null");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterIsNotNull() {
            addCriterion("f_bip_register is not null");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterEqualTo(String value) {
            addCriterion("f_bip_register =", value, "fBipRegister");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterNotEqualTo(String value) {
            addCriterion("f_bip_register <>", value, "fBipRegister");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterGreaterThan(String value) {
            addCriterion("f_bip_register >", value, "fBipRegister");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_register >=", value, "fBipRegister");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterLessThan(String value) {
            addCriterion("f_bip_register <", value, "fBipRegister");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterLessThanOrEqualTo(String value) {
            addCriterion("f_bip_register <=", value, "fBipRegister");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterLike(String value) {
            addCriterion("f_bip_register like", value, "fBipRegister");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterNotLike(String value) {
            addCriterion("f_bip_register not like", value, "fBipRegister");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterIn(List<String> values) {
            addCriterion("f_bip_register in", values, "fBipRegister");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterNotIn(List<String> values) {
            addCriterion("f_bip_register not in", values, "fBipRegister");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterBetween(String value1, String value2) {
            addCriterion("f_bip_register between", value1, value2, "fBipRegister");
            return (Criteria) this;
        }

        public Criteria andFBipRegisterNotBetween(String value1, String value2) {
            addCriterion("f_bip_register not between", value1, value2, "fBipRegister");
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

        public Criteria andFBipBaseIsNull() {
            addCriterion("f_bip_base is null");
            return (Criteria) this;
        }

        public Criteria andFBipBaseIsNotNull() {
            addCriterion("f_bip_base is not null");
            return (Criteria) this;
        }

        public Criteria andFBipBaseEqualTo(Integer value) {
            addCriterion("f_bip_base =", value, "fBipBase");
            return (Criteria) this;
        }

        public Criteria andFBipBaseNotEqualTo(Integer value) {
            addCriterion("f_bip_base <>", value, "fBipBase");
            return (Criteria) this;
        }

        public Criteria andFBipBaseGreaterThan(Integer value) {
            addCriterion("f_bip_base >", value, "fBipBase");
            return (Criteria) this;
        }

        public Criteria andFBipBaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_base >=", value, "fBipBase");
            return (Criteria) this;
        }

        public Criteria andFBipBaseLessThan(Integer value) {
            addCriterion("f_bip_base <", value, "fBipBase");
            return (Criteria) this;
        }

        public Criteria andFBipBaseLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_base <=", value, "fBipBase");
            return (Criteria) this;
        }

        public Criteria andFBipBaseIn(List<Integer> values) {
            addCriterion("f_bip_base in", values, "fBipBase");
            return (Criteria) this;
        }

        public Criteria andFBipBaseNotIn(List<Integer> values) {
            addCriterion("f_bip_base not in", values, "fBipBase");
            return (Criteria) this;
        }

        public Criteria andFBipBaseBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_base between", value1, value2, "fBipBase");
            return (Criteria) this;
        }

        public Criteria andFBipBaseNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_base not between", value1, value2, "fBipBase");
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

        public Criteria andFBipCreatoropenidIsNull() {
            addCriterion("f_bip_creatoropenid is null");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidIsNotNull() {
            addCriterion("f_bip_creatoropenid is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidEqualTo(String value) {
            addCriterion("f_bip_creatoropenid =", value, "fBipCreatoropenid");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidNotEqualTo(String value) {
            addCriterion("f_bip_creatoropenid <>", value, "fBipCreatoropenid");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidGreaterThan(String value) {
            addCriterion("f_bip_creatoropenid >", value, "fBipCreatoropenid");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_creatoropenid >=", value, "fBipCreatoropenid");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidLessThan(String value) {
            addCriterion("f_bip_creatoropenid <", value, "fBipCreatoropenid");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidLessThanOrEqualTo(String value) {
            addCriterion("f_bip_creatoropenid <=", value, "fBipCreatoropenid");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidLike(String value) {
            addCriterion("f_bip_creatoropenid like", value, "fBipCreatoropenid");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidNotLike(String value) {
            addCriterion("f_bip_creatoropenid not like", value, "fBipCreatoropenid");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidIn(List<String> values) {
            addCriterion("f_bip_creatoropenid in", values, "fBipCreatoropenid");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidNotIn(List<String> values) {
            addCriterion("f_bip_creatoropenid not in", values, "fBipCreatoropenid");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidBetween(String value1, String value2) {
            addCriterion("f_bip_creatoropenid between", value1, value2, "fBipCreatoropenid");
            return (Criteria) this;
        }

        public Criteria andFBipCreatoropenidNotBetween(String value1, String value2) {
            addCriterion("f_bip_creatoropenid not between", value1, value2, "fBipCreatoropenid");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerIsNull() {
            addCriterion("f_bip_integer is null");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerIsNotNull() {
            addCriterion("f_bip_integer is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerEqualTo(Integer value) {
            addCriterion("f_bip_integer =", value, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerNotEqualTo(Integer value) {
            addCriterion("f_bip_integer <>", value, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerGreaterThan(Integer value) {
            addCriterion("f_bip_integer >", value, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_integer >=", value, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerLessThan(Integer value) {
            addCriterion("f_bip_integer <", value, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_integer <=", value, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerIn(List<Integer> values) {
            addCriterion("f_bip_integer in", values, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerNotIn(List<Integer> values) {
            addCriterion("f_bip_integer not in", values, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_integer between", value1, value2, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_integer not between", value1, value2, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFbillstatusIsNull() {
            addCriterion("fbillstatus is null");
            return (Criteria) this;
        }

        public Criteria andFbillstatusIsNotNull() {
            addCriterion("fbillstatus is not null");
            return (Criteria) this;
        }

        public Criteria andFbillstatusEqualTo(String value) {
            addCriterion("fbillstatus =", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusNotEqualTo(String value) {
            addCriterion("fbillstatus <>", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusGreaterThan(String value) {
            addCriterion("fbillstatus >", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusGreaterThanOrEqualTo(String value) {
            addCriterion("fbillstatus >=", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusLessThan(String value) {
            addCriterion("fbillstatus <", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusLessThanOrEqualTo(String value) {
            addCriterion("fbillstatus <=", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusLike(String value) {
            addCriterion("fbillstatus like", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusNotLike(String value) {
            addCriterion("fbillstatus not like", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusIn(List<String> values) {
            addCriterion("fbillstatus in", values, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusNotIn(List<String> values) {
            addCriterion("fbillstatus not in", values, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusBetween(String value1, String value2) {
            addCriterion("fbillstatus between", value1, value2, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusNotBetween(String value1, String value2) {
            addCriterion("fbillstatus not between", value1, value2, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionnumIsNull() {
            addCriterion("f_bip_petitionnum is null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionnumIsNotNull() {
            addCriterion("f_bip_petitionnum is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionnumEqualTo(Integer value) {
            addCriterion("f_bip_petitionnum =", value, "fBipPetitionnum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionnumNotEqualTo(Integer value) {
            addCriterion("f_bip_petitionnum <>", value, "fBipPetitionnum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionnumGreaterThan(Integer value) {
            addCriterion("f_bip_petitionnum >", value, "fBipPetitionnum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_petitionnum >=", value, "fBipPetitionnum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionnumLessThan(Integer value) {
            addCriterion("f_bip_petitionnum <", value, "fBipPetitionnum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionnumLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_petitionnum <=", value, "fBipPetitionnum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionnumIn(List<Integer> values) {
            addCriterion("f_bip_petitionnum in", values, "fBipPetitionnum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionnumNotIn(List<Integer> values) {
            addCriterion("f_bip_petitionnum not in", values, "fBipPetitionnum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionnumBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_petitionnum between", value1, value2, "fBipPetitionnum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionnumNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_petitionnum not between", value1, value2, "fBipPetitionnum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeIsNull() {
            addCriterion("f_bip_petitiontype is null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeIsNotNull() {
            addCriterion("f_bip_petitiontype is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeEqualTo(Integer value) {
            addCriterion("f_bip_petitiontype =", value, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeNotEqualTo(Integer value) {
            addCriterion("f_bip_petitiontype <>", value, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeGreaterThan(Integer value) {
            addCriterion("f_bip_petitiontype >", value, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_petitiontype >=", value, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeLessThan(Integer value) {
            addCriterion("f_bip_petitiontype <", value, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_petitiontype <=", value, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeIn(List<Integer> values) {
            addCriterion("f_bip_petitiontype in", values, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeNotIn(List<Integer> values) {
            addCriterion("f_bip_petitiontype not in", values, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_petitiontype between", value1, value2, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_petitiontype not between", value1, value2, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameIsNull() {
            addCriterion("f_bip_createpersonname is null");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameIsNotNull() {
            addCriterion("f_bip_createpersonname is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameEqualTo(String value) {
            addCriterion("f_bip_createpersonname =", value, "fBipCreatepersonname");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameNotEqualTo(String value) {
            addCriterion("f_bip_createpersonname <>", value, "fBipCreatepersonname");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameGreaterThan(String value) {
            addCriterion("f_bip_createpersonname >", value, "fBipCreatepersonname");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_createpersonname >=", value, "fBipCreatepersonname");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameLessThan(String value) {
            addCriterion("f_bip_createpersonname <", value, "fBipCreatepersonname");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameLessThanOrEqualTo(String value) {
            addCriterion("f_bip_createpersonname <=", value, "fBipCreatepersonname");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameLike(String value) {
            addCriterion("f_bip_createpersonname like", value, "fBipCreatepersonname");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameNotLike(String value) {
            addCriterion("f_bip_createpersonname not like", value, "fBipCreatepersonname");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameIn(List<String> values) {
            addCriterion("f_bip_createpersonname in", values, "fBipCreatepersonname");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameNotIn(List<String> values) {
            addCriterion("f_bip_createpersonname not in", values, "fBipCreatepersonname");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameBetween(String value1, String value2) {
            addCriterion("f_bip_createpersonname between", value1, value2, "fBipCreatepersonname");
            return (Criteria) this;
        }

        public Criteria andFBipCreatepersonnameNotBetween(String value1, String value2) {
            addCriterion("f_bip_createpersonname not between", value1, value2, "fBipCreatepersonname");
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

        public Criteria andFBipNativeplaceIsNull() {
            addCriterion("f_bip_nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceIsNotNull() {
            addCriterion("f_bip_nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceEqualTo(String value) {
            addCriterion("f_bip_nativeplace =", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceNotEqualTo(String value) {
            addCriterion("f_bip_nativeplace <>", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceGreaterThan(String value) {
            addCriterion("f_bip_nativeplace >", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_nativeplace >=", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceLessThan(String value) {
            addCriterion("f_bip_nativeplace <", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("f_bip_nativeplace <=", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceLike(String value) {
            addCriterion("f_bip_nativeplace like", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceNotLike(String value) {
            addCriterion("f_bip_nativeplace not like", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceIn(List<String> values) {
            addCriterion("f_bip_nativeplace in", values, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceNotIn(List<String> values) {
            addCriterion("f_bip_nativeplace not in", values, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceBetween(String value1, String value2) {
            addCriterion("f_bip_nativeplace between", value1, value2, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceNotBetween(String value1, String value2) {
            addCriterion("f_bip_nativeplace not between", value1, value2, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxIsNull() {
            addCriterion("f_bip_checkbox is null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxIsNotNull() {
            addCriterion("f_bip_checkbox is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxEqualTo(String value) {
            addCriterion("f_bip_checkbox =", value, "fBipCheckbox");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxNotEqualTo(String value) {
            addCriterion("f_bip_checkbox <>", value, "fBipCheckbox");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxGreaterThan(String value) {
            addCriterion("f_bip_checkbox >", value, "fBipCheckbox");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_checkbox >=", value, "fBipCheckbox");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxLessThan(String value) {
            addCriterion("f_bip_checkbox <", value, "fBipCheckbox");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxLessThanOrEqualTo(String value) {
            addCriterion("f_bip_checkbox <=", value, "fBipCheckbox");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxLike(String value) {
            addCriterion("f_bip_checkbox like", value, "fBipCheckbox");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxNotLike(String value) {
            addCriterion("f_bip_checkbox not like", value, "fBipCheckbox");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxIn(List<String> values) {
            addCriterion("f_bip_checkbox in", values, "fBipCheckbox");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxNotIn(List<String> values) {
            addCriterion("f_bip_checkbox not in", values, "fBipCheckbox");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxBetween(String value1, String value2) {
            addCriterion("f_bip_checkbox between", value1, value2, "fBipCheckbox");
            return (Criteria) this;
        }

        public Criteria andFBipCheckboxNotBetween(String value1, String value2) {
            addCriterion("f_bip_checkbox not between", value1, value2, "fBipCheckbox");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressIsNull() {
            addCriterion("f_bip_liveaddress is null");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressIsNotNull() {
            addCriterion("f_bip_liveaddress is not null");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressEqualTo(String value) {
            addCriterion("f_bip_liveaddress =", value, "fBipLiveaddress");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressNotEqualTo(String value) {
            addCriterion("f_bip_liveaddress <>", value, "fBipLiveaddress");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressGreaterThan(String value) {
            addCriterion("f_bip_liveaddress >", value, "fBipLiveaddress");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_liveaddress >=", value, "fBipLiveaddress");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressLessThan(String value) {
            addCriterion("f_bip_liveaddress <", value, "fBipLiveaddress");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressLessThanOrEqualTo(String value) {
            addCriterion("f_bip_liveaddress <=", value, "fBipLiveaddress");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressLike(String value) {
            addCriterion("f_bip_liveaddress like", value, "fBipLiveaddress");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressNotLike(String value) {
            addCriterion("f_bip_liveaddress not like", value, "fBipLiveaddress");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressIn(List<String> values) {
            addCriterion("f_bip_liveaddress in", values, "fBipLiveaddress");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressNotIn(List<String> values) {
            addCriterion("f_bip_liveaddress not in", values, "fBipLiveaddress");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressBetween(String value1, String value2) {
            addCriterion("f_bip_liveaddress between", value1, value2, "fBipLiveaddress");
            return (Criteria) this;
        }

        public Criteria andFBipLiveaddressNotBetween(String value1, String value2) {
            addCriterion("f_bip_liveaddress not between", value1, value2, "fBipLiveaddress");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageIsNull() {
            addCriterion("f_bip_idcardimage is null");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageIsNotNull() {
            addCriterion("f_bip_idcardimage is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageEqualTo(String value) {
            addCriterion("f_bip_idcardimage =", value, "fBipIdcardimage");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageNotEqualTo(String value) {
            addCriterion("f_bip_idcardimage <>", value, "fBipIdcardimage");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageGreaterThan(String value) {
            addCriterion("f_bip_idcardimage >", value, "fBipIdcardimage");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_idcardimage >=", value, "fBipIdcardimage");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageLessThan(String value) {
            addCriterion("f_bip_idcardimage <", value, "fBipIdcardimage");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_idcardimage <=", value, "fBipIdcardimage");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageLike(String value) {
            addCriterion("f_bip_idcardimage like", value, "fBipIdcardimage");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageNotLike(String value) {
            addCriterion("f_bip_idcardimage not like", value, "fBipIdcardimage");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageIn(List<String> values) {
            addCriterion("f_bip_idcardimage in", values, "fBipIdcardimage");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageNotIn(List<String> values) {
            addCriterion("f_bip_idcardimage not in", values, "fBipIdcardimage");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageBetween(String value1, String value2) {
            addCriterion("f_bip_idcardimage between", value1, value2, "fBipIdcardimage");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardimageNotBetween(String value1, String value2) {
            addCriterion("f_bip_idcardimage not between", value1, value2, "fBipIdcardimage");
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

        public Criteria andFBipPoliticaloutlookIsNull() {
            addCriterion("f_bip_politicaloutlook is null");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookIsNotNull() {
            addCriterion("f_bip_politicaloutlook is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookEqualTo(String value) {
            addCriterion("f_bip_politicaloutlook =", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookNotEqualTo(String value) {
            addCriterion("f_bip_politicaloutlook <>", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookGreaterThan(String value) {
            addCriterion("f_bip_politicaloutlook >", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_politicaloutlook >=", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookLessThan(String value) {
            addCriterion("f_bip_politicaloutlook <", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookLessThanOrEqualTo(String value) {
            addCriterion("f_bip_politicaloutlook <=", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookLike(String value) {
            addCriterion("f_bip_politicaloutlook like", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookNotLike(String value) {
            addCriterion("f_bip_politicaloutlook not like", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookIn(List<String> values) {
            addCriterion("f_bip_politicaloutlook in", values, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookNotIn(List<String> values) {
            addCriterion("f_bip_politicaloutlook not in", values, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookBetween(String value1, String value2) {
            addCriterion("f_bip_politicaloutlook between", value1, value2, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookNotBetween(String value1, String value2) {
            addCriterion("f_bip_politicaloutlook not between", value1, value2, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageIsNull() {
            addCriterion("f_bip_issendmessage is null");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageIsNotNull() {
            addCriterion("f_bip_issendmessage is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageEqualTo(String value) {
            addCriterion("f_bip_issendmessage =", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageNotEqualTo(String value) {
            addCriterion("f_bip_issendmessage <>", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageGreaterThan(String value) {
            addCriterion("f_bip_issendmessage >", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_issendmessage >=", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageLessThan(String value) {
            addCriterion("f_bip_issendmessage <", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_issendmessage <=", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageLike(String value) {
            addCriterion("f_bip_issendmessage like", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageNotLike(String value) {
            addCriterion("f_bip_issendmessage not like", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageIn(List<String> values) {
            addCriterion("f_bip_issendmessage in", values, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageNotIn(List<String> values) {
            addCriterion("f_bip_issendmessage not in", values, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageBetween(String value1, String value2) {
            addCriterion("f_bip_issendmessage between", value1, value2, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageNotBetween(String value1, String value2) {
            addCriterion("f_bip_issendmessage not between", value1, value2, "fBipIssendmessage");
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