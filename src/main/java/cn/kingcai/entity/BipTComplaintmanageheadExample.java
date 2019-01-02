package cn.kingcai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BipTComplaintmanageheadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BipTComplaintmanageheadExample() {
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

        public Criteria andFBipPetitionernumIsNull() {
            addCriterion("f_bip_petitionernum is null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernumIsNotNull() {
            addCriterion("f_bip_petitionernum is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernumEqualTo(Integer value) {
            addCriterion("f_bip_petitionernum =", value, "fBipPetitionernum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernumNotEqualTo(Integer value) {
            addCriterion("f_bip_petitionernum <>", value, "fBipPetitionernum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernumGreaterThan(Integer value) {
            addCriterion("f_bip_petitionernum >", value, "fBipPetitionernum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_petitionernum >=", value, "fBipPetitionernum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernumLessThan(Integer value) {
            addCriterion("f_bip_petitionernum <", value, "fBipPetitionernum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernumLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_petitionernum <=", value, "fBipPetitionernum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernumIn(List<Integer> values) {
            addCriterion("f_bip_petitionernum in", values, "fBipPetitionernum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernumNotIn(List<Integer> values) {
            addCriterion("f_bip_petitionernum not in", values, "fBipPetitionernum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernumBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_petitionernum between", value1, value2, "fBipPetitionernum");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionernumNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_petitionernum not between", value1, value2, "fBipPetitionernum");
            return (Criteria) this;
        }

        public Criteria andFBipGovernanceunitIsNull() {
            addCriterion("f_bip_governanceunit is null");
            return (Criteria) this;
        }

        public Criteria andFBipGovernanceunitIsNotNull() {
            addCriterion("f_bip_governanceunit is not null");
            return (Criteria) this;
        }

        public Criteria andFBipGovernanceunitEqualTo(Integer value) {
            addCriterion("f_bip_governanceunit =", value, "fBipGovernanceunit");
            return (Criteria) this;
        }

        public Criteria andFBipGovernanceunitNotEqualTo(Integer value) {
            addCriterion("f_bip_governanceunit <>", value, "fBipGovernanceunit");
            return (Criteria) this;
        }

        public Criteria andFBipGovernanceunitGreaterThan(Integer value) {
            addCriterion("f_bip_governanceunit >", value, "fBipGovernanceunit");
            return (Criteria) this;
        }

        public Criteria andFBipGovernanceunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_governanceunit >=", value, "fBipGovernanceunit");
            return (Criteria) this;
        }

        public Criteria andFBipGovernanceunitLessThan(Integer value) {
            addCriterion("f_bip_governanceunit <", value, "fBipGovernanceunit");
            return (Criteria) this;
        }

        public Criteria andFBipGovernanceunitLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_governanceunit <=", value, "fBipGovernanceunit");
            return (Criteria) this;
        }

        public Criteria andFBipGovernanceunitIn(List<Integer> values) {
            addCriterion("f_bip_governanceunit in", values, "fBipGovernanceunit");
            return (Criteria) this;
        }

        public Criteria andFBipGovernanceunitNotIn(List<Integer> values) {
            addCriterion("f_bip_governanceunit not in", values, "fBipGovernanceunit");
            return (Criteria) this;
        }

        public Criteria andFBipGovernanceunitBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_governanceunit between", value1, value2, "fBipGovernanceunit");
            return (Criteria) this;
        }

        public Criteria andFBipGovernanceunitNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_governanceunit not between", value1, value2, "fBipGovernanceunit");
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

        public Criteria andFBipEventdetailsIsNull() {
            addCriterion("f_bip_eventdetails is null");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsIsNotNull() {
            addCriterion("f_bip_eventdetails is not null");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsEqualTo(String value) {
            addCriterion("f_bip_eventdetails =", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsNotEqualTo(String value) {
            addCriterion("f_bip_eventdetails <>", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsGreaterThan(String value) {
            addCriterion("f_bip_eventdetails >", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_eventdetails >=", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsLessThan(String value) {
            addCriterion("f_bip_eventdetails <", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsLessThanOrEqualTo(String value) {
            addCriterion("f_bip_eventdetails <=", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsLike(String value) {
            addCriterion("f_bip_eventdetails like", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsNotLike(String value) {
            addCriterion("f_bip_eventdetails not like", value, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsIn(List<String> values) {
            addCriterion("f_bip_eventdetails in", values, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsNotIn(List<String> values) {
            addCriterion("f_bip_eventdetails not in", values, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsBetween(String value1, String value2) {
            addCriterion("f_bip_eventdetails between", value1, value2, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipEventdetailsNotBetween(String value1, String value2) {
            addCriterion("f_bip_eventdetails not between", value1, value2, "fBipEventdetails");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridIsNull() {
            addCriterion("f_bip_petitionerid is null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridIsNotNull() {
            addCriterion("f_bip_petitionerid is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridEqualTo(String value) {
            addCriterion("f_bip_petitionerid =", value, "fBipPetitionerid");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridNotEqualTo(String value) {
            addCriterion("f_bip_petitionerid <>", value, "fBipPetitionerid");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridGreaterThan(String value) {
            addCriterion("f_bip_petitionerid >", value, "fBipPetitionerid");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_petitionerid >=", value, "fBipPetitionerid");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridLessThan(String value) {
            addCriterion("f_bip_petitionerid <", value, "fBipPetitionerid");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridLessThanOrEqualTo(String value) {
            addCriterion("f_bip_petitionerid <=", value, "fBipPetitionerid");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridLike(String value) {
            addCriterion("f_bip_petitionerid like", value, "fBipPetitionerid");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridNotLike(String value) {
            addCriterion("f_bip_petitionerid not like", value, "fBipPetitionerid");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridIn(List<String> values) {
            addCriterion("f_bip_petitionerid in", values, "fBipPetitionerid");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridNotIn(List<String> values) {
            addCriterion("f_bip_petitionerid not in", values, "fBipPetitionerid");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridBetween(String value1, String value2) {
            addCriterion("f_bip_petitionerid between", value1, value2, "fBipPetitionerid");
            return (Criteria) this;
        }

        public Criteria andFBipPetitioneridNotBetween(String value1, String value2) {
            addCriterion("f_bip_petitionerid not between", value1, value2, "fBipPetitionerid");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelIsNull() {
            addCriterion("f_bip_petitionertel is null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelIsNotNull() {
            addCriterion("f_bip_petitionertel is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelEqualTo(String value) {
            addCriterion("f_bip_petitionertel =", value, "fBipPetitionertel");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelNotEqualTo(String value) {
            addCriterion("f_bip_petitionertel <>", value, "fBipPetitionertel");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelGreaterThan(String value) {
            addCriterion("f_bip_petitionertel >", value, "fBipPetitionertel");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_petitionertel >=", value, "fBipPetitionertel");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelLessThan(String value) {
            addCriterion("f_bip_petitionertel <", value, "fBipPetitionertel");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelLessThanOrEqualTo(String value) {
            addCriterion("f_bip_petitionertel <=", value, "fBipPetitionertel");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelLike(String value) {
            addCriterion("f_bip_petitionertel like", value, "fBipPetitionertel");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelNotLike(String value) {
            addCriterion("f_bip_petitionertel not like", value, "fBipPetitionertel");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelIn(List<String> values) {
            addCriterion("f_bip_petitionertel in", values, "fBipPetitionertel");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelNotIn(List<String> values) {
            addCriterion("f_bip_petitionertel not in", values, "fBipPetitionertel");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelBetween(String value1, String value2) {
            addCriterion("f_bip_petitionertel between", value1, value2, "fBipPetitionertel");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionertelNotBetween(String value1, String value2) {
            addCriterion("f_bip_petitionertel not between", value1, value2, "fBipPetitionertel");
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

        public Criteria andFBipPetitionerIsNull() {
            addCriterion("f_bip_petitioner is null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerIsNotNull() {
            addCriterion("f_bip_petitioner is not null");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerEqualTo(String value) {
            addCriterion("f_bip_petitioner =", value, "fBipPetitioner");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerNotEqualTo(String value) {
            addCriterion("f_bip_petitioner <>", value, "fBipPetitioner");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerGreaterThan(String value) {
            addCriterion("f_bip_petitioner >", value, "fBipPetitioner");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_petitioner >=", value, "fBipPetitioner");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerLessThan(String value) {
            addCriterion("f_bip_petitioner <", value, "fBipPetitioner");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerLessThanOrEqualTo(String value) {
            addCriterion("f_bip_petitioner <=", value, "fBipPetitioner");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerLike(String value) {
            addCriterion("f_bip_petitioner like", value, "fBipPetitioner");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerNotLike(String value) {
            addCriterion("f_bip_petitioner not like", value, "fBipPetitioner");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerIn(List<String> values) {
            addCriterion("f_bip_petitioner in", values, "fBipPetitioner");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerNotIn(List<String> values) {
            addCriterion("f_bip_petitioner not in", values, "fBipPetitioner");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerBetween(String value1, String value2) {
            addCriterion("f_bip_petitioner between", value1, value2, "fBipPetitioner");
            return (Criteria) this;
        }

        public Criteria andFBipPetitionerNotBetween(String value1, String value2) {
            addCriterion("f_bip_petitioner not between", value1, value2, "fBipPetitioner");
            return (Criteria) this;
        }

        public Criteria andFBipLocationIsNull() {
            addCriterion("f_bip_location is null");
            return (Criteria) this;
        }

        public Criteria andFBipLocationIsNotNull() {
            addCriterion("f_bip_location is not null");
            return (Criteria) this;
        }

        public Criteria andFBipLocationEqualTo(String value) {
            addCriterion("f_bip_location =", value, "fBipLocation");
            return (Criteria) this;
        }

        public Criteria andFBipLocationNotEqualTo(String value) {
            addCriterion("f_bip_location <>", value, "fBipLocation");
            return (Criteria) this;
        }

        public Criteria andFBipLocationGreaterThan(String value) {
            addCriterion("f_bip_location >", value, "fBipLocation");
            return (Criteria) this;
        }

        public Criteria andFBipLocationGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_location >=", value, "fBipLocation");
            return (Criteria) this;
        }

        public Criteria andFBipLocationLessThan(String value) {
            addCriterion("f_bip_location <", value, "fBipLocation");
            return (Criteria) this;
        }

        public Criteria andFBipLocationLessThanOrEqualTo(String value) {
            addCriterion("f_bip_location <=", value, "fBipLocation");
            return (Criteria) this;
        }

        public Criteria andFBipLocationLike(String value) {
            addCriterion("f_bip_location like", value, "fBipLocation");
            return (Criteria) this;
        }

        public Criteria andFBipLocationNotLike(String value) {
            addCriterion("f_bip_location not like", value, "fBipLocation");
            return (Criteria) this;
        }

        public Criteria andFBipLocationIn(List<String> values) {
            addCriterion("f_bip_location in", values, "fBipLocation");
            return (Criteria) this;
        }

        public Criteria andFBipLocationNotIn(List<String> values) {
            addCriterion("f_bip_location not in", values, "fBipLocation");
            return (Criteria) this;
        }

        public Criteria andFBipLocationBetween(String value1, String value2) {
            addCriterion("f_bip_location between", value1, value2, "fBipLocation");
            return (Criteria) this;
        }

        public Criteria andFBipLocationNotBetween(String value1, String value2) {
            addCriterion("f_bip_location not between", value1, value2, "fBipLocation");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultIsNull() {
            addCriterion("f_bip_handledresult is null");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultIsNotNull() {
            addCriterion("f_bip_handledresult is not null");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultEqualTo(String value) {
            addCriterion("f_bip_handledresult =", value, "fBipHandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultNotEqualTo(String value) {
            addCriterion("f_bip_handledresult <>", value, "fBipHandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultGreaterThan(String value) {
            addCriterion("f_bip_handledresult >", value, "fBipHandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_handledresult >=", value, "fBipHandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultLessThan(String value) {
            addCriterion("f_bip_handledresult <", value, "fBipHandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultLessThanOrEqualTo(String value) {
            addCriterion("f_bip_handledresult <=", value, "fBipHandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultLike(String value) {
            addCriterion("f_bip_handledresult like", value, "fBipHandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultNotLike(String value) {
            addCriterion("f_bip_handledresult not like", value, "fBipHandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultIn(List<String> values) {
            addCriterion("f_bip_handledresult in", values, "fBipHandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultNotIn(List<String> values) {
            addCriterion("f_bip_handledresult not in", values, "fBipHandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultBetween(String value1, String value2) {
            addCriterion("f_bip_handledresult between", value1, value2, "fBipHandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipHandledresultNotBetween(String value1, String value2) {
            addCriterion("f_bip_handledresult not between", value1, value2, "fBipHandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultIsNull() {
            addCriterion("f_bip_eventhandledresult is null");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultIsNotNull() {
            addCriterion("f_bip_eventhandledresult is not null");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultEqualTo(String value) {
            addCriterion("f_bip_eventhandledresult =", value, "fBipEventhandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultNotEqualTo(String value) {
            addCriterion("f_bip_eventhandledresult <>", value, "fBipEventhandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultGreaterThan(String value) {
            addCriterion("f_bip_eventhandledresult >", value, "fBipEventhandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_eventhandledresult >=", value, "fBipEventhandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultLessThan(String value) {
            addCriterion("f_bip_eventhandledresult <", value, "fBipEventhandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultLessThanOrEqualTo(String value) {
            addCriterion("f_bip_eventhandledresult <=", value, "fBipEventhandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultLike(String value) {
            addCriterion("f_bip_eventhandledresult like", value, "fBipEventhandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultNotLike(String value) {
            addCriterion("f_bip_eventhandledresult not like", value, "fBipEventhandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultIn(List<String> values) {
            addCriterion("f_bip_eventhandledresult in", values, "fBipEventhandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultNotIn(List<String> values) {
            addCriterion("f_bip_eventhandledresult not in", values, "fBipEventhandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultBetween(String value1, String value2) {
            addCriterion("f_bip_eventhandledresult between", value1, value2, "fBipEventhandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledresultNotBetween(String value1, String value2) {
            addCriterion("f_bip_eventhandledresult not between", value1, value2, "fBipEventhandledresult");
            return (Criteria) this;
        }

        public Criteria andFBipCreaternameIsNull() {
            addCriterion("f_bip_creatername is null");
            return (Criteria) this;
        }

        public Criteria andFBipCreaternameIsNotNull() {
            addCriterion("f_bip_creatername is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCreaternameEqualTo(Integer value) {
            addCriterion("f_bip_creatername =", value, "fBipCreatername");
            return (Criteria) this;
        }

        public Criteria andFBipCreaternameNotEqualTo(Integer value) {
            addCriterion("f_bip_creatername <>", value, "fBipCreatername");
            return (Criteria) this;
        }

        public Criteria andFBipCreaternameGreaterThan(Integer value) {
            addCriterion("f_bip_creatername >", value, "fBipCreatername");
            return (Criteria) this;
        }

        public Criteria andFBipCreaternameGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_creatername >=", value, "fBipCreatername");
            return (Criteria) this;
        }

        public Criteria andFBipCreaternameLessThan(Integer value) {
            addCriterion("f_bip_creatername <", value, "fBipCreatername");
            return (Criteria) this;
        }

        public Criteria andFBipCreaternameLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_creatername <=", value, "fBipCreatername");
            return (Criteria) this;
        }

        public Criteria andFBipCreaternameIn(List<Integer> values) {
            addCriterion("f_bip_creatername in", values, "fBipCreatername");
            return (Criteria) this;
        }

        public Criteria andFBipCreaternameNotIn(List<Integer> values) {
            addCriterion("f_bip_creatername not in", values, "fBipCreatername");
            return (Criteria) this;
        }

        public Criteria andFBipCreaternameBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_creatername between", value1, value2, "fBipCreatername");
            return (Criteria) this;
        }

        public Criteria andFBipCreaternameNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_creatername not between", value1, value2, "fBipCreatername");
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

        public Criteria andFBipCreatedateIsNull() {
            addCriterion("f_bip_createdate is null");
            return (Criteria) this;
        }

        public Criteria andFBipCreatedateIsNotNull() {
            addCriterion("f_bip_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCreatedateEqualTo(Date value) {
            addCriterion("f_bip_createdate =", value, "fBipCreatedate");
            return (Criteria) this;
        }

        public Criteria andFBipCreatedateNotEqualTo(Date value) {
            addCriterion("f_bip_createdate <>", value, "fBipCreatedate");
            return (Criteria) this;
        }

        public Criteria andFBipCreatedateGreaterThan(Date value) {
            addCriterion("f_bip_createdate >", value, "fBipCreatedate");
            return (Criteria) this;
        }

        public Criteria andFBipCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_createdate >=", value, "fBipCreatedate");
            return (Criteria) this;
        }

        public Criteria andFBipCreatedateLessThan(Date value) {
            addCriterion("f_bip_createdate <", value, "fBipCreatedate");
            return (Criteria) this;
        }

        public Criteria andFBipCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_createdate <=", value, "fBipCreatedate");
            return (Criteria) this;
        }

        public Criteria andFBipCreatedateIn(List<Date> values) {
            addCriterion("f_bip_createdate in", values, "fBipCreatedate");
            return (Criteria) this;
        }

        public Criteria andFBipCreatedateNotIn(List<Date> values) {
            addCriterion("f_bip_createdate not in", values, "fBipCreatedate");
            return (Criteria) this;
        }

        public Criteria andFBipCreatedateBetween(Date value1, Date value2) {
            addCriterion("f_bip_createdate between", value1, value2, "fBipCreatedate");
            return (Criteria) this;
        }

        public Criteria andFBipCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_createdate not between", value1, value2, "fBipCreatedate");
            return (Criteria) this;
        }

        public Criteria andFBipModifydateIsNull() {
            addCriterion("f_bip_modifydate is null");
            return (Criteria) this;
        }

        public Criteria andFBipModifydateIsNotNull() {
            addCriterion("f_bip_modifydate is not null");
            return (Criteria) this;
        }

        public Criteria andFBipModifydateEqualTo(Date value) {
            addCriterion("f_bip_modifydate =", value, "fBipModifydate");
            return (Criteria) this;
        }

        public Criteria andFBipModifydateNotEqualTo(Date value) {
            addCriterion("f_bip_modifydate <>", value, "fBipModifydate");
            return (Criteria) this;
        }

        public Criteria andFBipModifydateGreaterThan(Date value) {
            addCriterion("f_bip_modifydate >", value, "fBipModifydate");
            return (Criteria) this;
        }

        public Criteria andFBipModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_modifydate >=", value, "fBipModifydate");
            return (Criteria) this;
        }

        public Criteria andFBipModifydateLessThan(Date value) {
            addCriterion("f_bip_modifydate <", value, "fBipModifydate");
            return (Criteria) this;
        }

        public Criteria andFBipModifydateLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_modifydate <=", value, "fBipModifydate");
            return (Criteria) this;
        }

        public Criteria andFBipModifydateIn(List<Date> values) {
            addCriterion("f_bip_modifydate in", values, "fBipModifydate");
            return (Criteria) this;
        }

        public Criteria andFBipModifydateNotIn(List<Date> values) {
            addCriterion("f_bip_modifydate not in", values, "fBipModifydate");
            return (Criteria) this;
        }

        public Criteria andFBipModifydateBetween(Date value1, Date value2) {
            addCriterion("f_bip_modifydate between", value1, value2, "fBipModifydate");
            return (Criteria) this;
        }

        public Criteria andFBipModifydateNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_modifydate not between", value1, value2, "fBipModifydate");
            return (Criteria) this;
        }

        public Criteria andFBipModifiernameIsNull() {
            addCriterion("f_bip_modifiername is null");
            return (Criteria) this;
        }

        public Criteria andFBipModifiernameIsNotNull() {
            addCriterion("f_bip_modifiername is not null");
            return (Criteria) this;
        }

        public Criteria andFBipModifiernameEqualTo(Integer value) {
            addCriterion("f_bip_modifiername =", value, "fBipModifiername");
            return (Criteria) this;
        }

        public Criteria andFBipModifiernameNotEqualTo(Integer value) {
            addCriterion("f_bip_modifiername <>", value, "fBipModifiername");
            return (Criteria) this;
        }

        public Criteria andFBipModifiernameGreaterThan(Integer value) {
            addCriterion("f_bip_modifiername >", value, "fBipModifiername");
            return (Criteria) this;
        }

        public Criteria andFBipModifiernameGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_modifiername >=", value, "fBipModifiername");
            return (Criteria) this;
        }

        public Criteria andFBipModifiernameLessThan(Integer value) {
            addCriterion("f_bip_modifiername <", value, "fBipModifiername");
            return (Criteria) this;
        }

        public Criteria andFBipModifiernameLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_modifiername <=", value, "fBipModifiername");
            return (Criteria) this;
        }

        public Criteria andFBipModifiernameIn(List<Integer> values) {
            addCriterion("f_bip_modifiername in", values, "fBipModifiername");
            return (Criteria) this;
        }

        public Criteria andFBipModifiernameNotIn(List<Integer> values) {
            addCriterion("f_bip_modifiername not in", values, "fBipModifiername");
            return (Criteria) this;
        }

        public Criteria andFBipModifiernameBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_modifiername between", value1, value2, "fBipModifiername");
            return (Criteria) this;
        }

        public Criteria andFBipModifiernameNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_modifiername not between", value1, value2, "fBipModifiername");
            return (Criteria) this;
        }

        public Criteria andFBipCheckernameIsNull() {
            addCriterion("f_bip_checkername is null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckernameIsNotNull() {
            addCriterion("f_bip_checkername is not null");
            return (Criteria) this;
        }

        public Criteria andFBipCheckernameEqualTo(Integer value) {
            addCriterion("f_bip_checkername =", value, "fBipCheckername");
            return (Criteria) this;
        }

        public Criteria andFBipCheckernameNotEqualTo(Integer value) {
            addCriterion("f_bip_checkername <>", value, "fBipCheckername");
            return (Criteria) this;
        }

        public Criteria andFBipCheckernameGreaterThan(Integer value) {
            addCriterion("f_bip_checkername >", value, "fBipCheckername");
            return (Criteria) this;
        }

        public Criteria andFBipCheckernameGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_checkername >=", value, "fBipCheckername");
            return (Criteria) this;
        }

        public Criteria andFBipCheckernameLessThan(Integer value) {
            addCriterion("f_bip_checkername <", value, "fBipCheckername");
            return (Criteria) this;
        }

        public Criteria andFBipCheckernameLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_checkername <=", value, "fBipCheckername");
            return (Criteria) this;
        }

        public Criteria andFBipCheckernameIn(List<Integer> values) {
            addCriterion("f_bip_checkername in", values, "fBipCheckername");
            return (Criteria) this;
        }

        public Criteria andFBipCheckernameNotIn(List<Integer> values) {
            addCriterion("f_bip_checkername not in", values, "fBipCheckername");
            return (Criteria) this;
        }

        public Criteria andFBipCheckernameBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_checkername between", value1, value2, "fBipCheckername");
            return (Criteria) this;
        }

        public Criteria andFBipCheckernameNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_checkername not between", value1, value2, "fBipCheckername");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidIsNull() {
            addCriterion("f_bip_sourceid is null");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidIsNotNull() {
            addCriterion("f_bip_sourceid is not null");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidEqualTo(String value) {
            addCriterion("f_bip_sourceid =", value, "fBipSourceid");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidNotEqualTo(String value) {
            addCriterion("f_bip_sourceid <>", value, "fBipSourceid");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidGreaterThan(String value) {
            addCriterion("f_bip_sourceid >", value, "fBipSourceid");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_sourceid >=", value, "fBipSourceid");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidLessThan(String value) {
            addCriterion("f_bip_sourceid <", value, "fBipSourceid");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidLessThanOrEqualTo(String value) {
            addCriterion("f_bip_sourceid <=", value, "fBipSourceid");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidLike(String value) {
            addCriterion("f_bip_sourceid like", value, "fBipSourceid");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidNotLike(String value) {
            addCriterion("f_bip_sourceid not like", value, "fBipSourceid");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidIn(List<String> values) {
            addCriterion("f_bip_sourceid in", values, "fBipSourceid");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidNotIn(List<String> values) {
            addCriterion("f_bip_sourceid not in", values, "fBipSourceid");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidBetween(String value1, String value2) {
            addCriterion("f_bip_sourceid between", value1, value2, "fBipSourceid");
            return (Criteria) this;
        }

        public Criteria andFBipSourceidNotBetween(String value1, String value2) {
            addCriterion("f_bip_sourceid not between", value1, value2, "fBipSourceid");
            return (Criteria) this;
        }

        public Criteria andFBipAwareofpersonIsNull() {
            addCriterion("f_bip_awareofperson is null");
            return (Criteria) this;
        }

        public Criteria andFBipAwareofpersonIsNotNull() {
            addCriterion("f_bip_awareofperson is not null");
            return (Criteria) this;
        }

        public Criteria andFBipAwareofpersonEqualTo(Integer value) {
            addCriterion("f_bip_awareofperson =", value, "fBipAwareofperson");
            return (Criteria) this;
        }

        public Criteria andFBipAwareofpersonNotEqualTo(Integer value) {
            addCriterion("f_bip_awareofperson <>", value, "fBipAwareofperson");
            return (Criteria) this;
        }

        public Criteria andFBipAwareofpersonGreaterThan(Integer value) {
            addCriterion("f_bip_awareofperson >", value, "fBipAwareofperson");
            return (Criteria) this;
        }

        public Criteria andFBipAwareofpersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_awareofperson >=", value, "fBipAwareofperson");
            return (Criteria) this;
        }

        public Criteria andFBipAwareofpersonLessThan(Integer value) {
            addCriterion("f_bip_awareofperson <", value, "fBipAwareofperson");
            return (Criteria) this;
        }

        public Criteria andFBipAwareofpersonLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_awareofperson <=", value, "fBipAwareofperson");
            return (Criteria) this;
        }

        public Criteria andFBipAwareofpersonIn(List<Integer> values) {
            addCriterion("f_bip_awareofperson in", values, "fBipAwareofperson");
            return (Criteria) this;
        }

        public Criteria andFBipAwareofpersonNotIn(List<Integer> values) {
            addCriterion("f_bip_awareofperson not in", values, "fBipAwareofperson");
            return (Criteria) this;
        }

        public Criteria andFBipAwareofpersonBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_awareofperson between", value1, value2, "fBipAwareofperson");
            return (Criteria) this;
        }

        public Criteria andFBipAwareofpersonNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_awareofperson not between", value1, value2, "fBipAwareofperson");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandlerIsNull() {
            addCriterion("f_bip_fieldhandler is null");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandlerIsNotNull() {
            addCriterion("f_bip_fieldhandler is not null");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandlerEqualTo(Integer value) {
            addCriterion("f_bip_fieldhandler =", value, "fBipFieldhandler");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandlerNotEqualTo(Integer value) {
            addCriterion("f_bip_fieldhandler <>", value, "fBipFieldhandler");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandlerGreaterThan(Integer value) {
            addCriterion("f_bip_fieldhandler >", value, "fBipFieldhandler");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandlerGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_fieldhandler >=", value, "fBipFieldhandler");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandlerLessThan(Integer value) {
            addCriterion("f_bip_fieldhandler <", value, "fBipFieldhandler");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandlerLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_fieldhandler <=", value, "fBipFieldhandler");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandlerIn(List<Integer> values) {
            addCriterion("f_bip_fieldhandler in", values, "fBipFieldhandler");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandlerNotIn(List<Integer> values) {
            addCriterion("f_bip_fieldhandler not in", values, "fBipFieldhandler");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandlerBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_fieldhandler between", value1, value2, "fBipFieldhandler");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandlerNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_fieldhandler not between", value1, value2, "fBipFieldhandler");
            return (Criteria) this;
        }

        public Criteria andFBipFieldconfirmerIsNull() {
            addCriterion("f_bip_fieldconfirmer is null");
            return (Criteria) this;
        }

        public Criteria andFBipFieldconfirmerIsNotNull() {
            addCriterion("f_bip_fieldconfirmer is not null");
            return (Criteria) this;
        }

        public Criteria andFBipFieldconfirmerEqualTo(Integer value) {
            addCriterion("f_bip_fieldconfirmer =", value, "fBipFieldconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipFieldconfirmerNotEqualTo(Integer value) {
            addCriterion("f_bip_fieldconfirmer <>", value, "fBipFieldconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipFieldconfirmerGreaterThan(Integer value) {
            addCriterion("f_bip_fieldconfirmer >", value, "fBipFieldconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipFieldconfirmerGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_fieldconfirmer >=", value, "fBipFieldconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipFieldconfirmerLessThan(Integer value) {
            addCriterion("f_bip_fieldconfirmer <", value, "fBipFieldconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipFieldconfirmerLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_fieldconfirmer <=", value, "fBipFieldconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipFieldconfirmerIn(List<Integer> values) {
            addCriterion("f_bip_fieldconfirmer in", values, "fBipFieldconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipFieldconfirmerNotIn(List<Integer> values) {
            addCriterion("f_bip_fieldconfirmer not in", values, "fBipFieldconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipFieldconfirmerBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_fieldconfirmer between", value1, value2, "fBipFieldconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipFieldconfirmerNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_fieldconfirmer not between", value1, value2, "fBipFieldconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandlerIsNull() {
            addCriterion("f_bip_eventhandler is null");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandlerIsNotNull() {
            addCriterion("f_bip_eventhandler is not null");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandlerEqualTo(Integer value) {
            addCriterion("f_bip_eventhandler =", value, "fBipEventhandler");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandlerNotEqualTo(Integer value) {
            addCriterion("f_bip_eventhandler <>", value, "fBipEventhandler");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandlerGreaterThan(Integer value) {
            addCriterion("f_bip_eventhandler >", value, "fBipEventhandler");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandlerGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_eventhandler >=", value, "fBipEventhandler");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandlerLessThan(Integer value) {
            addCriterion("f_bip_eventhandler <", value, "fBipEventhandler");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandlerLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_eventhandler <=", value, "fBipEventhandler");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandlerIn(List<Integer> values) {
            addCriterion("f_bip_eventhandler in", values, "fBipEventhandler");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandlerNotIn(List<Integer> values) {
            addCriterion("f_bip_eventhandler not in", values, "fBipEventhandler");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandlerBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_eventhandler between", value1, value2, "fBipEventhandler");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandlerNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_eventhandler not between", value1, value2, "fBipEventhandler");
            return (Criteria) this;
        }

        public Criteria andFBipEventconfirmerIsNull() {
            addCriterion("f_bip_eventconfirmer is null");
            return (Criteria) this;
        }

        public Criteria andFBipEventconfirmerIsNotNull() {
            addCriterion("f_bip_eventconfirmer is not null");
            return (Criteria) this;
        }

        public Criteria andFBipEventconfirmerEqualTo(Integer value) {
            addCriterion("f_bip_eventconfirmer =", value, "fBipEventconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipEventconfirmerNotEqualTo(Integer value) {
            addCriterion("f_bip_eventconfirmer <>", value, "fBipEventconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipEventconfirmerGreaterThan(Integer value) {
            addCriterion("f_bip_eventconfirmer >", value, "fBipEventconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipEventconfirmerGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_eventconfirmer >=", value, "fBipEventconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipEventconfirmerLessThan(Integer value) {
            addCriterion("f_bip_eventconfirmer <", value, "fBipEventconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipEventconfirmerLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_eventconfirmer <=", value, "fBipEventconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipEventconfirmerIn(List<Integer> values) {
            addCriterion("f_bip_eventconfirmer in", values, "fBipEventconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipEventconfirmerNotIn(List<Integer> values) {
            addCriterion("f_bip_eventconfirmer not in", values, "fBipEventconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipEventconfirmerBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_eventconfirmer between", value1, value2, "fBipEventconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipEventconfirmerNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_eventconfirmer not between", value1, value2, "fBipEventconfirmer");
            return (Criteria) this;
        }

        public Criteria andFBipAwareoftimeIsNull() {
            addCriterion("f_bip_awareoftime is null");
            return (Criteria) this;
        }

        public Criteria andFBipAwareoftimeIsNotNull() {
            addCriterion("f_bip_awareoftime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipAwareoftimeEqualTo(Date value) {
            addCriterion("f_bip_awareoftime =", value, "fBipAwareoftime");
            return (Criteria) this;
        }

        public Criteria andFBipAwareoftimeNotEqualTo(Date value) {
            addCriterion("f_bip_awareoftime <>", value, "fBipAwareoftime");
            return (Criteria) this;
        }

        public Criteria andFBipAwareoftimeGreaterThan(Date value) {
            addCriterion("f_bip_awareoftime >", value, "fBipAwareoftime");
            return (Criteria) this;
        }

        public Criteria andFBipAwareoftimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_awareoftime >=", value, "fBipAwareoftime");
            return (Criteria) this;
        }

        public Criteria andFBipAwareoftimeLessThan(Date value) {
            addCriterion("f_bip_awareoftime <", value, "fBipAwareoftime");
            return (Criteria) this;
        }

        public Criteria andFBipAwareoftimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_awareoftime <=", value, "fBipAwareoftime");
            return (Criteria) this;
        }

        public Criteria andFBipAwareoftimeIn(List<Date> values) {
            addCriterion("f_bip_awareoftime in", values, "fBipAwareoftime");
            return (Criteria) this;
        }

        public Criteria andFBipAwareoftimeNotIn(List<Date> values) {
            addCriterion("f_bip_awareoftime not in", values, "fBipAwareoftime");
            return (Criteria) this;
        }

        public Criteria andFBipAwareoftimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_awareoftime between", value1, value2, "fBipAwareoftime");
            return (Criteria) this;
        }

        public Criteria andFBipAwareoftimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_awareoftime not between", value1, value2, "fBipAwareoftime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivaltimeIsNull() {
            addCriterion("f_bip_arrivaltime is null");
            return (Criteria) this;
        }

        public Criteria andFBipArrivaltimeIsNotNull() {
            addCriterion("f_bip_arrivaltime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipArrivaltimeEqualTo(Date value) {
            addCriterion("f_bip_arrivaltime =", value, "fBipArrivaltime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivaltimeNotEqualTo(Date value) {
            addCriterion("f_bip_arrivaltime <>", value, "fBipArrivaltime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivaltimeGreaterThan(Date value) {
            addCriterion("f_bip_arrivaltime >", value, "fBipArrivaltime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivaltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_arrivaltime >=", value, "fBipArrivaltime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivaltimeLessThan(Date value) {
            addCriterion("f_bip_arrivaltime <", value, "fBipArrivaltime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivaltimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_arrivaltime <=", value, "fBipArrivaltime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivaltimeIn(List<Date> values) {
            addCriterion("f_bip_arrivaltime in", values, "fBipArrivaltime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivaltimeNotIn(List<Date> values) {
            addCriterion("f_bip_arrivaltime not in", values, "fBipArrivaltime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivaltimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_arrivaltime between", value1, value2, "fBipArrivaltime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivaltimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_arrivaltime not between", value1, value2, "fBipArrivaltime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandledtimeIsNull() {
            addCriterion("f_bip_fieldhandledtime is null");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandledtimeIsNotNull() {
            addCriterion("f_bip_fieldhandledtime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandledtimeEqualTo(Date value) {
            addCriterion("f_bip_fieldhandledtime =", value, "fBipFieldhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandledtimeNotEqualTo(Date value) {
            addCriterion("f_bip_fieldhandledtime <>", value, "fBipFieldhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandledtimeGreaterThan(Date value) {
            addCriterion("f_bip_fieldhandledtime >", value, "fBipFieldhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandledtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_fieldhandledtime >=", value, "fBipFieldhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandledtimeLessThan(Date value) {
            addCriterion("f_bip_fieldhandledtime <", value, "fBipFieldhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandledtimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_fieldhandledtime <=", value, "fBipFieldhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandledtimeIn(List<Date> values) {
            addCriterion("f_bip_fieldhandledtime in", values, "fBipFieldhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandledtimeNotIn(List<Date> values) {
            addCriterion("f_bip_fieldhandledtime not in", values, "fBipFieldhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandledtimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_fieldhandledtime between", value1, value2, "fBipFieldhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldhandledtimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_fieldhandledtime not between", value1, value2, "fBipFieldhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledtimeIsNull() {
            addCriterion("f_bip_eventhandledtime is null");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledtimeIsNotNull() {
            addCriterion("f_bip_eventhandledtime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledtimeEqualTo(Date value) {
            addCriterion("f_bip_eventhandledtime =", value, "fBipEventhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledtimeNotEqualTo(Date value) {
            addCriterion("f_bip_eventhandledtime <>", value, "fBipEventhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledtimeGreaterThan(Date value) {
            addCriterion("f_bip_eventhandledtime >", value, "fBipEventhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_eventhandledtime >=", value, "fBipEventhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledtimeLessThan(Date value) {
            addCriterion("f_bip_eventhandledtime <", value, "fBipEventhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledtimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_eventhandledtime <=", value, "fBipEventhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledtimeIn(List<Date> values) {
            addCriterion("f_bip_eventhandledtime in", values, "fBipEventhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledtimeNotIn(List<Date> values) {
            addCriterion("f_bip_eventhandledtime not in", values, "fBipEventhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledtimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_eventhandledtime between", value1, value2, "fBipEventhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipEventhandledtimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_eventhandledtime not between", value1, value2, "fBipEventhandledtime");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedIsNull() {
            addCriterion("f_bip_ischanged is null");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedIsNotNull() {
            addCriterion("f_bip_ischanged is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedEqualTo(String value) {
            addCriterion("f_bip_ischanged =", value, "fBipIschanged");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedNotEqualTo(String value) {
            addCriterion("f_bip_ischanged <>", value, "fBipIschanged");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedGreaterThan(String value) {
            addCriterion("f_bip_ischanged >", value, "fBipIschanged");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_ischanged >=", value, "fBipIschanged");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedLessThan(String value) {
            addCriterion("f_bip_ischanged <", value, "fBipIschanged");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedLessThanOrEqualTo(String value) {
            addCriterion("f_bip_ischanged <=", value, "fBipIschanged");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedLike(String value) {
            addCriterion("f_bip_ischanged like", value, "fBipIschanged");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedNotLike(String value) {
            addCriterion("f_bip_ischanged not like", value, "fBipIschanged");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedIn(List<String> values) {
            addCriterion("f_bip_ischanged in", values, "fBipIschanged");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedNotIn(List<String> values) {
            addCriterion("f_bip_ischanged not in", values, "fBipIschanged");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedBetween(String value1, String value2) {
            addCriterion("f_bip_ischanged between", value1, value2, "fBipIschanged");
            return (Criteria) this;
        }

        public Criteria andFBipIschangedNotBetween(String value1, String value2) {
            addCriterion("f_bip_ischanged not between", value1, value2, "fBipIschanged");
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

        public Criteria andFBipSoursedownIsNull() {
            addCriterion("f_bip_soursedown is null");
            return (Criteria) this;
        }

        public Criteria andFBipSoursedownIsNotNull() {
            addCriterion("f_bip_soursedown is not null");
            return (Criteria) this;
        }

        public Criteria andFBipSoursedownEqualTo(Integer value) {
            addCriterion("f_bip_soursedown =", value, "fBipSoursedown");
            return (Criteria) this;
        }

        public Criteria andFBipSoursedownNotEqualTo(Integer value) {
            addCriterion("f_bip_soursedown <>", value, "fBipSoursedown");
            return (Criteria) this;
        }

        public Criteria andFBipSoursedownGreaterThan(Integer value) {
            addCriterion("f_bip_soursedown >", value, "fBipSoursedown");
            return (Criteria) this;
        }

        public Criteria andFBipSoursedownGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_soursedown >=", value, "fBipSoursedown");
            return (Criteria) this;
        }

        public Criteria andFBipSoursedownLessThan(Integer value) {
            addCriterion("f_bip_soursedown <", value, "fBipSoursedown");
            return (Criteria) this;
        }

        public Criteria andFBipSoursedownLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_soursedown <=", value, "fBipSoursedown");
            return (Criteria) this;
        }

        public Criteria andFBipSoursedownIn(List<Integer> values) {
            addCriterion("f_bip_soursedown in", values, "fBipSoursedown");
            return (Criteria) this;
        }

        public Criteria andFBipSoursedownNotIn(List<Integer> values) {
            addCriterion("f_bip_soursedown not in", values, "fBipSoursedown");
            return (Criteria) this;
        }

        public Criteria andFBipSoursedownBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_soursedown between", value1, value2, "fBipSoursedown");
            return (Criteria) this;
        }

        public Criteria andFBipSoursedownNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_soursedown not between", value1, value2, "fBipSoursedown");
            return (Criteria) this;
        }

        public Criteria andFBipAcceptIsNull() {
            addCriterion("f_bip_accept is null");
            return (Criteria) this;
        }

        public Criteria andFBipAcceptIsNotNull() {
            addCriterion("f_bip_accept is not null");
            return (Criteria) this;
        }

        public Criteria andFBipAcceptEqualTo(Integer value) {
            addCriterion("f_bip_accept =", value, "fBipAccept");
            return (Criteria) this;
        }

        public Criteria andFBipAcceptNotEqualTo(Integer value) {
            addCriterion("f_bip_accept <>", value, "fBipAccept");
            return (Criteria) this;
        }

        public Criteria andFBipAcceptGreaterThan(Integer value) {
            addCriterion("f_bip_accept >", value, "fBipAccept");
            return (Criteria) this;
        }

        public Criteria andFBipAcceptGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_accept >=", value, "fBipAccept");
            return (Criteria) this;
        }

        public Criteria andFBipAcceptLessThan(Integer value) {
            addCriterion("f_bip_accept <", value, "fBipAccept");
            return (Criteria) this;
        }

        public Criteria andFBipAcceptLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_accept <=", value, "fBipAccept");
            return (Criteria) this;
        }

        public Criteria andFBipAcceptIn(List<Integer> values) {
            addCriterion("f_bip_accept in", values, "fBipAccept");
            return (Criteria) this;
        }

        public Criteria andFBipAcceptNotIn(List<Integer> values) {
            addCriterion("f_bip_accept not in", values, "fBipAccept");
            return (Criteria) this;
        }

        public Criteria andFBipAcceptBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_accept between", value1, value2, "fBipAccept");
            return (Criteria) this;
        }

        public Criteria andFBipAcceptNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_accept not between", value1, value2, "fBipAccept");
            return (Criteria) this;
        }

        public Criteria andFbillstatusIsNull() {
            addCriterion("fbillstatus is null");
            return (Criteria) this;
        }

        public Criteria andFbillstatusIsNotNull() {
            addCriterion("fbillstatus is not null");
            return (Criteria) this;
        }

        public Criteria andFbillstatusEqualTo(String value) {
            addCriterion("fbillstatus =", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusNotEqualTo(String value) {
            addCriterion("fbillstatus <>", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusGreaterThan(String value) {
            addCriterion("fbillstatus >", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusGreaterThanOrEqualTo(String value) {
            addCriterion("fbillstatus >=", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusLessThan(String value) {
            addCriterion("fbillstatus <", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusLessThanOrEqualTo(String value) {
            addCriterion("fbillstatus <=", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusLike(String value) {
            addCriterion("fbillstatus like", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusNotLike(String value) {
            addCriterion("fbillstatus not like", value, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusIn(List<String> values) {
            addCriterion("fbillstatus in", values, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusNotIn(List<String> values) {
            addCriterion("fbillstatus not in", values, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusBetween(String value1, String value2) {
            addCriterion("fbillstatus between", value1, value2, "fbillstatus");
            return (Criteria) this;
        }

        public Criteria andFbillstatusNotBetween(String value1, String value2) {
            addCriterion("fbillstatus not between", value1, value2, "fbillstatus");
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

        public Criteria andFBipAssistantIsNull() {
            addCriterion("f_bip_assistant is null");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantIsNotNull() {
            addCriterion("f_bip_assistant is not null");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantEqualTo(String value) {
            addCriterion("f_bip_assistant =", value, "fBipAssistant");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantNotEqualTo(String value) {
            addCriterion("f_bip_assistant <>", value, "fBipAssistant");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantGreaterThan(String value) {
            addCriterion("f_bip_assistant >", value, "fBipAssistant");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_assistant >=", value, "fBipAssistant");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantLessThan(String value) {
            addCriterion("f_bip_assistant <", value, "fBipAssistant");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantLessThanOrEqualTo(String value) {
            addCriterion("f_bip_assistant <=", value, "fBipAssistant");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantLike(String value) {
            addCriterion("f_bip_assistant like", value, "fBipAssistant");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantNotLike(String value) {
            addCriterion("f_bip_assistant not like", value, "fBipAssistant");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantIn(List<String> values) {
            addCriterion("f_bip_assistant in", values, "fBipAssistant");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantNotIn(List<String> values) {
            addCriterion("f_bip_assistant not in", values, "fBipAssistant");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantBetween(String value1, String value2) {
            addCriterion("f_bip_assistant between", value1, value2, "fBipAssistant");
            return (Criteria) this;
        }

        public Criteria andFBipAssistantNotBetween(String value1, String value2) {
            addCriterion("f_bip_assistant not between", value1, value2, "fBipAssistant");
            return (Criteria) this;
        }

        public Criteria andFBipInteger1IsNull() {
            addCriterion("f_bip_integer1 is null");
            return (Criteria) this;
        }

        public Criteria andFBipInteger1IsNotNull() {
            addCriterion("f_bip_integer1 is not null");
            return (Criteria) this;
        }

        public Criteria andFBipInteger1EqualTo(Integer value) {
            addCriterion("f_bip_integer1 =", value, "fBipInteger1");
            return (Criteria) this;
        }

        public Criteria andFBipInteger1NotEqualTo(Integer value) {
            addCriterion("f_bip_integer1 <>", value, "fBipInteger1");
            return (Criteria) this;
        }

        public Criteria andFBipInteger1GreaterThan(Integer value) {
            addCriterion("f_bip_integer1 >", value, "fBipInteger1");
            return (Criteria) this;
        }

        public Criteria andFBipInteger1GreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_integer1 >=", value, "fBipInteger1");
            return (Criteria) this;
        }

        public Criteria andFBipInteger1LessThan(Integer value) {
            addCriterion("f_bip_integer1 <", value, "fBipInteger1");
            return (Criteria) this;
        }

        public Criteria andFBipInteger1LessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_integer1 <=", value, "fBipInteger1");
            return (Criteria) this;
        }

        public Criteria andFBipInteger1In(List<Integer> values) {
            addCriterion("f_bip_integer1 in", values, "fBipInteger1");
            return (Criteria) this;
        }

        public Criteria andFBipInteger1NotIn(List<Integer> values) {
            addCriterion("f_bip_integer1 not in", values, "fBipInteger1");
            return (Criteria) this;
        }

        public Criteria andFBipInteger1Between(Integer value1, Integer value2) {
            addCriterion("f_bip_integer1 between", value1, value2, "fBipInteger1");
            return (Criteria) this;
        }

        public Criteria andFBipInteger1NotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_integer1 not between", value1, value2, "fBipInteger1");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechekerIsNull() {
            addCriterion("f_bip_arrivecheker is null");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechekerIsNotNull() {
            addCriterion("f_bip_arrivecheker is not null");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechekerEqualTo(Integer value) {
            addCriterion("f_bip_arrivecheker =", value, "fBipArrivecheker");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechekerNotEqualTo(Integer value) {
            addCriterion("f_bip_arrivecheker <>", value, "fBipArrivecheker");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechekerGreaterThan(Integer value) {
            addCriterion("f_bip_arrivecheker >", value, "fBipArrivecheker");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechekerGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_arrivecheker >=", value, "fBipArrivecheker");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechekerLessThan(Integer value) {
            addCriterion("f_bip_arrivecheker <", value, "fBipArrivecheker");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechekerLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_arrivecheker <=", value, "fBipArrivecheker");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechekerIn(List<Integer> values) {
            addCriterion("f_bip_arrivecheker in", values, "fBipArrivecheker");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechekerNotIn(List<Integer> values) {
            addCriterion("f_bip_arrivecheker not in", values, "fBipArrivecheker");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechekerBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_arrivecheker between", value1, value2, "fBipArrivecheker");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechekerNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_arrivecheker not between", value1, value2, "fBipArrivecheker");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechecktimeIsNull() {
            addCriterion("f_bip_arrivechecktime is null");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechecktimeIsNotNull() {
            addCriterion("f_bip_arrivechecktime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechecktimeEqualTo(Date value) {
            addCriterion("f_bip_arrivechecktime =", value, "fBipArrivechecktime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechecktimeNotEqualTo(Date value) {
            addCriterion("f_bip_arrivechecktime <>", value, "fBipArrivechecktime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechecktimeGreaterThan(Date value) {
            addCriterion("f_bip_arrivechecktime >", value, "fBipArrivechecktime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_arrivechecktime >=", value, "fBipArrivechecktime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechecktimeLessThan(Date value) {
            addCriterion("f_bip_arrivechecktime <", value, "fBipArrivechecktime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechecktimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_arrivechecktime <=", value, "fBipArrivechecktime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechecktimeIn(List<Date> values) {
            addCriterion("f_bip_arrivechecktime in", values, "fBipArrivechecktime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechecktimeNotIn(List<Date> values) {
            addCriterion("f_bip_arrivechecktime not in", values, "fBipArrivechecktime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechecktimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_arrivechecktime between", value1, value2, "fBipArrivechecktime");
            return (Criteria) this;
        }

        public Criteria andFBipArrivechecktimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_arrivechecktime not between", value1, value2, "fBipArrivechecktime");
            return (Criteria) this;
        }

        public Criteria andFBipDealoverpersonIsNull() {
            addCriterion("f_bip_dealoverperson is null");
            return (Criteria) this;
        }

        public Criteria andFBipDealoverpersonIsNotNull() {
            addCriterion("f_bip_dealoverperson is not null");
            return (Criteria) this;
        }

        public Criteria andFBipDealoverpersonEqualTo(Integer value) {
            addCriterion("f_bip_dealoverperson =", value, "fBipDealoverperson");
            return (Criteria) this;
        }

        public Criteria andFBipDealoverpersonNotEqualTo(Integer value) {
            addCriterion("f_bip_dealoverperson <>", value, "fBipDealoverperson");
            return (Criteria) this;
        }

        public Criteria andFBipDealoverpersonGreaterThan(Integer value) {
            addCriterion("f_bip_dealoverperson >", value, "fBipDealoverperson");
            return (Criteria) this;
        }

        public Criteria andFBipDealoverpersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_dealoverperson >=", value, "fBipDealoverperson");
            return (Criteria) this;
        }

        public Criteria andFBipDealoverpersonLessThan(Integer value) {
            addCriterion("f_bip_dealoverperson <", value, "fBipDealoverperson");
            return (Criteria) this;
        }

        public Criteria andFBipDealoverpersonLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_dealoverperson <=", value, "fBipDealoverperson");
            return (Criteria) this;
        }

        public Criteria andFBipDealoverpersonIn(List<Integer> values) {
            addCriterion("f_bip_dealoverperson in", values, "fBipDealoverperson");
            return (Criteria) this;
        }

        public Criteria andFBipDealoverpersonNotIn(List<Integer> values) {
            addCriterion("f_bip_dealoverperson not in", values, "fBipDealoverperson");
            return (Criteria) this;
        }

        public Criteria andFBipDealoverpersonBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_dealoverperson between", value1, value2, "fBipDealoverperson");
            return (Criteria) this;
        }

        public Criteria andFBipDealoverpersonNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_dealoverperson not between", value1, value2, "fBipDealoverperson");
            return (Criteria) this;
        }

        public Criteria andFBipOverchecktimeIsNull() {
            addCriterion("f_bip_overchecktime is null");
            return (Criteria) this;
        }

        public Criteria andFBipOverchecktimeIsNotNull() {
            addCriterion("f_bip_overchecktime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipOverchecktimeEqualTo(Date value) {
            addCriterion("f_bip_overchecktime =", value, "fBipOverchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipOverchecktimeNotEqualTo(Date value) {
            addCriterion("f_bip_overchecktime <>", value, "fBipOverchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipOverchecktimeGreaterThan(Date value) {
            addCriterion("f_bip_overchecktime >", value, "fBipOverchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipOverchecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_overchecktime >=", value, "fBipOverchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipOverchecktimeLessThan(Date value) {
            addCriterion("f_bip_overchecktime <", value, "fBipOverchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipOverchecktimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_overchecktime <=", value, "fBipOverchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipOverchecktimeIn(List<Date> values) {
            addCriterion("f_bip_overchecktime in", values, "fBipOverchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipOverchecktimeNotIn(List<Date> values) {
            addCriterion("f_bip_overchecktime not in", values, "fBipOverchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipOverchecktimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_overchecktime between", value1, value2, "fBipOverchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipOverchecktimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_overchecktime not between", value1, value2, "fBipOverchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldchecktimeIsNull() {
            addCriterion("f_bip_fieldchecktime is null");
            return (Criteria) this;
        }

        public Criteria andFBipFieldchecktimeIsNotNull() {
            addCriterion("f_bip_fieldchecktime is not null");
            return (Criteria) this;
        }

        public Criteria andFBipFieldchecktimeEqualTo(Date value) {
            addCriterion("f_bip_fieldchecktime =", value, "fBipFieldchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldchecktimeNotEqualTo(Date value) {
            addCriterion("f_bip_fieldchecktime <>", value, "fBipFieldchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldchecktimeGreaterThan(Date value) {
            addCriterion("f_bip_fieldchecktime >", value, "fBipFieldchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldchecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_bip_fieldchecktime >=", value, "fBipFieldchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldchecktimeLessThan(Date value) {
            addCriterion("f_bip_fieldchecktime <", value, "fBipFieldchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldchecktimeLessThanOrEqualTo(Date value) {
            addCriterion("f_bip_fieldchecktime <=", value, "fBipFieldchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldchecktimeIn(List<Date> values) {
            addCriterion("f_bip_fieldchecktime in", values, "fBipFieldchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldchecktimeNotIn(List<Date> values) {
            addCriterion("f_bip_fieldchecktime not in", values, "fBipFieldchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldchecktimeBetween(Date value1, Date value2) {
            addCriterion("f_bip_fieldchecktime between", value1, value2, "fBipFieldchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipFieldchecktimeNotBetween(Date value1, Date value2) {
            addCriterion("f_bip_fieldchecktime not between", value1, value2, "fBipFieldchecktime");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionIsNull() {
            addCriterion("f_bip_resultdiscription is null");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionIsNotNull() {
            addCriterion("f_bip_resultdiscription is not null");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionEqualTo(String value) {
            addCriterion("f_bip_resultdiscription =", value, "fBipResultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionNotEqualTo(String value) {
            addCriterion("f_bip_resultdiscription <>", value, "fBipResultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionGreaterThan(String value) {
            addCriterion("f_bip_resultdiscription >", value, "fBipResultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_resultdiscription >=", value, "fBipResultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionLessThan(String value) {
            addCriterion("f_bip_resultdiscription <", value, "fBipResultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionLessThanOrEqualTo(String value) {
            addCriterion("f_bip_resultdiscription <=", value, "fBipResultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionLike(String value) {
            addCriterion("f_bip_resultdiscription like", value, "fBipResultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionNotLike(String value) {
            addCriterion("f_bip_resultdiscription not like", value, "fBipResultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionIn(List<String> values) {
            addCriterion("f_bip_resultdiscription in", values, "fBipResultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionNotIn(List<String> values) {
            addCriterion("f_bip_resultdiscription not in", values, "fBipResultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionBetween(String value1, String value2) {
            addCriterion("f_bip_resultdiscription between", value1, value2, "fBipResultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipResultdiscriptionNotBetween(String value1, String value2) {
            addCriterion("f_bip_resultdiscription not between", value1, value2, "fBipResultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionIsNull() {
            addCriterion("f_bip_filedresultdiscription is null");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionIsNotNull() {
            addCriterion("f_bip_filedresultdiscription is not null");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionEqualTo(String value) {
            addCriterion("f_bip_filedresultdiscription =", value, "fBipFiledresultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionNotEqualTo(String value) {
            addCriterion("f_bip_filedresultdiscription <>", value, "fBipFiledresultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionGreaterThan(String value) {
            addCriterion("f_bip_filedresultdiscription >", value, "fBipFiledresultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_filedresultdiscription >=", value, "fBipFiledresultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionLessThan(String value) {
            addCriterion("f_bip_filedresultdiscription <", value, "fBipFiledresultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionLessThanOrEqualTo(String value) {
            addCriterion("f_bip_filedresultdiscription <=", value, "fBipFiledresultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionLike(String value) {
            addCriterion("f_bip_filedresultdiscription like", value, "fBipFiledresultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionNotLike(String value) {
            addCriterion("f_bip_filedresultdiscription not like", value, "fBipFiledresultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionIn(List<String> values) {
            addCriterion("f_bip_filedresultdiscription in", values, "fBipFiledresultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionNotIn(List<String> values) {
            addCriterion("f_bip_filedresultdiscription not in", values, "fBipFiledresultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionBetween(String value1, String value2) {
            addCriterion("f_bip_filedresultdiscription between", value1, value2, "fBipFiledresultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipFiledresultdiscriptionNotBetween(String value1, String value2) {
            addCriterion("f_bip_filedresultdiscription not between", value1, value2, "fBipFiledresultdiscription");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterIsNull() {
            addCriterion("f_bip_isregister is null");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterIsNotNull() {
            addCriterion("f_bip_isregister is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterEqualTo(String value) {
            addCriterion("f_bip_isregister =", value, "fBipIsregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterNotEqualTo(String value) {
            addCriterion("f_bip_isregister <>", value, "fBipIsregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterGreaterThan(String value) {
            addCriterion("f_bip_isregister >", value, "fBipIsregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_isregister >=", value, "fBipIsregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterLessThan(String value) {
            addCriterion("f_bip_isregister <", value, "fBipIsregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterLessThanOrEqualTo(String value) {
            addCriterion("f_bip_isregister <=", value, "fBipIsregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterLike(String value) {
            addCriterion("f_bip_isregister like", value, "fBipIsregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterNotLike(String value) {
            addCriterion("f_bip_isregister not like", value, "fBipIsregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterIn(List<String> values) {
            addCriterion("f_bip_isregister in", values, "fBipIsregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterNotIn(List<String> values) {
            addCriterion("f_bip_isregister not in", values, "fBipIsregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterBetween(String value1, String value2) {
            addCriterion("f_bip_isregister between", value1, value2, "fBipIsregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsregisterNotBetween(String value1, String value2) {
            addCriterion("f_bip_isregister not between", value1, value2, "fBipIsregister");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumIsNull() {
            addCriterion("f_bip_upfieldnum is null");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumIsNotNull() {
            addCriterion("f_bip_upfieldnum is not null");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumEqualTo(String value) {
            addCriterion("f_bip_upfieldnum =", value, "fBipUpfieldnum");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumNotEqualTo(String value) {
            addCriterion("f_bip_upfieldnum <>", value, "fBipUpfieldnum");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumGreaterThan(String value) {
            addCriterion("f_bip_upfieldnum >", value, "fBipUpfieldnum");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_upfieldnum >=", value, "fBipUpfieldnum");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumLessThan(String value) {
            addCriterion("f_bip_upfieldnum <", value, "fBipUpfieldnum");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumLessThanOrEqualTo(String value) {
            addCriterion("f_bip_upfieldnum <=", value, "fBipUpfieldnum");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumLike(String value) {
            addCriterion("f_bip_upfieldnum like", value, "fBipUpfieldnum");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumNotLike(String value) {
            addCriterion("f_bip_upfieldnum not like", value, "fBipUpfieldnum");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumIn(List<String> values) {
            addCriterion("f_bip_upfieldnum in", values, "fBipUpfieldnum");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumNotIn(List<String> values) {
            addCriterion("f_bip_upfieldnum not in", values, "fBipUpfieldnum");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumBetween(String value1, String value2) {
            addCriterion("f_bip_upfieldnum between", value1, value2, "fBipUpfieldnum");
            return (Criteria) this;
        }

        public Criteria andFBipUpfieldnumNotBetween(String value1, String value2) {
            addCriterion("f_bip_upfieldnum not between", value1, value2, "fBipUpfieldnum");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterIsNull() {
            addCriterion("f_bip_isoverregister is null");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterIsNotNull() {
            addCriterion("f_bip_isoverregister is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterEqualTo(String value) {
            addCriterion("f_bip_isoverregister =", value, "fBipIsoverregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterNotEqualTo(String value) {
            addCriterion("f_bip_isoverregister <>", value, "fBipIsoverregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterGreaterThan(String value) {
            addCriterion("f_bip_isoverregister >", value, "fBipIsoverregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_isoverregister >=", value, "fBipIsoverregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterLessThan(String value) {
            addCriterion("f_bip_isoverregister <", value, "fBipIsoverregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterLessThanOrEqualTo(String value) {
            addCriterion("f_bip_isoverregister <=", value, "fBipIsoverregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterLike(String value) {
            addCriterion("f_bip_isoverregister like", value, "fBipIsoverregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterNotLike(String value) {
            addCriterion("f_bip_isoverregister not like", value, "fBipIsoverregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterIn(List<String> values) {
            addCriterion("f_bip_isoverregister in", values, "fBipIsoverregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterNotIn(List<String> values) {
            addCriterion("f_bip_isoverregister not in", values, "fBipIsoverregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterBetween(String value1, String value2) {
            addCriterion("f_bip_isoverregister between", value1, value2, "fBipIsoverregister");
            return (Criteria) this;
        }

        public Criteria andFBipIsoverregisterNotBetween(String value1, String value2) {
            addCriterion("f_bip_isoverregister not between", value1, value2, "fBipIsoverregister");
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

        public Criteria andFBipIsfirstsendmessageIsNull() {
            addCriterion("f_bip_isfirstsendmessage is null");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageIsNotNull() {
            addCriterion("f_bip_isfirstsendmessage is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageEqualTo(String value) {
            addCriterion("f_bip_isfirstsendmessage =", value, "fBipIsfirstsendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageNotEqualTo(String value) {
            addCriterion("f_bip_isfirstsendmessage <>", value, "fBipIsfirstsendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageGreaterThan(String value) {
            addCriterion("f_bip_isfirstsendmessage >", value, "fBipIsfirstsendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_isfirstsendmessage >=", value, "fBipIsfirstsendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageLessThan(String value) {
            addCriterion("f_bip_isfirstsendmessage <", value, "fBipIsfirstsendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_isfirstsendmessage <=", value, "fBipIsfirstsendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageLike(String value) {
            addCriterion("f_bip_isfirstsendmessage like", value, "fBipIsfirstsendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageNotLike(String value) {
            addCriterion("f_bip_isfirstsendmessage not like", value, "fBipIsfirstsendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageIn(List<String> values) {
            addCriterion("f_bip_isfirstsendmessage in", values, "fBipIsfirstsendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageNotIn(List<String> values) {
            addCriterion("f_bip_isfirstsendmessage not in", values, "fBipIsfirstsendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageBetween(String value1, String value2) {
            addCriterion("f_bip_isfirstsendmessage between", value1, value2, "fBipIsfirstsendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIsfirstsendmessageNotBetween(String value1, String value2) {
            addCriterion("f_bip_isfirstsendmessage not between", value1, value2, "fBipIsfirstsendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageIsNull() {
            addCriterion("f_bip_ischangesendmessage is null");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageIsNotNull() {
            addCriterion("f_bip_ischangesendmessage is not null");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageEqualTo(String value) {
            addCriterion("f_bip_ischangesendmessage =", value, "fBipIschangesendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageNotEqualTo(String value) {
            addCriterion("f_bip_ischangesendmessage <>", value, "fBipIschangesendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageGreaterThan(String value) {
            addCriterion("f_bip_ischangesendmessage >", value, "fBipIschangesendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageGreaterThanOrEqualTo(String value) {
            addCriterion("f_bip_ischangesendmessage >=", value, "fBipIschangesendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageLessThan(String value) {
            addCriterion("f_bip_ischangesendmessage <", value, "fBipIschangesendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageLessThanOrEqualTo(String value) {
            addCriterion("f_bip_ischangesendmessage <=", value, "fBipIschangesendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageLike(String value) {
            addCriterion("f_bip_ischangesendmessage like", value, "fBipIschangesendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageNotLike(String value) {
            addCriterion("f_bip_ischangesendmessage not like", value, "fBipIschangesendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageIn(List<String> values) {
            addCriterion("f_bip_ischangesendmessage in", values, "fBipIschangesendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageNotIn(List<String> values) {
            addCriterion("f_bip_ischangesendmessage not in", values, "fBipIschangesendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageBetween(String value1, String value2) {
            addCriterion("f_bip_ischangesendmessage between", value1, value2, "fBipIschangesendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipIschangesendmessageNotBetween(String value1, String value2) {
            addCriterion("f_bip_ischangesendmessage not between", value1, value2, "fBipIschangesendmessage");
            return (Criteria) this;
        }

        public Criteria andFBipSynchrointegerIsNull() {
            addCriterion("f_bip_synchrointeger is null");
            return (Criteria) this;
        }

        public Criteria andFBipSynchrointegerIsNotNull() {
            addCriterion("f_bip_synchrointeger is not null");
            return (Criteria) this;
        }

        public Criteria andFBipSynchrointegerEqualTo(Integer value) {
            addCriterion("f_bip_synchrointeger =", value, "fBipSynchrointeger");
            return (Criteria) this;
        }

        public Criteria andFBipSynchrointegerNotEqualTo(Integer value) {
            addCriterion("f_bip_synchrointeger <>", value, "fBipSynchrointeger");
            return (Criteria) this;
        }

        public Criteria andFBipSynchrointegerGreaterThan(Integer value) {
            addCriterion("f_bip_synchrointeger >", value, "fBipSynchrointeger");
            return (Criteria) this;
        }

        public Criteria andFBipSynchrointegerGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_bip_synchrointeger >=", value, "fBipSynchrointeger");
            return (Criteria) this;
        }

        public Criteria andFBipSynchrointegerLessThan(Integer value) {
            addCriterion("f_bip_synchrointeger <", value, "fBipSynchrointeger");
            return (Criteria) this;
        }

        public Criteria andFBipSynchrointegerLessThanOrEqualTo(Integer value) {
            addCriterion("f_bip_synchrointeger <=", value, "fBipSynchrointeger");
            return (Criteria) this;
        }

        public Criteria andFBipSynchrointegerIn(List<Integer> values) {
            addCriterion("f_bip_synchrointeger in", values, "fBipSynchrointeger");
            return (Criteria) this;
        }

        public Criteria andFBipSynchrointegerNotIn(List<Integer> values) {
            addCriterion("f_bip_synchrointeger not in", values, "fBipSynchrointeger");
            return (Criteria) this;
        }

        public Criteria andFBipSynchrointegerBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_synchrointeger between", value1, value2, "fBipSynchrointeger");
            return (Criteria) this;
        }

        public Criteria andFBipSynchrointegerNotBetween(Integer value1, Integer value2) {
            addCriterion("f_bip_synchrointeger not between", value1, value2, "fBipSynchrointeger");
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