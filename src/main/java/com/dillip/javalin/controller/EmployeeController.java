package com.dillip.javalin.controller;

import java.util.List;

import com.dillip.javalin.request.EmployeeRequest;
import com.dillip.javalin.response.EmployeeResponse;
import com.dillip.javalin.service.EmployeeService;
import com.dillip.javalin.service.EmployeeServiceImpl;

import io.javalin.http.Context;

public class EmployeeController {
	private EmployeeService employeeService = new EmployeeServiceImpl();

	public void saveEmployee(Context ctx) {
		EmployeeRequest employeeRequest = ctx.bodyAsClass(EmployeeRequest.class);
		EmployeeResponse response = employeeService.saveEmployee(employeeRequest);
		ctx.json(response).status(201);
	}

	public void getAllEmployee(Context ctx) {
		List<EmployeeResponse> response = employeeService.getAllEmployee();
		ctx.json(response).status(200);
	}

	public void getEmployeeById(Context ctx) {
		String employeeId = ctx.pathParam("employeeId");
		EmployeeResponse employee = employeeService.getEmployeeById(Integer.parseInt(employeeId));
		if (employee != null) {
			ctx.json(employee).status(200);
		} else {
			ctx.result("Employee Not Found with employeeId = " + employeeId).status(404);
		}
	}
}
