package com.hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryExample() {
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

        public Criteria andHistoryidIsNull() {
            addCriterion("HISTORYID is null");
            return (Criteria) this;
        }

        public Criteria andHistoryidIsNotNull() {
            addCriterion("HISTORYID is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryidEqualTo(Integer value) {
            addCriterion("HISTORYID =", value, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidNotEqualTo(Integer value) {
            addCriterion("HISTORYID <>", value, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidGreaterThan(Integer value) {
            addCriterion("HISTORYID >", value, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HISTORYID >=", value, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidLessThan(Integer value) {
            addCriterion("HISTORYID <", value, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidLessThanOrEqualTo(Integer value) {
            addCriterion("HISTORYID <=", value, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidIn(List<Integer> values) {
            addCriterion("HISTORYID in", values, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidNotIn(List<Integer> values) {
            addCriterion("HISTORYID not in", values, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidBetween(Integer value1, Integer value2) {
            addCriterion("HISTORYID between", value1, value2, "historyid");
            return (Criteria) this;
        }

        public Criteria andHistoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("HISTORYID not between", value1, value2, "historyid");
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(Integer value) {
            addCriterion("PEOPLE =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(Integer value) {
            addCriterion("PEOPLE <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(Integer value) {
            addCriterion("PEOPLE >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("PEOPLE >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(Integer value) {
            addCriterion("PEOPLE <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("PEOPLE <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<Integer> values) {
            addCriterion("PEOPLE in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<Integer> values) {
            addCriterion("PEOPLE not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(Integer value1, Integer value2) {
            addCriterion("PEOPLE between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("PEOPLE not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNull() {
            addCriterion("CHANGETIME is null");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNotNull() {
            addCriterion("CHANGETIME is not null");
            return (Criteria) this;
        }

        public Criteria andChangetimeEqualTo(Date value) {
            addCriterionForJDBCDate("CHANGETIME =", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHANGETIME <>", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CHANGETIME >", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHANGETIME >=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThan(Date value) {
            addCriterionForJDBCDate("CHANGETIME <", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHANGETIME <=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeIn(List<Date> values) {
            addCriterionForJDBCDate("CHANGETIME in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHANGETIME not in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHANGETIME between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHANGETIME not between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andOldpeopleIsNull() {
            addCriterion("OLDPEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andOldpeopleIsNotNull() {
            addCriterion("OLDPEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andOldpeopleEqualTo(Integer value) {
            addCriterion("OLDPEOPLE =", value, "oldpeople");
            return (Criteria) this;
        }

        public Criteria andOldpeopleNotEqualTo(Integer value) {
            addCriterion("OLDPEOPLE <>", value, "oldpeople");
            return (Criteria) this;
        }

        public Criteria andOldpeopleGreaterThan(Integer value) {
            addCriterion("OLDPEOPLE >", value, "oldpeople");
            return (Criteria) this;
        }

        public Criteria andOldpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("OLDPEOPLE >=", value, "oldpeople");
            return (Criteria) this;
        }

        public Criteria andOldpeopleLessThan(Integer value) {
            addCriterion("OLDPEOPLE <", value, "oldpeople");
            return (Criteria) this;
        }

        public Criteria andOldpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("OLDPEOPLE <=", value, "oldpeople");
            return (Criteria) this;
        }

        public Criteria andOldpeopleIn(List<Integer> values) {
            addCriterion("OLDPEOPLE in", values, "oldpeople");
            return (Criteria) this;
        }

        public Criteria andOldpeopleNotIn(List<Integer> values) {
            addCriterion("OLDPEOPLE not in", values, "oldpeople");
            return (Criteria) this;
        }

        public Criteria andOldpeopleBetween(Integer value1, Integer value2) {
            addCriterion("OLDPEOPLE between", value1, value2, "oldpeople");
            return (Criteria) this;
        }

        public Criteria andOldpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("OLDPEOPLE not between", value1, value2, "oldpeople");
            return (Criteria) this;
        }

        public Criteria andNewpeopleIsNull() {
            addCriterion("NEWPEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andNewpeopleIsNotNull() {
            addCriterion("NEWPEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andNewpeopleEqualTo(Integer value) {
            addCriterion("NEWPEOPLE =", value, "newpeople");
            return (Criteria) this;
        }

        public Criteria andNewpeopleNotEqualTo(Integer value) {
            addCriterion("NEWPEOPLE <>", value, "newpeople");
            return (Criteria) this;
        }

        public Criteria andNewpeopleGreaterThan(Integer value) {
            addCriterion("NEWPEOPLE >", value, "newpeople");
            return (Criteria) this;
        }

        public Criteria andNewpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEWPEOPLE >=", value, "newpeople");
            return (Criteria) this;
        }

        public Criteria andNewpeopleLessThan(Integer value) {
            addCriterion("NEWPEOPLE <", value, "newpeople");
            return (Criteria) this;
        }

        public Criteria andNewpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("NEWPEOPLE <=", value, "newpeople");
            return (Criteria) this;
        }

        public Criteria andNewpeopleIn(List<Integer> values) {
            addCriterion("NEWPEOPLE in", values, "newpeople");
            return (Criteria) this;
        }

        public Criteria andNewpeopleNotIn(List<Integer> values) {
            addCriterion("NEWPEOPLE not in", values, "newpeople");
            return (Criteria) this;
        }

        public Criteria andNewpeopleBetween(Integer value1, Integer value2) {
            addCriterion("NEWPEOPLE between", value1, value2, "newpeople");
            return (Criteria) this;
        }

        public Criteria andNewpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("NEWPEOPLE not between", value1, value2, "newpeople");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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