package com.hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OccupationcareerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OccupationcareerExample() {
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

        public Criteria andOccupationcareeridIsNull() {
            addCriterion("OCCUPATIONCAREERID is null");
            return (Criteria) this;
        }

        public Criteria andOccupationcareeridIsNotNull() {
            addCriterion("OCCUPATIONCAREERID is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationcareeridEqualTo(Integer value) {
            addCriterion("OCCUPATIONCAREERID =", value, "occupationcareerid");
            return (Criteria) this;
        }

        public Criteria andOccupationcareeridNotEqualTo(Integer value) {
            addCriterion("OCCUPATIONCAREERID <>", value, "occupationcareerid");
            return (Criteria) this;
        }

        public Criteria andOccupationcareeridGreaterThan(Integer value) {
            addCriterion("OCCUPATIONCAREERID >", value, "occupationcareerid");
            return (Criteria) this;
        }

        public Criteria andOccupationcareeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("OCCUPATIONCAREERID >=", value, "occupationcareerid");
            return (Criteria) this;
        }

        public Criteria andOccupationcareeridLessThan(Integer value) {
            addCriterion("OCCUPATIONCAREERID <", value, "occupationcareerid");
            return (Criteria) this;
        }

        public Criteria andOccupationcareeridLessThanOrEqualTo(Integer value) {
            addCriterion("OCCUPATIONCAREERID <=", value, "occupationcareerid");
            return (Criteria) this;
        }

        public Criteria andOccupationcareeridIn(List<Integer> values) {
            addCriterion("OCCUPATIONCAREERID in", values, "occupationcareerid");
            return (Criteria) this;
        }

        public Criteria andOccupationcareeridNotIn(List<Integer> values) {
            addCriterion("OCCUPATIONCAREERID not in", values, "occupationcareerid");
            return (Criteria) this;
        }

        public Criteria andOccupationcareeridBetween(Integer value1, Integer value2) {
            addCriterion("OCCUPATIONCAREERID between", value1, value2, "occupationcareerid");
            return (Criteria) this;
        }

        public Criteria andOccupationcareeridNotBetween(Integer value1, Integer value2) {
            addCriterion("OCCUPATIONCAREERID not between", value1, value2, "occupationcareerid");
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

        public Criteria andJobdiscripIsNull() {
            addCriterion("JOBDISCRIP is null");
            return (Criteria) this;
        }

        public Criteria andJobdiscripIsNotNull() {
            addCriterion("JOBDISCRIP is not null");
            return (Criteria) this;
        }

        public Criteria andJobdiscripEqualTo(String value) {
            addCriterion("JOBDISCRIP =", value, "jobdiscrip");
            return (Criteria) this;
        }

        public Criteria andJobdiscripNotEqualTo(String value) {
            addCriterion("JOBDISCRIP <>", value, "jobdiscrip");
            return (Criteria) this;
        }

        public Criteria andJobdiscripGreaterThan(String value) {
            addCriterion("JOBDISCRIP >", value, "jobdiscrip");
            return (Criteria) this;
        }

        public Criteria andJobdiscripGreaterThanOrEqualTo(String value) {
            addCriterion("JOBDISCRIP >=", value, "jobdiscrip");
            return (Criteria) this;
        }

        public Criteria andJobdiscripLessThan(String value) {
            addCriterion("JOBDISCRIP <", value, "jobdiscrip");
            return (Criteria) this;
        }

        public Criteria andJobdiscripLessThanOrEqualTo(String value) {
            addCriterion("JOBDISCRIP <=", value, "jobdiscrip");
            return (Criteria) this;
        }

        public Criteria andJobdiscripLike(String value) {
            addCriterion("JOBDISCRIP like", value, "jobdiscrip");
            return (Criteria) this;
        }

        public Criteria andJobdiscripNotLike(String value) {
            addCriterion("JOBDISCRIP not like", value, "jobdiscrip");
            return (Criteria) this;
        }

        public Criteria andJobdiscripIn(List<String> values) {
            addCriterion("JOBDISCRIP in", values, "jobdiscrip");
            return (Criteria) this;
        }

        public Criteria andJobdiscripNotIn(List<String> values) {
            addCriterion("JOBDISCRIP not in", values, "jobdiscrip");
            return (Criteria) this;
        }

        public Criteria andJobdiscripBetween(String value1, String value2) {
            addCriterion("JOBDISCRIP between", value1, value2, "jobdiscrip");
            return (Criteria) this;
        }

        public Criteria andJobdiscripNotBetween(String value1, String value2) {
            addCriterion("JOBDISCRIP not between", value1, value2, "jobdiscrip");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("SALARY is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Integer value) {
            addCriterion("SALARY =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Integer value) {
            addCriterion("SALARY <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Integer value) {
            addCriterion("SALARY >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALARY >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Integer value) {
            addCriterion("SALARY <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("SALARY <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Integer> values) {
            addCriterion("SALARY in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Integer> values) {
            addCriterion("SALARY not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Integer value1, Integer value2) {
            addCriterion("SALARY between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("SALARY not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andReferenceIsNull() {
            addCriterion("REFERENCE is null");
            return (Criteria) this;
        }

        public Criteria andReferenceIsNotNull() {
            addCriterion("REFERENCE is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceEqualTo(String value) {
            addCriterion("REFERENCE =", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotEqualTo(String value) {
            addCriterion("REFERENCE <>", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceGreaterThan(String value) {
            addCriterion("REFERENCE >", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceGreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE >=", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLessThan(String value) {
            addCriterion("REFERENCE <", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLessThanOrEqualTo(String value) {
            addCriterion("REFERENCE <=", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLike(String value) {
            addCriterion("REFERENCE like", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotLike(String value) {
            addCriterion("REFERENCE not like", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceIn(List<String> values) {
            addCriterion("REFERENCE in", values, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotIn(List<String> values) {
            addCriterion("REFERENCE not in", values, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceBetween(String value1, String value2) {
            addCriterion("REFERENCE between", value1, value2, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotBetween(String value1, String value2) {
            addCriterion("REFERENCE not between", value1, value2, "reference");
            return (Criteria) this;
        }

        public Criteria andReferencepositionIsNull() {
            addCriterion("REFERENCEPOSITION is null");
            return (Criteria) this;
        }

        public Criteria andReferencepositionIsNotNull() {
            addCriterion("REFERENCEPOSITION is not null");
            return (Criteria) this;
        }

        public Criteria andReferencepositionEqualTo(String value) {
            addCriterion("REFERENCEPOSITION =", value, "referenceposition");
            return (Criteria) this;
        }

        public Criteria andReferencepositionNotEqualTo(String value) {
            addCriterion("REFERENCEPOSITION <>", value, "referenceposition");
            return (Criteria) this;
        }

        public Criteria andReferencepositionGreaterThan(String value) {
            addCriterion("REFERENCEPOSITION >", value, "referenceposition");
            return (Criteria) this;
        }

        public Criteria andReferencepositionGreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCEPOSITION >=", value, "referenceposition");
            return (Criteria) this;
        }

        public Criteria andReferencepositionLessThan(String value) {
            addCriterion("REFERENCEPOSITION <", value, "referenceposition");
            return (Criteria) this;
        }

        public Criteria andReferencepositionLessThanOrEqualTo(String value) {
            addCriterion("REFERENCEPOSITION <=", value, "referenceposition");
            return (Criteria) this;
        }

        public Criteria andReferencepositionLike(String value) {
            addCriterion("REFERENCEPOSITION like", value, "referenceposition");
            return (Criteria) this;
        }

        public Criteria andReferencepositionNotLike(String value) {
            addCriterion("REFERENCEPOSITION not like", value, "referenceposition");
            return (Criteria) this;
        }

        public Criteria andReferencepositionIn(List<String> values) {
            addCriterion("REFERENCEPOSITION in", values, "referenceposition");
            return (Criteria) this;
        }

        public Criteria andReferencepositionNotIn(List<String> values) {
            addCriterion("REFERENCEPOSITION not in", values, "referenceposition");
            return (Criteria) this;
        }

        public Criteria andReferencepositionBetween(String value1, String value2) {
            addCriterion("REFERENCEPOSITION between", value1, value2, "referenceposition");
            return (Criteria) this;
        }

        public Criteria andReferencepositionNotBetween(String value1, String value2) {
            addCriterion("REFERENCEPOSITION not between", value1, value2, "referenceposition");
            return (Criteria) this;
        }

        public Criteria andReferencetelIsNull() {
            addCriterion("REFERENCETEL is null");
            return (Criteria) this;
        }

        public Criteria andReferencetelIsNotNull() {
            addCriterion("REFERENCETEL is not null");
            return (Criteria) this;
        }

        public Criteria andReferencetelEqualTo(String value) {
            addCriterion("REFERENCETEL =", value, "referencetel");
            return (Criteria) this;
        }

        public Criteria andReferencetelNotEqualTo(String value) {
            addCriterion("REFERENCETEL <>", value, "referencetel");
            return (Criteria) this;
        }

        public Criteria andReferencetelGreaterThan(String value) {
            addCriterion("REFERENCETEL >", value, "referencetel");
            return (Criteria) this;
        }

        public Criteria andReferencetelGreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCETEL >=", value, "referencetel");
            return (Criteria) this;
        }

        public Criteria andReferencetelLessThan(String value) {
            addCriterion("REFERENCETEL <", value, "referencetel");
            return (Criteria) this;
        }

        public Criteria andReferencetelLessThanOrEqualTo(String value) {
            addCriterion("REFERENCETEL <=", value, "referencetel");
            return (Criteria) this;
        }

        public Criteria andReferencetelLike(String value) {
            addCriterion("REFERENCETEL like", value, "referencetel");
            return (Criteria) this;
        }

        public Criteria andReferencetelNotLike(String value) {
            addCriterion("REFERENCETEL not like", value, "referencetel");
            return (Criteria) this;
        }

        public Criteria andReferencetelIn(List<String> values) {
            addCriterion("REFERENCETEL in", values, "referencetel");
            return (Criteria) this;
        }

        public Criteria andReferencetelNotIn(List<String> values) {
            addCriterion("REFERENCETEL not in", values, "referencetel");
            return (Criteria) this;
        }

        public Criteria andReferencetelBetween(String value1, String value2) {
            addCriterion("REFERENCETEL between", value1, value2, "referencetel");
            return (Criteria) this;
        }

        public Criteria andReferencetelNotBetween(String value1, String value2) {
            addCriterion("REFERENCETEL not between", value1, value2, "referencetel");
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