package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTLeadersubentityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTLeadersubentityExample() {
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

        public Criteria andFdetailidIsNull() {
            addCriterion("fdetailid is null");
            return (Criteria) this;
        }

        public Criteria andFdetailidIsNotNull() {
            addCriterion("fdetailid is not null");
            return (Criteria) this;
        }

        public Criteria andFdetailidEqualTo(Long value) {
            addCriterion("fdetailid =", value, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidNotEqualTo(Long value) {
            addCriterion("fdetailid <>", value, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidGreaterThan(Long value) {
            addCriterion("fdetailid >", value, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidGreaterThanOrEqualTo(Long value) {
            addCriterion("fdetailid >=", value, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidLessThan(Long value) {
            addCriterion("fdetailid <", value, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidLessThanOrEqualTo(Long value) {
            addCriterion("fdetailid <=", value, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidIn(List<Long> values) {
            addCriterion("fdetailid in", values, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidNotIn(List<Long> values) {
            addCriterion("fdetailid not in", values, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidBetween(Long value1, Long value2) {
            addCriterion("fdetailid between", value1, value2, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidNotBetween(Long value1, Long value2) {
            addCriterion("fdetailid not between", value1, value2, "fdetailid");
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

        public Criteria andFBipReplypersonIsNull() {
            addCriterion("f_bip_replyperson is null");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonIsNotNull() {
            addCriterion("f_bip_replyperson is not null");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonEqualTo(String value) {
            addCriterion("f_bip_replyperson =", value, "fBipReplyperson");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonNotEqualTo(String value) {
            addCriterion("f_bip_replyperson <>", value, "fBipReplyperson");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonGreaterThan(String value) {
            addCriterion("f_bip_replyperson >", value, "fBipReplyperson");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_replyperson >=", value, "fBipReplyperson");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonLessThan(String value) {
            addCriterion("f_bip_replyperson <", value, "fBipReplyperson");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonLessThanOrEqualTo(String value) {
            addCriterion("f_bip_replyperson <=", value, "fBipReplyperson");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonLike(String value) {
            addCriterion("f_bip_replyperson like", value, "fBipReplyperson");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonNotLike(String value) {
            addCriterion("f_bip_replyperson not like", value, "fBipReplyperson");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonIn(List<String> values) {
            addCriterion("f_bip_replyperson in", values, "fBipReplyperson");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonNotIn(List<String> values) {
            addCriterion("f_bip_replyperson not in", values, "fBipReplyperson");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonBetween(String value1, String value2) {
            addCriterion("f_bip_replyperson between", value1, value2, "fBipReplyperson");
            return (Criteria) this;
        }

        public Criteria andFBipReplypersonNotBetween(String value1, String value2) {
            addCriterion("f_bip_replyperson not between", value1, value2, "fBipReplyperson");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonIsNull() {
            addCriterion("f_bip_indicateperson is null");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonIsNotNull() {
            addCriterion("f_bip_indicateperson is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonEqualTo(String value) {
            addCriterion("f_bip_indicateperson =", value, "fBipIndicateperson");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonNotEqualTo(String value) {
            addCriterion("f_bip_indicateperson <>", value, "fBipIndicateperson");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonGreaterThan(String value) {
            addCriterion("f_bip_indicateperson >", value, "fBipIndicateperson");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_indicateperson >=", value, "fBipIndicateperson");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonLessThan(String value) {
            addCriterion("f_bip_indicateperson <", value, "fBipIndicateperson");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonLessThanOrEqualTo(String value) {
            addCriterion("f_bip_indicateperson <=", value, "fBipIndicateperson");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonLike(String value) {
            addCriterion("f_bip_indicateperson like", value, "fBipIndicateperson");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonNotLike(String value) {
            addCriterion("f_bip_indicateperson not like", value, "fBipIndicateperson");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonIn(List<String> values) {
            addCriterion("f_bip_indicateperson in", values, "fBipIndicateperson");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonNotIn(List<String> values) {
            addCriterion("f_bip_indicateperson not in", values, "fBipIndicateperson");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonBetween(String value1, String value2) {
            addCriterion("f_bip_indicateperson between", value1, value2, "fBipIndicateperson");
            return (Criteria) this;
        }

        public Criteria andFBipIndicatepersonNotBetween(String value1, String value2) {
            addCriterion("f_bip_indicateperson not between", value1, value2, "fBipIndicateperson");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsIsNull() {
            addCriterion("f_bip_replydetails is null");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsIsNotNull() {
            addCriterion("f_bip_replydetails is not null");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsEqualTo(String value) {
            addCriterion("f_bip_replydetails =", value, "fBipReplydetails");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsNotEqualTo(String value) {
            addCriterion("f_bip_replydetails <>", value, "fBipReplydetails");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsGreaterThan(String value) {
            addCriterion("f_bip_replydetails >", value, "fBipReplydetails");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_replydetails >=", value, "fBipReplydetails");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsLessThan(String value) {
            addCriterion("f_bip_replydetails <", value, "fBipReplydetails");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsLessThanOrEqualTo(String value) {
            addCriterion("f_bip_replydetails <=", value, "fBipReplydetails");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsLike(String value) {
            addCriterion("f_bip_replydetails like", value, "fBipReplydetails");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsNotLike(String value) {
            addCriterion("f_bip_replydetails not like", value, "fBipReplydetails");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsIn(List<String> values) {
            addCriterion("f_bip_replydetails in", values, "fBipReplydetails");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsNotIn(List<String> values) {
            addCriterion("f_bip_replydetails not in", values, "fBipReplydetails");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsBetween(String value1, String value2) {
            addCriterion("f_bip_replydetails between", value1, value2, "fBipReplydetails");
            return (Criteria) this;
        }

        public Criteria andFBipReplydetailsNotBetween(String value1, String value2) {
            addCriterion("f_bip_replydetails not between", value1, value2, "fBipReplydetails");
            return (Criteria) this;
        }

        public Criteria andFBipReplytimeIsNull() {
            addCriterion("f_bip_replytime is null");
            return (Criteria) this;
        }

        public Criteria andFBipReplytimeIsNotNull() {
            addCriterion("f_bip_replytime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipReplytimeEqualTo(Date value) {
            addCriterion("f_bip_replytime =", value, "fBipReplytime");
            return (Criteria) this;
        }

        public Criteria andFBipReplytimeNotEqualTo(Date value) {
            addCriterion("f_bip_replytime <>", value, "fBipReplytime");
            return (Criteria) this;
        }

        public Criteria andFBipReplytimeGreaterThan(Date value) {
            addCriterion("f_bip_replytime >", value, "fBipReplytime");
            return (Criteria) this;
        }

        public Criteria andFBipReplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_replytime >=", value, "fBipReplytime");
            return (Criteria) this;
        }

        public Criteria andFBipReplytimeLessThan(Date value) {
            addCriterion("f_bip_replytime <", value, "fBipReplytime");
            return (Criteria) this;
        }

        public Criteria andFBipReplytimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_replytime <=", value, "fBipReplytime");
            return (Criteria) this;
        }

        public Criteria andFBipReplytimeIn(List<Date> values) {
            addCriterion("f_bip_replytime in", values, "fBipReplytime");
            return (Criteria) this;
        }

        public Criteria andFBipReplytimeNotIn(List<Date> values) {
            addCriterion("f_bip_replytime not in", values, "fBipReplytime");
            return (Criteria) this;
        }

        public Criteria andFBipReplytimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_replytime between", value1, value2, "fBipReplytime");
            return (Criteria) this;
        }

        public Criteria andFBipReplytimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_replytime not between", value1, value2, "fBipReplytime");
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