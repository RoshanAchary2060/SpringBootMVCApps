
package com.rosan.model;

public class Customer {

	private String cname;
	private String cadd;

	public Customer() {

	}

	public Customer(String cname, String cadd, Double billAmt) {
		super();
		this.cname = cname;
		this.cadd = cadd;
		this.billAmt = billAmt;
	}

	private Double billAmt;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCadd() {
		return cadd;
	}

	public void setCadd(String cadd) {
		this.cadd = cadd;
	}

	public Double getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(Double billAmt) {
		this.billAmt = billAmt;
	}
}

