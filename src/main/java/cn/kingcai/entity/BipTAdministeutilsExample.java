package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.List;

public class BipTAdministeutilsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTAdministeutilsExample() {
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

        public Criteria andFdetailidIsNull() {
            addCriterion("fdetailid is null");
            return (Criteria) this;
        }

        public Criteria andFdetailidIsNotNull() {
            addCriterion("fdetailid is not null");
            return (Criteria) this;
        }

        public Criteria andFdetailidEqualTo(Integer value) {
            addCriterion("fdetailid =", value, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidNotEqualTo(Integer value) {
            addCriterion("fdetailid <>", value, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidGreaterThan(Integer value) {
            addCriterion("fdetailid >", value, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fdetailid >=", value, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidLessThan(Integer value) {
            addCriterion("fdetailid <", value, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("fdetailid <=", value, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidIn(List<Integer> values) {
            addCriterion("fdetailid in", values, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidNotIn(List<Integer> values) {
            addCriterion("fdetailid not in", values, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidBetween(Integer value1, Integer value2) {
            addCriterion("fdetailid between", value1, value2, "fdetailid");
            return (Criteria) this;
        }

        public Criteria andFdetailidNotBetween(Integer value1, Integer value2) {
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