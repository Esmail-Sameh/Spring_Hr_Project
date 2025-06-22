package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.models.Department;
import com.hr.services.DepartmentService;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

	@Autowired
	DepartmentService deptService;
	
	@GetMapping("/departments")
	public List<Department> getAllDept(){
		return deptService.getAllDept();
	}
	
	@PostMapping("/departments")
	public String addNewDept(@RequestBody Department dept){
		deptService.addNewDept(dept);
		return "data is added";
	}
	
	@PutMapping("/departments")
	public String updateDept(@RequestBody Department dept){
		deptService.updateDept(dept);
		return "data is updated";
	}
	
}

