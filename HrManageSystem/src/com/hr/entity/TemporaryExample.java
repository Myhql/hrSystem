package com.hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TemporaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TemporaryExample() {
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

        public Criteria andTemporaryidIsNull() {
            addCriterion("TEMPORARYID is null");
            return (Criteria) this;
        }

        public Criteria andTemporaryidIsNotNull() {
            addCriterion("TEMPORARYID is not null");
            return (Criteria) this;
        }

        public Criteria andTemporaryidEqualTo(Integer value) {
            addCriterion("TEMPORARYID =", value, "temporaryid");
            return (Criteria) this;
        }

        public Criteria andTemporaryidNotEqualTo(Integer value) {
            addCriterion("TEMPORARYID <>", value, "temporaryid");
            return (Criteria) this;
        }

        public Criteria andTemporaryidGreaterThan(Integer value) {
            addCriterion("TEMPORARYID >", value, "temporaryid");
            return (Criteria) this;
        }

        public Criteria andTemporaryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEMPORARYID >=", value, "temporaryid");
            return (Criteria) this;
        }

        public Criteria andTemporaryidLessThan(Integer value) {
            addCriterion("TEMPORARYID <", value, "temporaryid");
            return (Criteria) this;
        }

        public Criteria andTemporaryidLessThanOrEqualTo(Integer value) {
            addCriterion("TEMPORARYID <=", value, "temporaryid");
            return (Criteria) this;
        }

        public Criteria andTemporaryidIn(List<Integer> values) {
            addCriterion("TEMPORARYID in", values, "temporaryid");
            return (Criteria) this;
        }

        public Criteria andTemporaryidNotIn(List<Integer> values) {
            addCriterion("TEMPORARYID not in", values, "temporaryid");
            return (Criteria) this;
        }

        public Criteria andTemporaryidBetween(Integer value1, Integer value2) {
            addCriterion("TEMPORARYID between", value1, value2, "temporaryid");
            return (Criteria) this;
        }

        public Criteria andTemporaryidNotBetween(Integer value1, Integer value2) {
            addCriterion("TEMPORARYID not between", value1, value2, "temporaryid");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("BEGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("BEGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterionForJDBCDate("BEGINTIME =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("BEGINTIME <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("BEGINTIME >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BEGINTIME >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterionForJDBCDate("BEGINTIME <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BEGINTIME <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterionForJDBCDate("BEGINTIME in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("BEGINTIME not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BEGINTIME between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BEGINTIME not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNull() {
            addCriterion("DEALTIME is null");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNotNull() {
            addCriterion("DEALTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDealtimeEqualTo(Date value) {
            addCriterionForJDBCDate("DEALTIME =", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEALTIME <>", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DEALTIME >", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEALTIME >=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThan(Date value) {
            addCriterionForJDBCDate("DEALTIME <", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEALTIME <=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeIn(List<Date> values) {
            addCriterionForJDBCDate("DEALTIME in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEALTIME not in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEALTIME between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEALTIME not between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andOpeIsNull() {
            addCriterion("OPE is null");
            return (Criteria) this;
        }

        public Criteria andOpeIsNotNull() {
            addCriterion("OPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpeEqualTo(String value) {
            addCriterion("OPE =", value, "ope");
            return (Criteria) this;
        }

        public Criteria andOpeNotEqualTo(String value) {
            addCriterion("OPE <>", value, "ope");
            return (Criteria) this;
        }

        public Criteria andOpeGreaterThan(String value) {
            addCriterion("OPE >", value, "ope");
            return (Criteria) this;
        }

        public Criteria andOpeGreaterThanOrEqualTo(String value) {
            addCriterion("OPE >=", value, "ope");
            return (Criteria) this;
        }

        public Criteria andOpeLessThan(String value) {
            addCriterion("OPE <", value, "ope");
            return (Criteria) this;
        }

        public Criteria andOpeLessThanOrEqualTo(String value) {
            addCriterion("OPE <=", value, "ope");
            return (Criteria) this;
        }

        public Criteria andOpeLike(String value) {
            addCriterion("OPE like", value, "ope");
            return (Criteria) this;
        }

        public Criteria andOpeNotLike(String value) {
            addCriterion("OPE not like", value, "ope");
            return (Criteria) this;
        }

        public Criteria andOpeIn(List<String> values) {
            addCriterion("OPE in", values, "ope");
            return (Criteria) this;
        }

        public Criteria andOpeNotIn(List<String> values) {
            addCriterion("OPE not in", values, "ope");
            return (Criteria) this;
        }

        public Criteria andOpeBetween(String value1, String value2) {
            addCriterion("OPE between", value1, value2, "ope");
            return (Criteria) this;
        }

        public Criteria andOpeNotBetween(String value1, String value2) {
            addCriterion("OPE not between", value1, value2, "ope");
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