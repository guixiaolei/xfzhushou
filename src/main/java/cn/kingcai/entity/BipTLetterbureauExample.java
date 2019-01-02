package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.List;

public class BipTLetterbureauExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTLetterbureauExample() {
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

        public Criteria andFBipOndutyIsNull() {
            addCriterion("f_bip_onduty is null");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyIsNotNull() {
            addCriterion("f_bip_onduty is not null");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyEqualTo(String value) {
            addCriterion("f_bip_onduty =", value, "fBipOnduty");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyNotEqualTo(String value) {
            addCriterion("f_bip_onduty <>", value, "fBipOnduty");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyGreaterThan(String value) {
            addCriterion("f_bip_onduty >", value, "fBipOnduty");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_onduty >=", value, "fBipOnduty");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyLessThan(String value) {
            addCriterion("f_bip_onduty <", value, "fBipOnduty");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyLessThanOrEqualTo(String value) {
            addCriterion("f_bip_onduty <=", value, "fBipOnduty");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyLike(String value) {
            addCriterion("f_bip_onduty like", value, "fBipOnduty");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyNotLike(String value) {
            addCriterion("f_bip_onduty not like", value, "fBipOnduty");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyIn(List<String> values) {
            addCriterion("f_bip_onduty in", values, "fBipOnduty");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyNotIn(List<String> values) {
            addCriterion("f_bip_onduty not in", values, "fBipOnduty");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyBetween(String value1, String value2) {
            addCriterion("f_bip_onduty between", value1, value2, "fBipOnduty");
            return (Criteria) this;
        }

        public Criteria andFBipOndutyNotBetween(String value1, String value2) {
            addCriterion("f_bip_onduty not between", value1, value2, "fBipOnduty");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalIsNull() {
            addCriterion("f_bip_isprincipal is null");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalIsNotNull() {
            addCriterion("f_bip_isprincipal is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalEqualTo(String value) {
            addCriterion("f_bip_isprincipal =", value, "fBipIsprincipal");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalNotEqualTo(String value) {
            addCriterion("f_bip_isprincipal <>", value, "fBipIsprincipal");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalGreaterThan(String value) {
            addCriterion("f_bip_isprincipal >", value, "fBipIsprincipal");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_isprincipal >=", value, "fBipIsprincipal");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalLessThan(String value) {
            addCriterion("f_bip_isprincipal <", value, "fBipIsprincipal");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalLessThanOrEqualTo(String value) {
            addCriterion("f_bip_isprincipal <=", value, "fBipIsprincipal");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalLike(String value) {
            addCriterion("f_bip_isprincipal like", value, "fBipIsprincipal");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalNotLike(String value) {
            addCriterion("f_bip_isprincipal not like", value, "fBipIsprincipal");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalIn(List<String> values) {
            addCriterion("f_bip_isprincipal in", values, "fBipIsprincipal");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalNotIn(List<String> values) {
            addCriterion("f_bip_isprincipal not in", values, "fBipIsprincipal");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalBetween(String value1, String value2) {
            addCriterion("f_bip_isprincipal between", value1, value2, "fBipIsprincipal");
            return (Criteria) this;
        }

        public Criteria andFBipIsprincipalNotBetween(String value1, String value2) {
            addCriterion("f_bip_isprincipal not between", value1, value2, "fBipIsprincipal");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceIsNull() {
            addCriterion("f_bip_isgetprovince is null");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceIsNotNull() {
            addCriterion("f_bip_isgetprovince is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceEqualTo(String value) {
            addCriterion("f_bip_isgetprovince =", value, "fBipIsgetprovince");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceNotEqualTo(String value) {
            addCriterion("f_bip_isgetprovince <>", value, "fBipIsgetprovince");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceGreaterThan(String value) {
            addCriterion("f_bip_isgetprovince >", value, "fBipIsgetprovince");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_isgetprovince >=", value, "fBipIsgetprovince");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceLessThan(String value) {
            addCriterion("f_bip_isgetprovince <", value, "fBipIsgetprovince");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceLessThanOrEqualTo(String value) {
            addCriterion("f_bip_isgetprovince <=", value, "fBipIsgetprovince");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceLike(String value) {
            addCriterion("f_bip_isgetprovince like", value, "fBipIsgetprovince");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceNotLike(String value) {
            addCriterion("f_bip_isgetprovince not like", value, "fBipIsgetprovince");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceIn(List<String> values) {
            addCriterion("f_bip_isgetprovince in", values, "fBipIsgetprovince");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceNotIn(List<String> values) {
            addCriterion("f_bip_isgetprovince not in", values, "fBipIsgetprovince");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceBetween(String value1, String value2) {
            addCriterion("f_bip_isgetprovince between", value1, value2, "fBipIsgetprovince");
            return (Criteria) this;
        }

        public Criteria andFBipIsgetprovinceNotBetween(String value1, String value2) {
            addCriterion("f_bip_isgetprovince not between", value1, value2, "fBipIsgetprovince");
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