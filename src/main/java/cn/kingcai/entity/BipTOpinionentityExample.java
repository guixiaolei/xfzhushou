package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTOpinionentityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTOpinionentityExample() {
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

        public Criteria andFentryidIsNull() {
            addCriterion("fentryid is null");
            return (Criteria) this;
        }

        public Criteria andFentryidIsNotNull() {
            addCriterion("fentryid is not null");
            return (Criteria) this;
        }

        public Criteria andFentryidEqualTo(Long value) {
            addCriterion("fentryid =", value, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidNotEqualTo(Long value) {
            addCriterion("fentryid <>", value, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidGreaterThan(Long value) {
            addCriterion("fentryid >", value, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidGreaterThanOrEqualTo(Long value) {
            addCriterion("fentryid >=", value, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidLessThan(Long value) {
            addCriterion("fentryid <", value, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidLessThanOrEqualTo(Long value) {
            addCriterion("fentryid <=", value, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidIn(List<Long> values) {
            addCriterion("fentryid in", values, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidNotIn(List<Long> values) {
            addCriterion("fentryid not in", values, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidBetween(Long value1, Long value2) {
            addCriterion("fentryid between", value1, value2, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidNotBetween(Long value1, Long value2) {
            addCriterion("fentryid not between", value1, value2, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFseqIsNull() {
            addCriterion("fseq is null");
            return (Criteria) this;
        }

        public Criteria andFseqIsNotNull() {
            addCriterion("fseq is not null");
            return (Criteria) this;
        }

        public Criteria andFseqEqualTo(Integer value) {
            addCriterion("fseq =", value, "fseq");
            return (Criteria) this;
        }

        public Criteria andFseqNotEqualTo(Integer value) {
            addCriterion("fseq <>", value, "fseq");
            return (Criteria) this;
        }

        public Criteria andFseqGreaterThan(Integer value) {
            addCriterion("fseq >", value, "fseq");
            return (Criteria) this;
        }

        public Criteria andFseqGreaterThanOrEqualTo(Integer value) {
            addCriterion("fseq >=", value, "fseq");
            return (Criteria) this;
        }

        public Criteria andFseqLessThan(Integer value) {
            addCriterion("fseq <", value, "fseq");
            return (Criteria) this;
        }

        public Criteria andFseqLessThanOrEqualTo(Integer value) {
            addCriterion("fseq <=", value, "fseq");
            return (Criteria) this;
        }

        public Criteria andFseqIn(List<Integer> values) {
            addCriterion("fseq in", values, "fseq");
            return (Criteria) this;
        }

        public Criteria andFseqNotIn(List<Integer> values) {
            addCriterion("fseq not in", values, "fseq");
            return (Criteria) this;
        }

        public Criteria andFseqBetween(Integer value1, Integer value2) {
            addCriterion("fseq between", value1, value2, "fseq");
            return (Criteria) this;
        }

        public Criteria andFseqNotBetween(Integer value1, Integer value2) {
            addCriterion("fseq not between", value1, value2, "fseq");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageradvicetimeIsNull() {
            addCriterion("f_bip_greatmanageradvicetime is null");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageradvicetimeIsNotNull() {
            addCriterion("f_bip_greatmanageradvicetime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageradvicetimeEqualTo(Date value) {
            addCriterion("f_bip_greatmanageradvicetime =", value, "fBipGreatmanageradvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageradvicetimeNotEqualTo(Date value) {
            addCriterion("f_bip_greatmanageradvicetime <>", value, "fBipGreatmanageradvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageradvicetimeGreaterThan(Date value) {
            addCriterion("f_bip_greatmanageradvicetime >", value, "fBipGreatmanageradvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageradvicetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_greatmanageradvicetime >=", value, "fBipGreatmanageradvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageradvicetimeLessThan(Date value) {
            addCriterion("f_bip_greatmanageradvicetime <", value, "fBipGreatmanageradvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageradvicetimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_greatmanageradvicetime <=", value, "fBipGreatmanageradvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageradvicetimeIn(List<Date> values) {
            addCriterion("f_bip_greatmanageradvicetime in", values, "fBipGreatmanageradvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageradvicetimeNotIn(List<Date> values) {
            addCriterion("f_bip_greatmanageradvicetime not in", values, "fBipGreatmanageradvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageradvicetimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_greatmanageradvicetime between", value1, value2, "fBipGreatmanageradvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageradvicetimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_greatmanageradvicetime not between", value1, value2, "fBipGreatmanageradvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsIsNull() {
            addCriterion("f_bip_greatmanageropiniondetails is null");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsIsNotNull() {
            addCriterion("f_bip_greatmanageropiniondetails is not null");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsEqualTo(String value) {
            addCriterion("f_bip_greatmanageropiniondetails =", value, "fBipGreatmanageropiniondetails");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsNotEqualTo(String value) {
            addCriterion("f_bip_greatmanageropiniondetails <>", value, "fBipGreatmanageropiniondetails");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsGreaterThan(String value) {
            addCriterion("f_bip_greatmanageropiniondetails >", value, "fBipGreatmanageropiniondetails");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_greatmanageropiniondetails >=", value, "fBipGreatmanageropiniondetails");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsLessThan(String value) {
            addCriterion("f_bip_greatmanageropiniondetails <", value, "fBipGreatmanageropiniondetails");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsLessThanOrEqualTo(String value) {
            addCriterion("f_bip_greatmanageropiniondetails <=", value, "fBipGreatmanageropiniondetails");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsLike(String value) {
            addCriterion("f_bip_greatmanageropiniondetails like", value, "fBipGreatmanageropiniondetails");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsNotLike(String value) {
            addCriterion("f_bip_greatmanageropiniondetails not like", value, "fBipGreatmanageropiniondetails");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsIn(List<String> values) {
            addCriterion("f_bip_greatmanageropiniondetails in", values, "fBipGreatmanageropiniondetails");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsNotIn(List<String> values) {
            addCriterion("f_bip_greatmanageropiniondetails not in", values, "fBipGreatmanageropiniondetails");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsBetween(String value1, String value2) {
            addCriterion("f_bip_greatmanageropiniondetails between", value1, value2, "fBipGreatmanageropiniondetails");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanageropiniondetailsNotBetween(String value1, String value2) {
            addCriterion("f_bip_greatmanageropiniondetails not between", value1, value2, "fBipGreatmanageropiniondetails");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanager0IsNull() {
            addCriterion("f_bip_greatmanager0 is null");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanager0IsNotNull() {
            addCriterion("f_bip_greatmanager0 is not null");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanager0EqualTo(Integer value) {
            addCriterion("f_bip_greatmanager0 =", value, "fBipGreatmanager0");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanager0NotEqualTo(Integer value) {
            addCriterion("f_bip_greatmanager0 <>", value, "fBipGreatmanager0");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanager0GreaterThan(Integer value) {
            addCriterion("f_bip_greatmanager0 >", value, "fBipGreatmanager0");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanager0GreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_greatmanager0 >=", value, "fBipGreatmanager0");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanager0LessThan(Integer value) {
            addCriterion("f_bip_greatmanager0 <", value, "fBipGreatmanager0");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanager0LessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_greatmanager0 <=", value, "fBipGreatmanager0");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanager0In(List<Integer> values) {
            addCriterion("f_bip_greatmanager0 in", values, "fBipGreatmanager0");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanager0NotIn(List<Integer> values) {
            addCriterion("f_bip_greatmanager0 not in", values, "fBipGreatmanager0");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanager0Between(Integer value1, Integer value2) {
            addCriterion("f_bip_greatmanager0 between", value1, value2, "fBipGreatmanager0");
            return (Criteria) this;
        }

        public Criteria andFBipGreatmanager0NotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_greatmanager0 not between", value1, value2, "fBipGreatmanager0");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageIsNull() {
            addCriterion("f_bip_ispostcloudmessage is null");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageIsNotNull() {
            addCriterion("f_bip_ispostcloudmessage is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageEqualTo(String value) {
            addCriterion("f_bip_ispostcloudmessage =", value, "fBipIspostcloudmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageNotEqualTo(String value) {
            addCriterion("f_bip_ispostcloudmessage <>", value, "fBipIspostcloudmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageGreaterThan(String value) {
            addCriterion("f_bip_ispostcloudmessage >", value, "fBipIspostcloudmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_ispostcloudmessage >=", value, "fBipIspostcloudmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageLessThan(String value) {
            addCriterion("f_bip_ispostcloudmessage <", value, "fBipIspostcloudmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_ispostcloudmessage <=", value, "fBipIspostcloudmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageLike(String value) {
            addCriterion("f_bip_ispostcloudmessage like", value, "fBipIspostcloudmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageNotLike(String value) {
            addCriterion("f_bip_ispostcloudmessage not like", value, "fBipIspostcloudmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageIn(List<String> values) {
            addCriterion("f_bip_ispostcloudmessage in", values, "fBipIspostcloudmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageNotIn(List<String> values) {
            addCriterion("f_bip_ispostcloudmessage not in", values, "fBipIspostcloudmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageBetween(String value1, String value2) {
            addCriterion("f_bip_ispostcloudmessage between", value1, value2, "fBipIspostcloudmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostcloudmessageNotBetween(String value1, String value2) {
            addCriterion("f_bip_ispostcloudmessage not between", value1, value2, "fBipIspostcloudmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageIsNull() {
            addCriterion("f_bip_ispostyunmessage is null");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageIsNotNull() {
            addCriterion("f_bip_ispostyunmessage is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageEqualTo(String value) {
            addCriterion("f_bip_ispostyunmessage =", value, "fBipIspostyunmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageNotEqualTo(String value) {
            addCriterion("f_bip_ispostyunmessage <>", value, "fBipIspostyunmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageGreaterThan(String value) {
            addCriterion("f_bip_ispostyunmessage >", value, "fBipIspostyunmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_ispostyunmessage >=", value, "fBipIspostyunmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageLessThan(String value) {
            addCriterion("f_bip_ispostyunmessage <", value, "fBipIspostyunmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_ispostyunmessage <=", value, "fBipIspostyunmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageLike(String value) {
            addCriterion("f_bip_ispostyunmessage like", value, "fBipIspostyunmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageNotLike(String value) {
            addCriterion("f_bip_ispostyunmessage not like", value, "fBipIspostyunmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageIn(List<String> values) {
            addCriterion("f_bip_ispostyunmessage in", values, "fBipIspostyunmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageNotIn(List<String> values) {
            addCriterion("f_bip_ispostyunmessage not in", values, "fBipIspostyunmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageBetween(String value1, String value2) {
            addCriterion("f_bip_ispostyunmessage between", value1, value2, "fBipIspostyunmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIspostyunmessageNotBetween(String value1, String value2) {
            addCriterion("f_bip_ispostyunmessage not between", value1, value2, "fBipIspostyunmessage");
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