package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTPeopleentryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTPeopleentryExample() {
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

        public Criteria andFBipNamesIsNull() {
            addCriterion("f_bip_names is null");
            return (Criteria) this;
        }

        public Criteria andFBipNamesIsNotNull() {
            addCriterion("f_bip_names is not null");
            return (Criteria) this;
        }

        public Criteria andFBipNamesEqualTo(String value) {
            addCriterion("f_bip_names =", value, "fBipNames");
            return (Criteria) this;
        }

        public Criteria andFBipNamesNotEqualTo(String value) {
            addCriterion("f_bip_names <>", value, "fBipNames");
            return (Criteria) this;
        }

        public Criteria andFBipNamesGreaterThan(String value) {
            addCriterion("f_bip_names >", value, "fBipNames");
            return (Criteria) this;
        }

        public Criteria andFBipNamesGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_names >=", value, "fBipNames");
            return (Criteria) this;
        }

        public Criteria andFBipNamesLessThan(String value) {
            addCriterion("f_bip_names <", value, "fBipNames");
            return (Criteria) this;
        }

        public Criteria andFBipNamesLessThanOrEqualTo(String value) {
            addCriterion("f_bip_names <=", value, "fBipNames");
            return (Criteria) this;
        }

        public Criteria andFBipNamesLike(String value) {
            addCriterion("f_bip_names like", value, "fBipNames");
            return (Criteria) this;
        }

        public Criteria andFBipNamesNotLike(String value) {
            addCriterion("f_bip_names not like", value, "fBipNames");
            return (Criteria) this;
        }

        public Criteria andFBipNamesIn(List<String> values) {
            addCriterion("f_bip_names in", values, "fBipNames");
            return (Criteria) this;
        }

        public Criteria andFBipNamesNotIn(List<String> values) {
            addCriterion("f_bip_names not in", values, "fBipNames");
            return (Criteria) this;
        }

        public Criteria andFBipNamesBetween(String value1, String value2) {
            addCriterion("f_bip_names between", value1, value2, "fBipNames");
            return (Criteria) this;
        }

        public Criteria andFBipNamesNotBetween(String value1, String value2) {
            addCriterion("f_bip_names not between", value1, value2, "fBipNames");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsIsNull() {
            addCriterion("f_bip_idcards is null");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsIsNotNull() {
            addCriterion("f_bip_idcards is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsEqualTo(String value) {
            addCriterion("f_bip_idcards =", value, "fBipIdcards");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsNotEqualTo(String value) {
            addCriterion("f_bip_idcards <>", value, "fBipIdcards");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsGreaterThan(String value) {
            addCriterion("f_bip_idcards >", value, "fBipIdcards");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_idcards >=", value, "fBipIdcards");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsLessThan(String value) {
            addCriterion("f_bip_idcards <", value, "fBipIdcards");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsLessThanOrEqualTo(String value) {
            addCriterion("f_bip_idcards <=", value, "fBipIdcards");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsLike(String value) {
            addCriterion("f_bip_idcards like", value, "fBipIdcards");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsNotLike(String value) {
            addCriterion("f_bip_idcards not like", value, "fBipIdcards");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsIn(List<String> values) {
            addCriterion("f_bip_idcards in", values, "fBipIdcards");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsNotIn(List<String> values) {
            addCriterion("f_bip_idcards not in", values, "fBipIdcards");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsBetween(String value1, String value2) {
            addCriterion("f_bip_idcards between", value1, value2, "fBipIdcards");
            return (Criteria) this;
        }

        public Criteria andFBipIdcardsNotBetween(String value1, String value2) {
            addCriterion("f_bip_idcards not between", value1, value2, "fBipIdcards");
            return (Criteria) this;
        }

        public Criteria andFBipSexsIsNull() {
            addCriterion("f_bip_sexs is null");
            return (Criteria) this;
        }

        public Criteria andFBipSexsIsNotNull() {
            addCriterion("f_bip_sexs is not null");
            return (Criteria) this;
        }

        public Criteria andFBipSexsEqualTo(String value) {
            addCriterion("f_bip_sexs =", value, "fBipSexs");
            return (Criteria) this;
        }

        public Criteria andFBipSexsNotEqualTo(String value) {
            addCriterion("f_bip_sexs <>", value, "fBipSexs");
            return (Criteria) this;
        }

        public Criteria andFBipSexsGreaterThan(String value) {
            addCriterion("f_bip_sexs >", value, "fBipSexs");
            return (Criteria) this;
        }

        public Criteria andFBipSexsGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_sexs >=", value, "fBipSexs");
            return (Criteria) this;
        }

        public Criteria andFBipSexsLessThan(String value) {
            addCriterion("f_bip_sexs <", value, "fBipSexs");
            return (Criteria) this;
        }

        public Criteria andFBipSexsLessThanOrEqualTo(String value) {
            addCriterion("f_bip_sexs <=", value, "fBipSexs");
            return (Criteria) this;
        }

        public Criteria andFBipSexsLike(String value) {
            addCriterion("f_bip_sexs like", value, "fBipSexs");
            return (Criteria) this;
        }

        public Criteria andFBipSexsNotLike(String value) {
            addCriterion("f_bip_sexs not like", value, "fBipSexs");
            return (Criteria) this;
        }

        public Criteria andFBipSexsIn(List<String> values) {
            addCriterion("f_bip_sexs in", values, "fBipSexs");
            return (Criteria) this;
        }

        public Criteria andFBipSexsNotIn(List<String> values) {
            addCriterion("f_bip_sexs not in", values, "fBipSexs");
            return (Criteria) this;
        }

        public Criteria andFBipSexsBetween(String value1, String value2) {
            addCriterion("f_bip_sexs between", value1, value2, "fBipSexs");
            return (Criteria) this;
        }

        public Criteria andFBipSexsNotBetween(String value1, String value2) {
            addCriterion("f_bip_sexs not between", value1, value2, "fBipSexs");
            return (Criteria) this;
        }

        public Criteria andFBipNationsIsNull() {
            addCriterion("f_bip_nations is null");
            return (Criteria) this;
        }

        public Criteria andFBipNationsIsNotNull() {
            addCriterion("f_bip_nations is not null");
            return (Criteria) this;
        }

        public Criteria andFBipNationsEqualTo(String value) {
            addCriterion("f_bip_nations =", value, "fBipNations");
            return (Criteria) this;
        }

        public Criteria andFBipNationsNotEqualTo(String value) {
            addCriterion("f_bip_nations <>", value, "fBipNations");
            return (Criteria) this;
        }

        public Criteria andFBipNationsGreaterThan(String value) {
            addCriterion("f_bip_nations >", value, "fBipNations");
            return (Criteria) this;
        }

        public Criteria andFBipNationsGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_nations >=", value, "fBipNations");
            return (Criteria) this;
        }

        public Criteria andFBipNationsLessThan(String value) {
            addCriterion("f_bip_nations <", value, "fBipNations");
            return (Criteria) this;
        }

        public Criteria andFBipNationsLessThanOrEqualTo(String value) {
            addCriterion("f_bip_nations <=", value, "fBipNations");
            return (Criteria) this;
        }

        public Criteria andFBipNationsLike(String value) {
            addCriterion("f_bip_nations like", value, "fBipNations");
            return (Criteria) this;
        }

        public Criteria andFBipNationsNotLike(String value) {
            addCriterion("f_bip_nations not like", value, "fBipNations");
            return (Criteria) this;
        }

        public Criteria andFBipNationsIn(List<String> values) {
            addCriterion("f_bip_nations in", values, "fBipNations");
            return (Criteria) this;
        }

        public Criteria andFBipNationsNotIn(List<String> values) {
            addCriterion("f_bip_nations not in", values, "fBipNations");
            return (Criteria) this;
        }

        public Criteria andFBipNationsBetween(String value1, String value2) {
            addCriterion("f_bip_nations between", value1, value2, "fBipNations");
            return (Criteria) this;
        }

        public Criteria andFBipNationsNotBetween(String value1, String value2) {
            addCriterion("f_bip_nations not between", value1, value2, "fBipNations");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdatesIsNull() {
            addCriterion("f_bip_birthdates is null");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdatesIsNotNull() {
            addCriterion("f_bip_birthdates is not null");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdatesEqualTo(Date value) {
            addCriterion("f_bip_birthdates =", value, "fBipBirthdates");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdatesNotEqualTo(Date value) {
            addCriterion("f_bip_birthdates <>", value, "fBipBirthdates");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdatesGreaterThan(Date value) {
            addCriterion("f_bip_birthdates >", value, "fBipBirthdates");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdatesGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_birthdates >=", value, "fBipBirthdates");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdatesLessThan(Date value) {
            addCriterion("f_bip_birthdates <", value, "fBipBirthdates");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdatesLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_birthdates <=", value, "fBipBirthdates");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdatesIn(List<Date> values) {
            addCriterion("f_bip_birthdates in", values, "fBipBirthdates");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdatesNotIn(List<Date> values) {
            addCriterion("f_bip_birthdates not in", values, "fBipBirthdates");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdatesBetween(Date value1, Date value2) {
            addCriterion("f_bip_birthdates between", value1, value2, "fBipBirthdates");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdatesNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_birthdates not between", value1, value2, "fBipBirthdates");
            return (Criteria) this;
        }

        public Criteria andFBipTelsIsNull() {
            addCriterion("f_bip_tels is null");
            return (Criteria) this;
        }

        public Criteria andFBipTelsIsNotNull() {
            addCriterion("f_bip_tels is not null");
            return (Criteria) this;
        }

        public Criteria andFBipTelsEqualTo(String value) {
            addCriterion("f_bip_tels =", value, "fBipTels");
            return (Criteria) this;
        }

        public Criteria andFBipTelsNotEqualTo(String value) {
            addCriterion("f_bip_tels <>", value, "fBipTels");
            return (Criteria) this;
        }

        public Criteria andFBipTelsGreaterThan(String value) {
            addCriterion("f_bip_tels >", value, "fBipTels");
            return (Criteria) this;
        }

        public Criteria andFBipTelsGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_tels >=", value, "fBipTels");
            return (Criteria) this;
        }

        public Criteria andFBipTelsLessThan(String value) {
            addCriterion("f_bip_tels <", value, "fBipTels");
            return (Criteria) this;
        }

        public Criteria andFBipTelsLessThanOrEqualTo(String value) {
            addCriterion("f_bip_tels <=", value, "fBipTels");
            return (Criteria) this;
        }

        public Criteria andFBipTelsLike(String value) {
            addCriterion("f_bip_tels like", value, "fBipTels");
            return (Criteria) this;
        }

        public Criteria andFBipTelsNotLike(String value) {
            addCriterion("f_bip_tels not like", value, "fBipTels");
            return (Criteria) this;
        }

        public Criteria andFBipTelsIn(List<String> values) {
            addCriterion("f_bip_tels in", values, "fBipTels");
            return (Criteria) this;
        }

        public Criteria andFBipTelsNotIn(List<String> values) {
            addCriterion("f_bip_tels not in", values, "fBipTels");
            return (Criteria) this;
        }

        public Criteria andFBipTelsBetween(String value1, String value2) {
            addCriterion("f_bip_tels between", value1, value2, "fBipTels");
            return (Criteria) this;
        }

        public Criteria andFBipTelsNotBetween(String value1, String value2) {
            addCriterion("f_bip_tels not between", value1, value2, "fBipTels");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksIsNull() {
            addCriterion("f_bip_outlooks is null");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksIsNotNull() {
            addCriterion("f_bip_outlooks is not null");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksEqualTo(String value) {
            addCriterion("f_bip_outlooks =", value, "fBipOutlooks");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksNotEqualTo(String value) {
            addCriterion("f_bip_outlooks <>", value, "fBipOutlooks");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksGreaterThan(String value) {
            addCriterion("f_bip_outlooks >", value, "fBipOutlooks");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_outlooks >=", value, "fBipOutlooks");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksLessThan(String value) {
            addCriterion("f_bip_outlooks <", value, "fBipOutlooks");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksLessThanOrEqualTo(String value) {
            addCriterion("f_bip_outlooks <=", value, "fBipOutlooks");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksLike(String value) {
            addCriterion("f_bip_outlooks like", value, "fBipOutlooks");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksNotLike(String value) {
            addCriterion("f_bip_outlooks not like", value, "fBipOutlooks");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksIn(List<String> values) {
            addCriterion("f_bip_outlooks in", values, "fBipOutlooks");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksNotIn(List<String> values) {
            addCriterion("f_bip_outlooks not in", values, "fBipOutlooks");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksBetween(String value1, String value2) {
            addCriterion("f_bip_outlooks between", value1, value2, "fBipOutlooks");
            return (Criteria) this;
        }

        public Criteria andFBipOutlooksNotBetween(String value1, String value2) {
            addCriterion("f_bip_outlooks not between", value1, value2, "fBipOutlooks");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesIsNull() {
            addCriterion("f_bip_headimages is null");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesIsNotNull() {
            addCriterion("f_bip_headimages is not null");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesEqualTo(String value) {
            addCriterion("f_bip_headimages =", value, "fBipHeadimages");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesNotEqualTo(String value) {
            addCriterion("f_bip_headimages <>", value, "fBipHeadimages");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesGreaterThan(String value) {
            addCriterion("f_bip_headimages >", value, "fBipHeadimages");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_headimages >=", value, "fBipHeadimages");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesLessThan(String value) {
            addCriterion("f_bip_headimages <", value, "fBipHeadimages");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesLessThanOrEqualTo(String value) {
            addCriterion("f_bip_headimages <=", value, "fBipHeadimages");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesLike(String value) {
            addCriterion("f_bip_headimages like", value, "fBipHeadimages");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesNotLike(String value) {
            addCriterion("f_bip_headimages not like", value, "fBipHeadimages");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesIn(List<String> values) {
            addCriterion("f_bip_headimages in", values, "fBipHeadimages");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesNotIn(List<String> values) {
            addCriterion("f_bip_headimages not in", values, "fBipHeadimages");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesBetween(String value1, String value2) {
            addCriterion("f_bip_headimages between", value1, value2, "fBipHeadimages");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimagesNotBetween(String value1, String value2) {
            addCriterion("f_bip_headimages not between", value1, value2, "fBipHeadimages");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesIsNull() {
            addCriterion("f_bip_recentimages is null");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesIsNotNull() {
            addCriterion("f_bip_recentimages is not null");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesEqualTo(String value) {
            addCriterion("f_bip_recentimages =", value, "fBipRecentimages");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesNotEqualTo(String value) {
            addCriterion("f_bip_recentimages <>", value, "fBipRecentimages");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesGreaterThan(String value) {
            addCriterion("f_bip_recentimages >", value, "fBipRecentimages");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_recentimages >=", value, "fBipRecentimages");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesLessThan(String value) {
            addCriterion("f_bip_recentimages <", value, "fBipRecentimages");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesLessThanOrEqualTo(String value) {
            addCriterion("f_bip_recentimages <=", value, "fBipRecentimages");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesLike(String value) {
            addCriterion("f_bip_recentimages like", value, "fBipRecentimages");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesNotLike(String value) {
            addCriterion("f_bip_recentimages not like", value, "fBipRecentimages");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesIn(List<String> values) {
            addCriterion("f_bip_recentimages in", values, "fBipRecentimages");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesNotIn(List<String> values) {
            addCriterion("f_bip_recentimages not in", values, "fBipRecentimages");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesBetween(String value1, String value2) {
            addCriterion("f_bip_recentimages between", value1, value2, "fBipRecentimages");
            return (Criteria) this;
        }

        public Criteria andFBipRecentimagesNotBetween(String value1, String value2) {
            addCriterion("f_bip_recentimages not between", value1, value2, "fBipRecentimages");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssIsNull() {
            addCriterion("f_bip_nowaddresss is null");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssIsNotNull() {
            addCriterion("f_bip_nowaddresss is not null");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssEqualTo(String value) {
            addCriterion("f_bip_nowaddresss =", value, "fBipNowaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssNotEqualTo(String value) {
            addCriterion("f_bip_nowaddresss <>", value, "fBipNowaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssGreaterThan(String value) {
            addCriterion("f_bip_nowaddresss >", value, "fBipNowaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_nowaddresss >=", value, "fBipNowaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssLessThan(String value) {
            addCriterion("f_bip_nowaddresss <", value, "fBipNowaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssLessThanOrEqualTo(String value) {
            addCriterion("f_bip_nowaddresss <=", value, "fBipNowaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssLike(String value) {
            addCriterion("f_bip_nowaddresss like", value, "fBipNowaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssNotLike(String value) {
            addCriterion("f_bip_nowaddresss not like", value, "fBipNowaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssIn(List<String> values) {
            addCriterion("f_bip_nowaddresss in", values, "fBipNowaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssNotIn(List<String> values) {
            addCriterion("f_bip_nowaddresss not in", values, "fBipNowaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssBetween(String value1, String value2) {
            addCriterion("f_bip_nowaddresss between", value1, value2, "fBipNowaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNowaddresssNotBetween(String value1, String value2) {
            addCriterion("f_bip_nowaddresss not between", value1, value2, "fBipNowaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssIsNull() {
            addCriterion("f_bip_nationaddresss is null");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssIsNotNull() {
            addCriterion("f_bip_nationaddresss is not null");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssEqualTo(String value) {
            addCriterion("f_bip_nationaddresss =", value, "fBipNationaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssNotEqualTo(String value) {
            addCriterion("f_bip_nationaddresss <>", value, "fBipNationaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssGreaterThan(String value) {
            addCriterion("f_bip_nationaddresss >", value, "fBipNationaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_nationaddresss >=", value, "fBipNationaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssLessThan(String value) {
            addCriterion("f_bip_nationaddresss <", value, "fBipNationaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssLessThanOrEqualTo(String value) {
            addCriterion("f_bip_nationaddresss <=", value, "fBipNationaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssLike(String value) {
            addCriterion("f_bip_nationaddresss like", value, "fBipNationaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssNotLike(String value) {
            addCriterion("f_bip_nationaddresss not like", value, "fBipNationaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssIn(List<String> values) {
            addCriterion("f_bip_nationaddresss in", values, "fBipNationaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssNotIn(List<String> values) {
            addCriterion("f_bip_nationaddresss not in", values, "fBipNationaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssBetween(String value1, String value2) {
            addCriterion("f_bip_nationaddresss between", value1, value2, "fBipNationaddresss");
            return (Criteria) this;
        }

        public Criteria andFBipNationaddresssNotBetween(String value1, String value2) {
            addCriterion("f_bip_nationaddresss not between", value1, value2, "fBipNationaddresss");
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