package com.poc.vo;

public class Medicine {
	
	private String medID;
	private String medName;
	public String getMedID() {
		return medID;
	}
	public void setMedID(String medID) {
		this.medID = medID;
	}
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	@Override
	public String toString() {
		return "Medicine [medID=" + medID + ", medName=" + medName + "]";
	}
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicine(String medID, String medName) {
		super();
		this.medID = medID;
		this.medName = medName;
	}
	
	

}
