package com.dillip.javalin;

import com.dillip.javalin.controller.EmployeeController;

import io.javalin.Javalin;

public class App {
	public static void main(String[] args) {
		var app = Javalin.create().start(7000);

		EmployeeController employeeController = new EmployeeController();

		app.post("/employees", employeeController::saveEmployee);
		app.get("/employees", employeeController::getAllEmployee);
		app.get("/employees/{employeeId}", employeeController::getEmployeeById);
	}
}
