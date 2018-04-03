package com.hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpExample() {
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

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirIsNull() {
            addCriterion("BIR is null");
            return (Criteria) this;
        }

        public Criteria andBirIsNotNull() {
            addCriterion("BIR is not null");
            return (Criteria) this;
        }

        public Criteria andBirEqualTo(Date value) {
            addCriterionForJDBCDate("BIR =", value, "bir");
            return (Criteria) this;
        }

        public Criteria andBirNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIR <>", value, "bir");
            return (Criteria) this;
        }

        public Criteria andBirGreaterThan(Date value) {
            addCriterionForJDBCDate("BIR >", value, "bir");
            return (Criteria) this;
        }

        public Criteria andBirGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIR >=", value, "bir");
            return (Criteria) this;
        }

        public Criteria andBirLessThan(Date value) {
            addCriterionForJDBCDate("BIR <", value, "bir");
            return (Criteria) this;
        }

        public Criteria andBirLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIR <=", value, "bir");
            return (Criteria) this;
        }

        public Criteria andBirIn(List<Date> values) {
            addCriterionForJDBCDate("BIR in", values, "bir");
            return (Criteria) this;
        }

        public Criteria andBirNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIR not in", values, "bir");
            return (Criteria) this;
        }

        public Criteria andBirBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIR between", value1, value2, "bir");
            return (Criteria) this;
        }

        public Criteria andBirNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIR not between", value1, value2, "bir");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andToworktimeIsNull() {
            addCriterion("TOWORKTIME is null");
            return (Criteria) this;
        }

        public Criteria andToworktimeIsNotNull() {
            addCriterion("TOWORKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andToworktimeEqualTo(Date value) {
            addCriterionForJDBCDate("TOWORKTIME =", value, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("TOWORKTIME <>", value, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeGreaterThan(Date value) {
            addCriterionForJDBCDate("TOWORKTIME >", value, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOWORKTIME >=", value, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeLessThan(Date value) {
            addCriterionForJDBCDate("TOWORKTIME <", value, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TOWORKTIME <=", value, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeIn(List<Date> values) {
            addCriterionForJDBCDate("TOWORKTIME in", values, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("TOWORKTIME not in", values, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOWORKTIME between", value1, value2, "toworktime");
            return (Criteria) this;
        }

        public Criteria andToworktimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TOWORKTIME not between", value1, value2, "toworktime");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNull() {
            addCriterion("ZZMM is null");
            return (Criteria) this;
        }

        public Criteria andZzmmIsNotNull() {
            addCriterion("ZZMM is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmEqualTo(String value) {
            addCriterion("ZZMM =", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotEqualTo(String value) {
            addCriterion("ZZMM <>", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThan(String value) {
            addCriterion("ZZMM >", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmGreaterThanOrEqualTo(String value) {
            addCriterion("ZZMM >=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThan(String value) {
            addCriterion("ZZMM <", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLessThanOrEqualTo(String value) {
            addCriterion("ZZMM <=", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmLike(String value) {
            addCriterion("ZZMM like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotLike(String value) {
            addCriterion("ZZMM not like", value, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmIn(List<String> values) {
            addCriterion("ZZMM in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotIn(List<String> values) {
            addCriterion("ZZMM not in", values, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmBetween(String value1, String value2) {
            addCriterion("ZZMM between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andZzmmNotBetween(String value1, String value2) {
            addCriterion("ZZMM not between", value1, value2, "zzmm");
            return (Criteria) this;
        }

        public Criteria andNationalIsNull() {
            addCriterion("NATIONAL is null");
            return (Criteria) this;
        }

        public Criteria andNationalIsNotNull() {
            addCriterion("NATIONAL is not null");
            return (Criteria) this;
        }

        public Criteria andNationalEqualTo(String value) {
            addCriterion("NATIONAL =", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotEqualTo(String value) {
            addCriterion("NATIONAL <>", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThan(String value) {
            addCriterion("NATIONAL >", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONAL >=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThan(String value) {
            addCriterion("NATIONAL <", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThanOrEqualTo(String value) {
            addCriterion("NATIONAL <=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLike(String value) {
            addCriterion("NATIONAL like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotLike(String value) {
            addCriterion("NATIONAL not like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalIn(List<String> values) {
            addCriterion("NATIONAL in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotIn(List<String> values) {
            addCriterion("NATIONAL not in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalBetween(String value1, String value2) {
            addCriterion("NATIONAL between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotBetween(String value1, String value2) {
            addCriterion("NATIONAL not between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andNativesIsNull() {
            addCriterion("NATIVES is null");
            return (Criteria) this;
        }

        public Criteria andNativesIsNotNull() {
            addCriterion("NATIVES is not null");
            return (Criteria) this;
        }

        public Criteria andNativesEqualTo(String value) {
            addCriterion("NATIVES =", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesNotEqualTo(String value) {
            addCriterion("NATIVES <>", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesGreaterThan(String value) {
            addCriterion("NATIVES >", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesGreaterThanOrEqualTo(String value) {
            addCriterion("NATIVES >=", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesLessThan(String value) {
            addCriterion("NATIVES <", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesLessThanOrEqualTo(String value) {
            addCriterion("NATIVES <=", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesLike(String value) {
            addCriterion("NATIVES like", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesNotLike(String value) {
            addCriterion("NATIVES not like", value, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesIn(List<String> values) {
            addCriterion("NATIVES in", values, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesNotIn(List<String> values) {
            addCriterion("NATIVES not in", values, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesBetween(String value1, String value2) {
            addCriterion("NATIVES between", value1, value2, "natives");
            return (Criteria) this;
        }

        public Criteria andNativesNotBetween(String value1, String value2) {
            addCriterion("NATIVES not between", value1, value2, "natives");
            return (Criteria) this;
        }

        public Criteria andTeleIsNull() {
            addCriterion("TELE is null");
            return (Criteria) this;
        }

        public Criteria andTeleIsNotNull() {
            addCriterion("TELE is not null");
            return (Criteria) this;
        }

        public Criteria andTeleEqualTo(String value) {
            addCriterion("TELE =", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleNotEqualTo(String value) {
            addCriterion("TELE <>", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleGreaterThan(String value) {
            addCriterion("TELE >", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleGreaterThanOrEqualTo(String value) {
            addCriterion("TELE >=", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleLessThan(String value) {
            addCriterion("TELE <", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleLessThanOrEqualTo(String value) {
            addCriterion("TELE <=", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleLike(String value) {
            addCriterion("TELE like", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleNotLike(String value) {
            addCriterion("TELE not like", value, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleIn(List<String> values) {
            addCriterion("TELE in", values, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleNotIn(List<String> values) {
            addCriterion("TELE not in", values, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleBetween(String value1, String value2) {
            addCriterion("TELE between", value1, value2, "tele");
            return (Criteria) this;
        }

        public Criteria andTeleNotBetween(String value1, String value2) {
            addCriterion("TELE not between", value1, value2, "tele");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("MAIL is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("MAIL =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("MAIL <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("MAIL >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("MAIL <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("MAIL <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("MAIL like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("MAIL not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("MAIL in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("MAIL not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("MAIL between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("MAIL not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("HEIGHT =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("HEIGHT <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("HEIGHT >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("HEIGHT >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("HEIGHT <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("HEIGHT <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("HEIGHT like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("HEIGHT not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("HEIGHT in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("HEIGHT not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("HEIGHT between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("HEIGHT not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIsNull() {
            addCriterion("BLOODTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIsNotNull() {
            addCriterion("BLOODTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeEqualTo(String value) {
            addCriterion("BLOODTYPE =", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotEqualTo(String value) {
            addCriterion("BLOODTYPE <>", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeGreaterThan(String value) {
            addCriterion("BLOODTYPE >", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeGreaterThanOrEqualTo(String value) {
            addCriterion("BLOODTYPE >=", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLessThan(String value) {
            addCriterion("BLOODTYPE <", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLessThanOrEqualTo(String value) {
            addCriterion("BLOODTYPE <=", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLike(String value) {
            addCriterion("BLOODTYPE like", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotLike(String value) {
            addCriterion("BLOODTYPE not like", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIn(List<String> values) {
            addCriterion("BLOODTYPE in", values, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotIn(List<String> values) {
            addCriterion("BLOODTYPE not in", values, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeBetween(String value1, String value2) {
            addCriterion("BLOODTYPE between", value1, value2, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotBetween(String value1, String value2) {
            addCriterion("BLOODTYPE not between", value1, value2, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNull() {
            addCriterion("BIRTHPLACE is null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNotNull() {
            addCriterion("BIRTHPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceEqualTo(String value) {
            addCriterion("BIRTHPLACE =", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotEqualTo(String value) {
            addCriterion("BIRTHPLACE <>", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThan(String value) {
            addCriterion("BIRTHPLACE >", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHPLACE >=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThan(String value) {
            addCriterion("BIRTHPLACE <", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("BIRTHPLACE <=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLike(String value) {
            addCriterion("BIRTHPLACE like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotLike(String value) {
            addCriterion("BIRTHPLACE not like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIn(List<String> values) {
            addCriterion("BIRTHPLACE in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotIn(List<String> values) {
            addCriterion("BIRTHPLACE not in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceBetween(String value1, String value2) {
            addCriterion("BIRTHPLACE between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotBetween(String value1, String value2) {
            addCriterion("BIRTHPLACE not between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceIsNull() {
            addCriterion("HKPLACE is null");
            return (Criteria) this;
        }

        public Criteria andHkplaceIsNotNull() {
            addCriterion("HKPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andHkplaceEqualTo(String value) {
            addCriterion("HKPLACE =", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceNotEqualTo(String value) {
            addCriterion("HKPLACE <>", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceGreaterThan(String value) {
            addCriterion("HKPLACE >", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceGreaterThanOrEqualTo(String value) {
            addCriterion("HKPLACE >=", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceLessThan(String value) {
            addCriterion("HKPLACE <", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceLessThanOrEqualTo(String value) {
            addCriterion("HKPLACE <=", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceLike(String value) {
            addCriterion("HKPLACE like", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceNotLike(String value) {
            addCriterion("HKPLACE not like", value, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceIn(List<String> values) {
            addCriterion("HKPLACE in", values, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceNotIn(List<String> values) {
            addCriterion("HKPLACE not in", values, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceBetween(String value1, String value2) {
            addCriterion("HKPLACE between", value1, value2, "hkplace");
            return (Criteria) this;
        }

        public Criteria andHkplaceNotBetween(String value1, String value2) {
            addCriterion("HKPLACE not between", value1, value2, "hkplace");
            return (Criteria) this;
        }

        public Criteria andXlIsNull() {
            addCriterion("XL is null");
            return (Criteria) this;
        }

        public Criteria andXlIsNotNull() {
            addCriterion("XL is not null");
            return (Criteria) this;
        }

        public Criteria andXlEqualTo(String value) {
            addCriterion("XL =", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotEqualTo(String value) {
            addCriterion("XL <>", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThan(String value) {
            addCriterion("XL >", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThanOrEqualTo(String value) {
            addCriterion("XL >=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThan(String value) {
            addCriterion("XL <", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThanOrEqualTo(String value) {
            addCriterion("XL <=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLike(String value) {
            addCriterion("XL like", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotLike(String value) {
            addCriterion("XL not like", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlIn(List<String> values) {
            addCriterion("XL in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotIn(List<String> values) {
            addCriterion("XL not in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlBetween(String value1, String value2) {
            addCriterion("XL between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotBetween(String value1, String value2) {
            addCriterion("XL not between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("DEGREE =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("DEGREE <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("DEGREE >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("DEGREE >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("DEGREE <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("DEGREE <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("DEGREE like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("DEGREE not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("DEGREE in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("DEGREE not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("DEGREE between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("DEGREE not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIsNull() {
            addCriterion("GRADUATESCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIsNotNull() {
            addCriterion("GRADUATESCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolEqualTo(String value) {
            addCriterion("GRADUATESCHOOL =", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotEqualTo(String value) {
            addCriterion("GRADUATESCHOOL <>", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolGreaterThan(String value) {
            addCriterion("GRADUATESCHOOL >", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATESCHOOL >=", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLessThan(String value) {
            addCriterion("GRADUATESCHOOL <", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLessThanOrEqualTo(String value) {
            addCriterion("GRADUATESCHOOL <=", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLike(String value) {
            addCriterion("GRADUATESCHOOL like", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotLike(String value) {
            addCriterion("GRADUATESCHOOL not like", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIn(List<String> values) {
            addCriterion("GRADUATESCHOOL in", values, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotIn(List<String> values) {
            addCriterion("GRADUATESCHOOL not in", values, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolBetween(String value1, String value2) {
            addCriterion("GRADUATESCHOOL between", value1, value2, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotBetween(String value1, String value2) {
            addCriterion("GRADUATESCHOOL not between", value1, value2, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNull() {
            addCriterion("PROFESSIONAL is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNotNull() {
            addCriterion("PROFESSIONAL is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalEqualTo(String value) {
            addCriterion("PROFESSIONAL =", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotEqualTo(String value) {
            addCriterion("PROFESSIONAL <>", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThan(String value) {
            addCriterion("PROFESSIONAL >", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSIONAL >=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThan(String value) {
            addCriterion("PROFESSIONAL <", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThanOrEqualTo(String value) {
            addCriterion("PROFESSIONAL <=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLike(String value) {
            addCriterion("PROFESSIONAL like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotLike(String value) {
            addCriterion("PROFESSIONAL not like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalIn(List<String> values) {
            addCriterion("PROFESSIONAL in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotIn(List<String> values) {
            addCriterion("PROFESSIONAL not in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalBetween(String value1, String value2) {
            addCriterion("PROFESSIONAL between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotBetween(String value1, String value2) {
            addCriterion("PROFESSIONAL not between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeIsNull() {
            addCriterion("GRADUATETIME is null");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeIsNotNull() {
            addCriterion("GRADUATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("GRADUATETIME =", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("GRADUATETIME <>", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("GRADUATETIME >", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GRADUATETIME >=", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeLessThan(Date value) {
            addCriterionForJDBCDate("GRADUATETIME <", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GRADUATETIME <=", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("GRADUATETIME in", values, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("GRADUATETIME not in", values, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GRADUATETIME between", value1, value2, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GRADUATETIME not between", value1, value2, "graduatetime");
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