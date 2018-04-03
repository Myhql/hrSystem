package com.hr.entity;

import java.util.ArrayList;
import java.util.List;

public class JobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobExample() {
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

        public Criteria andJobidIsNull() {
            addCriterion("JOBID is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("JOBID is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(Integer value) {
            addCriterion("JOBID =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(Integer value) {
            addCriterion("JOBID <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(Integer value) {
            addCriterion("JOBID >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JOBID >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(Integer value) {
            addCriterion("JOBID <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(Integer value) {
            addCriterion("JOBID <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<Integer> values) {
            addCriterion("JOBID in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<Integer> values) {
            addCriterion("JOBID not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(Integer value1, Integer value2) {
            addCriterion("JOBID between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(Integer value1, Integer value2) {
            addCriterion("JOBID not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("JOBNAME is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("JOBNAME is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("JOBNAME =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("JOBNAME <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("JOBNAME >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("JOBNAME >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("JOBNAME <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("JOBNAME <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("JOBNAME like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("JOBNAME not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("JOBNAME in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("JOBNAME not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("JOBNAME between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("JOBNAME not between", value1, value2, "jobname");
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

        public Criteria andLimitIsNull() {
            addCriterion("LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andLimitIsNotNull() {
            addCriterion("LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEqualTo(Integer value) {
            addCriterion("LIMIT =", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotEqualTo(Integer value) {
            addCriterion("LIMIT <>", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThan(Integer value) {
            addCriterion("LIMIT >", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIMIT >=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThan(Integer value) {
            addCriterion("LIMIT <", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThanOrEqualTo(Integer value) {
            addCriterion("LIMIT <=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitIn(List<Integer> values) {
            addCriterion("LIMIT in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotIn(List<Integer> values) {
            addCriterion("LIMIT not in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT not between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DEPTID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("DEPTID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("DEPTID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("DEPTID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPTID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("DEPTID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("DEPTID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("DEPTID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("DEPTID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("DEPTID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPTID not between", value1, value2, "deptid");
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