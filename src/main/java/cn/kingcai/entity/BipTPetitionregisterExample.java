package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTPetitionregisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTPetitionregisterExample() {
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

        public Criteria andFBipBirthdateIsNull() {
            addCriterion("f_bip_birthdate is null");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateIsNotNull() {
            addCriterion("f_bip_birthdate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateEqualTo(Date value) {
            addCriterion("f_bip_birthdate =", value, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateNotEqualTo(Date value) {
            addCriterion("f_bip_birthdate <>", value, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateGreaterThan(Date value) {
            addCriterion("f_bip_birthdate >", value, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_birthdate >=", value, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateLessThan(Date value) {
            addCriterion("f_bip_birthdate <", value, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_birthdate <=", value, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateIn(List<Date> values) {
            addCriterion("f_bip_birthdate in", values, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateNotIn(List<Date> values) {
            addCriterion("f_bip_birthdate not in", values, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateBetween(Date value1, Date value2) {
            addCriterion("f_bip_birthdate between", value1, value2, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipBirthdateNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_birthdate not between", value1, value2, "fBipBirthdate");
            return (Criteria) this;
        }

        public Criteria andFBipNationIsNull() {
            addCriterion("f_bip_nation is null");
            return (Criteria) this;
        }

        public Criteria andFBipNationIsNotNull() {
            addCriterion("f_bip_nation is not null");
            return (Criteria) this;
        }

        public Criteria andFBipNationEqualTo(String value) {
            addCriterion("f_bip_nation =", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationNotEqualTo(String value) {
            addCriterion("f_bip_nation <>", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationGreaterThan(String value) {
            addCriterion("f_bip_nation >", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_nation >=", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationLessThan(String value) {
            addCriterion("f_bip_nation <", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationLessThanOrEqualTo(String value) {
            addCriterion("f_bip_nation <=", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationLike(String value) {
            addCriterion("f_bip_nation like", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationNotLike(String value) {
            addCriterion("f_bip_nation not like", value, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationIn(List<String> values) {
            addCriterion("f_bip_nation in", values, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationNotIn(List<String> values) {
            addCriterion("f_bip_nation not in", values, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationBetween(String value1, String value2) {
            addCriterion("f_bip_nation between", value1, value2, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipNationNotBetween(String value1, String value2) {
            addCriterion("f_bip_nation not between", value1, value2, "fBipNation");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneIsNull() {
            addCriterion("f_bip_petitionerphone is null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneIsNotNull() {
            addCriterion("f_bip_petitionerphone is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneEqualTo(String value) {
            addCriterion("f_bip_petitionerphone =", value, "fBipPetitionerphone");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneNotEqualTo(String value) {
            addCriterion("f_bip_petitionerphone <>", value, "fBipPetitionerphone");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneGreaterThan(String value) {
            addCriterion("f_bip_petitionerphone >", value, "fBipPetitionerphone");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_petitionerphone >=", value, "fBipPetitionerphone");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneLessThan(String value) {
            addCriterion("f_bip_petitionerphone <", value, "fBipPetitionerphone");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneLessThanOrEqualTo(String value) {
            addCriterion("f_bip_petitionerphone <=", value, "fBipPetitionerphone");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneLike(String value) {
            addCriterion("f_bip_petitionerphone like", value, "fBipPetitionerphone");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneNotLike(String value) {
            addCriterion("f_bip_petitionerphone not like", value, "fBipPetitionerphone");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneIn(List<String> values) {
            addCriterion("f_bip_petitionerphone in", values, "fBipPetitionerphone");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneNotIn(List<String> values) {
            addCriterion("f_bip_petitionerphone not in", values, "fBipPetitionerphone");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneBetween(String value1, String value2) {
            addCriterion("f_bip_petitionerphone between", value1, value2, "fBipPetitionerphone");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerphoneNotBetween(String value1, String value2) {
            addCriterion("f_bip_petitionerphone not between", value1, value2, "fBipPetitionerphone");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesIsNull() {
            addCriterion("f_bip_representatives is null");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesIsNotNull() {
            addCriterion("f_bip_representatives is not null");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesEqualTo(String value) {
            addCriterion("f_bip_representatives =", value, "fBipRepresentatives");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesNotEqualTo(String value) {
            addCriterion("f_bip_representatives <>", value, "fBipRepresentatives");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesGreaterThan(String value) {
            addCriterion("f_bip_representatives >", value, "fBipRepresentatives");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_representatives >=", value, "fBipRepresentatives");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesLessThan(String value) {
            addCriterion("f_bip_representatives <", value, "fBipRepresentatives");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesLessThanOrEqualTo(String value) {
            addCriterion("f_bip_representatives <=", value, "fBipRepresentatives");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesLike(String value) {
            addCriterion("f_bip_representatives like", value, "fBipRepresentatives");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesNotLike(String value) {
            addCriterion("f_bip_representatives not like", value, "fBipRepresentatives");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesIn(List<String> values) {
            addCriterion("f_bip_representatives in", values, "fBipRepresentatives");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesNotIn(List<String> values) {
            addCriterion("f_bip_representatives not in", values, "fBipRepresentatives");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesBetween(String value1, String value2) {
            addCriterion("f_bip_representatives between", value1, value2, "fBipRepresentatives");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativesNotBetween(String value1, String value2) {
            addCriterion("f_bip_representatives not between", value1, value2, "fBipRepresentatives");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidIsNull() {
            addCriterion("f_bip_representativenumberid is null");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidIsNotNull() {
            addCriterion("f_bip_representativenumberid is not null");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidEqualTo(String value) {
            addCriterion("f_bip_representativenumberid =", value, "fBipRepresentativenumberid");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidNotEqualTo(String value) {
            addCriterion("f_bip_representativenumberid <>", value, "fBipRepresentativenumberid");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidGreaterThan(String value) {
            addCriterion("f_bip_representativenumberid >", value, "fBipRepresentativenumberid");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_representativenumberid >=", value, "fBipRepresentativenumberid");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidLessThan(String value) {
            addCriterion("f_bip_representativenumberid <", value, "fBipRepresentativenumberid");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidLessThanOrEqualTo(String value) {
            addCriterion("f_bip_representativenumberid <=", value, "fBipRepresentativenumberid");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidLike(String value) {
            addCriterion("f_bip_representativenumberid like", value, "fBipRepresentativenumberid");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidNotLike(String value) {
            addCriterion("f_bip_representativenumberid not like", value, "fBipRepresentativenumberid");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidIn(List<String> values) {
            addCriterion("f_bip_representativenumberid in", values, "fBipRepresentativenumberid");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidNotIn(List<String> values) {
            addCriterion("f_bip_representativenumberid not in", values, "fBipRepresentativenumberid");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidBetween(String value1, String value2) {
            addCriterion("f_bip_representativenumberid between", value1, value2, "fBipRepresentativenumberid");
            return (Criteria) this;
        }

        public Criteria andFBipRepresentativenumberidNotBetween(String value1, String value2) {
            addCriterion("f_bip_representativenumberid not between", value1, value2, "fBipRepresentativenumberid");
            return (Criteria) this;
        }

        public Criteria andFBipSexIsNull() {
            addCriterion("f_bip_sex is null");
            return (Criteria) this;
        }

        public Criteria andFBipSexIsNotNull() {
            addCriterion("f_bip_sex is not null");
            return (Criteria) this;
        }

        public Criteria andFBipSexEqualTo(String value) {
            addCriterion("f_bip_sex =", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexNotEqualTo(String value) {
            addCriterion("f_bip_sex <>", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexGreaterThan(String value) {
            addCriterion("f_bip_sex >", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_sex >=", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexLessThan(String value) {
            addCriterion("f_bip_sex <", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexLessThanOrEqualTo(String value) {
            addCriterion("f_bip_sex <=", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexLike(String value) {
            addCriterion("f_bip_sex like", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexNotLike(String value) {
            addCriterion("f_bip_sex not like", value, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexIn(List<String> values) {
            addCriterion("f_bip_sex in", values, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexNotIn(List<String> values) {
            addCriterion("f_bip_sex not in", values, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexBetween(String value1, String value2) {
            addCriterion("f_bip_sex between", value1, value2, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipSexNotBetween(String value1, String value2) {
            addCriterion("f_bip_sex not between", value1, value2, "fBipSex");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosIsNull() {
            addCriterion("f_bip_recentphotos is null");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosIsNotNull() {
            addCriterion("f_bip_recentphotos is not null");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosEqualTo(String value) {
            addCriterion("f_bip_recentphotos =", value, "fBipRecentphotos");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosNotEqualTo(String value) {
            addCriterion("f_bip_recentphotos <>", value, "fBipRecentphotos");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosGreaterThan(String value) {
            addCriterion("f_bip_recentphotos >", value, "fBipRecentphotos");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_recentphotos >=", value, "fBipRecentphotos");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosLessThan(String value) {
            addCriterion("f_bip_recentphotos <", value, "fBipRecentphotos");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosLessThanOrEqualTo(String value) {
            addCriterion("f_bip_recentphotos <=", value, "fBipRecentphotos");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosLike(String value) {
            addCriterion("f_bip_recentphotos like", value, "fBipRecentphotos");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosNotLike(String value) {
            addCriterion("f_bip_recentphotos not like", value, "fBipRecentphotos");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosIn(List<String> values) {
            addCriterion("f_bip_recentphotos in", values, "fBipRecentphotos");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosNotIn(List<String> values) {
            addCriterion("f_bip_recentphotos not in", values, "fBipRecentphotos");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosBetween(String value1, String value2) {
            addCriterion("f_bip_recentphotos between", value1, value2, "fBipRecentphotos");
            return (Criteria) this;
        }

        public Criteria andFBipRecentphotosNotBetween(String value1, String value2) {
            addCriterion("f_bip_recentphotos not between", value1, value2, "fBipRecentphotos");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyIsNull() {
            addCriterion("f_bip_thirdclassify is null");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyIsNotNull() {
            addCriterion("f_bip_thirdclassify is not null");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyEqualTo(String value) {
            addCriterion("f_bip_thirdclassify =", value, "fBipThirdclassify");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyNotEqualTo(String value) {
            addCriterion("f_bip_thirdclassify <>", value, "fBipThirdclassify");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyGreaterThan(String value) {
            addCriterion("f_bip_thirdclassify >", value, "fBipThirdclassify");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_thirdclassify >=", value, "fBipThirdclassify");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyLessThan(String value) {
            addCriterion("f_bip_thirdclassify <", value, "fBipThirdclassify");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyLessThanOrEqualTo(String value) {
            addCriterion("f_bip_thirdclassify <=", value, "fBipThirdclassify");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyLike(String value) {
            addCriterion("f_bip_thirdclassify like", value, "fBipThirdclassify");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyNotLike(String value) {
            addCriterion("f_bip_thirdclassify not like", value, "fBipThirdclassify");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyIn(List<String> values) {
            addCriterion("f_bip_thirdclassify in", values, "fBipThirdclassify");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyNotIn(List<String> values) {
            addCriterion("f_bip_thirdclassify not in", values, "fBipThirdclassify");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyBetween(String value1, String value2) {
            addCriterion("f_bip_thirdclassify between", value1, value2, "fBipThirdclassify");
            return (Criteria) this;
        }

        public Criteria andFBipThirdclassifyNotBetween(String value1, String value2) {
            addCriterion("f_bip_thirdclassify not between", value1, value2, "fBipThirdclassify");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionersnumberIsNull() {
            addCriterion("f_bip_petitionersnumber is null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionersnumberIsNotNull() {
            addCriterion("f_bip_petitionersnumber is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionersnumberEqualTo(Integer value) {
            addCriterion("f_bip_petitionersnumber =", value, "fBipPetitionersnumber");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionersnumberNotEqualTo(Integer value) {
            addCriterion("f_bip_petitionersnumber <>", value, "fBipPetitionersnumber");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionersnumberGreaterThan(Integer value) {
            addCriterion("f_bip_petitionersnumber >", value, "fBipPetitionersnumber");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionersnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_petitionersnumber >=", value, "fBipPetitionersnumber");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionersnumberLessThan(Integer value) {
            addCriterion("f_bip_petitionersnumber <", value, "fBipPetitionersnumber");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionersnumberLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_petitionersnumber <=", value, "fBipPetitionersnumber");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionersnumberIn(List<Integer> values) {
            addCriterion("f_bip_petitionersnumber in", values, "fBipPetitionersnumber");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionersnumberNotIn(List<Integer> values) {
            addCriterion("f_bip_petitionersnumber not in", values, "fBipPetitionersnumber");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionersnumberBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_petitionersnumber between", value1, value2, "fBipPetitionersnumber");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionersnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_petitionersnumber not between", value1, value2, "fBipPetitionersnumber");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyIsNull() {
            addCriterion("f_bip_firstclassify is null");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyIsNotNull() {
            addCriterion("f_bip_firstclassify is not null");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyEqualTo(String value) {
            addCriterion("f_bip_firstclassify =", value, "fBipFirstclassify");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyNotEqualTo(String value) {
            addCriterion("f_bip_firstclassify <>", value, "fBipFirstclassify");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyGreaterThan(String value) {
            addCriterion("f_bip_firstclassify >", value, "fBipFirstclassify");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_firstclassify >=", value, "fBipFirstclassify");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyLessThan(String value) {
            addCriterion("f_bip_firstclassify <", value, "fBipFirstclassify");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyLessThanOrEqualTo(String value) {
            addCriterion("f_bip_firstclassify <=", value, "fBipFirstclassify");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyLike(String value) {
            addCriterion("f_bip_firstclassify like", value, "fBipFirstclassify");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyNotLike(String value) {
            addCriterion("f_bip_firstclassify not like", value, "fBipFirstclassify");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyIn(List<String> values) {
            addCriterion("f_bip_firstclassify in", values, "fBipFirstclassify");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyNotIn(List<String> values) {
            addCriterion("f_bip_firstclassify not in", values, "fBipFirstclassify");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyBetween(String value1, String value2) {
            addCriterion("f_bip_firstclassify between", value1, value2, "fBipFirstclassify");
            return (Criteria) this;
        }

        public Criteria andFBipFirstclassifyNotBetween(String value1, String value2) {
            addCriterion("f_bip_firstclassify not between", value1, value2, "fBipFirstclassify");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyIsNull() {
            addCriterion("f_bip_secondclassify is null");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyIsNotNull() {
            addCriterion("f_bip_secondclassify is not null");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyEqualTo(String value) {
            addCriterion("f_bip_secondclassify =", value, "fBipSecondclassify");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyNotEqualTo(String value) {
            addCriterion("f_bip_secondclassify <>", value, "fBipSecondclassify");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyGreaterThan(String value) {
            addCriterion("f_bip_secondclassify >", value, "fBipSecondclassify");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_secondclassify >=", value, "fBipSecondclassify");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyLessThan(String value) {
            addCriterion("f_bip_secondclassify <", value, "fBipSecondclassify");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyLessThanOrEqualTo(String value) {
            addCriterion("f_bip_secondclassify <=", value, "fBipSecondclassify");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyLike(String value) {
            addCriterion("f_bip_secondclassify like", value, "fBipSecondclassify");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyNotLike(String value) {
            addCriterion("f_bip_secondclassify not like", value, "fBipSecondclassify");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyIn(List<String> values) {
            addCriterion("f_bip_secondclassify in", values, "fBipSecondclassify");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyNotIn(List<String> values) {
            addCriterion("f_bip_secondclassify not in", values, "fBipSecondclassify");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyBetween(String value1, String value2) {
            addCriterion("f_bip_secondclassify between", value1, value2, "fBipSecondclassify");
            return (Criteria) this;
        }

        public Criteria andFBipSecondclassifyNotBetween(String value1, String value2) {
            addCriterion("f_bip_secondclassify not between", value1, value2, "fBipSecondclassify");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeIsNull() {
            addCriterion("f_bip_petitiontype is null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeIsNotNull() {
            addCriterion("f_bip_petitiontype is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeEqualTo(Integer value) {
            addCriterion("f_bip_petitiontype =", value, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeNotEqualTo(Integer value) {
            addCriterion("f_bip_petitiontype <>", value, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeGreaterThan(Integer value) {
            addCriterion("f_bip_petitiontype >", value, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_petitiontype >=", value, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeLessThan(Integer value) {
            addCriterion("f_bip_petitiontype <", value, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_petitiontype <=", value, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeIn(List<Integer> values) {
            addCriterion("f_bip_petitiontype in", values, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeNotIn(List<Integer> values) {
            addCriterion("f_bip_petitiontype not in", values, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_petitiontype between", value1, value2, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPetitiontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_petitiontype not between", value1, value2, "fBipPetitiontype");
            return (Criteria) this;
        }

        public Criteria andFBipPoweraffairsIsNull() {
            addCriterion("f_bip_poweraffairs is null");
            return (Criteria) this;
        }

        public Criteria andFBipPoweraffairsIsNotNull() {
            addCriterion("f_bip_poweraffairs is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPoweraffairsEqualTo(Integer value) {
            addCriterion("f_bip_poweraffairs =", value, "fBipPoweraffairs");
            return (Criteria) this;
        }

        public Criteria andFBipPoweraffairsNotEqualTo(Integer value) {
            addCriterion("f_bip_poweraffairs <>", value, "fBipPoweraffairs");
            return (Criteria) this;
        }

        public Criteria andFBipPoweraffairsGreaterThan(Integer value) {
            addCriterion("f_bip_poweraffairs >", value, "fBipPoweraffairs");
            return (Criteria) this;
        }

        public Criteria andFBipPoweraffairsGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_poweraffairs >=", value, "fBipPoweraffairs");
            return (Criteria) this;
        }

        public Criteria andFBipPoweraffairsLessThan(Integer value) {
            addCriterion("f_bip_poweraffairs <", value, "fBipPoweraffairs");
            return (Criteria) this;
        }

        public Criteria andFBipPoweraffairsLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_poweraffairs <=", value, "fBipPoweraffairs");
            return (Criteria) this;
        }

        public Criteria andFBipPoweraffairsIn(List<Integer> values) {
            addCriterion("f_bip_poweraffairs in", values, "fBipPoweraffairs");
            return (Criteria) this;
        }

        public Criteria andFBipPoweraffairsNotIn(List<Integer> values) {
            addCriterion("f_bip_poweraffairs not in", values, "fBipPoweraffairs");
            return (Criteria) this;
        }

        public Criteria andFBipPoweraffairsBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_poweraffairs between", value1, value2, "fBipPoweraffairs");
            return (Criteria) this;
        }

        public Criteria andFBipPoweraffairsNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_poweraffairs not between", value1, value2, "fBipPoweraffairs");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksIsNull() {
            addCriterion("f_bip_remarks is null");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksIsNotNull() {
            addCriterion("f_bip_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksEqualTo(String value) {
            addCriterion("f_bip_remarks =", value, "fBipRemarks");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksNotEqualTo(String value) {
            addCriterion("f_bip_remarks <>", value, "fBipRemarks");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksGreaterThan(String value) {
            addCriterion("f_bip_remarks >", value, "fBipRemarks");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_remarks >=", value, "fBipRemarks");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksLessThan(String value) {
            addCriterion("f_bip_remarks <", value, "fBipRemarks");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksLessThanOrEqualTo(String value) {
            addCriterion("f_bip_remarks <=", value, "fBipRemarks");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksLike(String value) {
            addCriterion("f_bip_remarks like", value, "fBipRemarks");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksNotLike(String value) {
            addCriterion("f_bip_remarks not like", value, "fBipRemarks");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksIn(List<String> values) {
            addCriterion("f_bip_remarks in", values, "fBipRemarks");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksNotIn(List<String> values) {
            addCriterion("f_bip_remarks not in", values, "fBipRemarks");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksBetween(String value1, String value2) {
            addCriterion("f_bip_remarks between", value1, value2, "fBipRemarks");
            return (Criteria) this;
        }

        public Criteria andFBipRemarksNotBetween(String value1, String value2) {
            addCriterion("f_bip_remarks not between", value1, value2, "fBipRemarks");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryIsNull() {
            addCriterion("f_bip_ismanualentry is null");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryIsNotNull() {
            addCriterion("f_bip_ismanualentry is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryEqualTo(String value) {
            addCriterion("f_bip_ismanualentry =", value, "fBipIsmanualentry");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryNotEqualTo(String value) {
            addCriterion("f_bip_ismanualentry <>", value, "fBipIsmanualentry");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryGreaterThan(String value) {
            addCriterion("f_bip_ismanualentry >", value, "fBipIsmanualentry");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_ismanualentry >=", value, "fBipIsmanualentry");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryLessThan(String value) {
            addCriterion("f_bip_ismanualentry <", value, "fBipIsmanualentry");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryLessThanOrEqualTo(String value) {
            addCriterion("f_bip_ismanualentry <=", value, "fBipIsmanualentry");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryLike(String value) {
            addCriterion("f_bip_ismanualentry like", value, "fBipIsmanualentry");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryNotLike(String value) {
            addCriterion("f_bip_ismanualentry not like", value, "fBipIsmanualentry");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryIn(List<String> values) {
            addCriterion("f_bip_ismanualentry in", values, "fBipIsmanualentry");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryNotIn(List<String> values) {
            addCriterion("f_bip_ismanualentry not in", values, "fBipIsmanualentry");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryBetween(String value1, String value2) {
            addCriterion("f_bip_ismanualentry between", value1, value2, "fBipIsmanualentry");
            return (Criteria) this;
        }

        public Criteria andFBipIsmanualentryNotBetween(String value1, String value2) {
            addCriterion("f_bip_ismanualentry not between", value1, value2, "fBipIsmanualentry");
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

        public Criteria andFBipCheckdateIsNull() {
            addCriterion("f_bip_checkdate is null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateIsNotNull() {
            addCriterion("f_bip_checkdate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateEqualTo(Date value) {
            addCriterion("f_bip_checkdate =", value, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateNotEqualTo(Date value) {
            addCriterion("f_bip_checkdate <>", value, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateGreaterThan(Date value) {
            addCriterion("f_bip_checkdate >", value, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_checkdate >=", value, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateLessThan(Date value) {
            addCriterion("f_bip_checkdate <", value, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_checkdate <=", value, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateIn(List<Date> values) {
            addCriterion("f_bip_checkdate in", values, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateNotIn(List<Date> values) {
            addCriterion("f_bip_checkdate not in", values, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateBetween(Date value1, Date value2) {
            addCriterion("f_bip_checkdate between", value1, value2, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipCheckdateNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_checkdate not between", value1, value2, "fBipCheckdate");
            return (Criteria) this;
        }

        public Criteria andFBipAddressIsNull() {
            addCriterion("f_bip_address is null");
            return (Criteria) this;
        }

        public Criteria andFBipAddressIsNotNull() {
            addCriterion("f_bip_address is not null");
            return (Criteria) this;
        }

        public Criteria andFBipAddressEqualTo(String value) {
            addCriterion("f_bip_address =", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressNotEqualTo(String value) {
            addCriterion("f_bip_address <>", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressGreaterThan(String value) {
            addCriterion("f_bip_address >", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_address >=", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressLessThan(String value) {
            addCriterion("f_bip_address <", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressLessThanOrEqualTo(String value) {
            addCriterion("f_bip_address <=", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressLike(String value) {
            addCriterion("f_bip_address like", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressNotLike(String value) {
            addCriterion("f_bip_address not like", value, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressIn(List<String> values) {
            addCriterion("f_bip_address in", values, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressNotIn(List<String> values) {
            addCriterion("f_bip_address not in", values, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressBetween(String value1, String value2) {
            addCriterion("f_bip_address between", value1, value2, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipAddressNotBetween(String value1, String value2) {
            addCriterion("f_bip_address not between", value1, value2, "fBipAddress");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceIsNull() {
            addCriterion("f_bip_nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceIsNotNull() {
            addCriterion("f_bip_nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceEqualTo(String value) {
            addCriterion("f_bip_nativeplace =", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceNotEqualTo(String value) {
            addCriterion("f_bip_nativeplace <>", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceGreaterThan(String value) {
            addCriterion("f_bip_nativeplace >", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_nativeplace >=", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceLessThan(String value) {
            addCriterion("f_bip_nativeplace <", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("f_bip_nativeplace <=", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceLike(String value) {
            addCriterion("f_bip_nativeplace like", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceNotLike(String value) {
            addCriterion("f_bip_nativeplace not like", value, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceIn(List<String> values) {
            addCriterion("f_bip_nativeplace in", values, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceNotIn(List<String> values) {
            addCriterion("f_bip_nativeplace not in", values, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceBetween(String value1, String value2) {
            addCriterion("f_bip_nativeplace between", value1, value2, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipNativeplaceNotBetween(String value1, String value2) {
            addCriterion("f_bip_nativeplace not between", value1, value2, "fBipNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipUseridIsNull() {
            addCriterion("f_bip_userid is null");
            return (Criteria) this;
        }

        public Criteria andFBipUseridIsNotNull() {
            addCriterion("f_bip_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFBipUseridEqualTo(Integer value) {
            addCriterion("f_bip_userid =", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridNotEqualTo(Integer value) {
            addCriterion("f_bip_userid <>", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridGreaterThan(Integer value) {
            addCriterion("f_bip_userid >", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_userid >=", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridLessThan(Integer value) {
            addCriterion("f_bip_userid <", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_userid <=", value, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridIn(List<Integer> values) {
            addCriterion("f_bip_userid in", values, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridNotIn(List<Integer> values) {
            addCriterion("f_bip_userid not in", values, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_userid between", value1, value2, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_userid not between", value1, value2, "fBipUserid");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerIsNull() {
            addCriterion("f_bip_integer is null");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerIsNotNull() {
            addCriterion("f_bip_integer is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerEqualTo(Integer value) {
            addCriterion("f_bip_integer =", value, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerNotEqualTo(Integer value) {
            addCriterion("f_bip_integer <>", value, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerGreaterThan(Integer value) {
            addCriterion("f_bip_integer >", value, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_integer >=", value, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerLessThan(Integer value) {
            addCriterion("f_bip_integer <", value, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_integer <=", value, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerIn(List<Integer> values) {
            addCriterion("f_bip_integer in", values, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerNotIn(List<Integer> values) {
            addCriterion("f_bip_integer not in", values, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_integer between", value1, value2, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFBipIntegerNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_integer not between", value1, value2, "fBipInteger");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusIsNull() {
            addCriterion("fpashdownstatus is null");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusIsNotNull() {
            addCriterion("fpashdownstatus is not null");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusEqualTo(String value) {
            addCriterion("fpashdownstatus =", value, "fpashdownstatus");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusNotEqualTo(String value) {
            addCriterion("fpashdownstatus <>", value, "fpashdownstatus");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusGreaterThan(String value) {
            addCriterion("fpashdownstatus >", value, "fpashdownstatus");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusGreaterThanOrEqualTo(String value) {
            addCriterion("fpashdownstatus >=", value, "fpashdownstatus");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusLessThan(String value) {
            addCriterion("fpashdownstatus <", value, "fpashdownstatus");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusLessThanOrEqualTo(String value) {
            addCriterion("fpashdownstatus <=", value, "fpashdownstatus");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusLike(String value) {
            addCriterion("fpashdownstatus like", value, "fpashdownstatus");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusNotLike(String value) {
            addCriterion("fpashdownstatus not like", value, "fpashdownstatus");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusIn(List<String> values) {
            addCriterion("fpashdownstatus in", values, "fpashdownstatus");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusNotIn(List<String> values) {
            addCriterion("fpashdownstatus not in", values, "fpashdownstatus");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusBetween(String value1, String value2) {
            addCriterion("fpashdownstatus between", value1, value2, "fpashdownstatus");
            return (Criteria) this;
        }

        public Criteria andFpashdownstatusNotBetween(String value1, String value2) {
            addCriterion("fpashdownstatus not between", value1, value2, "fpashdownstatus");
            return (Criteria) this;
        }

        public Criteria andFBipOrgidIsNull() {
            addCriterion("f_bip_orgid is null");
            return (Criteria) this;
        }

        public Criteria andFBipOrgidIsNotNull() {
            addCriterion("f_bip_orgid is not null");
            return (Criteria) this;
        }

        public Criteria andFBipOrgidEqualTo(Integer value) {
            addCriterion("f_bip_orgid =", value, "fBipOrgid");
            return (Criteria) this;
        }

        public Criteria andFBipOrgidNotEqualTo(Integer value) {
            addCriterion("f_bip_orgid <>", value, "fBipOrgid");
            return (Criteria) this;
        }

        public Criteria andFBipOrgidGreaterThan(Integer value) {
            addCriterion("f_bip_orgid >", value, "fBipOrgid");
            return (Criteria) this;
        }

        public Criteria andFBipOrgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_orgid >=", value, "fBipOrgid");
            return (Criteria) this;
        }

        public Criteria andFBipOrgidLessThan(Integer value) {
            addCriterion("f_bip_orgid <", value, "fBipOrgid");
            return (Criteria) this;
        }

        public Criteria andFBipOrgidLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_orgid <=", value, "fBipOrgid");
            return (Criteria) this;
        }

        public Criteria andFBipOrgidIn(List<Integer> values) {
            addCriterion("f_bip_orgid in", values, "fBipOrgid");
            return (Criteria) this;
        }

        public Criteria andFBipOrgidNotIn(List<Integer> values) {
            addCriterion("f_bip_orgid not in", values, "fBipOrgid");
            return (Criteria) this;
        }

        public Criteria andFBipOrgidBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_orgid between", value1, value2, "fBipOrgid");
            return (Criteria) this;
        }

        public Criteria andFBipOrgidNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_orgid not between", value1, value2, "fBipOrgid");
            return (Criteria) this;
        }

        public Criteria andFBipVisitcountIsNull() {
            addCriterion("f_bip_visitcount is null");
            return (Criteria) this;
        }

        public Criteria andFBipVisitcountIsNotNull() {
            addCriterion("f_bip_visitcount is not null");
            return (Criteria) this;
        }

        public Criteria andFBipVisitcountEqualTo(Integer value) {
            addCriterion("f_bip_visitcount =", value, "fBipVisitcount");
            return (Criteria) this;
        }

        public Criteria andFBipVisitcountNotEqualTo(Integer value) {
            addCriterion("f_bip_visitcount <>", value, "fBipVisitcount");
            return (Criteria) this;
        }

        public Criteria andFBipVisitcountGreaterThan(Integer value) {
            addCriterion("f_bip_visitcount >", value, "fBipVisitcount");
            return (Criteria) this;
        }

        public Criteria andFBipVisitcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_visitcount >=", value, "fBipVisitcount");
            return (Criteria) this;
        }

        public Criteria andFBipVisitcountLessThan(Integer value) {
            addCriterion("f_bip_visitcount <", value, "fBipVisitcount");
            return (Criteria) this;
        }

        public Criteria andFBipVisitcountLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_visitcount <=", value, "fBipVisitcount");
            return (Criteria) this;
        }

        public Criteria andFBipVisitcountIn(List<Integer> values) {
            addCriterion("f_bip_visitcount in", values, "fBipVisitcount");
            return (Criteria) this;
        }

        public Criteria andFBipVisitcountNotIn(List<Integer> values) {
            addCriterion("f_bip_visitcount not in", values, "fBipVisitcount");
            return (Criteria) this;
        }

        public Criteria andFBipVisitcountBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_visitcount between", value1, value2, "fBipVisitcount");
            return (Criteria) this;
        }

        public Criteria andFBipVisitcountNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_visitcount not between", value1, value2, "fBipVisitcount");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkIsNull() {
            addCriterion("f_bip_remark is null");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkIsNotNull() {
            addCriterion("f_bip_remark is not null");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkEqualTo(String value) {
            addCriterion("f_bip_remark =", value, "fBipRemark");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkNotEqualTo(String value) {
            addCriterion("f_bip_remark <>", value, "fBipRemark");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkGreaterThan(String value) {
            addCriterion("f_bip_remark >", value, "fBipRemark");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_remark >=", value, "fBipRemark");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkLessThan(String value) {
            addCriterion("f_bip_remark <", value, "fBipRemark");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkLessThanOrEqualTo(String value) {
            addCriterion("f_bip_remark <=", value, "fBipRemark");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkLike(String value) {
            addCriterion("f_bip_remark like", value, "fBipRemark");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkNotLike(String value) {
            addCriterion("f_bip_remark not like", value, "fBipRemark");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkIn(List<String> values) {
            addCriterion("f_bip_remark in", values, "fBipRemark");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkNotIn(List<String> values) {
            addCriterion("f_bip_remark not in", values, "fBipRemark");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkBetween(String value1, String value2) {
            addCriterion("f_bip_remark between", value1, value2, "fBipRemark");
            return (Criteria) this;
        }

        public Criteria andFBipRemarkNotBetween(String value1, String value2) {
            addCriterion("f_bip_remark not between", value1, value2, "fBipRemark");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageIsNull() {
            addCriterion("f_bip_headimage is null");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageIsNotNull() {
            addCriterion("f_bip_headimage is not null");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageEqualTo(String value) {
            addCriterion("f_bip_headimage =", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageNotEqualTo(String value) {
            addCriterion("f_bip_headimage <>", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageGreaterThan(String value) {
            addCriterion("f_bip_headimage >", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_headimage >=", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageLessThan(String value) {
            addCriterion("f_bip_headimage <", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_headimage <=", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageLike(String value) {
            addCriterion("f_bip_headimage like", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageNotLike(String value) {
            addCriterion("f_bip_headimage not like", value, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageIn(List<String> values) {
            addCriterion("f_bip_headimage in", values, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageNotIn(List<String> values) {
            addCriterion("f_bip_headimage not in", values, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageBetween(String value1, String value2) {
            addCriterion("f_bip_headimage between", value1, value2, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipHeadimageNotBetween(String value1, String value2) {
            addCriterion("f_bip_headimage not between", value1, value2, "fBipHeadimage");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookIsNull() {
            addCriterion("f_bip_politicaloutlook is null");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookIsNotNull() {
            addCriterion("f_bip_politicaloutlook is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookEqualTo(String value) {
            addCriterion("f_bip_politicaloutlook =", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookNotEqualTo(String value) {
            addCriterion("f_bip_politicaloutlook <>", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookGreaterThan(String value) {
            addCriterion("f_bip_politicaloutlook >", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_politicaloutlook >=", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookLessThan(String value) {
            addCriterion("f_bip_politicaloutlook <", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookLessThanOrEqualTo(String value) {
            addCriterion("f_bip_politicaloutlook <=", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookLike(String value) {
            addCriterion("f_bip_politicaloutlook like", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookNotLike(String value) {
            addCriterion("f_bip_politicaloutlook not like", value, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookIn(List<String> values) {
            addCriterion("f_bip_politicaloutlook in", values, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookNotIn(List<String> values) {
            addCriterion("f_bip_politicaloutlook not in", values, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookBetween(String value1, String value2) {
            addCriterion("f_bip_politicaloutlook between", value1, value2, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipPoliticaloutlookNotBetween(String value1, String value2) {
            addCriterion("f_bip_politicaloutlook not between", value1, value2, "fBipPoliticaloutlook");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageIsNull() {
            addCriterion("f_bip_issendmessage is null");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageIsNotNull() {
            addCriterion("f_bip_issendmessage is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageEqualTo(String value) {
            addCriterion("f_bip_issendmessage =", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageNotEqualTo(String value) {
            addCriterion("f_bip_issendmessage <>", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageGreaterThan(String value) {
            addCriterion("f_bip_issendmessage >", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_issendmessage >=", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageLessThan(String value) {
            addCriterion("f_bip_issendmessage <", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_issendmessage <=", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageLike(String value) {
            addCriterion("f_bip_issendmessage like", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageNotLike(String value) {
            addCriterion("f_bip_issendmessage not like", value, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageIn(List<String> values) {
            addCriterion("f_bip_issendmessage in", values, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageNotIn(List<String> values) {
            addCriterion("f_bip_issendmessage not in", values, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageBetween(String value1, String value2) {
            addCriterion("f_bip_issendmessage between", value1, value2, "fBipIssendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIssendmessageNotBetween(String value1, String value2) {
            addCriterion("f_bip_issendmessage not between", value1, value2, "fBipIssendmessage");
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