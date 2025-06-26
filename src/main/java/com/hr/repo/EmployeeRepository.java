package com.hr.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.hr.models.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {

	public List<EmployeeModel> findByFirstName(String firstName);
	
	@Query("select emp from EmployeeModel emp where emp.firstName = :firstNameBind")
	public List<EmployeeModel> empSearch(@Param("firstNameBind") String firstName);
	
	public List<EmployeeModel> findByDepartmentId(Long id);
	
}
	