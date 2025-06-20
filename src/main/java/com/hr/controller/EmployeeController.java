package com.hr.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hr.models.EmployeeModel;
import com.hr.services.EmployeeService;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getAllData")
	public List<EmployeeModel> getAllDataa(){
		return employeeService.getAllData();
	}
	
}
