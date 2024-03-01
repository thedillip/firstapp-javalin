package com.dillip.javalin.response;

import java.util.Objects;

public class EmployeeResponse {
	private int employeeId;
	private String employeeName;
	private String employeeNumber;

	public EmployeeResponse() {
		super();
	}

	public EmployeeResponse(int employeeId, String employeeName, String employeeNumber) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
		return "EmployeeResponse [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeNumber="
				+ employeeNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, employeeNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeResponse other = (EmployeeResponse) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& Objects.equals(employeeNumber, other.employeeNumber);
	}
}
