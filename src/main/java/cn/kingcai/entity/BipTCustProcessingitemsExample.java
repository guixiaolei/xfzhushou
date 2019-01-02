package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.List;

public class BipTCustProcessingitemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTCustProcessingitemsExample() {
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