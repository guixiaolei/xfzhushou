package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.List;

public class BipTComplaintmanageheadLkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTComplaintmanageheadLkExample() {
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

        public Criteria andFlinkidIsNull() {
            addCriterion("flinkid is null");
            return (Criteria) this;
        }

        public Criteria andFlinkidIsNotNull() {
            addCriterion("flinkid is not null");
            return (Criteria) this;
        }

        public Criteria andFlinkidEqualTo(Long value) {
            addCriterion("flinkid =", value, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidNotEqualTo(Long value) {
            addCriterion("flinkid <>", value, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidGreaterThan(Long value) {
            addCriterion("flinkid >", value, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidGreaterThanOrEqualTo(Long value) {
            addCriterion("flinkid >=", value, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidLessThan(Long value) {
            addCriterion("flinkid <", value, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidLessThanOrEqualTo(Long value) {
            addCriterion("flinkid <=", value, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidIn(List<Long> values) {
            addCriterion("flinkid in", values, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidNotIn(List<Long> values) {
            addCriterion("flinkid not in", values, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidBetween(Long value1, Long value2) {
            addCriterion("flinkid between", value1, value2, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFlinkidNotBetween(Long value1, Long value2) {
            addCriterion("flinkid not between", value1, value2, "flinkid");
            return (Criteria) this;
        }

        public Criteria andFflowidIsNull() {
            addCriterion("fflowid is null");
            return (Criteria) this;
        }

        public Criteria andFflowidIsNotNull() {
            addCriterion("fflowid is not null");
            return (Criteria) this;
        }

        public Criteria andFflowidEqualTo(String value) {
            addCriterion("fflowid =", value, "fflowid");
            return (Criteria) this;
        }

        public Criteria andFflowidNotEqualTo(String value) {
            addCriterion("fflowid <>", value, "fflowid");
            return (Criteria) this;
        }

        public Criteria andFflowidGreaterThan(String value) {
            addCriterion("fflowid >", value, "fflowid");
            return (Criteria) this;
        }

        public Criteria andFflowidGreaterThanOrEqualTo(String value) {
            addCriterion("fflowid >=", value, "fflowid");
            return (Criteria) this;
        }

        public Criteria andFflowidLessThan(String value) {
            addCriterion("fflowid <", value, "fflowid");
            return (Criteria) this;
        }

        public Criteria andFflowidLessThanOrEqualTo(String value) {
            addCriterion("fflowid <=", value, "fflowid");
            return (Criteria) this;
        }

        public Criteria andFflowidLike(String value) {
            addCriterion("fflowid like", value, "fflowid");
            return (Criteria) this;
        }

        public Criteria andFflowidNotLike(String value) {
            addCriterion("fflowid not like", value, "fflowid");
            return (Criteria) this;
        }

        public Criteria andFflowidIn(List<String> values) {
            addCriterion("fflowid in", values, "fflowid");
            return (Criteria) this;
        }

        public Criteria andFflowidNotIn(List<String> values) {
            addCriterion("fflowid not in", values, "fflowid");
            return (Criteria) this;
        }

        public Criteria andFflowidBetween(String value1, String value2) {
            addCriterion("fflowid between", value1, value2, "fflowid");
            return (Criteria) this;
        }

        public Criteria andFflowidNotBetween(String value1, String value2) {
            addCriterion("fflowid not between", value1, value2, "fflowid");
            return (Criteria) this;
        }

        public Criteria andFflowlineidIsNull() {
            addCriterion("fflowlineid is null");
            return (Criteria) this;
        }

        public Criteria andFflowlineidIsNotNull() {
            addCriterion("fflowlineid is not null");
            return (Criteria) this;
        }

        public Criteria andFflowlineidEqualTo(Integer value) {
            addCriterion("fflowlineid =", value, "fflowlineid");
            return (Criteria) this;
        }

        public Criteria andFflowlineidNotEqualTo(Integer value) {
            addCriterion("fflowlineid <>", value, "fflowlineid");
            return (Criteria) this;
        }

        public Criteria andFflowlineidGreaterThan(Integer value) {
            addCriterion("fflowlineid >", value, "fflowlineid");
            return (Criteria) this;
        }

        public Criteria andFflowlineidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fflowlineid >=", value, "fflowlineid");
            return (Criteria) this;
        }

        public Criteria andFflowlineidLessThan(Integer value) {
            addCriterion("fflowlineid <", value, "fflowlineid");
            return (Criteria) this;
        }

        public Criteria andFflowlineidLessThanOrEqualTo(Integer value) {
            addCriterion("fflowlineid <=", value, "fflowlineid");
            return (Criteria) this;
        }

        public Criteria andFflowlineidIn(List<Integer> values) {
            addCriterion("fflowlineid in", values, "fflowlineid");
            return (Criteria) this;
        }

        public Criteria andFflowlineidNotIn(List<Integer> values) {
            addCriterion("fflowlineid not in", values, "fflowlineid");
            return (Criteria) this;
        }

        public Criteria andFflowlineidBetween(Integer value1, Integer value2) {
            addCriterion("fflowlineid between", value1, value2, "fflowlineid");
            return (Criteria) this;
        }

        public Criteria andFflowlineidNotBetween(Integer value1, Integer value2) {
            addCriterion("fflowlineid not between", value1, value2, "fflowlineid");
            return (Criteria) this;
        }

        public Criteria andFruleidIsNull() {
            addCriterion("fruleid is null");
            return (Criteria) this;
        }

        public Criteria andFruleidIsNotNull() {
            addCriterion("fruleid is not null");
            return (Criteria) this;
        }

        public Criteria andFruleidEqualTo(String value) {
            addCriterion("fruleid =", value, "fruleid");
            return (Criteria) this;
        }

        public Criteria andFruleidNotEqualTo(String value) {
            addCriterion("fruleid <>", value, "fruleid");
            return (Criteria) this;
        }

        public Criteria andFruleidGreaterThan(String value) {
            addCriterion("fruleid >", value, "fruleid");
            return (Criteria) this;
        }

        public Criteria andFruleidGreaterThanOrEqualTo(String value) {
            addCriterion("fruleid >=", value, "fruleid");
            return (Criteria) this;
        }

        public Criteria andFruleidLessThan(String value) {
            addCriterion("fruleid <", value, "fruleid");
            return (Criteria) this;
        }

        public Criteria andFruleidLessThanOrEqualTo(String value) {
            addCriterion("fruleid <=", value, "fruleid");
            return (Criteria) this;
        }

        public Criteria andFruleidLike(String value) {
            addCriterion("fruleid like", value, "fruleid");
            return (Criteria) this;
        }

        public Criteria andFruleidNotLike(String value) {
            addCriterion("fruleid not like", value, "fruleid");
            return (Criteria) this;
        }

        public Criteria andFruleidIn(List<String> values) {
            addCriterion("fruleid in", values, "fruleid");
            return (Criteria) this;
        }

        public Criteria andFruleidNotIn(List<String> values) {
            addCriterion("fruleid not in", values, "fruleid");
            return (Criteria) this;
        }

        public Criteria andFruleidBetween(String value1, String value2) {
            addCriterion("fruleid between", value1, value2, "fruleid");
            return (Criteria) this;
        }

        public Criteria andFruleidNotBetween(String value1, String value2) {
            addCriterion("fruleid not between", value1, value2, "fruleid");
            return (Criteria) this;
        }

        public Criteria andFstableidIsNull() {
            addCriterion("fstableid is null");
            return (Criteria) this;
        }

        public Criteria andFstableidIsNotNull() {
            addCriterion("fstableid is not null");
            return (Criteria) this;
        }

        public Criteria andFstableidEqualTo(Integer value) {
            addCriterion("fstableid =", value, "fstableid");
            return (Criteria) this;
        }

        public Criteria andFstableidNotEqualTo(Integer value) {
            addCriterion("fstableid <>", value, "fstableid");
            return (Criteria) this;
        }

        public Criteria andFstableidGreaterThan(Integer value) {
            addCriterion("fstableid >", value, "fstableid");
            return (Criteria) this;
        }

        public Criteria andFstableidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fstableid >=", value, "fstableid");
            return (Criteria) this;
        }

        public Criteria andFstableidLessThan(Integer value) {
            addCriterion("fstableid <", value, "fstableid");
            return (Criteria) this;
        }

        public Criteria andFstableidLessThanOrEqualTo(Integer value) {
            addCriterion("fstableid <=", value, "fstableid");
            return (Criteria) this;
        }

        public Criteria andFstableidIn(List<Integer> values) {
            addCriterion("fstableid in", values, "fstableid");
            return (Criteria) this;
        }

        public Criteria andFstableidNotIn(List<Integer> values) {
            addCriterion("fstableid not in", values, "fstableid");
            return (Criteria) this;
        }

        public Criteria andFstableidBetween(Integer value1, Integer value2) {
            addCriterion("fstableid between", value1, value2, "fstableid");
            return (Criteria) this;
        }

        public Criteria andFstableidNotBetween(Integer value1, Integer value2) {
            addCriterion("fstableid not between", value1, value2, "fstableid");
            return (Criteria) this;
        }

        public Criteria andFstablenameIsNull() {
            addCriterion("fstablename is null");
            return (Criteria) this;
        }

        public Criteria andFstablenameIsNotNull() {
            addCriterion("fstablename is not null");
            return (Criteria) this;
        }

        public Criteria andFstablenameEqualTo(String value) {
            addCriterion("fstablename =", value, "fstablename");
            return (Criteria) this;
        }

        public Criteria andFstablenameNotEqualTo(String value) {
            addCriterion("fstablename <>", value, "fstablename");
            return (Criteria) this;
        }

        public Criteria andFstablenameGreaterThan(String value) {
            addCriterion("fstablename >", value, "fstablename");
            return (Criteria) this;
        }

        public Criteria andFstablenameGreaterThanOrEqualTo(String value) {
            addCriterion("fstablename >=", value, "fstablename");
            return (Criteria) this;
        }

        public Criteria andFstablenameLessThan(String value) {
            addCriterion("fstablename <", value, "fstablename");
            return (Criteria) this;
        }

        public Criteria andFstablenameLessThanOrEqualTo(String value) {
            addCriterion("fstablename <=", value, "fstablename");
            return (Criteria) this;
        }

        public Criteria andFstablenameLike(String value) {
            addCriterion("fstablename like", value, "fstablename");
            return (Criteria) this;
        }

        public Criteria andFstablenameNotLike(String value) {
            addCriterion("fstablename not like", value, "fstablename");
            return (Criteria) this;
        }

        public Criteria andFstablenameIn(List<String> values) {
            addCriterion("fstablename in", values, "fstablename");
            return (Criteria) this;
        }

        public Criteria andFstablenameNotIn(List<String> values) {
            addCriterion("fstablename not in", values, "fstablename");
            return (Criteria) this;
        }

        public Criteria andFstablenameBetween(String value1, String value2) {
            addCriterion("fstablename between", value1, value2, "fstablename");
            return (Criteria) this;
        }

        public Criteria andFstablenameNotBetween(String value1, String value2) {
            addCriterion("fstablename not between", value1, value2, "fstablename");
            return (Criteria) this;
        }

        public Criteria andFsbillidIsNull() {
            addCriterion("fsbillid is null");
            return (Criteria) this;
        }

        public Criteria andFsbillidIsNotNull() {
            addCriterion("fsbillid is not null");
            return (Criteria) this;
        }

        public Criteria andFsbillidEqualTo(String value) {
            addCriterion("fsbillid =", value, "fsbillid");
            return (Criteria) this;
        }

        public Criteria andFsbillidNotEqualTo(String value) {
            addCriterion("fsbillid <>", value, "fsbillid");
            return (Criteria) this;
        }

        public Criteria andFsbillidGreaterThan(String value) {
            addCriterion("fsbillid >", value, "fsbillid");
            return (Criteria) this;
        }

        public Criteria andFsbillidGreaterThanOrEqualTo(String value) {
            addCriterion("fsbillid >=", value, "fsbillid");
            return (Criteria) this;
        }

        public Criteria andFsbillidLessThan(String value) {
            addCriterion("fsbillid <", value, "fsbillid");
            return (Criteria) this;
        }

        public Criteria andFsbillidLessThanOrEqualTo(String value) {
            addCriterion("fsbillid <=", value, "fsbillid");
            return (Criteria) this;
        }

        public Criteria andFsbillidLike(String value) {
            addCriterion("fsbillid like", value, "fsbillid");
            return (Criteria) this;
        }

        public Criteria andFsbillidNotLike(String value) {
            addCriterion("fsbillid not like", value, "fsbillid");
            return (Criteria) this;
        }

        public Criteria andFsbillidIn(List<String> values) {
            addCriterion("fsbillid in", values, "fsbillid");
            return (Criteria) this;
        }

        public Criteria andFsbillidNotIn(List<String> values) {
            addCriterion("fsbillid not in", values, "fsbillid");
            return (Criteria) this;
        }

        public Criteria andFsbillidBetween(String value1, String value2) {
            addCriterion("fsbillid between", value1, value2, "fsbillid");
            return (Criteria) this;
        }

        public Criteria andFsbillidNotBetween(String value1, String value2) {
            addCriterion("fsbillid not between", value1, value2, "fsbillid");
            return (Criteria) this;
        }

        public Criteria andFsidIsNull() {
            addCriterion("fsid is null");
            return (Criteria) this;
        }

        public Criteria andFsidIsNotNull() {
            addCriterion("fsid is not null");
            return (Criteria) this;
        }

        public Criteria andFsidEqualTo(String value) {
            addCriterion("fsid =", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidNotEqualTo(String value) {
            addCriterion("fsid <>", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidGreaterThan(String value) {
            addCriterion("fsid >", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidGreaterThanOrEqualTo(String value) {
            addCriterion("fsid >=", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidLessThan(String value) {
            addCriterion("fsid <", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidLessThanOrEqualTo(String value) {
            addCriterion("fsid <=", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidLike(String value) {
            addCriterion("fsid like", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidNotLike(String value) {
            addCriterion("fsid not like", value, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidIn(List<String> values) {
            addCriterion("fsid in", values, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidNotIn(List<String> values) {
            addCriterion("fsid not in", values, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidBetween(String value1, String value2) {
            addCriterion("fsid between", value1, value2, "fsid");
            return (Criteria) this;
        }

        public Criteria andFsidNotBetween(String value1, String value2) {
            addCriterion("fsid not between", value1, value2, "fsid");
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