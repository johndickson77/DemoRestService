package com.poc.vo;

public class RequestParameter {

	private String patientId;
	private String patientName;
	private String code;
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "RequestParameter [patientId=" + patientId + ", patientName=" + patientName + ", code=" + code + "]";
	}
	
	
	
}
