package com.spring.model;

public class EmpModel {
	
	private int empId;
	private String empName;
	private Double empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public EmpModel(int empId, String empName, Double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
}
