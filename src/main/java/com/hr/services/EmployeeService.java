package com.hr.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hr.models.EmployeeModel;
import com.hr.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;
	
	public List<EmployeeModel> getAllData(){
		return employeeRepo.findAll();
	}
	
	public List<EmployeeModel> getEmpByFirstName(String firstName){
		return employeeRepo.findByFirstName(firstName);
	}
	
	public List<EmployeeModel> empSeaech(String firstName){
		return employeeRepo.empSearch(firstName);
	}
	
	public EmployeeModel addEmp(EmployeeModel newEmp) {
		return employeeRepo.save(newEmp);
	}
	
	public EmployeeModel updateEmp(EmployeeModel newEmp) {
		return employeeRepo.save(newEmp);
	}
	
	public void deleteEmp(Long id){
		employeeRepo.deleteById(id);
	}

	
}
