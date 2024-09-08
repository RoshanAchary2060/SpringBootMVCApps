package com.rosan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INFO_FACULTY")
public class Faculty {
	@Id
	private Integer fid;
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getQlfy() {
		return qlfy;
	}
	public void setQlfy(String qlfy) {
		this.qlfy = qlfy;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	private String fname;
	private String qlfy;
	private String subject;
}
