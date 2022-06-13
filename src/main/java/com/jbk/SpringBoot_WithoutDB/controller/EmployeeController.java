package com.jbk.SpringBoot_WithoutDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.SpringBoot_WithoutDB.entity.Employee;
import com.jbk.SpringBoot_WithoutDB.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {

		String msg = service.saveEmployee(employee);

		return msg;

	}

	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {

		List<Employee> list = service.getAllEmployee();

		return list;

	}

	@GetMapping("/getEmployee/{eid}")
	public Object getEmployee(@PathVariable int eid) {

		Employee employee = service.getEmployee(eid);

		if (employee != null) {
			return employee;
		} else {
			return "Record Not Found...!!!";
		}

	}

	@GetMapping("/getEmployeeByRequestParam")
	public Object getEmployeeByRequestParam(@RequestParam int eid) {

		Employee employee = service.getEmployee(eid);

		if (employee != null) {
			return employee;
		} else {
			return "Record Not Found...!!!";
		}

	}
	
	@GetMapping("/sortEmployeeOnSalary")
	public List<Employee> sortEmployeeOnSalary(){
		List<Employee> list = service.sortEmployeeOnSalary();
		return list;
	}
	
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee employee) {
		
		String msg = service.updateEmployee(employee);
		
		return msg;	
	}
	
	@DeleteMapping("/deleteEmployee/{eid}")
	public String deleteEmployee(@PathVariable int eid) {
		String msg = service.deleteEmployee(eid);
		return msg;
	}
}
