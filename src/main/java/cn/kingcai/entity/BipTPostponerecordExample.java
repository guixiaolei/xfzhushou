package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTPostponerecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTPostponerecordExample() {
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

        public Criteria andFBipApplydateIsNull() {
            addCriterion("f_bip_applydate is null");
            return (Criteria) this;
        }

        public Criteria andFBipApplydateIsNotNull() {
            addCriterion("f_bip_applydate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipApplydateEqualTo(Date value) {
            addCriterion("f_bip_applydate =", value, "fBipApplydate");
            return (Criteria) this;
        }

        public Criteria andFBipApplydateNotEqualTo(Date value) {
            addCriterion("f_bip_applydate <>", value, "fBipApplydate");
            return (Criteria) this;
        }

        public Criteria andFBipApplydateGreaterThan(Date value) {
            addCriterion("f_bip_applydate >", value, "fBipApplydate");
            return (Criteria) this;
        }

        public Criteria andFBipApplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_applydate >=", value, "fBipApplydate");
            return (Criteria) this;
        }

        public Criteria andFBipApplydateLessThan(Date value) {
            addCriterion("f_bip_applydate <", value, "fBipApplydate");
            return (Criteria) this;
        }

        public Criteria andFBipApplydateLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_applydate <=", value, "fBipApplydate");
            return (Criteria) this;
        }

        public Criteria andFBipApplydateIn(List<Date> values) {
            addCriterion("f_bip_applydate in", values, "fBipApplydate");
            return (Criteria) this;
        }

        public Criteria andFBipApplydateNotIn(List<Date> values) {
            addCriterion("f_bip_applydate not in", values, "fBipApplydate");
            return (Criteria) this;
        }

        public Criteria andFBipApplydateBetween(Date value1, Date value2) {
            addCriterion("f_bip_applydate between", value1, value2, "fBipApplydate");
            return (Criteria) this;
        }

        public Criteria andFBipApplydateNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_applydate not between", value1, value2, "fBipApplydate");
            return (Criteria) this;
        }

        public Criteria andFBipOverdateIsNull() {
            addCriterion("f_bip_overdate is null");
            return (Criteria) this;
        }

        public Criteria andFBipOverdateIsNotNull() {
            addCriterion("f_bip_overdate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipOverdateEqualTo(Date value) {
            addCriterion("f_bip_overdate =", value, "fBipOverdate");
            return (Criteria) this;
        }

        public Criteria andFBipOverdateNotEqualTo(Date value) {
            addCriterion("f_bip_overdate <>", value, "fBipOverdate");
            return (Criteria) this;
        }

        public Criteria andFBipOverdateGreaterThan(Date value) {
            addCriterion("f_bip_overdate >", value, "fBipOverdate");
            return (Criteria) this;
        }

        public Criteria andFBipOverdateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_overdate >=", value, "fBipOverdate");
            return (Criteria) this;
        }

        public Criteria andFBipOverdateLessThan(Date value) {
            addCriterion("f_bip_overdate <", value, "fBipOverdate");
            return (Criteria) this;
        }

        public Criteria andFBipOverdateLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_overdate <=", value, "fBipOverdate");
            return (Criteria) this;
        }

        public Criteria andFBipOverdateIn(List<Date> values) {
            addCriterion("f_bip_overdate in", values, "fBipOverdate");
            return (Criteria) this;
        }

        public Criteria andFBipOverdateNotIn(List<Date> values) {
            addCriterion("f_bip_overdate not in", values, "fBipOverdate");
            return (Criteria) this;
        }

        public Criteria andFBipOverdateBetween(Date value1, Date value2) {
            addCriterion("f_bip_overdate between", value1, value2, "fBipOverdate");
            return (Criteria) this;
        }

        public Criteria andFBipOverdateNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_overdate not between", value1, value2, "fBipOverdate");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonIsNull() {
            addCriterion("f_bip_applyreason is null");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonIsNotNull() {
            addCriterion("f_bip_applyreason is not null");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonEqualTo(String value) {
            addCriterion("f_bip_applyreason =", value, "fBipApplyreason");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonNotEqualTo(String value) {
            addCriterion("f_bip_applyreason <>", value, "fBipApplyreason");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonGreaterThan(String value) {
            addCriterion("f_bip_applyreason >", value, "fBipApplyreason");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_applyreason >=", value, "fBipApplyreason");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonLessThan(String value) {
            addCriterion("f_bip_applyreason <", value, "fBipApplyreason");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonLessThanOrEqualTo(String value) {
            addCriterion("f_bip_applyreason <=", value, "fBipApplyreason");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonLike(String value) {
            addCriterion("f_bip_applyreason like", value, "fBipApplyreason");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonNotLike(String value) {
            addCriterion("f_bip_applyreason not like", value, "fBipApplyreason");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonIn(List<String> values) {
            addCriterion("f_bip_applyreason in", values, "fBipApplyreason");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonNotIn(List<String> values) {
            addCriterion("f_bip_applyreason not in", values, "fBipApplyreason");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonBetween(String value1, String value2) {
            addCriterion("f_bip_applyreason between", value1, value2, "fBipApplyreason");
            return (Criteria) this;
        }

        public Criteria andFBipApplyreasonNotBetween(String value1, String value2) {
            addCriterion("f_bip_applyreason not between", value1, value2, "fBipApplyreason");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonIsNull() {
            addCriterion("f_bip_recordperson is null");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonIsNotNull() {
            addCriterion("f_bip_recordperson is not null");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonEqualTo(String value) {
            addCriterion("f_bip_recordperson =", value, "fBipRecordperson");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonNotEqualTo(String value) {
            addCriterion("f_bip_recordperson <>", value, "fBipRecordperson");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonGreaterThan(String value) {
            addCriterion("f_bip_recordperson >", value, "fBipRecordperson");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_recordperson >=", value, "fBipRecordperson");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonLessThan(String value) {
            addCriterion("f_bip_recordperson <", value, "fBipRecordperson");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonLessThanOrEqualTo(String value) {
            addCriterion("f_bip_recordperson <=", value, "fBipRecordperson");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonLike(String value) {
            addCriterion("f_bip_recordperson like", value, "fBipRecordperson");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonNotLike(String value) {
            addCriterion("f_bip_recordperson not like", value, "fBipRecordperson");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonIn(List<String> values) {
            addCriterion("f_bip_recordperson in", values, "fBipRecordperson");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonNotIn(List<String> values) {
            addCriterion("f_bip_recordperson not in", values, "fBipRecordperson");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonBetween(String value1, String value2) {
            addCriterion("f_bip_recordperson between", value1, value2, "fBipRecordperson");
            return (Criteria) this;
        }

        public Criteria andFBipRecordpersonNotBetween(String value1, String value2) {
            addCriterion("f_bip_recordperson not between", value1, value2, "fBipRecordperson");
            return (Criteria) this;
        }

        public Criteria andFBipCratedateIsNull() {
            addCriterion("f_bip_cratedate is null");
            return (Criteria) this;
        }

        public Criteria andFBipCratedateIsNotNull() {
            addCriterion("f_bip_cratedate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCratedateEqualTo(Date value) {
            addCriterion("f_bip_cratedate =", value, "fBipCratedate");
            return (Criteria) this;
        }

        public Criteria andFBipCratedateNotEqualTo(Date value) {
            addCriterion("f_bip_cratedate <>", value, "fBipCratedate");
            return (Criteria) this;
        }

        public Criteria andFBipCratedateGreaterThan(Date value) {
            addCriterion("f_bip_cratedate >", value, "fBipCratedate");
            return (Criteria) this;
        }

        public Criteria andFBipCratedateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_cratedate >=", value, "fBipCratedate");
            return (Criteria) this;
        }

        public Criteria andFBipCratedateLessThan(Date value) {
            addCriterion("f_bip_cratedate <", value, "fBipCratedate");
            return (Criteria) this;
        }

        public Criteria andFBipCratedateLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_cratedate <=", value, "fBipCratedate");
            return (Criteria) this;
        }

        public Criteria andFBipCratedateIn(List<Date> values) {
            addCriterion("f_bip_cratedate in", values, "fBipCratedate");
            return (Criteria) this;
        }

        public Criteria andFBipCratedateNotIn(List<Date> values) {
            addCriterion("f_bip_cratedate not in", values, "fBipCratedate");
            return (Criteria) this;
        }

        public Criteria andFBipCratedateBetween(Date value1, Date value2) {
            addCriterion("f_bip_cratedate between", value1, value2, "fBipCratedate");
            return (Criteria) this;
        }

        public Criteria andFBipCratedateNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_cratedate not between", value1, value2, "fBipCratedate");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateIsNull() {
            addCriterion("f_bip_processstate is null");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateIsNotNull() {
            addCriterion("f_bip_processstate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateEqualTo(String value) {
            addCriterion("f_bip_processstate =", value, "fBipProcessstate");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateNotEqualTo(String value) {
            addCriterion("f_bip_processstate <>", value, "fBipProcessstate");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateGreaterThan(String value) {
            addCriterion("f_bip_processstate >", value, "fBipProcessstate");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_processstate >=", value, "fBipProcessstate");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateLessThan(String value) {
            addCriterion("f_bip_processstate <", value, "fBipProcessstate");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateLessThanOrEqualTo(String value) {
            addCriterion("f_bip_processstate <=", value, "fBipProcessstate");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateLike(String value) {
            addCriterion("f_bip_processstate like", value, "fBipProcessstate");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateNotLike(String value) {
            addCriterion("f_bip_processstate not like", value, "fBipProcessstate");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateIn(List<String> values) {
            addCriterion("f_bip_processstate in", values, "fBipProcessstate");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateNotIn(List<String> values) {
            addCriterion("f_bip_processstate not in", values, "fBipProcessstate");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateBetween(String value1, String value2) {
            addCriterion("f_bip_processstate between", value1, value2, "fBipProcessstate");
            return (Criteria) this;
        }

        public Criteria andFBipProcessstateNotBetween(String value1, String value2) {
            addCriterion("f_bip_processstate not between", value1, value2, "fBipProcessstate");
            return (Criteria) this;
        }

        public Criteria andFBipDateIsNull() {
            addCriterion("f_bip_date is null");
            return (Criteria) this;
        }

        public Criteria andFBipDateIsNotNull() {
            addCriterion("f_bip_date is not null");
            return (Criteria) this;
        }

        public Criteria andFBipDateEqualTo(Date value) {
            addCriterion("f_bip_date =", value, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateNotEqualTo(Date value) {
            addCriterion("f_bip_date <>", value, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateGreaterThan(Date value) {
            addCriterion("f_bip_date >", value, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_date >=", value, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateLessThan(Date value) {
            addCriterion("f_bip_date <", value, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_date <=", value, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateIn(List<Date> values) {
            addCriterion("f_bip_date in", values, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateNotIn(List<Date> values) {
            addCriterion("f_bip_date not in", values, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateBetween(Date value1, Date value2) {
            addCriterion("f_bip_date between", value1, value2, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipDateNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_date not between", value1, value2, "fBipDate");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateIsNull() {
            addCriterion("f_bip_isfirstdate is null");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateIsNotNull() {
            addCriterion("f_bip_isfirstdate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateEqualTo(String value) {
            addCriterion("f_bip_isfirstdate =", value, "fBipIsfirstdate");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateNotEqualTo(String value) {
            addCriterion("f_bip_isfirstdate <>", value, "fBipIsfirstdate");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateGreaterThan(String value) {
            addCriterion("f_bip_isfirstdate >", value, "fBipIsfirstdate");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_isfirstdate >=", value, "fBipIsfirstdate");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateLessThan(String value) {
            addCriterion("f_bip_isfirstdate <", value, "fBipIsfirstdate");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateLessThanOrEqualTo(String value) {
            addCriterion("f_bip_isfirstdate <=", value, "fBipIsfirstdate");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateLike(String value) {
            addCriterion("f_bip_isfirstdate like", value, "fBipIsfirstdate");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateNotLike(String value) {
            addCriterion("f_bip_isfirstdate not like", value, "fBipIsfirstdate");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateIn(List<String> values) {
            addCriterion("f_bip_isfirstdate in", values, "fBipIsfirstdate");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateNotIn(List<String> values) {
            addCriterion("f_bip_isfirstdate not in", values, "fBipIsfirstdate");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateBetween(String value1, String value2) {
            addCriterion("f_bip_isfirstdate between", value1, value2, "fBipIsfirstdate");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstdateNotBetween(String value1, String value2) {
            addCriterion("f_bip_isfirstdate not between", value1, value2, "fBipIsfirstdate");
            return (Criteria) this;
        }

        public Criteria andFoperatorIsNull() {
            addCriterion("foperator is null");
            return (Criteria) this;
        }

        public Criteria andFoperatorIsNotNull() {
            addCriterion("foperator is not null");
            return (Criteria) this;
        }

        public Criteria andFoperatorEqualTo(String value) {
            addCriterion("foperator =", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorNotEqualTo(String value) {
            addCriterion("foperator <>", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorGreaterThan(String value) {
            addCriterion("foperator >", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorGreaterThanOrEqualTo(String value) {
            addCriterion("foperator >=", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorLessThan(String value) {
            addCriterion("foperator <", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorLessThanOrEqualTo(String value) {
            addCriterion("foperator <=", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorLike(String value) {
            addCriterion("foperator like", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorNotLike(String value) {
            addCriterion("foperator not like", value, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorIn(List<String> values) {
            addCriterion("foperator in", values, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorNotIn(List<String> values) {
            addCriterion("foperator not in", values, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorBetween(String value1, String value2) {
            addCriterion("foperator between", value1, value2, "foperator");
            return (Criteria) this;
        }

        public Criteria andFoperatorNotBetween(String value1, String value2) {
            addCriterion("foperator not between", value1, value2, "foperator");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonIsNull() {
            addCriterion("f_bip_delayreason is null");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonIsNotNull() {
            addCriterion("f_bip_delayreason is not null");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonEqualTo(String value) {
            addCriterion("f_bip_delayreason =", value, "fBipDelayreason");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonNotEqualTo(String value) {
            addCriterion("f_bip_delayreason <>", value, "fBipDelayreason");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonGreaterThan(String value) {
            addCriterion("f_bip_delayreason >", value, "fBipDelayreason");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_delayreason >=", value, "fBipDelayreason");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonLessThan(String value) {
            addCriterion("f_bip_delayreason <", value, "fBipDelayreason");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonLessThanOrEqualTo(String value) {
            addCriterion("f_bip_delayreason <=", value, "fBipDelayreason");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonLike(String value) {
            addCriterion("f_bip_delayreason like", value, "fBipDelayreason");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonNotLike(String value) {
            addCriterion("f_bip_delayreason not like", value, "fBipDelayreason");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonIn(List<String> values) {
            addCriterion("f_bip_delayreason in", values, "fBipDelayreason");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonNotIn(List<String> values) {
            addCriterion("f_bip_delayreason not in", values, "fBipDelayreason");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonBetween(String value1, String value2) {
            addCriterion("f_bip_delayreason between", value1, value2, "fBipDelayreason");
            return (Criteria) this;
        }

        public Criteria andFBipDelayreasonNotBetween(String value1, String value2) {
            addCriterion("f_bip_delayreason not between", value1, value2, "fBipDelayreason");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateIsNull() {
            addCriterion("f_bip_issystemupdate is null");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateIsNotNull() {
            addCriterion("f_bip_issystemupdate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateEqualTo(String value) {
            addCriterion("f_bip_issystemupdate =", value, "fBipIssystemupdate");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateNotEqualTo(String value) {
            addCriterion("f_bip_issystemupdate <>", value, "fBipIssystemupdate");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateGreaterThan(String value) {
            addCriterion("f_bip_issystemupdate >", value, "fBipIssystemupdate");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_issystemupdate >=", value, "fBipIssystemupdate");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateLessThan(String value) {
            addCriterion("f_bip_issystemupdate <", value, "fBipIssystemupdate");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateLessThanOrEqualTo(String value) {
            addCriterion("f_bip_issystemupdate <=", value, "fBipIssystemupdate");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateLike(String value) {
            addCriterion("f_bip_issystemupdate like", value, "fBipIssystemupdate");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateNotLike(String value) {
            addCriterion("f_bip_issystemupdate not like", value, "fBipIssystemupdate");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateIn(List<String> values) {
            addCriterion("f_bip_issystemupdate in", values, "fBipIssystemupdate");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateNotIn(List<String> values) {
            addCriterion("f_bip_issystemupdate not in", values, "fBipIssystemupdate");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateBetween(String value1, String value2) {
            addCriterion("f_bip_issystemupdate between", value1, value2, "fBipIssystemupdate");
            return (Criteria) this;
        }

        public Criteria andFBipIssystemupdateNotBetween(String value1, String value2) {
            addCriterion("f_bip_issystemupdate not between", value1, value2, "fBipIssystemupdate");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayIsNull() {
            addCriterion("f_bip_isdelay is null");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayIsNotNull() {
            addCriterion("f_bip_isdelay is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayEqualTo(String value) {
            addCriterion("f_bip_isdelay =", value, "fBipIsdelay");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayNotEqualTo(String value) {
            addCriterion("f_bip_isdelay <>", value, "fBipIsdelay");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayGreaterThan(String value) {
            addCriterion("f_bip_isdelay >", value, "fBipIsdelay");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_isdelay >=", value, "fBipIsdelay");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayLessThan(String value) {
            addCriterion("f_bip_isdelay <", value, "fBipIsdelay");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayLessThanOrEqualTo(String value) {
            addCriterion("f_bip_isdelay <=", value, "fBipIsdelay");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayLike(String value) {
            addCriterion("f_bip_isdelay like", value, "fBipIsdelay");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayNotLike(String value) {
            addCriterion("f_bip_isdelay not like", value, "fBipIsdelay");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayIn(List<String> values) {
            addCriterion("f_bip_isdelay in", values, "fBipIsdelay");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayNotIn(List<String> values) {
            addCriterion("f_bip_isdelay not in", values, "fBipIsdelay");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayBetween(String value1, String value2) {
            addCriterion("f_bip_isdelay between", value1, value2, "fBipIsdelay");
            return (Criteria) this;
        }

        public Criteria andFBipIsdelayNotBetween(String value1, String value2) {
            addCriterion("f_bip_isdelay not between", value1, value2, "fBipIsdelay");
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