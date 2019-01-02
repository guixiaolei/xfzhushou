package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTCustUnitadvicesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTCustUnitadvicesExample() {
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

        public Criteria andFBipUnitleadernameIsNull() {
            addCriterion("f_bip_unitleadername is null");
            return (Criteria) this;
        }

        public Criteria andFBipUnitleadernameIsNotNull() {
            addCriterion("f_bip_unitleadername is not null");
            return (Criteria) this;
        }

        public Criteria andFBipUnitleadernameEqualTo(Integer value) {
            addCriterion("f_bip_unitleadername =", value, "fBipUnitleadername");
            return (Criteria) this;
        }

        public Criteria andFBipUnitleadernameNotEqualTo(Integer value) {
            addCriterion("f_bip_unitleadername <>", value, "fBipUnitleadername");
            return (Criteria) this;
        }

        public Criteria andFBipUnitleadernameGreaterThan(Integer value) {
            addCriterion("f_bip_unitleadername >", value, "fBipUnitleadername");
            return (Criteria) this;
        }

        public Criteria andFBipUnitleadernameGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_unitleadername >=", value, "fBipUnitleadername");
            return (Criteria) this;
        }

        public Criteria andFBipUnitleadernameLessThan(Integer value) {
            addCriterion("f_bip_unitleadername <", value, "fBipUnitleadername");
            return (Criteria) this;
        }

        public Criteria andFBipUnitleadernameLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_unitleadername <=", value, "fBipUnitleadername");
            return (Criteria) this;
        }

        public Criteria andFBipUnitleadernameIn(List<Integer> values) {
            addCriterion("f_bip_unitleadername in", values, "fBipUnitleadername");
            return (Criteria) this;
        }

        public Criteria andFBipUnitleadernameNotIn(List<Integer> values) {
            addCriterion("f_bip_unitleadername not in", values, "fBipUnitleadername");
            return (Criteria) this;
        }

        public Criteria andFBipUnitleadernameBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_unitleadername between", value1, value2, "fBipUnitleadername");
            return (Criteria) this;
        }

        public Criteria andFBipUnitleadernameNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_unitleadername not between", value1, value2, "fBipUnitleadername");
            return (Criteria) this;
        }

        public Criteria andFBipUnitadvicetimeIsNull() {
            addCriterion("f_bip_unitadvicetime is null");
            return (Criteria) this;
        }

        public Criteria andFBipUnitadvicetimeIsNotNull() {
            addCriterion("f_bip_unitadvicetime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipUnitadvicetimeEqualTo(Date value) {
            addCriterion("f_bip_unitadvicetime =", value, "fBipUnitadvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipUnitadvicetimeNotEqualTo(Date value) {
            addCriterion("f_bip_unitadvicetime <>", value, "fBipUnitadvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipUnitadvicetimeGreaterThan(Date value) {
            addCriterion("f_bip_unitadvicetime >", value, "fBipUnitadvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipUnitadvicetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_unitadvicetime >=", value, "fBipUnitadvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipUnitadvicetimeLessThan(Date value) {
            addCriterion("f_bip_unitadvicetime <", value, "fBipUnitadvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipUnitadvicetimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_unitadvicetime <=", value, "fBipUnitadvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipUnitadvicetimeIn(List<Date> values) {
            addCriterion("f_bip_unitadvicetime in", values, "fBipUnitadvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipUnitadvicetimeNotIn(List<Date> values) {
            addCriterion("f_bip_unitadvicetime not in", values, "fBipUnitadvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipUnitadvicetimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_unitadvicetime between", value1, value2, "fBipUnitadvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipUnitadvicetimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_unitadvicetime not between", value1, value2, "fBipUnitadvicetime");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceIsNull() {
            addCriterion("f_bip_unitdealadvice is null");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceIsNotNull() {
            addCriterion("f_bip_unitdealadvice is not null");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceEqualTo(String value) {
            addCriterion("f_bip_unitdealadvice =", value, "fBipUnitdealadvice");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceNotEqualTo(String value) {
            addCriterion("f_bip_unitdealadvice <>", value, "fBipUnitdealadvice");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceGreaterThan(String value) {
            addCriterion("f_bip_unitdealadvice >", value, "fBipUnitdealadvice");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_unitdealadvice >=", value, "fBipUnitdealadvice");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceLessThan(String value) {
            addCriterion("f_bip_unitdealadvice <", value, "fBipUnitdealadvice");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceLessThanOrEqualTo(String value) {
            addCriterion("f_bip_unitdealadvice <=", value, "fBipUnitdealadvice");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceLike(String value) {
            addCriterion("f_bip_unitdealadvice like", value, "fBipUnitdealadvice");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceNotLike(String value) {
            addCriterion("f_bip_unitdealadvice not like", value, "fBipUnitdealadvice");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceIn(List<String> values) {
            addCriterion("f_bip_unitdealadvice in", values, "fBipUnitdealadvice");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceNotIn(List<String> values) {
            addCriterion("f_bip_unitdealadvice not in", values, "fBipUnitdealadvice");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceBetween(String value1, String value2) {
            addCriterion("f_bip_unitdealadvice between", value1, value2, "fBipUnitdealadvice");
            return (Criteria) this;
        }

        public Criteria andFBipUnitdealadviceNotBetween(String value1, String value2) {
            addCriterion("f_bip_unitdealadvice not between", value1, value2, "fBipUnitdealadvice");
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