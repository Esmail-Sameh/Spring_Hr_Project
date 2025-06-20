package com.hr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hr.models.EmployeeModel;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeModel, Long> {

}
