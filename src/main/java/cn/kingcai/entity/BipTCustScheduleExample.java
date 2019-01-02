package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTCustScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTCustScheduleExample() {
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

        public Criteria andFbillnoIsNull() {
            addCriterion("fbillno is null");
            return (Criteria) this;
        }

        public Criteria andFbillnoIsNotNull() {
            addCriterion("fbillno is not null");
            return (Criteria) this;
        }

        public Criteria andFbillnoEqualTo(String value) {
            addCriterion("fbillno =", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoNotEqualTo(String value) {
            addCriterion("fbillno <>", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoGreaterThan(String value) {
            addCriterion("fbillno >", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoGreaterThanOrEqualTo(String value) {
            addCriterion("fbillno >=", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoLessThan(String value) {
            addCriterion("fbillno <", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoLessThanOrEqualTo(String value) {
            addCriterion("fbillno <=", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoLike(String value) {
            addCriterion("fbillno like", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoNotLike(String value) {
            addCriterion("fbillno not like", value, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoIn(List<String> values) {
            addCriterion("fbillno in", values, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoNotIn(List<String> values) {
            addCriterion("fbillno not in", values, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoBetween(String value1, String value2) {
            addCriterion("fbillno between", value1, value2, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFbillnoNotBetween(String value1, String value2) {
            addCriterion("fbillno not between", value1, value2, "fbillno");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusIsNull() {
            addCriterion("fdocumentstatus is null");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusIsNotNull() {
            addCriterion("fdocumentstatus is not null");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusEqualTo(String value) {
            addCriterion("fdocumentstatus =", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusNotEqualTo(String value) {
            addCriterion("fdocumentstatus <>", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusGreaterThan(String value) {
            addCriterion("fdocumentstatus >", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusGreaterThanOrEqualTo(String value) {
            addCriterion("fdocumentstatus >=", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusLessThan(String value) {
            addCriterion("fdocumentstatus <", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusLessThanOrEqualTo(String value) {
            addCriterion("fdocumentstatus <=", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusLike(String value) {
            addCriterion("fdocumentstatus like", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusNotLike(String value) {
            addCriterion("fdocumentstatus not like", value, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusIn(List<String> values) {
            addCriterion("fdocumentstatus in", values, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusNotIn(List<String> values) {
            addCriterion("fdocumentstatus not in", values, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusBetween(String value1, String value2) {
            addCriterion("fdocumentstatus between", value1, value2, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFdocumentstatusNotBetween(String value1, String value2) {
            addCriterion("fdocumentstatus not between", value1, value2, "fdocumentstatus");
            return (Criteria) this;
        }

        public Criteria andFBipStartdatetimeIsNull() {
            addCriterion("f_bip_startdatetime is null");
            return (Criteria) this;
        }

        public Criteria andFBipStartdatetimeIsNotNull() {
            addCriterion("f_bip_startdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipStartdatetimeEqualTo(Date value) {
            addCriterion("f_bip_startdatetime =", value, "fBipStartdatetime");
            return (Criteria) this;
        }

        public Criteria andFBipStartdatetimeNotEqualTo(Date value) {
            addCriterion("f_bip_startdatetime <>", value, "fBipStartdatetime");
            return (Criteria) this;
        }

        public Criteria andFBipStartdatetimeGreaterThan(Date value) {
            addCriterion("f_bip_startdatetime >", value, "fBipStartdatetime");
            return (Criteria) this;
        }

        public Criteria andFBipStartdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_startdatetime >=", value, "fBipStartdatetime");
            return (Criteria) this;
        }

        public Criteria andFBipStartdatetimeLessThan(Date value) {
            addCriterion("f_bip_startdatetime <", value, "fBipStartdatetime");
            return (Criteria) this;
        }

        public Criteria andFBipStartdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_startdatetime <=", value, "fBipStartdatetime");
            return (Criteria) this;
        }

        public Criteria andFBipStartdatetimeIn(List<Date> values) {
            addCriterion("f_bip_startdatetime in", values, "fBipStartdatetime");
            return (Criteria) this;
        }

        public Criteria andFBipStartdatetimeNotIn(List<Date> values) {
            addCriterion("f_bip_startdatetime not in", values, "fBipStartdatetime");
            return (Criteria) this;
        }

        public Criteria andFBipStartdatetimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_startdatetime between", value1, value2, "fBipStartdatetime");
            return (Criteria) this;
        }

        public Criteria andFBipStartdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_startdatetime not between", value1, value2, "fBipStartdatetime");
            return (Criteria) this;
        }

        public Criteria andFBipEnddatetimeIsNull() {
            addCriterion("f_bip_enddatetime is null");
            return (Criteria) this;
        }

        public Criteria andFBipEnddatetimeIsNotNull() {
            addCriterion("f_bip_enddatetime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipEnddatetimeEqualTo(Date value) {
            addCriterion("f_bip_enddatetime =", value, "fBipEnddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipEnddatetimeNotEqualTo(Date value) {
            addCriterion("f_bip_enddatetime <>", value, "fBipEnddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipEnddatetimeGreaterThan(Date value) {
            addCriterion("f_bip_enddatetime >", value, "fBipEnddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipEnddatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_enddatetime >=", value, "fBipEnddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipEnddatetimeLessThan(Date value) {
            addCriterion("f_bip_enddatetime <", value, "fBipEnddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipEnddatetimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_enddatetime <=", value, "fBipEnddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipEnddatetimeIn(List<Date> values) {
            addCriterion("f_bip_enddatetime in", values, "fBipEnddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipEnddatetimeNotIn(List<Date> values) {
            addCriterion("f_bip_enddatetime not in", values, "fBipEnddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipEnddatetimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_enddatetime between", value1, value2, "fBipEnddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipEnddatetimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_enddatetime not between", value1, value2, "fBipEnddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipReminddatetimeIsNull() {
            addCriterion("f_bip_reminddatetime is null");
            return (Criteria) this;
        }

        public Criteria andFBipReminddatetimeIsNotNull() {
            addCriterion("f_bip_reminddatetime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipReminddatetimeEqualTo(Date value) {
            addCriterion("f_bip_reminddatetime =", value, "fBipReminddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipReminddatetimeNotEqualTo(Date value) {
            addCriterion("f_bip_reminddatetime <>", value, "fBipReminddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipReminddatetimeGreaterThan(Date value) {
            addCriterion("f_bip_reminddatetime >", value, "fBipReminddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipReminddatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_reminddatetime >=", value, "fBipReminddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipReminddatetimeLessThan(Date value) {
            addCriterion("f_bip_reminddatetime <", value, "fBipReminddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipReminddatetimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_reminddatetime <=", value, "fBipReminddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipReminddatetimeIn(List<Date> values) {
            addCriterion("f_bip_reminddatetime in", values, "fBipReminddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipReminddatetimeNotIn(List<Date> values) {
            addCriterion("f_bip_reminddatetime not in", values, "fBipReminddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipReminddatetimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_reminddatetime between", value1, value2, "fBipReminddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipReminddatetimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_reminddatetime not between", value1, value2, "fBipReminddatetime");
            return (Criteria) this;
        }

        public Criteria andFBipThemeIsNull() {
            addCriterion("f_bip_theme is null");
            return (Criteria) this;
        }

        public Criteria andFBipThemeIsNotNull() {
            addCriterion("f_bip_theme is not null");
            return (Criteria) this;
        }

        public Criteria andFBipThemeEqualTo(String value) {
            addCriterion("f_bip_theme =", value, "fBipTheme");
            return (Criteria) this;
        }

        public Criteria andFBipThemeNotEqualTo(String value) {
            addCriterion("f_bip_theme <>", value, "fBipTheme");
            return (Criteria) this;
        }

        public Criteria andFBipThemeGreaterThan(String value) {
            addCriterion("f_bip_theme >", value, "fBipTheme");
            return (Criteria) this;
        }

        public Criteria andFBipThemeGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_theme >=", value, "fBipTheme");
            return (Criteria) this;
        }

        public Criteria andFBipThemeLessThan(String value) {
            addCriterion("f_bip_theme <", value, "fBipTheme");
            return (Criteria) this;
        }

        public Criteria andFBipThemeLessThanOrEqualTo(String value) {
            addCriterion("f_bip_theme <=", value, "fBipTheme");
            return (Criteria) this;
        }

        public Criteria andFBipThemeLike(String value) {
            addCriterion("f_bip_theme like", value, "fBipTheme");
            return (Criteria) this;
        }

        public Criteria andFBipThemeNotLike(String value) {
            addCriterion("f_bip_theme not like", value, "fBipTheme");
            return (Criteria) this;
        }

        public Criteria andFBipThemeIn(List<String> values) {
            addCriterion("f_bip_theme in", values, "fBipTheme");
            return (Criteria) this;
        }

        public Criteria andFBipThemeNotIn(List<String> values) {
            addCriterion("f_bip_theme not in", values, "fBipTheme");
            return (Criteria) this;
        }

        public Criteria andFBipThemeBetween(String value1, String value2) {
            addCriterion("f_bip_theme between", value1, value2, "fBipTheme");
            return (Criteria) this;
        }

        public Criteria andFBipThemeNotBetween(String value1, String value2) {
            addCriterion("f_bip_theme not between", value1, value2, "fBipTheme");
            return (Criteria) this;
        }

        public Criteria andFBipTypeIsNull() {
            addCriterion("f_bip_type is null");
            return (Criteria) this;
        }

        public Criteria andFBipTypeIsNotNull() {
            addCriterion("f_bip_type is not null");
            return (Criteria) this;
        }

        public Criteria andFBipTypeEqualTo(String value) {
            addCriterion("f_bip_type =", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeNotEqualTo(String value) {
            addCriterion("f_bip_type <>", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeGreaterThan(String value) {
            addCriterion("f_bip_type >", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_type >=", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeLessThan(String value) {
            addCriterion("f_bip_type <", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeLessThanOrEqualTo(String value) {
            addCriterion("f_bip_type <=", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeLike(String value) {
            addCriterion("f_bip_type like", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeNotLike(String value) {
            addCriterion("f_bip_type not like", value, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeIn(List<String> values) {
            addCriterion("f_bip_type in", values, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeNotIn(List<String> values) {
            addCriterion("f_bip_type not in", values, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeBetween(String value1, String value2) {
            addCriterion("f_bip_type between", value1, value2, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipTypeNotBetween(String value1, String value2) {
            addCriterion("f_bip_type not between", value1, value2, "fBipType");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceIsNull() {
            addCriterion("f_bip_importance is null");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceIsNotNull() {
            addCriterion("f_bip_importance is not null");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceEqualTo(String value) {
            addCriterion("f_bip_importance =", value, "fBipImportance");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceNotEqualTo(String value) {
            addCriterion("f_bip_importance <>", value, "fBipImportance");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceGreaterThan(String value) {
            addCriterion("f_bip_importance >", value, "fBipImportance");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_importance >=", value, "fBipImportance");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceLessThan(String value) {
            addCriterion("f_bip_importance <", value, "fBipImportance");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceLessThanOrEqualTo(String value) {
            addCriterion("f_bip_importance <=", value, "fBipImportance");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceLike(String value) {
            addCriterion("f_bip_importance like", value, "fBipImportance");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceNotLike(String value) {
            addCriterion("f_bip_importance not like", value, "fBipImportance");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceIn(List<String> values) {
            addCriterion("f_bip_importance in", values, "fBipImportance");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceNotIn(List<String> values) {
            addCriterion("f_bip_importance not in", values, "fBipImportance");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceBetween(String value1, String value2) {
            addCriterion("f_bip_importance between", value1, value2, "fBipImportance");
            return (Criteria) this;
        }

        public Criteria andFBipImportanceNotBetween(String value1, String value2) {
            addCriterion("f_bip_importance not between", value1, value2, "fBipImportance");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsIsNull() {
            addCriterion("f_bip_participants is null");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsIsNotNull() {
            addCriterion("f_bip_participants is not null");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsEqualTo(String value) {
            addCriterion("f_bip_participants =", value, "fBipParticipants");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsNotEqualTo(String value) {
            addCriterion("f_bip_participants <>", value, "fBipParticipants");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsGreaterThan(String value) {
            addCriterion("f_bip_participants >", value, "fBipParticipants");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_participants >=", value, "fBipParticipants");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsLessThan(String value) {
            addCriterion("f_bip_participants <", value, "fBipParticipants");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsLessThanOrEqualTo(String value) {
            addCriterion("f_bip_participants <=", value, "fBipParticipants");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsLike(String value) {
            addCriterion("f_bip_participants like", value, "fBipParticipants");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsNotLike(String value) {
            addCriterion("f_bip_participants not like", value, "fBipParticipants");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsIn(List<String> values) {
            addCriterion("f_bip_participants in", values, "fBipParticipants");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsNotIn(List<String> values) {
            addCriterion("f_bip_participants not in", values, "fBipParticipants");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsBetween(String value1, String value2) {
            addCriterion("f_bip_participants between", value1, value2, "fBipParticipants");
            return (Criteria) this;
        }

        public Criteria andFBipParticipantsNotBetween(String value1, String value2) {
            addCriterion("f_bip_participants not between", value1, value2, "fBipParticipants");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileIsNull() {
            addCriterion("f_bip_needfile is null");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileIsNotNull() {
            addCriterion("f_bip_needfile is not null");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileEqualTo(String value) {
            addCriterion("f_bip_needfile =", value, "fBipNeedfile");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileNotEqualTo(String value) {
            addCriterion("f_bip_needfile <>", value, "fBipNeedfile");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileGreaterThan(String value) {
            addCriterion("f_bip_needfile >", value, "fBipNeedfile");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_needfile >=", value, "fBipNeedfile");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileLessThan(String value) {
            addCriterion("f_bip_needfile <", value, "fBipNeedfile");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileLessThanOrEqualTo(String value) {
            addCriterion("f_bip_needfile <=", value, "fBipNeedfile");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileLike(String value) {
            addCriterion("f_bip_needfile like", value, "fBipNeedfile");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileNotLike(String value) {
            addCriterion("f_bip_needfile not like", value, "fBipNeedfile");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileIn(List<String> values) {
            addCriterion("f_bip_needfile in", values, "fBipNeedfile");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileNotIn(List<String> values) {
            addCriterion("f_bip_needfile not in", values, "fBipNeedfile");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileBetween(String value1, String value2) {
            addCriterion("f_bip_needfile between", value1, value2, "fBipNeedfile");
            return (Criteria) this;
        }

        public Criteria andFBipNeedfileNotBetween(String value1, String value2) {
            addCriterion("f_bip_needfile not between", value1, value2, "fBipNeedfile");
            return (Criteria) this;
        }

        public Criteria andFBipFinishIsNull() {
            addCriterion("f_bip_finish is null");
            return (Criteria) this;
        }

        public Criteria andFBipFinishIsNotNull() {
            addCriterion("f_bip_finish is not null");
            return (Criteria) this;
        }

        public Criteria andFBipFinishEqualTo(String value) {
            addCriterion("f_bip_finish =", value, "fBipFinish");
            return (Criteria) this;
        }

        public Criteria andFBipFinishNotEqualTo(String value) {
            addCriterion("f_bip_finish <>", value, "fBipFinish");
            return (Criteria) this;
        }

        public Criteria andFBipFinishGreaterThan(String value) {
            addCriterion("f_bip_finish >", value, "fBipFinish");
            return (Criteria) this;
        }

        public Criteria andFBipFinishGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_finish >=", value, "fBipFinish");
            return (Criteria) this;
        }

        public Criteria andFBipFinishLessThan(String value) {
            addCriterion("f_bip_finish <", value, "fBipFinish");
            return (Criteria) this;
        }

        public Criteria andFBipFinishLessThanOrEqualTo(String value) {
            addCriterion("f_bip_finish <=", value, "fBipFinish");
            return (Criteria) this;
        }

        public Criteria andFBipFinishLike(String value) {
            addCriterion("f_bip_finish like", value, "fBipFinish");
            return (Criteria) this;
        }

        public Criteria andFBipFinishNotLike(String value) {
            addCriterion("f_bip_finish not like", value, "fBipFinish");
            return (Criteria) this;
        }

        public Criteria andFBipFinishIn(List<String> values) {
            addCriterion("f_bip_finish in", values, "fBipFinish");
            return (Criteria) this;
        }

        public Criteria andFBipFinishNotIn(List<String> values) {
            addCriterion("f_bip_finish not in", values, "fBipFinish");
            return (Criteria) this;
        }

        public Criteria andFBipFinishBetween(String value1, String value2) {
            addCriterion("f_bip_finish between", value1, value2, "fBipFinish");
            return (Criteria) this;
        }

        public Criteria andFBipFinishNotBetween(String value1, String value2) {
            addCriterion("f_bip_finish not between", value1, value2, "fBipFinish");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsIsNull() {
            addCriterion("f_bip_details is null");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsIsNotNull() {
            addCriterion("f_bip_details is not null");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsEqualTo(String value) {
            addCriterion("f_bip_details =", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsNotEqualTo(String value) {
            addCriterion("f_bip_details <>", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsGreaterThan(String value) {
            addCriterion("f_bip_details >", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_details >=", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsLessThan(String value) {
            addCriterion("f_bip_details <", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsLessThanOrEqualTo(String value) {
            addCriterion("f_bip_details <=", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsLike(String value) {
            addCriterion("f_bip_details like", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsNotLike(String value) {
            addCriterion("f_bip_details not like", value, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsIn(List<String> values) {
            addCriterion("f_bip_details in", values, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsNotIn(List<String> values) {
            addCriterion("f_bip_details not in", values, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsBetween(String value1, String value2) {
            addCriterion("f_bip_details between", value1, value2, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFBipDetailsNotBetween(String value1, String value2) {
            addCriterion("f_bip_details not between", value1, value2, "fBipDetails");
            return (Criteria) this;
        }

        public Criteria andFcreatoridIsNull() {
            addCriterion("fcreatorid is null");
            return (Criteria) this;
        }

        public Criteria andFcreatoridIsNotNull() {
            addCriterion("fcreatorid is not null");
            return (Criteria) this;
        }

        public Criteria andFcreatoridEqualTo(Integer value) {
            addCriterion("fcreatorid =", value, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridNotEqualTo(Integer value) {
            addCriterion("fcreatorid <>", value, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridGreaterThan(Integer value) {
            addCriterion("fcreatorid >", value, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fcreatorid >=", value, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridLessThan(Integer value) {
            addCriterion("fcreatorid <", value, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridLessThanOrEqualTo(Integer value) {
            addCriterion("fcreatorid <=", value, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridIn(List<Integer> values) {
            addCriterion("fcreatorid in", values, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridNotIn(List<Integer> values) {
            addCriterion("fcreatorid not in", values, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridBetween(Integer value1, Integer value2) {
            addCriterion("fcreatorid between", value1, value2, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("fcreatorid not between", value1, value2, "fcreatorid");
            return (Criteria) this;
        }

        public Criteria andFcreatedateIsNull() {
            addCriterion("fcreatedate is null");
            return (Criteria) this;
        }

        public Criteria andFcreatedateIsNotNull() {
            addCriterion("fcreatedate is not null");
            return (Criteria) this;
        }

        public Criteria andFcreatedateEqualTo(Date value) {
            addCriterion("fcreatedate =", value, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateNotEqualTo(Date value) {
            addCriterion("fcreatedate <>", value, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateGreaterThan(Date value) {
            addCriterion("fcreatedate >", value, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("fcreatedate >=", value, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateLessThan(Date value) {
            addCriterion("fcreatedate <", value, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateLessThanOrEqualTo(Date value) {
            addCriterion("fcreatedate <=", value, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateIn(List<Date> values) {
            addCriterion("fcreatedate in", values, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateNotIn(List<Date> values) {
            addCriterion("fcreatedate not in", values, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateBetween(Date value1, Date value2) {
            addCriterion("fcreatedate between", value1, value2, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFcreatedateNotBetween(Date value1, Date value2) {
            addCriterion("fcreatedate not between", value1, value2, "fcreatedate");
            return (Criteria) this;
        }

        public Criteria andFmodifieridIsNull() {
            addCriterion("fmodifierid is null");
            return (Criteria) this;
        }

        public Criteria andFmodifieridIsNotNull() {
            addCriterion("fmodifierid is not null");
            return (Criteria) this;
        }

        public Criteria andFmodifieridEqualTo(Integer value) {
            addCriterion("fmodifierid =", value, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridNotEqualTo(Integer value) {
            addCriterion("fmodifierid <>", value, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridGreaterThan(Integer value) {
            addCriterion("fmodifierid >", value, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fmodifierid >=", value, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridLessThan(Integer value) {
            addCriterion("fmodifierid <", value, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridLessThanOrEqualTo(Integer value) {
            addCriterion("fmodifierid <=", value, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridIn(List<Integer> values) {
            addCriterion("fmodifierid in", values, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridNotIn(List<Integer> values) {
            addCriterion("fmodifierid not in", values, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridBetween(Integer value1, Integer value2) {
            addCriterion("fmodifierid between", value1, value2, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifieridNotBetween(Integer value1, Integer value2) {
            addCriterion("fmodifierid not between", value1, value2, "fmodifierid");
            return (Criteria) this;
        }

        public Criteria andFmodifydateIsNull() {
            addCriterion("fmodifydate is null");
            return (Criteria) this;
        }

        public Criteria andFmodifydateIsNotNull() {
            addCriterion("fmodifydate is not null");
            return (Criteria) this;
        }

        public Criteria andFmodifydateEqualTo(Date value) {
            addCriterion("fmodifydate =", value, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateNotEqualTo(Date value) {
            addCriterion("fmodifydate <>", value, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateGreaterThan(Date value) {
            addCriterion("fmodifydate >", value, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("fmodifydate >=", value, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateLessThan(Date value) {
            addCriterion("fmodifydate <", value, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateLessThanOrEqualTo(Date value) {
            addCriterion("fmodifydate <=", value, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateIn(List<Date> values) {
            addCriterion("fmodifydate in", values, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateNotIn(List<Date> values) {
            addCriterion("fmodifydate not in", values, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateBetween(Date value1, Date value2) {
            addCriterion("fmodifydate between", value1, value2, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFmodifydateNotBetween(Date value1, Date value2) {
            addCriterion("fmodifydate not between", value1, value2, "fmodifydate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerIsNull() {
            addCriterion("f_bip_checker is null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerIsNotNull() {
            addCriterion("f_bip_checker is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerEqualTo(Integer value) {
            addCriterion("f_bip_checker =", value, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerNotEqualTo(Integer value) {
            addCriterion("f_bip_checker <>", value, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerGreaterThan(Integer value) {
            addCriterion("f_bip_checker >", value, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_checker >=", value, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerLessThan(Integer value) {
            addCriterion("f_bip_checker <", value, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_checker <=", value, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerIn(List<Integer> values) {
            addCriterion("f_bip_checker in", values, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerNotIn(List<Integer> values) {
            addCriterion("f_bip_checker not in", values, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_checker between", value1, value2, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipCheckerNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_checker not between", value1, value2, "fBipChecker");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeIsNull() {
            addCriterion("f_bip_checktime is null");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeIsNotNull() {
            addCriterion("f_bip_checktime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeEqualTo(Date value) {
            addCriterion("f_bip_checktime =", value, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeNotEqualTo(Date value) {
            addCriterion("f_bip_checktime <>", value, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeGreaterThan(Date value) {
            addCriterion("f_bip_checktime >", value, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_checktime >=", value, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeLessThan(Date value) {
            addCriterion("f_bip_checktime <", value, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_checktime <=", value, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeIn(List<Date> values) {
            addCriterion("f_bip_checktime in", values, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeNotIn(List<Date> values) {
            addCriterion("f_bip_checktime not in", values, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_checktime between", value1, value2, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_checktime not between", value1, value2, "fBipChecktime");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindIsNull() {
            addCriterion("f_bip_isfirstremind is null");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindIsNotNull() {
            addCriterion("f_bip_isfirstremind is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindEqualTo(String value) {
            addCriterion("f_bip_isfirstremind =", value, "fBipIsfirstremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindNotEqualTo(String value) {
            addCriterion("f_bip_isfirstremind <>", value, "fBipIsfirstremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindGreaterThan(String value) {
            addCriterion("f_bip_isfirstremind >", value, "fBipIsfirstremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_isfirstremind >=", value, "fBipIsfirstremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindLessThan(String value) {
            addCriterion("f_bip_isfirstremind <", value, "fBipIsfirstremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindLessThanOrEqualTo(String value) {
            addCriterion("f_bip_isfirstremind <=", value, "fBipIsfirstremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindLike(String value) {
            addCriterion("f_bip_isfirstremind like", value, "fBipIsfirstremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindNotLike(String value) {
            addCriterion("f_bip_isfirstremind not like", value, "fBipIsfirstremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindIn(List<String> values) {
            addCriterion("f_bip_isfirstremind in", values, "fBipIsfirstremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindNotIn(List<String> values) {
            addCriterion("f_bip_isfirstremind not in", values, "fBipIsfirstremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindBetween(String value1, String value2) {
            addCriterion("f_bip_isfirstremind between", value1, value2, "fBipIsfirstremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstremindNotBetween(String value1, String value2) {
            addCriterion("f_bip_isfirstremind not between", value1, value2, "fBipIsfirstremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindIsNull() {
            addCriterion("f_bip_isoverremind is null");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindIsNotNull() {
            addCriterion("f_bip_isoverremind is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindEqualTo(String value) {
            addCriterion("f_bip_isoverremind =", value, "fBipIsoverremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindNotEqualTo(String value) {
            addCriterion("f_bip_isoverremind <>", value, "fBipIsoverremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindGreaterThan(String value) {
            addCriterion("f_bip_isoverremind >", value, "fBipIsoverremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_isoverremind >=", value, "fBipIsoverremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindLessThan(String value) {
            addCriterion("f_bip_isoverremind <", value, "fBipIsoverremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindLessThanOrEqualTo(String value) {
            addCriterion("f_bip_isoverremind <=", value, "fBipIsoverremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindLike(String value) {
            addCriterion("f_bip_isoverremind like", value, "fBipIsoverremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindNotLike(String value) {
            addCriterion("f_bip_isoverremind not like", value, "fBipIsoverremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindIn(List<String> values) {
            addCriterion("f_bip_isoverremind in", values, "fBipIsoverremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindNotIn(List<String> values) {
            addCriterion("f_bip_isoverremind not in", values, "fBipIsoverremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindBetween(String value1, String value2) {
            addCriterion("f_bip_isoverremind between", value1, value2, "fBipIsoverremind");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverremindNotBetween(String value1, String value2) {
            addCriterion("f_bip_isoverremind not between", value1, value2, "fBipIsoverremind");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterIsNull() {
            addCriterion("f_bip_billcreater is null");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterIsNotNull() {
            addCriterion("f_bip_billcreater is not null");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterEqualTo(String value) {
            addCriterion("f_bip_billcreater =", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterNotEqualTo(String value) {
            addCriterion("f_bip_billcreater <>", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterGreaterThan(String value) {
            addCriterion("f_bip_billcreater >", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_billcreater >=", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterLessThan(String value) {
            addCriterion("f_bip_billcreater <", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterLessThanOrEqualTo(String value) {
            addCriterion("f_bip_billcreater <=", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterLike(String value) {
            addCriterion("f_bip_billcreater like", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterNotLike(String value) {
            addCriterion("f_bip_billcreater not like", value, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterIn(List<String> values) {
            addCriterion("f_bip_billcreater in", values, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterNotIn(List<String> values) {
            addCriterion("f_bip_billcreater not in", values, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterBetween(String value1, String value2) {
            addCriterion("f_bip_billcreater between", value1, value2, "fBipBillcreater");
            return (Criteria) this;
        }

        public Criteria andFBipBillcreaterNotBetween(String value1, String value2) {
            addCriterion("f_bip_billcreater not between", value1, value2, "fBipBillcreater");
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