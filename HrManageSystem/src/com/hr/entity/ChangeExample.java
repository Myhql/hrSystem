package com.hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChangeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andChangeidIsNull() {
            addCriterion("CHANGEID is null");
            return (Criteria) this;
        }

        public Criteria andChangeidIsNotNull() {
            addCriterion("CHANGEID is not null");
            return (Criteria) this;
        }

        public Criteria andChangeidEqualTo(Integer value) {
            addCriterion("CHANGEID =", value, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidNotEqualTo(Integer value) {
            addCriterion("CHANGEID <>", value, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidGreaterThan(Integer value) {
            addCriterion("CHANGEID >", value, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANGEID >=", value, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidLessThan(Integer value) {
            addCriterion("CHANGEID <", value, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidLessThanOrEqualTo(Integer value) {
            addCriterion("CHANGEID <=", value, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidIn(List<Integer> values) {
            addCriterion("CHANGEID in", values, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidNotIn(List<Integer> values) {
            addCriterion("CHANGEID not in", values, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidBetween(Integer value1, Integer value2) {
            addCriterion("CHANGEID between", value1, value2, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANGEID not between", value1, value2, "changeid");
            return (Criteria) this;
        }

        public Criteria andOlddeptIsNull() {
            addCriterion("OLDDEPT is null");
            return (Criteria) this;
        }

        public Criteria andOlddeptIsNotNull() {
            addCriterion("OLDDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andOlddeptEqualTo(String value) {
            addCriterion("OLDDEPT =", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotEqualTo(String value) {
            addCriterion("OLDDEPT <>", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptGreaterThan(String value) {
            addCriterion("OLDDEPT >", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptGreaterThanOrEqualTo(String value) {
            addCriterion("OLDDEPT >=", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptLessThan(String value) {
            addCriterion("OLDDEPT <", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptLessThanOrEqualTo(String value) {
            addCriterion("OLDDEPT <=", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptLike(String value) {
            addCriterion("OLDDEPT like", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotLike(String value) {
            addCriterion("OLDDEPT not like", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptIn(List<String> values) {
            addCriterion("OLDDEPT in", values, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotIn(List<String> values) {
            addCriterion("OLDDEPT not in", values, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptBetween(String value1, String value2) {
            addCriterion("OLDDEPT between", value1, value2, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotBetween(String value1, String value2) {
            addCriterion("OLDDEPT not between", value1, value2, "olddept");
            return (Criteria) this;
        }

        public Criteria andNewdeptIsNull() {
            addCriterion("NEWDEPT is null");
            return (Criteria) this;
        }

        public Criteria andNewdeptIsNotNull() {
            addCriterion("NEWDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andNewdeptEqualTo(String value) {
            addCriterion("NEWDEPT =", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptNotEqualTo(String value) {
            addCriterion("NEWDEPT <>", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptGreaterThan(String value) {
            addCriterion("NEWDEPT >", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptGreaterThanOrEqualTo(String value) {
            addCriterion("NEWDEPT >=", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptLessThan(String value) {
            addCriterion("NEWDEPT <", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptLessThanOrEqualTo(String value) {
            addCriterion("NEWDEPT <=", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptLike(String value) {
            addCriterion("NEWDEPT like", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptNotLike(String value) {
            addCriterion("NEWDEPT not like", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptIn(List<String> values) {
            addCriterion("NEWDEPT in", values, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptNotIn(List<String> values) {
            addCriterion("NEWDEPT not in", values, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptBetween(String value1, String value2) {
            addCriterion("NEWDEPT between", value1, value2, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptNotBetween(String value1, String value2) {
            addCriterion("NEWDEPT not between", value1, value2, "newdept");
            return (Criteria) this;
        }

        public Criteria andDepttypeIsNull() {
            addCriterion("DEPTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDepttypeIsNotNull() {
            addCriterion("DEPTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDepttypeEqualTo(String value) {
            addCriterion("DEPTTYPE =", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotEqualTo(String value) {
            addCriterion("DEPTTYPE <>", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeGreaterThan(String value) {
            addCriterion("DEPTTYPE >", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTTYPE >=", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLessThan(String value) {
            addCriterion("DEPTTYPE <", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLessThanOrEqualTo(String value) {
            addCriterion("DEPTTYPE <=", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeLike(String value) {
            addCriterion("DEPTTYPE like", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotLike(String value) {
            addCriterion("DEPTTYPE not like", value, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeIn(List<String> values) {
            addCriterion("DEPTTYPE in", values, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotIn(List<String> values) {
            addCriterion("DEPTTYPE not in", values, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeBetween(String value1, String value2) {
            addCriterion("DEPTTYPE between", value1, value2, "depttype");
            return (Criteria) this;
        }

        public Criteria andDepttypeNotBetween(String value1, String value2) {
            addCriterion("DEPTTYPE not between", value1, value2, "depttype");
            return (Criteria) this;
        }

        public Criteria andDeptreasonIsNull() {
            addCriterion("DEPTREASON is null");
            return (Criteria) this;
        }

        public Criteria andDeptreasonIsNotNull() {
            addCriterion("DEPTREASON is not null");
            return (Criteria) this;
        }

        public Criteria andDeptreasonEqualTo(String value) {
            addCriterion("DEPTREASON =", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonNotEqualTo(String value) {
            addCriterion("DEPTREASON <>", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonGreaterThan(String value) {
            addCriterion("DEPTREASON >", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTREASON >=", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonLessThan(String value) {
            addCriterion("DEPTREASON <", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonLessThanOrEqualTo(String value) {
            addCriterion("DEPTREASON <=", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonLike(String value) {
            addCriterion("DEPTREASON like", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonNotLike(String value) {
            addCriterion("DEPTREASON not like", value, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonIn(List<String> values) {
            addCriterion("DEPTREASON in", values, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonNotIn(List<String> values) {
            addCriterion("DEPTREASON not in", values, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonBetween(String value1, String value2) {
            addCriterion("DEPTREASON between", value1, value2, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDeptreasonNotBetween(String value1, String value2) {
            addCriterion("DEPTREASON not between", value1, value2, "deptreason");
            return (Criteria) this;
        }

        public Criteria andDepttimeIsNull() {
            addCriterion("DEPTTIME is null");
            return (Criteria) this;
        }

        public Criteria andDepttimeIsNotNull() {
            addCriterion("DEPTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDepttimeEqualTo(Date value) {
            addCriterionForJDBCDate("DEPTTIME =", value, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEPTTIME <>", value, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DEPTTIME >", value, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEPTTIME >=", value, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeLessThan(Date value) {
            addCriterionForJDBCDate("DEPTTIME <", value, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEPTTIME <=", value, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeIn(List<Date> values) {
            addCriterionForJDBCDate("DEPTTIME in", values, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEPTTIME not in", values, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEPTTIME between", value1, value2, "depttime");
            return (Criteria) this;
        }

        public Criteria andDepttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEPTTIME not between", value1, value2, "depttime");
            return (Criteria) this;
        }

        public Criteria andOldjobIsNull() {
            addCriterion("OLDJOB is null");
            return (Criteria) this;
        }

        public Criteria andOldjobIsNotNull() {
            addCriterion("OLDJOB is not null");
            return (Criteria) this;
        }

        public Criteria andOldjobEqualTo(String value) {
            addCriterion("OLDJOB =", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobNotEqualTo(String value) {
            addCriterion("OLDJOB <>", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobGreaterThan(String value) {
            addCriterion("OLDJOB >", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobGreaterThanOrEqualTo(String value) {
            addCriterion("OLDJOB >=", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobLessThan(String value) {
            addCriterion("OLDJOB <", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobLessThanOrEqualTo(String value) {
            addCriterion("OLDJOB <=", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobLike(String value) {
            addCriterion("OLDJOB like", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobNotLike(String value) {
            addCriterion("OLDJOB not like", value, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobIn(List<String> values) {
            addCriterion("OLDJOB in", values, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobNotIn(List<String> values) {
            addCriterion("OLDJOB not in", values, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobBetween(String value1, String value2) {
            addCriterion("OLDJOB between", value1, value2, "oldjob");
            return (Criteria) this;
        }

        public Criteria andOldjobNotBetween(String value1, String value2) {
            addCriterion("OLDJOB not between", value1, value2, "oldjob");
            return (Criteria) this;
        }

        public Criteria andNewjobIsNull() {
            addCriterion("NEWJOB is null");
            return (Criteria) this;
        }

        public Criteria andNewjobIsNotNull() {
            addCriterion("NEWJOB is not null");
            return (Criteria) this;
        }

        public Criteria andNewjobEqualTo(String value) {
            addCriterion("NEWJOB =", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobNotEqualTo(String value) {
            addCriterion("NEWJOB <>", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobGreaterThan(String value) {
            addCriterion("NEWJOB >", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobGreaterThanOrEqualTo(String value) {
            addCriterion("NEWJOB >=", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobLessThan(String value) {
            addCriterion("NEWJOB <", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobLessThanOrEqualTo(String value) {
            addCriterion("NEWJOB <=", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobLike(String value) {
            addCriterion("NEWJOB like", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobNotLike(String value) {
            addCriterion("NEWJOB not like", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobIn(List<String> values) {
            addCriterion("NEWJOB in", values, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobNotIn(List<String> values) {
            addCriterion("NEWJOB not in", values, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobBetween(String value1, String value2) {
            addCriterion("NEWJOB between", value1, value2, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobNotBetween(String value1, String value2) {
            addCriterion("NEWJOB not between", value1, value2, "newjob");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNull() {
            addCriterion("JOBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNotNull() {
            addCriterion("JOBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andJobtypeEqualTo(String value) {
            addCriterion("JOBTYPE =", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotEqualTo(String value) {
            addCriterion("JOBTYPE <>", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThan(String value) {
            addCriterion("JOBTYPE >", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThanOrEqualTo(String value) {
            addCriterion("JOBTYPE >=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThan(String value) {
            addCriterion("JOBTYPE <", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThanOrEqualTo(String value) {
            addCriterion("JOBTYPE <=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLike(String value) {
            addCriterion("JOBTYPE like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotLike(String value) {
            addCriterion("JOBTYPE not like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeIn(List<String> values) {
            addCriterion("JOBTYPE in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotIn(List<String> values) {
            addCriterion("JOBTYPE not in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeBetween(String value1, String value2) {
            addCriterion("JOBTYPE between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotBetween(String value1, String value2) {
            addCriterion("JOBTYPE not between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobreasonIsNull() {
            addCriterion("JOBREASON is null");
            return (Criteria) this;
        }

        public Criteria andJobreasonIsNotNull() {
            addCriterion("JOBREASON is not null");
            return (Criteria) this;
        }

        public Criteria andJobreasonEqualTo(String value) {
            addCriterion("JOBREASON =", value, "jobreason");
            return (Criteria) this;
        }

        public Criteria andJobreasonNotEqualTo(String value) {
            addCriterion("JOBREASON <>", value, "jobreason");
            return (Criteria) this;
        }

        public Criteria andJobreasonGreaterThan(String value) {
            addCriterion("JOBREASON >", value, "jobreason");
            return (Criteria) this;
        }

        public Criteria andJobreasonGreaterThanOrEqualTo(String value) {
            addCriterion("JOBREASON >=", value, "jobreason");
            return (Criteria) this;
        }

        public Criteria andJobreasonLessThan(String value) {
            addCriterion("JOBREASON <", value, "jobreason");
            return (Criteria) this;
        }

        public Criteria andJobreasonLessThanOrEqualTo(String value) {
            addCriterion("JOBREASON <=", value, "jobreason");
            return (Criteria) this;
        }

        public Criteria andJobreasonLike(String value) {
            addCriterion("JOBREASON like", value, "jobreason");
            return (Criteria) this;
        }

        public Criteria andJobreasonNotLike(String value) {
            addCriterion("JOBREASON not like", value, "jobreason");
            return (Criteria) this;
        }

        public Criteria andJobreasonIn(List<String> values) {
            addCriterion("JOBREASON in", values, "jobreason");
            return (Criteria) this;
        }

        public Criteria andJobreasonNotIn(List<String> values) {
            addCriterion("JOBREASON not in", values, "jobreason");
            return (Criteria) this;
        }

        public Criteria andJobreasonBetween(String value1, String value2) {
            addCriterion("JOBREASON between", value1, value2, "jobreason");
            return (Criteria) this;
        }

        public Criteria andJobreasonNotBetween(String value1, String value2) {
            addCriterion("JOBREASON not between", value1, value2, "jobreason");
            return (Criteria) this;
        }

        public Criteria andJobtimeIsNull() {
            addCriterion("JOBTIME is null");
            return (Criteria) this;
        }

        public Criteria andJobtimeIsNotNull() {
            addCriterion("JOBTIME is not null");
            return (Criteria) this;
        }

        public Criteria andJobtimeEqualTo(Date value) {
            addCriterionForJDBCDate("JOBTIME =", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("JOBTIME <>", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("JOBTIME >", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JOBTIME >=", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeLessThan(Date value) {
            addCriterionForJDBCDate("JOBTIME <", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JOBTIME <=", value, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeIn(List<Date> values) {
            addCriterionForJDBCDate("JOBTIME in", values, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("JOBTIME not in", values, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JOBTIME between", value1, value2, "jobtime");
            return (Criteria) this;
        }

        public Criteria andJobtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JOBTIME not between", value1, value2, "jobtime");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("EMPID is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(Integer value) {
            addCriterion("EMPID =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(Integer value) {
            addCriterion("EMPID <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(Integer value) {
            addCriterion("EMPID >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMPID >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(Integer value) {
            addCriterion("EMPID <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("EMPID <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<Integer> values) {
            addCriterion("EMPID in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<Integer> values) {
            addCriterion("EMPID not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(Integer value1, Integer value2) {
            addCriterion("EMPID between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("EMPID not between", value1, value2, "empid");
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