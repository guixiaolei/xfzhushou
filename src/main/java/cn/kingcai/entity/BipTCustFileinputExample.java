package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTCustFileinputExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTCustFileinputExample() {
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

        public Criteria andFBipFiletypeIsNull() {
            addCriterion("f_bip_filetype is null");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeIsNotNull() {
            addCriterion("f_bip_filetype is not null");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeEqualTo(String value) {
            addCriterion("f_bip_filetype =", value, "fBipFiletype");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeNotEqualTo(String value) {
            addCriterion("f_bip_filetype <>", value, "fBipFiletype");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeGreaterThan(String value) {
            addCriterion("f_bip_filetype >", value, "fBipFiletype");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_filetype >=", value, "fBipFiletype");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeLessThan(String value) {
            addCriterion("f_bip_filetype <", value, "fBipFiletype");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeLessThanOrEqualTo(String value) {
            addCriterion("f_bip_filetype <=", value, "fBipFiletype");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeLike(String value) {
            addCriterion("f_bip_filetype like", value, "fBipFiletype");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeNotLike(String value) {
            addCriterion("f_bip_filetype not like", value, "fBipFiletype");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeIn(List<String> values) {
            addCriterion("f_bip_filetype in", values, "fBipFiletype");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeNotIn(List<String> values) {
            addCriterion("f_bip_filetype not in", values, "fBipFiletype");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeBetween(String value1, String value2) {
            addCriterion("f_bip_filetype between", value1, value2, "fBipFiletype");
            return (Criteria) this;
        }

        public Criteria andFBipFiletypeNotBetween(String value1, String value2) {
            addCriterion("f_bip_filetype not between", value1, value2, "fBipFiletype");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameIsNull() {
            addCriterion("f_bip_filename is null");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameIsNotNull() {
            addCriterion("f_bip_filename is not null");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameEqualTo(String value) {
            addCriterion("f_bip_filename =", value, "fBipFilename");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameNotEqualTo(String value) {
            addCriterion("f_bip_filename <>", value, "fBipFilename");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameGreaterThan(String value) {
            addCriterion("f_bip_filename >", value, "fBipFilename");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_filename >=", value, "fBipFilename");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameLessThan(String value) {
            addCriterion("f_bip_filename <", value, "fBipFilename");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameLessThanOrEqualTo(String value) {
            addCriterion("f_bip_filename <=", value, "fBipFilename");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameLike(String value) {
            addCriterion("f_bip_filename like", value, "fBipFilename");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameNotLike(String value) {
            addCriterion("f_bip_filename not like", value, "fBipFilename");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameIn(List<String> values) {
            addCriterion("f_bip_filename in", values, "fBipFilename");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameNotIn(List<String> values) {
            addCriterion("f_bip_filename not in", values, "fBipFilename");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameBetween(String value1, String value2) {
            addCriterion("f_bip_filename between", value1, value2, "fBipFilename");
            return (Criteria) this;
        }

        public Criteria andFBipFilenameNotBetween(String value1, String value2) {
            addCriterion("f_bip_filename not between", value1, value2, "fBipFilename");
            return (Criteria) this;
        }

        public Criteria andFBipInputtimeIsNull() {
            addCriterion("f_bip_inputtime is null");
            return (Criteria) this;
        }

        public Criteria andFBipInputtimeIsNotNull() {
            addCriterion("f_bip_inputtime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipInputtimeEqualTo(Date value) {
            addCriterion("f_bip_inputtime =", value, "fBipInputtime");
            return (Criteria) this;
        }

        public Criteria andFBipInputtimeNotEqualTo(Date value) {
            addCriterion("f_bip_inputtime <>", value, "fBipInputtime");
            return (Criteria) this;
        }

        public Criteria andFBipInputtimeGreaterThan(Date value) {
            addCriterion("f_bip_inputtime >", value, "fBipInputtime");
            return (Criteria) this;
        }

        public Criteria andFBipInputtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_inputtime >=", value, "fBipInputtime");
            return (Criteria) this;
        }

        public Criteria andFBipInputtimeLessThan(Date value) {
            addCriterion("f_bip_inputtime <", value, "fBipInputtime");
            return (Criteria) this;
        }

        public Criteria andFBipInputtimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_inputtime <=", value, "fBipInputtime");
            return (Criteria) this;
        }

        public Criteria andFBipInputtimeIn(List<Date> values) {
            addCriterion("f_bip_inputtime in", values, "fBipInputtime");
            return (Criteria) this;
        }

        public Criteria andFBipInputtimeNotIn(List<Date> values) {
            addCriterion("f_bip_inputtime not in", values, "fBipInputtime");
            return (Criteria) this;
        }

        public Criteria andFBipInputtimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_inputtime between", value1, value2, "fBipInputtime");
            return (Criteria) this;
        }

        public Criteria andFBipInputtimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_inputtime not between", value1, value2, "fBipInputtime");
            return (Criteria) this;
        }

        public Criteria andFBipSecretIsNull() {
            addCriterion("f_bip_secret is null");
            return (Criteria) this;
        }

        public Criteria andFBipSecretIsNotNull() {
            addCriterion("f_bip_secret is not null");
            return (Criteria) this;
        }

        public Criteria andFBipSecretEqualTo(String value) {
            addCriterion("f_bip_secret =", value, "fBipSecret");
            return (Criteria) this;
        }

        public Criteria andFBipSecretNotEqualTo(String value) {
            addCriterion("f_bip_secret <>", value, "fBipSecret");
            return (Criteria) this;
        }

        public Criteria andFBipSecretGreaterThan(String value) {
            addCriterion("f_bip_secret >", value, "fBipSecret");
            return (Criteria) this;
        }

        public Criteria andFBipSecretGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_secret >=", value, "fBipSecret");
            return (Criteria) this;
        }

        public Criteria andFBipSecretLessThan(String value) {
            addCriterion("f_bip_secret <", value, "fBipSecret");
            return (Criteria) this;
        }

        public Criteria andFBipSecretLessThanOrEqualTo(String value) {
            addCriterion("f_bip_secret <=", value, "fBipSecret");
            return (Criteria) this;
        }

        public Criteria andFBipSecretLike(String value) {
            addCriterion("f_bip_secret like", value, "fBipSecret");
            return (Criteria) this;
        }

        public Criteria andFBipSecretNotLike(String value) {
            addCriterion("f_bip_secret not like", value, "fBipSecret");
            return (Criteria) this;
        }

        public Criteria andFBipSecretIn(List<String> values) {
            addCriterion("f_bip_secret in", values, "fBipSecret");
            return (Criteria) this;
        }

        public Criteria andFBipSecretNotIn(List<String> values) {
            addCriterion("f_bip_secret not in", values, "fBipSecret");
            return (Criteria) this;
        }

        public Criteria andFBipSecretBetween(String value1, String value2) {
            addCriterion("f_bip_secret between", value1, value2, "fBipSecret");
            return (Criteria) this;
        }

        public Criteria andFBipSecretNotBetween(String value1, String value2) {
            addCriterion("f_bip_secret not between", value1, value2, "fBipSecret");
            return (Criteria) this;
        }

        public Criteria andFBipClaimIsNull() {
            addCriterion("f_bip_claim is null");
            return (Criteria) this;
        }

        public Criteria andFBipClaimIsNotNull() {
            addCriterion("f_bip_claim is not null");
            return (Criteria) this;
        }

        public Criteria andFBipClaimEqualTo(String value) {
            addCriterion("f_bip_claim =", value, "fBipClaim");
            return (Criteria) this;
        }

        public Criteria andFBipClaimNotEqualTo(String value) {
            addCriterion("f_bip_claim <>", value, "fBipClaim");
            return (Criteria) this;
        }

        public Criteria andFBipClaimGreaterThan(String value) {
            addCriterion("f_bip_claim >", value, "fBipClaim");
            return (Criteria) this;
        }

        public Criteria andFBipClaimGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_claim >=", value, "fBipClaim");
            return (Criteria) this;
        }

        public Criteria andFBipClaimLessThan(String value) {
            addCriterion("f_bip_claim <", value, "fBipClaim");
            return (Criteria) this;
        }

        public Criteria andFBipClaimLessThanOrEqualTo(String value) {
            addCriterion("f_bip_claim <=", value, "fBipClaim");
            return (Criteria) this;
        }

        public Criteria andFBipClaimLike(String value) {
            addCriterion("f_bip_claim like", value, "fBipClaim");
            return (Criteria) this;
        }

        public Criteria andFBipClaimNotLike(String value) {
            addCriterion("f_bip_claim not like", value, "fBipClaim");
            return (Criteria) this;
        }

        public Criteria andFBipClaimIn(List<String> values) {
            addCriterion("f_bip_claim in", values, "fBipClaim");
            return (Criteria) this;
        }

        public Criteria andFBipClaimNotIn(List<String> values) {
            addCriterion("f_bip_claim not in", values, "fBipClaim");
            return (Criteria) this;
        }

        public Criteria andFBipClaimBetween(String value1, String value2) {
            addCriterion("f_bip_claim between", value1, value2, "fBipClaim");
            return (Criteria) this;
        }

        public Criteria andFBipClaimNotBetween(String value1, String value2) {
            addCriterion("f_bip_claim not between", value1, value2, "fBipClaim");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationIsNull() {
            addCriterion("f_bip_implementation is null");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationIsNotNull() {
            addCriterion("f_bip_implementation is not null");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationEqualTo(String value) {
            addCriterion("f_bip_implementation =", value, "fBipImplementation");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationNotEqualTo(String value) {
            addCriterion("f_bip_implementation <>", value, "fBipImplementation");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationGreaterThan(String value) {
            addCriterion("f_bip_implementation >", value, "fBipImplementation");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_implementation >=", value, "fBipImplementation");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationLessThan(String value) {
            addCriterion("f_bip_implementation <", value, "fBipImplementation");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationLessThanOrEqualTo(String value) {
            addCriterion("f_bip_implementation <=", value, "fBipImplementation");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationLike(String value) {
            addCriterion("f_bip_implementation like", value, "fBipImplementation");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationNotLike(String value) {
            addCriterion("f_bip_implementation not like", value, "fBipImplementation");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationIn(List<String> values) {
            addCriterion("f_bip_implementation in", values, "fBipImplementation");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationNotIn(List<String> values) {
            addCriterion("f_bip_implementation not in", values, "fBipImplementation");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationBetween(String value1, String value2) {
            addCriterion("f_bip_implementation between", value1, value2, "fBipImplementation");
            return (Criteria) this;
        }

        public Criteria andFBipImplementationNotBetween(String value1, String value2) {
            addCriterion("f_bip_implementation not between", value1, value2, "fBipImplementation");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceIsNull() {
            addCriterion("f_bip_leaderadvice is null");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceIsNotNull() {
            addCriterion("f_bip_leaderadvice is not null");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceEqualTo(String value) {
            addCriterion("f_bip_leaderadvice =", value, "fBipLeaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceNotEqualTo(String value) {
            addCriterion("f_bip_leaderadvice <>", value, "fBipLeaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceGreaterThan(String value) {
            addCriterion("f_bip_leaderadvice >", value, "fBipLeaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_leaderadvice >=", value, "fBipLeaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceLessThan(String value) {
            addCriterion("f_bip_leaderadvice <", value, "fBipLeaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceLessThanOrEqualTo(String value) {
            addCriterion("f_bip_leaderadvice <=", value, "fBipLeaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceLike(String value) {
            addCriterion("f_bip_leaderadvice like", value, "fBipLeaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceNotLike(String value) {
            addCriterion("f_bip_leaderadvice not like", value, "fBipLeaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceIn(List<String> values) {
            addCriterion("f_bip_leaderadvice in", values, "fBipLeaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceNotIn(List<String> values) {
            addCriterion("f_bip_leaderadvice not in", values, "fBipLeaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceBetween(String value1, String value2) {
            addCriterion("f_bip_leaderadvice between", value1, value2, "fBipLeaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipLeaderadviceNotBetween(String value1, String value2) {
            addCriterion("f_bip_leaderadvice not between", value1, value2, "fBipLeaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceIsNull() {
            addCriterion("f_bip_bigleaderadvice is null");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceIsNotNull() {
            addCriterion("f_bip_bigleaderadvice is not null");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceEqualTo(String value) {
            addCriterion("f_bip_bigleaderadvice =", value, "fBipBigleaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceNotEqualTo(String value) {
            addCriterion("f_bip_bigleaderadvice <>", value, "fBipBigleaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceGreaterThan(String value) {
            addCriterion("f_bip_bigleaderadvice >", value, "fBipBigleaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_bigleaderadvice >=", value, "fBipBigleaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceLessThan(String value) {
            addCriterion("f_bip_bigleaderadvice <", value, "fBipBigleaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceLessThanOrEqualTo(String value) {
            addCriterion("f_bip_bigleaderadvice <=", value, "fBipBigleaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceLike(String value) {
            addCriterion("f_bip_bigleaderadvice like", value, "fBipBigleaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceNotLike(String value) {
            addCriterion("f_bip_bigleaderadvice not like", value, "fBipBigleaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceIn(List<String> values) {
            addCriterion("f_bip_bigleaderadvice in", values, "fBipBigleaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceNotIn(List<String> values) {
            addCriterion("f_bip_bigleaderadvice not in", values, "fBipBigleaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceBetween(String value1, String value2) {
            addCriterion("f_bip_bigleaderadvice between", value1, value2, "fBipBigleaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipBigleaderadviceNotBetween(String value1, String value2) {
            addCriterion("f_bip_bigleaderadvice not between", value1, value2, "fBipBigleaderadvice");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageIsNull() {
            addCriterion("f_bip_moremessage is null");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageIsNotNull() {
            addCriterion("f_bip_moremessage is not null");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageEqualTo(String value) {
            addCriterion("f_bip_moremessage =", value, "fBipMoremessage");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageNotEqualTo(String value) {
            addCriterion("f_bip_moremessage <>", value, "fBipMoremessage");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageGreaterThan(String value) {
            addCriterion("f_bip_moremessage >", value, "fBipMoremessage");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_moremessage >=", value, "fBipMoremessage");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageLessThan(String value) {
            addCriterion("f_bip_moremessage <", value, "fBipMoremessage");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_moremessage <=", value, "fBipMoremessage");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageLike(String value) {
            addCriterion("f_bip_moremessage like", value, "fBipMoremessage");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageNotLike(String value) {
            addCriterion("f_bip_moremessage not like", value, "fBipMoremessage");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageIn(List<String> values) {
            addCriterion("f_bip_moremessage in", values, "fBipMoremessage");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageNotIn(List<String> values) {
            addCriterion("f_bip_moremessage not in", values, "fBipMoremessage");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageBetween(String value1, String value2) {
            addCriterion("f_bip_moremessage between", value1, value2, "fBipMoremessage");
            return (Criteria) this;
        }

        public Criteria andFBipMoremessageNotBetween(String value1, String value2) {
            addCriterion("f_bip_moremessage not between", value1, value2, "fBipMoremessage");
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