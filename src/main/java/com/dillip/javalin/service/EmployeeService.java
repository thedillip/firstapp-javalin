package com.dillip.javalin.service;

import java.util.List;

import com.dillip.javalin.request.EmployeeRequest;
import com.dillip.javalin.response.EmployeeResponse;

public interface EmployeeService {
	EmployeeResponse saveEmployee(EmployeeRequest employeeRequest);

	List<EmployeeResponse> getAllEmployee();

	EmployeeResponse getEmployeeById(int employeeId);

	String updateEmployee(int employeeId, EmployeeRequest employeeRequest);

	String deleteEmployeeById(int employeeId);

	String deleteAllEmployee();
}
