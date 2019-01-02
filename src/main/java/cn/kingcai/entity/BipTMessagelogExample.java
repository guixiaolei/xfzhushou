package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTMessagelogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTMessagelogExample() {
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

        public Criteria andFformidIsNull() {
            addCriterion("fformid is null");
            return (Criteria) this;
        }

        public Criteria andFformidIsNotNull() {
            addCriterion("fformid is not null");
            return (Criteria) this;
        }

        public Criteria andFformidEqualTo(String value) {
            addCriterion("fformid =", value, "fformid");
            return (Criteria) this;
        }

        public Criteria andFformidNotEqualTo(String value) {
            addCriterion("fformid <>", value, "fformid");
            return (Criteria) this;
        }

        public Criteria andFformidGreaterThan(String value) {
            addCriterion("fformid >", value, "fformid");
            return (Criteria) this;
        }

        public Criteria andFformidGreaterThanOrEqualTo(String value) {
            addCriterion("fformid >=", value, "fformid");
            return (Criteria) this;
        }

        public Criteria andFformidLessThan(String value) {
            addCriterion("fformid <", value, "fformid");
            return (Criteria) this;
        }

        public Criteria andFformidLessThanOrEqualTo(String value) {
            addCriterion("fformid <=", value, "fformid");
            return (Criteria) this;
        }

        public Criteria andFformidLike(String value) {
            addCriterion("fformid like", value, "fformid");
            return (Criteria) this;
        }

        public Criteria andFformidNotLike(String value) {
            addCriterion("fformid not like", value, "fformid");
            return (Criteria) this;
        }

        public Criteria andFformidIn(List<String> values) {
            addCriterion("fformid in", values, "fformid");
            return (Criteria) this;
        }

        public Criteria andFformidNotIn(List<String> values) {
            addCriterion("fformid not in", values, "fformid");
            return (Criteria) this;
        }

        public Criteria andFformidBetween(String value1, String value2) {
            addCriterion("fformid between", value1, value2, "fformid");
            return (Criteria) this;
        }

        public Criteria andFformidNotBetween(String value1, String value2) {
            addCriterion("fformid not between", value1, value2, "fformid");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeIsNull() {
            addCriterion("f_bip_messagetype is null");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeIsNotNull() {
            addCriterion("f_bip_messagetype is not null");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeEqualTo(String value) {
            addCriterion("f_bip_messagetype =", value, "fBipMessagetype");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeNotEqualTo(String value) {
            addCriterion("f_bip_messagetype <>", value, "fBipMessagetype");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeGreaterThan(String value) {
            addCriterion("f_bip_messagetype >", value, "fBipMessagetype");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_messagetype >=", value, "fBipMessagetype");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeLessThan(String value) {
            addCriterion("f_bip_messagetype <", value, "fBipMessagetype");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeLessThanOrEqualTo(String value) {
            addCriterion("f_bip_messagetype <=", value, "fBipMessagetype");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeLike(String value) {
            addCriterion("f_bip_messagetype like", value, "fBipMessagetype");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeNotLike(String value) {
            addCriterion("f_bip_messagetype not like", value, "fBipMessagetype");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeIn(List<String> values) {
            addCriterion("f_bip_messagetype in", values, "fBipMessagetype");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeNotIn(List<String> values) {
            addCriterion("f_bip_messagetype not in", values, "fBipMessagetype");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeBetween(String value1, String value2) {
            addCriterion("f_bip_messagetype between", value1, value2, "fBipMessagetype");
            return (Criteria) this;
        }

        public Criteria andFBipMessagetypeNotBetween(String value1, String value2) {
            addCriterion("f_bip_messagetype not between", value1, value2, "fBipMessagetype");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitIsNull() {
            addCriterion("f_bip_affairsunit is null");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitIsNotNull() {
            addCriterion("f_bip_affairsunit is not null");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitEqualTo(String value) {
            addCriterion("f_bip_affairsunit =", value, "fBipAffairsunit");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitNotEqualTo(String value) {
            addCriterion("f_bip_affairsunit <>", value, "fBipAffairsunit");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitGreaterThan(String value) {
            addCriterion("f_bip_affairsunit >", value, "fBipAffairsunit");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_affairsunit >=", value, "fBipAffairsunit");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitLessThan(String value) {
            addCriterion("f_bip_affairsunit <", value, "fBipAffairsunit");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitLessThanOrEqualTo(String value) {
            addCriterion("f_bip_affairsunit <=", value, "fBipAffairsunit");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitLike(String value) {
            addCriterion("f_bip_affairsunit like", value, "fBipAffairsunit");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitNotLike(String value) {
            addCriterion("f_bip_affairsunit not like", value, "fBipAffairsunit");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitIn(List<String> values) {
            addCriterion("f_bip_affairsunit in", values, "fBipAffairsunit");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitNotIn(List<String> values) {
            addCriterion("f_bip_affairsunit not in", values, "fBipAffairsunit");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitBetween(String value1, String value2) {
            addCriterion("f_bip_affairsunit between", value1, value2, "fBipAffairsunit");
            return (Criteria) this;
        }

        public Criteria andFBipAffairsunitNotBetween(String value1, String value2) {
            addCriterion("f_bip_affairsunit not between", value1, value2, "fBipAffairsunit");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterIsNull() {
            addCriterion("f_bip_messagegeter is null");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterIsNotNull() {
            addCriterion("f_bip_messagegeter is not null");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterEqualTo(String value) {
            addCriterion("f_bip_messagegeter =", value, "fBipMessagegeter");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterNotEqualTo(String value) {
            addCriterion("f_bip_messagegeter <>", value, "fBipMessagegeter");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterGreaterThan(String value) {
            addCriterion("f_bip_messagegeter >", value, "fBipMessagegeter");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_messagegeter >=", value, "fBipMessagegeter");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterLessThan(String value) {
            addCriterion("f_bip_messagegeter <", value, "fBipMessagegeter");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterLessThanOrEqualTo(String value) {
            addCriterion("f_bip_messagegeter <=", value, "fBipMessagegeter");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterLike(String value) {
            addCriterion("f_bip_messagegeter like", value, "fBipMessagegeter");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterNotLike(String value) {
            addCriterion("f_bip_messagegeter not like", value, "fBipMessagegeter");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterIn(List<String> values) {
            addCriterion("f_bip_messagegeter in", values, "fBipMessagegeter");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterNotIn(List<String> values) {
            addCriterion("f_bip_messagegeter not in", values, "fBipMessagegeter");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterBetween(String value1, String value2) {
            addCriterion("f_bip_messagegeter between", value1, value2, "fBipMessagegeter");
            return (Criteria) this;
        }

        public Criteria andFBipMessagegeterNotBetween(String value1, String value2) {
            addCriterion("f_bip_messagegeter not between", value1, value2, "fBipMessagegeter");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessIsNull() {
            addCriterion("f_bip_issuccess is null");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessIsNotNull() {
            addCriterion("f_bip_issuccess is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessEqualTo(String value) {
            addCriterion("f_bip_issuccess =", value, "fBipIssuccess");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessNotEqualTo(String value) {
            addCriterion("f_bip_issuccess <>", value, "fBipIssuccess");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessGreaterThan(String value) {
            addCriterion("f_bip_issuccess >", value, "fBipIssuccess");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_issuccess >=", value, "fBipIssuccess");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessLessThan(String value) {
            addCriterion("f_bip_issuccess <", value, "fBipIssuccess");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessLessThanOrEqualTo(String value) {
            addCriterion("f_bip_issuccess <=", value, "fBipIssuccess");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessLike(String value) {
            addCriterion("f_bip_issuccess like", value, "fBipIssuccess");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessNotLike(String value) {
            addCriterion("f_bip_issuccess not like", value, "fBipIssuccess");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessIn(List<String> values) {
            addCriterion("f_bip_issuccess in", values, "fBipIssuccess");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessNotIn(List<String> values) {
            addCriterion("f_bip_issuccess not in", values, "fBipIssuccess");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessBetween(String value1, String value2) {
            addCriterion("f_bip_issuccess between", value1, value2, "fBipIssuccess");
            return (Criteria) this;
        }

        public Criteria andFBipIssuccessNotBetween(String value1, String value2) {
            addCriterion("f_bip_issuccess not between", value1, value2, "fBipIssuccess");
            return (Criteria) this;
        }

        public Criteria andFBipMessageposttimeIsNull() {
            addCriterion("f_bip_messageposttime is null");
            return (Criteria) this;
        }

        public Criteria andFBipMessageposttimeIsNotNull() {
            addCriterion("f_bip_messageposttime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipMessageposttimeEqualTo(Date value) {
            addCriterion("f_bip_messageposttime =", value, "fBipMessageposttime");
            return (Criteria) this;
        }

        public Criteria andFBipMessageposttimeNotEqualTo(Date value) {
            addCriterion("f_bip_messageposttime <>", value, "fBipMessageposttime");
            return (Criteria) this;
        }

        public Criteria andFBipMessageposttimeGreaterThan(Date value) {
            addCriterion("f_bip_messageposttime >", value, "fBipMessageposttime");
            return (Criteria) this;
        }

        public Criteria andFBipMessageposttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_messageposttime >=", value, "fBipMessageposttime");
            return (Criteria) this;
        }

        public Criteria andFBipMessageposttimeLessThan(Date value) {
            addCriterion("f_bip_messageposttime <", value, "fBipMessageposttime");
            return (Criteria) this;
        }

        public Criteria andFBipMessageposttimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_messageposttime <=", value, "fBipMessageposttime");
            return (Criteria) this;
        }

        public Criteria andFBipMessageposttimeIn(List<Date> values) {
            addCriterion("f_bip_messageposttime in", values, "fBipMessageposttime");
            return (Criteria) this;
        }

        public Criteria andFBipMessageposttimeNotIn(List<Date> values) {
            addCriterion("f_bip_messageposttime not in", values, "fBipMessageposttime");
            return (Criteria) this;
        }

        public Criteria andFBipMessageposttimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_messageposttime between", value1, value2, "fBipMessageposttime");
            return (Criteria) this;
        }

        public Criteria andFBipMessageposttimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_messageposttime not between", value1, value2, "fBipMessageposttime");
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