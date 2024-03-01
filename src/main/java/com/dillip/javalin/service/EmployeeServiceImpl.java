package com.dillip.javalin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.dillip.javalin.entity.Employee;
import com.dillip.javalin.request.EmployeeRequest;
import com.dillip.javalin.response.EmployeeResponse;

public class EmployeeServiceImpl implements EmployeeService {

	private final List<Employee> employeeList = new ArrayList<>();

	@Override
	public EmployeeResponse saveEmployee(EmployeeRequest employeeRequest) {
		Employee employee = new Employee();
		employee.setId(generateEmployeeId());
		employee.setName(employeeRequest.getEmployeeName());
		employee.setNumber(employeeRequest.getEmployeeNumber());
		boolean add = this.employeeList.add(employee);
		EmployeeResponse employeeResponse = null;
		if (add) {
			employeeResponse = new EmployeeResponse();
			employeeResponse.setEmployeeId(employee.getId());
			employeeResponse.setEmployeeName(employee.getName());
			employeeResponse.setEmployeeNumber(employee.getNumber());
		}
		return employeeResponse;
	}

	@Override
	public List<EmployeeResponse> getAllEmployee() {
		return employeeList.stream().map(e -> new EmployeeResponse(e.getId(), e.getName(), e.getNumber()))
				.collect(Collectors.toList());
	}

	@Override
	public EmployeeResponse getEmployeeById(int employeeId) {
		Employee employee = this.employeeList.stream().filter(e -> e.getId() == employeeId).findFirst().orElse(null);
		EmployeeResponse employeeResponse = null;
		if (employee != null) {
			employeeResponse = new EmployeeResponse();
			employeeResponse.setEmployeeId(employee.getId());
			employeeResponse.setEmployeeName(employee.getName());
			employeeResponse.setEmployeeNumber(employee.getNumber());
		}
		return employeeResponse;
	}

	@Override
	public String updateEmployee(int employeeId, EmployeeRequest employeeRequest) {
		return null;
	}

	@Override
	public String deleteEmployeeById(int employeeId) {
		return null;
	}

	@Override
	public String deleteAllEmployee() {
		return null;
	}

	private int generateEmployeeId() {
		return this.employeeList.size() + 1;
	}
}
