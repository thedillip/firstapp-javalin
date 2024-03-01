package com.dillip.javalin.request;

import java.util.Objects;

public class EmployeeRequest {
	private String employeeName;
	private String employeeNumber;

	public EmployeeRequest() {
		super();
	}

	public EmployeeRequest(String employeeName, String employeeNumber) {
		super();
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public String toString() {
		return "EmployeeRequest [employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeName, employeeNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeRequest other = (EmployeeRequest) obj;
		return Objects.equals(employeeName, other.employeeName) && Objects.equals(employeeNumber, other.employeeNumber);
	}
}
