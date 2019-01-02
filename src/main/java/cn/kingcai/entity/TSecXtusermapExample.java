package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.List;

public class TSecXtusermapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSecXtusermapExample() {
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

        public Criteria andFopenidIsNull() {
            addCriterion("fopenid is null");
            return (Criteria) this;
        }

        public Criteria andFopenidIsNotNull() {
            addCriterion("fopenid is not null");
            return (Criteria) this;
        }

        public Criteria andFopenidEqualTo(String value) {
            addCriterion("fopenid =", value, "fopenid");
            return (Criteria) this;
        }

        public Criteria andFopenidNotEqualTo(String value) {
            addCriterion("fopenid <>", value, "fopenid");
            return (Criteria) this;
        }

        public Criteria andFopenidGreaterThan(String value) {
            addCriterion("fopenid >", value, "fopenid");
            return (Criteria) this;
        }

        public Criteria andFopenidGreaterThanOrEqualTo(String value) {
            addCriterion("fopenid >=", value, "fopenid");
            return (Criteria) this;
        }

        public Criteria andFopenidLessThan(String value) {
            addCriterion("fopenid <", value, "fopenid");
            return (Criteria) this;
        }

        public Criteria andFopenidLessThanOrEqualTo(String value) {
            addCriterion("fopenid <=", value, "fopenid");
            return (Criteria) this;
        }

        public Criteria andFopenidLike(String value) {
            addCriterion("fopenid like", value, "fopenid");
            return (Criteria) this;
        }

        public Criteria andFopenidNotLike(String value) {
            addCriterion("fopenid not like", value, "fopenid");
            return (Criteria) this;
        }

        public Criteria andFopenidIn(List<String> values) {
            addCriterion("fopenid in", values, "fopenid");
            return (Criteria) this;
        }

        public Criteria andFopenidNotIn(List<String> values) {
            addCriterion("fopenid not in", values, "fopenid");
            return (Criteria) this;
        }

        public Criteria andFopenidBetween(String value1, String value2) {
            addCriterion("fopenid between", value1, value2, "fopenid");
            return (Criteria) this;
        }

        public Criteria andFopenidNotBetween(String value1, String value2) {
            addCriterion("fopenid not between", value1, value2, "fopenid");
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

        public Criteria andFusernameIsNull() {
            addCriterion("fusername is null");
            return (Criteria) this;
        }

        public Criteria andFusernameIsNotNull() {
            addCriterion("fusername is not null");
            return (Criteria) this;
        }

        public Criteria andFusernameEqualTo(String value) {
            addCriterion("fusername =", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameNotEqualTo(String value) {
            addCriterion("fusername <>", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameGreaterThan(String value) {
            addCriterion("fusername >", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameGreaterThanOrEqualTo(String value) {
            addCriterion("fusername >=", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameLessThan(String value) {
            addCriterion("fusername <", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameLessThanOrEqualTo(String value) {
            addCriterion("fusername <=", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameLike(String value) {
            addCriterion("fusername like", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameNotLike(String value) {
            addCriterion("fusername not like", value, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameIn(List<String> values) {
            addCriterion("fusername in", values, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameNotIn(List<String> values) {
            addCriterion("fusername not in", values, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameBetween(String value1, String value2) {
            addCriterion("fusername between", value1, value2, "fusername");
            return (Criteria) this;
        }

        public Criteria andFusernameNotBetween(String value1, String value2) {
            addCriterion("fusername not between", value1, value2, "fusername");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptIsNull() {
            addCriterion("fbelongdept is null");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptIsNotNull() {
            addCriterion("fbelongdept is not null");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptEqualTo(String value) {
            addCriterion("fbelongdept =", value, "fbelongdept");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptNotEqualTo(String value) {
            addCriterion("fbelongdept <>", value, "fbelongdept");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptGreaterThan(String value) {
            addCriterion("fbelongdept >", value, "fbelongdept");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptGreaterThanOrEqualTo(String value) {
            addCriterion("fbelongdept >=", value, "fbelongdept");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptLessThan(String value) {
            addCriterion("fbelongdept <", value, "fbelongdept");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptLessThanOrEqualTo(String value) {
            addCriterion("fbelongdept <=", value, "fbelongdept");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptLike(String value) {
            addCriterion("fbelongdept like", value, "fbelongdept");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptNotLike(String value) {
            addCriterion("fbelongdept not like", value, "fbelongdept");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptIn(List<String> values) {
            addCriterion("fbelongdept in", values, "fbelongdept");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptNotIn(List<String> values) {
            addCriterion("fbelongdept not in", values, "fbelongdept");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptBetween(String value1, String value2) {
            addCriterion("fbelongdept between", value1, value2, "fbelongdept");
            return (Criteria) this;
        }

        public Criteria andFbelongdeptNotBetween(String value1, String value2) {
            addCriterion("fbelongdept not between", value1, value2, "fbelongdept");
            return (Criteria) this;
        }

        public Criteria andFpositionIsNull() {
            addCriterion("fposition is null");
            return (Criteria) this;
        }

        public Criteria andFpositionIsNotNull() {
            addCriterion("fposition is not null");
            return (Criteria) this;
        }

        public Criteria andFpositionEqualTo(String value) {
            addCriterion("fposition =", value, "fposition");
            return (Criteria) this;
        }

        public Criteria andFpositionNotEqualTo(String value) {
            addCriterion("fposition <>", value, "fposition");
            return (Criteria) this;
        }

        public Criteria andFpositionGreaterThan(String value) {
            addCriterion("fposition >", value, "fposition");
            return (Criteria) this;
        }

        public Criteria andFpositionGreaterThanOrEqualTo(String value) {
            addCriterion("fposition >=", value, "fposition");
            return (Criteria) this;
        }

        public Criteria andFpositionLessThan(String value) {
            addCriterion("fposition <", value, "fposition");
            return (Criteria) this;
        }

        public Criteria andFpositionLessThanOrEqualTo(String value) {
            addCriterion("fposition <=", value, "fposition");
            return (Criteria) this;
        }

        public Criteria andFpositionLike(String value) {
            addCriterion("fposition like", value, "fposition");
            return (Criteria) this;
        }

        public Criteria andFpositionNotLike(String value) {
            addCriterion("fposition not like", value, "fposition");
            return (Criteria) this;
        }

        public Criteria andFpositionIn(List<String> values) {
            addCriterion("fposition in", values, "fposition");
            return (Criteria) this;
        }

        public Criteria andFpositionNotIn(List<String> values) {
            addCriterion("fposition not in", values, "fposition");
            return (Criteria) this;
        }

        public Criteria andFpositionBetween(String value1, String value2) {
            addCriterion("fposition between", value1, value2, "fposition");
            return (Criteria) this;
        }

        public Criteria andFpositionNotBetween(String value1, String value2) {
            addCriterion("fposition not between", value1, value2, "fposition");
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