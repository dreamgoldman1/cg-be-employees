package com.capgemini.employees.controller;

import com.capgemini.employees.bussiness.EmployeeBussiness;
import com.capgemini.employees.data.EmployeeData;
import com.capgemini.employees.model.EmployeeResponse;
import com.capgemini.employees.model.SingleEmployeeResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.RequestPath;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	@Autowired
	private EmployeeBussiness employeeBussiness;

	@GetMapping("/")
	@CrossOrigin(origins = "*")
	public EmployeeResponse index() throws JsonProcessingException {
		return employeeBussiness.getAllEmployees();
	}

	@GetMapping("/{id}")
	@CrossOrigin(origins = "*")
	public SingleEmployeeResponse index(@PathVariable int id) throws JsonProcessingException {
		return employeeBussiness.getEmployeeById(id);
	}

}
