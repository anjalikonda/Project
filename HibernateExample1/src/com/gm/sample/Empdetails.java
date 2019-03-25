package com.gm.sample;

public class Empdetails
{
	private int eid;
	private String ename;
	private String esalary;
	private String eaddress;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsalary() {
		return esalary;
	}
	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	@Override
	public String toString() {
		return "Empdetails [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", eaddress=" + eaddress + "]";
	}
	
	
	

}
