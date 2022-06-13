package com.jbk.SpringBoot_WithoutDB.service;

import java.util.List;

import com.jbk.SpringBoot_WithoutDB.entity.Employee;

public interface EmployeeService {

	public String saveEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployee(int eid);
	public List<Employee> sortEmployeeOnSalary();
	public String updateEmployee(Employee employee);
	public String deleteEmployee(int eid);
}
