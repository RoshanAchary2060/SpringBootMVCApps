package com.nt.model;

public class Employee {
	public Employee(int eno, String ename, String desg, double salary) {
		this.eno = eno;
		this.ename = ename;
		this.desg = desg;
		this.salary = salary;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private int eno;
	private String ename;
	private String desg;
	private double salary;
}
