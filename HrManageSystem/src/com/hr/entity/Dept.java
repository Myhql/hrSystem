package com.hr.entity;

import java.util.Date;

public class Dept {
    private Integer deptid;

    private String name;

    private String type;

    private String tele;

    private String fax;

    private String discrip;

    private Integer superid;
    private Dept superdept;

    private Date createtime;

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele == null ? null : tele.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getDiscrip() {
        return discrip;
    }

    public void setDiscrip(String discrip) {
        this.discrip = discrip == null ? null : discrip.trim();
    }

    
    public Integer getSuperid() {
        return superid;
    }

    public void setSuperid(Integer superid) {
        this.superid = superid;
    }

   

	public Date getCreatetime() {
        return createtime;
    }

    public Dept getSuperdept() {
		return superdept;
	}

	public void setSuperdept(Dept superdept) {
		this.superdept = superdept;
	}

	public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}