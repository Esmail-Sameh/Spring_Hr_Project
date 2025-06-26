package com.hr.controller;

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
import com.hr.models.EmployeeModel;
import com.hr.services.EmployeeService;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getAllData")
	public List<EmployeeModel> getAllData(){
			return employeeService.getAllData();
	}
	
	@GetMapping("/findByFirstName")
	public List<EmployeeModel> getEmpByFirstName(@RequestParam String firstName){
		return employeeService.getEmpByFirstName(firstName);
	}
	
	@GetMapping("/empSearch")
	public List<EmployeeModel> empSearch(@RequestParam   String firstName){
		return employeeService.empSeaech(firstName);
	}
	
	@PostMapping("/addNewEmp")
	public EmployeeModel addEmp(@RequestBody EmployeeModel newEmp){
		EmployeeModel model = employeeService.addEmp(newEmp);
		return model;
	}
	
	@PutMapping("/updateEmp")
	public EmployeeModel updateEmp(@RequestBody EmployeeModel newEmp){
		EmployeeModel model = employeeService.addEmp(newEmp);
		return model;
	}
	
	@DeleteMapping("/deleteEmp")
	public String deleteEmp(@RequestParam Long id) {
		employeeService.deleteEmp(id);
		return "Employee is Deleted";
	}
	
	@GetMapping("/department/{deptId}/employee")
	public List<EmployeeModel> getEmpById(@PathVariable Long deptId){
		return employeeService.getEmpById(deptId);
	}
	
	
}
