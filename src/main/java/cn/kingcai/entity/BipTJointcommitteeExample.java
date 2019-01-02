package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.List;

public class BipTJointcommitteeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTJointcommitteeExample() {
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

        public Criteria andFentryidIsNull() {
            addCriterion("fentryid is null");
            return (Criteria) this;
        }

        public Criteria andFentryidIsNotNull() {
            addCriterion("fentryid is not null");
            return (Criteria) this;
        }

        public Criteria andFentryidEqualTo(Integer value) {
            addCriterion("fentryid =", value, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidNotEqualTo(Integer value) {
            addCriterion("fentryid <>", value, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidGreaterThan(Integer value) {
            addCriterion("fentryid >", value, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fentryid >=", value, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidLessThan(Integer value) {
            addCriterion("fentryid <", value, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidLessThanOrEqualTo(Integer value) {
            addCriterion("fentryid <=", value, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidIn(List<Integer> values) {
            addCriterion("fentryid in", values, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidNotIn(List<Integer> values) {
            addCriterion("fentryid not in", values, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidBetween(Integer value1, Integer value2) {
            addCriterion("fentryid between", value1, value2, "fentryid");
            return (Criteria) this;
        }

        public Criteria andFentryidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andFBipTelephoneIsNull() {
            addCriterion("f_bip_telephone is null");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneIsNotNull() {
            addCriterion("f_bip_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneEqualTo(String value) {
            addCriterion("f_bip_telephone =", value, "fBipTelephone");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneNotEqualTo(String value) {
            addCriterion("f_bip_telephone <>", value, "fBipTelephone");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneGreaterThan(String value) {
            addCriterion("f_bip_telephone >", value, "fBipTelephone");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_telephone >=", value, "fBipTelephone");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneLessThan(String value) {
            addCriterion("f_bip_telephone <", value, "fBipTelephone");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneLessThanOrEqualTo(String value) {
            addCriterion("f_bip_telephone <=", value, "fBipTelephone");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneLike(String value) {
            addCriterion("f_bip_telephone like", value, "fBipTelephone");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneNotLike(String value) {
            addCriterion("f_bip_telephone not like", value, "fBipTelephone");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneIn(List<String> values) {
            addCriterion("f_bip_telephone in", values, "fBipTelephone");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneNotIn(List<String> values) {
            addCriterion("f_bip_telephone not in", values, "fBipTelephone");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneBetween(String value1, String value2) {
            addCriterion("f_bip_telephone between", value1, value2, "fBipTelephone");
            return (Criteria) this;
        }

        public Criteria andFBipTelephoneNotBetween(String value1, String value2) {
            addCriterion("f_bip_telephone not between", value1, value2, "fBipTelephone");
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

        public Criteria andFBipNameEqualTo(Integer value) {
            addCriterion("f_bip_name =", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameNotEqualTo(Integer value) {
            addCriterion("f_bip_name <>", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameGreaterThan(Integer value) {
            addCriterion("f_bip_name >", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_name >=", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameLessThan(Integer value) {
            addCriterion("f_bip_name <", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_name <=", value, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameIn(List<Integer> values) {
            addCriterion("f_bip_name in", values, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameNotIn(List<Integer> values) {
            addCriterion("f_bip_name not in", values, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_name between", value1, value2, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipNameNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_name not between", value1, value2, "fBipName");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageIsNull() {
            addCriterion("f_bip_isgetmessage is null");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageIsNotNull() {
            addCriterion("f_bip_isgetmessage is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageEqualTo(String value) {
            addCriterion("f_bip_isgetmessage =", value, "fBipIsgetmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageNotEqualTo(String value) {
            addCriterion("f_bip_isgetmessage <>", value, "fBipIsgetmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageGreaterThan(String value) {
            addCriterion("f_bip_isgetmessage >", value, "fBipIsgetmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_isgetmessage >=", value, "fBipIsgetmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageLessThan(String value) {
            addCriterion("f_bip_isgetmessage <", value, "fBipIsgetmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_isgetmessage <=", value, "fBipIsgetmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageLike(String value) {
            addCriterion("f_bip_isgetmessage like", value, "fBipIsgetmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageNotLike(String value) {
            addCriterion("f_bip_isgetmessage not like", value, "fBipIsgetmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageIn(List<String> values) {
            addCriterion("f_bip_isgetmessage in", values, "fBipIsgetmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageNotIn(List<String> values) {
            addCriterion("f_bip_isgetmessage not in", values, "fBipIsgetmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageBetween(String value1, String value2) {
            addCriterion("f_bip_isgetmessage between", value1, value2, "fBipIsgetmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetmessageNotBetween(String value1, String value2) {
            addCriterion("f_bip_isgetmessage not between", value1, value2, "fBipIsgetmessage");
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