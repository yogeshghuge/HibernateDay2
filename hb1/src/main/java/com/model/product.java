package com.model;

public class product {
	
	private int pid;
	private String pname;
	private String pcompany;
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", pcompany=" + pcompany + ", pquantity=" + pquantity + "]";
	}
	private int pquantity;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcompany() {
		return pcompany;
	}
	public void setPcompany(String pcompany) {
		this.pcompany = pcompany;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}

}
