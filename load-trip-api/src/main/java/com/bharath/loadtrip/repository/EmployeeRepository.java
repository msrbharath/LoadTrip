package com.bharath.loadtrip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bharath.loadtrip.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
