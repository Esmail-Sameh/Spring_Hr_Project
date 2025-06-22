package com.hr.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.hr.models.Department;
import com.hr.repo.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository deptRepo;
	
	public List<Department> getAllDept(){
		return deptRepo.findAll();
	}
	
	public void addNewDept(@RequestBody Department dept) {
		deptRepo.save(dept);
	}
	
	public void updateDept(@RequestBody Department dept) {
		deptRepo.save(dept);
	}
	
}
