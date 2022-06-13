package com.jbk.SpringBoot_WithoutDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.SpringBoot_WithoutDB.dao.EmployeeDao;
import com.jbk.SpringBoot_WithoutDB.entity.Employee;

@Service
public class EmployeeService_Impl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	@Override
	public String saveEmployee(Employee employee) {

		String msg = dao.saveEmployee(employee);

		return msg;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list = dao.getAllEmployee();
		return list;
	}

	@Override
	public Employee getEmployee(int eid) {
		
		Employee employee = dao.getEmployee(eid);
		
		return employee;
	}

	@Override
	public List<Employee> sortEmployeeOnSalary() {
		
		List<Employee> list =dao.sortEmployeeOnSalary();
		
		return list;
	}

	@Override
	public String updateEmployee(Employee employee) {

		String msg = dao.updateEmployee(employee);

		return msg;
	}

	@Override
	public String deleteEmployee(int eid) {
		
		String msg = dao.deleteEmployee(eid);
		
		return msg;
	}

}
