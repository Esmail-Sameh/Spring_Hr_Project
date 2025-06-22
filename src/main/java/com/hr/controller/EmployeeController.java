package com.hr.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hr.models.EmployeeModel;
import com.hr.repo.EmployeeRepo;
import com.hr.services.EmployeeService;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

    private final EmployeeRepo employeeRepo;
	
	@Autowired
	EmployeeService employeeService;

    EmployeeController(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
	
	@GetMapping("/getAllData")
	public List<EmployeeModel> getAllData(){
		try {
			System.out.print("try");
			return employeeService.getAllData();
		}catch (Exception e) {
			System.out.print(e.toString());
		}
		return employeeService.getAllData();
	}
	
	@GetMapping("/findByFirstName")
	public List<EmployeeModel> getEmpByFirstName(@RequestParam String firstName){
		return employeeService.getEmpByFirstName(firstName);
	}
	
}
