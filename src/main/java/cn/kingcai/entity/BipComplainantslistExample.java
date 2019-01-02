package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipComplainantslistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipComplainantslistExample() {
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

        public Criteria andFBipPetitionernameIsNull() {
            addCriterion("f_bip_petitionername is null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameIsNotNull() {
            addCriterion("f_bip_petitionername is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameEqualTo(String value) {
            addCriterion("f_bip_petitionername =", value, "fBipPetitionername");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameNotEqualTo(String value) {
            addCriterion("f_bip_petitionername <>", value, "fBipPetitionername");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameGreaterThan(String value) {
            addCriterion("f_bip_petitionername >", value, "fBipPetitionername");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_petitionername >=", value, "fBipPetitionername");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameLessThan(String value) {
            addCriterion("f_bip_petitionername <", value, "fBipPetitionername");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameLessThanOrEqualTo(String value) {
            addCriterion("f_bip_petitionername <=", value, "fBipPetitionername");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameLike(String value) {
            addCriterion("f_bip_petitionername like", value, "fBipPetitionername");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameNotLike(String value) {
            addCriterion("f_bip_petitionername not like", value, "fBipPetitionername");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameIn(List<String> values) {
            addCriterion("f_bip_petitionername in", values, "fBipPetitionername");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameNotIn(List<String> values) {
            addCriterion("f_bip_petitionername not in", values, "fBipPetitionername");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameBetween(String value1, String value2) {
            addCriterion("f_bip_petitionername between", value1, value2, "fBipPetitionername");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernameNotBetween(String value1, String value2) {
            addCriterion("f_bip_petitionername not between", value1, value2, "fBipPetitionername");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridIsNull() {
            addCriterion("f_bip_complainantsnumerid is null");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridIsNotNull() {
            addCriterion("f_bip_complainantsnumerid is not null");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridEqualTo(String value) {
            addCriterion("f_bip_complainantsnumerid =", value, "fBipComplainantsnumerid");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridNotEqualTo(String value) {
            addCriterion("f_bip_complainantsnumerid <>", value, "fBipComplainantsnumerid");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridGreaterThan(String value) {
            addCriterion("f_bip_complainantsnumerid >", value, "fBipComplainantsnumerid");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_complainantsnumerid >=", value, "fBipComplainantsnumerid");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridLessThan(String value) {
            addCriterion("f_bip_complainantsnumerid <", value, "fBipComplainantsnumerid");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridLessThanOrEqualTo(String value) {
            addCriterion("f_bip_complainantsnumerid <=", value, "fBipComplainantsnumerid");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridLike(String value) {
            addCriterion("f_bip_complainantsnumerid like", value, "fBipComplainantsnumerid");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridNotLike(String value) {
            addCriterion("f_bip_complainantsnumerid not like", value, "fBipComplainantsnumerid");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridIn(List<String> values) {
            addCriterion("f_bip_complainantsnumerid in", values, "fBipComplainantsnumerid");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridNotIn(List<String> values) {
            addCriterion("f_bip_complainantsnumerid not in", values, "fBipComplainantsnumerid");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridBetween(String value1, String value2) {
            addCriterion("f_bip_complainantsnumerid between", value1, value2, "fBipComplainantsnumerid");
            return (Criteria) this;
        }

        public Criteria andFBipComplainantsnumeridNotBetween(String value1, String value2) {
            addCriterion("f_bip_complainantsnumerid not between", value1, value2, "fBipComplainantsnumerid");
            return (Criteria) this;
        }

        public Criteria andFBipPictureIsNull() {
            addCriterion("f_bip_picture is null");
            return (Criteria) this;
        }

        public Criteria andFBipPictureIsNotNull() {
            addCriterion("f_bip_picture is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPictureEqualTo(String value) {
            addCriterion("f_bip_picture =", value, "fBipPicture");
            return (Criteria) this;
        }

        public Criteria andFBipPictureNotEqualTo(String value) {
            addCriterion("f_bip_picture <>", value, "fBipPicture");
            return (Criteria) this;
        }

        public Criteria andFBipPictureGreaterThan(String value) {
            addCriterion("f_bip_picture >", value, "fBipPicture");
            return (Criteria) this;
        }

        public Criteria andFBipPictureGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_picture >=", value, "fBipPicture");
            return (Criteria) this;
        }

        public Criteria andFBipPictureLessThan(String value) {
            addCriterion("f_bip_picture <", value, "fBipPicture");
            return (Criteria) this;
        }

        public Criteria andFBipPictureLessThanOrEqualTo(String value) {
            addCriterion("f_bip_picture <=", value, "fBipPicture");
            return (Criteria) this;
        }

        public Criteria andFBipPictureLike(String value) {
            addCriterion("f_bip_picture like", value, "fBipPicture");
            return (Criteria) this;
        }

        public Criteria andFBipPictureNotLike(String value) {
            addCriterion("f_bip_picture not like", value, "fBipPicture");
            return (Criteria) this;
        }

        public Criteria andFBipPictureIn(List<String> values) {
            addCriterion("f_bip_picture in", values, "fBipPicture");
            return (Criteria) this;
        }

        public Criteria andFBipPictureNotIn(List<String> values) {
            addCriterion("f_bip_picture not in", values, "fBipPicture");
            return (Criteria) this;
        }

        public Criteria andFBipPictureBetween(String value1, String value2) {
            addCriterion("f_bip_picture between", value1, value2, "fBipPicture");
            return (Criteria) this;
        }

        public Criteria andFBipPictureNotBetween(String value1, String value2) {
            addCriterion("f_bip_picture not between", value1, value2, "fBipPicture");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsIsNull() {
            addCriterion("f_bip_iscontacts is null");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsIsNotNull() {
            addCriterion("f_bip_iscontacts is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsEqualTo(String value) {
            addCriterion("f_bip_iscontacts =", value, "fBipIscontacts");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsNotEqualTo(String value) {
            addCriterion("f_bip_iscontacts <>", value, "fBipIscontacts");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsGreaterThan(String value) {
            addCriterion("f_bip_iscontacts >", value, "fBipIscontacts");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_iscontacts >=", value, "fBipIscontacts");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsLessThan(String value) {
            addCriterion("f_bip_iscontacts <", value, "fBipIscontacts");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsLessThanOrEqualTo(String value) {
            addCriterion("f_bip_iscontacts <=", value, "fBipIscontacts");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsLike(String value) {
            addCriterion("f_bip_iscontacts like", value, "fBipIscontacts");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsNotLike(String value) {
            addCriterion("f_bip_iscontacts not like", value, "fBipIscontacts");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsIn(List<String> values) {
            addCriterion("f_bip_iscontacts in", values, "fBipIscontacts");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsNotIn(List<String> values) {
            addCriterion("f_bip_iscontacts not in", values, "fBipIscontacts");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsBetween(String value1, String value2) {
            addCriterion("f_bip_iscontacts between", value1, value2, "fBipIscontacts");
            return (Criteria) this;
        }

        public Criteria andFBipIscontactsNotBetween(String value1, String value2) {
            addCriterion("f_bip_iscontacts not between", value1, value2, "fBipIscontacts");
            return (Criteria) this;
        }

        public Criteria andFsexIsNull() {
            addCriterion("fsex is null");
            return (Criteria) this;
        }

        public Criteria andFsexIsNotNull() {
            addCriterion("fsex is not null");
            return (Criteria) this;
        }

        public Criteria andFsexEqualTo(String value) {
            addCriterion("fsex =", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotEqualTo(String value) {
            addCriterion("fsex <>", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexGreaterThan(String value) {
            addCriterion("fsex >", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexGreaterThanOrEqualTo(String value) {
            addCriterion("fsex >=", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexLessThan(String value) {
            addCriterion("fsex <", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexLessThanOrEqualTo(String value) {
            addCriterion("fsex <=", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexLike(String value) {
            addCriterion("fsex like", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotLike(String value) {
            addCriterion("fsex not like", value, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexIn(List<String> values) {
            addCriterion("fsex in", values, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotIn(List<String> values) {
            addCriterion("fsex not in", values, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexBetween(String value1, String value2) {
            addCriterion("fsex between", value1, value2, "fsex");
            return (Criteria) this;
        }

        public Criteria andFsexNotBetween(String value1, String value2) {
            addCriterion("fsex not between", value1, value2, "fsex");
            return (Criteria) this;
        }

        public Criteria andFnationIsNull() {
            addCriterion("fnation is null");
            return (Criteria) this;
        }

        public Criteria andFnationIsNotNull() {
            addCriterion("fnation is not null");
            return (Criteria) this;
        }

        public Criteria andFnationEqualTo(String value) {
            addCriterion("fnation =", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationNotEqualTo(String value) {
            addCriterion("fnation <>", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationGreaterThan(String value) {
            addCriterion("fnation >", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationGreaterThanOrEqualTo(String value) {
            addCriterion("fnation >=", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationLessThan(String value) {
            addCriterion("fnation <", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationLessThanOrEqualTo(String value) {
            addCriterion("fnation <=", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationLike(String value) {
            addCriterion("fnation like", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationNotLike(String value) {
            addCriterion("fnation not like", value, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationIn(List<String> values) {
            addCriterion("fnation in", values, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationNotIn(List<String> values) {
            addCriterion("fnation not in", values, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationBetween(String value1, String value2) {
            addCriterion("fnation between", value1, value2, "fnation");
            return (Criteria) this;
        }

        public Criteria andFnationNotBetween(String value1, String value2) {
            addCriterion("fnation not between", value1, value2, "fnation");
            return (Criteria) this;
        }

        public Criteria andFbirthdateIsNull() {
            addCriterion("fbirthdate is null");
            return (Criteria) this;
        }

        public Criteria andFbirthdateIsNotNull() {
            addCriterion("fbirthdate is not null");
            return (Criteria) this;
        }

        public Criteria andFbirthdateEqualTo(Date value) {
            addCriterion("fbirthdate =", value, "fbirthdate");
            return (Criteria) this;
        }

        public Criteria andFbirthdateNotEqualTo(Date value) {
            addCriterion("fbirthdate <>", value, "fbirthdate");
            return (Criteria) this;
        }

        public Criteria andFbirthdateGreaterThan(Date value) {
            addCriterion("fbirthdate >", value, "fbirthdate");
            return (Criteria) this;
        }

        public Criteria andFbirthdateGreaterThanOrEqualTo(Date value) {
            addCriterion("fbirthdate >=", value, "fbirthdate");
            return (Criteria) this;
        }

        public Criteria andFbirthdateLessThan(Date value) {
            addCriterion("fbirthdate <", value, "fbirthdate");
            return (Criteria) this;
        }

        public Criteria andFbirthdateLessThanOrEqualTo(Date value) {
            addCriterion("fbirthdate <=", value, "fbirthdate");
            return (Criteria) this;
        }

        public Criteria andFbirthdateIn(List<Date> values) {
            addCriterion("fbirthdate in", values, "fbirthdate");
            return (Criteria) this;
        }

        public Criteria andFbirthdateNotIn(List<Date> values) {
            addCriterion("fbirthdate not in", values, "fbirthdate");
            return (Criteria) this;
        }

        public Criteria andFbirthdateBetween(Date value1, Date value2) {
            addCriterion("fbirthdate between", value1, value2, "fbirthdate");
            return (Criteria) this;
        }

        public Criteria andFbirthdateNotBetween(Date value1, Date value2) {
            addCriterion("fbirthdate not between", value1, value2, "fbirthdate");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceIsNull() {
            addCriterion("f_nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceIsNotNull() {
            addCriterion("f_nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceEqualTo(String value) {
            addCriterion("f_nativeplace =", value, "fNativeplace");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceNotEqualTo(String value) {
            addCriterion("f_nativeplace <>", value, "fNativeplace");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceGreaterThan(String value) {
            addCriterion("f_nativeplace >", value, "fNativeplace");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("f_nativeplace >=", value, "fNativeplace");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceLessThan(String value) {
            addCriterion("f_nativeplace <", value, "fNativeplace");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("f_nativeplace <=", value, "fNativeplace");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceLike(String value) {
            addCriterion("f_nativeplace like", value, "fNativeplace");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceNotLike(String value) {
            addCriterion("f_nativeplace not like", value, "fNativeplace");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceIn(List<String> values) {
            addCriterion("f_nativeplace in", values, "fNativeplace");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceNotIn(List<String> values) {
            addCriterion("f_nativeplace not in", values, "fNativeplace");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceBetween(String value1, String value2) {
            addCriterion("f_nativeplace between", value1, value2, "fNativeplace");
            return (Criteria) this;
        }

        public Criteria andFNativeplaceNotBetween(String value1, String value2) {
            addCriterion("f_nativeplace not between", value1, value2, "fNativeplace");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteIsNull() {
            addCriterion("f_bip_phote is null");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteIsNotNull() {
            addCriterion("f_bip_phote is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteEqualTo(String value) {
            addCriterion("f_bip_phote =", value, "fBipPhote");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteNotEqualTo(String value) {
            addCriterion("f_bip_phote <>", value, "fBipPhote");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteGreaterThan(String value) {
            addCriterion("f_bip_phote >", value, "fBipPhote");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_phote >=", value, "fBipPhote");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteLessThan(String value) {
            addCriterion("f_bip_phote <", value, "fBipPhote");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteLessThanOrEqualTo(String value) {
            addCriterion("f_bip_phote <=", value, "fBipPhote");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteLike(String value) {
            addCriterion("f_bip_phote like", value, "fBipPhote");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteNotLike(String value) {
            addCriterion("f_bip_phote not like", value, "fBipPhote");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteIn(List<String> values) {
            addCriterion("f_bip_phote in", values, "fBipPhote");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteNotIn(List<String> values) {
            addCriterion("f_bip_phote not in", values, "fBipPhote");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteBetween(String value1, String value2) {
            addCriterion("f_bip_phote between", value1, value2, "fBipPhote");
            return (Criteria) this;
        }

        public Criteria andFBipPhoteNotBetween(String value1, String value2) {
            addCriterion("f_bip_phote not between", value1, value2, "fBipPhote");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneIsNull() {
            addCriterion("f_bip_phone is null");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneIsNotNull() {
            addCriterion("f_bip_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneEqualTo(String value) {
            addCriterion("f_bip_phone =", value, "fBipPhone");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneNotEqualTo(String value) {
            addCriterion("f_bip_phone <>", value, "fBipPhone");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneGreaterThan(String value) {
            addCriterion("f_bip_phone >", value, "fBipPhone");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_phone >=", value, "fBipPhone");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneLessThan(String value) {
            addCriterion("f_bip_phone <", value, "fBipPhone");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneLessThanOrEqualTo(String value) {
            addCriterion("f_bip_phone <=", value, "fBipPhone");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneLike(String value) {
            addCriterion("f_bip_phone like", value, "fBipPhone");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneNotLike(String value) {
            addCriterion("f_bip_phone not like", value, "fBipPhone");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneIn(List<String> values) {
            addCriterion("f_bip_phone in", values, "fBipPhone");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneNotIn(List<String> values) {
            addCriterion("f_bip_phone not in", values, "fBipPhone");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneBetween(String value1, String value2) {
            addCriterion("f_bip_phone between", value1, value2, "fBipPhone");
            return (Criteria) this;
        }

        public Criteria andFBipPhoneNotBetween(String value1, String value2) {
            addCriterion("f_bip_phone not between", value1, value2, "fBipPhone");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszIsNull() {
            addCriterion("f_bip_addressz is null");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszIsNotNull() {
            addCriterion("f_bip_addressz is not null");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszEqualTo(String value) {
            addCriterion("f_bip_addressz =", value, "fBipAddressz");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszNotEqualTo(String value) {
            addCriterion("f_bip_addressz <>", value, "fBipAddressz");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszGreaterThan(String value) {
            addCriterion("f_bip_addressz >", value, "fBipAddressz");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_addressz >=", value, "fBipAddressz");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszLessThan(String value) {
            addCriterion("f_bip_addressz <", value, "fBipAddressz");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszLessThanOrEqualTo(String value) {
            addCriterion("f_bip_addressz <=", value, "fBipAddressz");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszLike(String value) {
            addCriterion("f_bip_addressz like", value, "fBipAddressz");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszNotLike(String value) {
            addCriterion("f_bip_addressz not like", value, "fBipAddressz");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszIn(List<String> values) {
            addCriterion("f_bip_addressz in", values, "fBipAddressz");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszNotIn(List<String> values) {
            addCriterion("f_bip_addressz not in", values, "fBipAddressz");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszBetween(String value1, String value2) {
            addCriterion("f_bip_addressz between", value1, value2, "fBipAddressz");
            return (Criteria) this;
        }

        public Criteria andFBipAddresszNotBetween(String value1, String value2) {
            addCriterion("f_bip_addressz not between", value1, value2, "fBipAddressz");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookIsNull() {
            addCriterion("f_bip_outlook is null");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookIsNotNull() {
            addCriterion("f_bip_outlook is not null");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookEqualTo(String value) {
            addCriterion("f_bip_outlook =", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookNotEqualTo(String value) {
            addCriterion("f_bip_outlook <>", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookGreaterThan(String value) {
            addCriterion("f_bip_outlook >", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_outlook >=", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookLessThan(String value) {
            addCriterion("f_bip_outlook <", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookLessThanOrEqualTo(String value) {
            addCriterion("f_bip_outlook <=", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookLike(String value) {
            addCriterion("f_bip_outlook like", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookNotLike(String value) {
            addCriterion("f_bip_outlook not like", value, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookIn(List<String> values) {
            addCriterion("f_bip_outlook in", values, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookNotIn(List<String> values) {
            addCriterion("f_bip_outlook not in", values, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookBetween(String value1, String value2) {
            addCriterion("f_bip_outlook between", value1, value2, "fBipOutlook");
            return (Criteria) this;
        }

        public Criteria andFBipOutlookNotBetween(String value1, String value2) {
            addCriterion("f_bip_outlook not between", value1, value2, "fBipOutlook");
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