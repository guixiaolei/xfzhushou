package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.List;

public class BipTLeaderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTLeaderExample() {
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

        public Criteria andFBipDirectornameIsNull() {
            addCriterion("f_bip_directorname is null");
            return (Criteria) this;
        }

        public Criteria andFBipDirectornameIsNotNull() {
            addCriterion("f_bip_directorname is not null");
            return (Criteria) this;
        }

        public Criteria andFBipDirectornameEqualTo(Long value) {
            addCriterion("f_bip_directorname =", value, "fBipDirectorname");
            return (Criteria) this;
        }

        public Criteria andFBipDirectornameNotEqualTo(Long value) {
            addCriterion("f_bip_directorname <>", value, "fBipDirectorname");
            return (Criteria) this;
        }

        public Criteria andFBipDirectornameGreaterThan(Long value) {
            addCriterion("f_bip_directorname >", value, "fBipDirectorname");
            return (Criteria) this;
        }

        public Criteria andFBipDirectornameGreaterThanOrEqualTo(Long value) {
            addCriterion("f_bip_directorname >=", value, "fBipDirectorname");
            return (Criteria) this;
        }

        public Criteria andFBipDirectornameLessThan(Long value) {
            addCriterion("f_bip_directorname <", value, "fBipDirectorname");
            return (Criteria) this;
        }

        public Criteria andFBipDirectornameLessThanOrEqualTo(Long value) {
            addCriterion("f_bip_directorname <=", value, "fBipDirectorname");
            return (Criteria) this;
        }

        public Criteria andFBipDirectornameIn(List<Long> values) {
            addCriterion("f_bip_directorname in", values, "fBipDirectorname");
            return (Criteria) this;
        }

        public Criteria andFBipDirectornameNotIn(List<Long> values) {
            addCriterion("f_bip_directorname not in", values, "fBipDirectorname");
            return (Criteria) this;
        }

        public Criteria andFBipDirectornameBetween(Long value1, Long value2) {
            addCriterion("f_bip_directorname between", value1, value2, "fBipDirectorname");
            return (Criteria) this;
        }

        public Criteria andFBipDirectornameNotBetween(Long value1, Long value2) {
            addCriterion("f_bip_directorname not between", value1, value2, "fBipDirectorname");
            return (Criteria) this;
        }

        public Criteria andFBipDtelIsNull() {
            addCriterion("f_bip_dtel is null");
            return (Criteria) this;
        }

        public Criteria andFBipDtelIsNotNull() {
            addCriterion("f_bip_dtel is not null");
            return (Criteria) this;
        }

        public Criteria andFBipDtelEqualTo(String value) {
            addCriterion("f_bip_dtel =", value, "fBipDtel");
            return (Criteria) this;
        }

        public Criteria andFBipDtelNotEqualTo(String value) {
            addCriterion("f_bip_dtel <>", value, "fBipDtel");
            return (Criteria) this;
        }

        public Criteria andFBipDtelGreaterThan(String value) {
            addCriterion("f_bip_dtel >", value, "fBipDtel");
            return (Criteria) this;
        }

        public Criteria andFBipDtelGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_dtel >=", value, "fBipDtel");
            return (Criteria) this;
        }

        public Criteria andFBipDtelLessThan(String value) {
            addCriterion("f_bip_dtel <", value, "fBipDtel");
            return (Criteria) this;
        }

        public Criteria andFBipDtelLessThanOrEqualTo(String value) {
            addCriterion("f_bip_dtel <=", value, "fBipDtel");
            return (Criteria) this;
        }

        public Criteria andFBipDtelLike(String value) {
            addCriterion("f_bip_dtel like", value, "fBipDtel");
            return (Criteria) this;
        }

        public Criteria andFBipDtelNotLike(String value) {
            addCriterion("f_bip_dtel not like", value, "fBipDtel");
            return (Criteria) this;
        }

        public Criteria andFBipDtelIn(List<String> values) {
            addCriterion("f_bip_dtel in", values, "fBipDtel");
            return (Criteria) this;
        }

        public Criteria andFBipDtelNotIn(List<String> values) {
            addCriterion("f_bip_dtel not in", values, "fBipDtel");
            return (Criteria) this;
        }

        public Criteria andFBipDtelBetween(String value1, String value2) {
            addCriterion("f_bip_dtel between", value1, value2, "fBipDtel");
            return (Criteria) this;
        }

        public Criteria andFBipDtelNotBetween(String value1, String value2) {
            addCriterion("f_bip_dtel not between", value1, value2, "fBipDtel");
            return (Criteria) this;
        }

        public Criteria andFBipPostIsNull() {
            addCriterion("f_bip_post is null");
            return (Criteria) this;
        }

        public Criteria andFBipPostIsNotNull() {
            addCriterion("f_bip_post is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPostEqualTo(String value) {
            addCriterion("f_bip_post =", value, "fBipPost");
            return (Criteria) this;
        }

        public Criteria andFBipPostNotEqualTo(String value) {
            addCriterion("f_bip_post <>", value, "fBipPost");
            return (Criteria) this;
        }

        public Criteria andFBipPostGreaterThan(String value) {
            addCriterion("f_bip_post >", value, "fBipPost");
            return (Criteria) this;
        }

        public Criteria andFBipPostGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_post >=", value, "fBipPost");
            return (Criteria) this;
        }

        public Criteria andFBipPostLessThan(String value) {
            addCriterion("f_bip_post <", value, "fBipPost");
            return (Criteria) this;
        }

        public Criteria andFBipPostLessThanOrEqualTo(String value) {
            addCriterion("f_bip_post <=", value, "fBipPost");
            return (Criteria) this;
        }

        public Criteria andFBipPostLike(String value) {
            addCriterion("f_bip_post like", value, "fBipPost");
            return (Criteria) this;
        }

        public Criteria andFBipPostNotLike(String value) {
            addCriterion("f_bip_post not like", value, "fBipPost");
            return (Criteria) this;
        }

        public Criteria andFBipPostIn(List<String> values) {
            addCriterion("f_bip_post in", values, "fBipPost");
            return (Criteria) this;
        }

        public Criteria andFBipPostNotIn(List<String> values) {
            addCriterion("f_bip_post not in", values, "fBipPost");
            return (Criteria) this;
        }

        public Criteria andFBipPostBetween(String value1, String value2) {
            addCriterion("f_bip_post between", value1, value2, "fBipPost");
            return (Criteria) this;
        }

        public Criteria andFBipPostNotBetween(String value1, String value2) {
            addCriterion("f_bip_post not between", value1, value2, "fBipPost");
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