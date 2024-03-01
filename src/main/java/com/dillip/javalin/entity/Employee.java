package com.dillip.javalin.entity;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private String number;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", number=" + number + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(number, other.number);
	}
}
