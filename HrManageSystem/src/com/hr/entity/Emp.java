package com.hr.entity;

import java.util.Date;

public class Emp {
    private Integer empid;

    private String name;

    private String sex;

    private Date bir;

    private String idcard;

    private Date toworktime;

    private String zzmm;

    private String national;

    private String natives;

    private String tele;

    private String mail;

    private String height;

    private String bloodtype;

    private String birthplace;

    private String hkplace;

    private String xl;

    private String degree;

    private String graduateschool;

    private String professional;

    private Date graduatetime;

    
    
    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Date getToworktime() {
        return toworktime;
    }

    public void setToworktime(Date toworktime) {
        this.toworktime = toworktime;
    }

    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm == null ? null : zzmm.trim();
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national == null ? null : national.trim();
    }

    public String getNatives() {
        return natives;
    }

    public void setNatives(String natives) {
        this.natives = natives == null ? null : natives.trim();
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele == null ? null : tele.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype == null ? null : bloodtype.trim();
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }

    public String getHkplace() {
        return hkplace;
    }

    public void setHkplace(String hkplace) {
        this.hkplace = hkplace == null ? null : hkplace.trim();
    }

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl == null ? null : xl.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getGraduateschool() {
        return graduateschool;
    }

    public void setGraduateschool(String graduateschool) {
        this.graduateschool = graduateschool == null ? null : graduateschool.trim();
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public Date getGraduatetime() {
        return graduatetime;
    }

    public void setGraduatetime(Date graduatetime) {
        this.graduatetime = graduatetime;
    }
}