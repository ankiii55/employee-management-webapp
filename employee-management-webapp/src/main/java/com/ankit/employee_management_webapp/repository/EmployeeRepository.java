package com.ankit.employee_management_webapp.repository;

import com.ankit.employee_management_webapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
