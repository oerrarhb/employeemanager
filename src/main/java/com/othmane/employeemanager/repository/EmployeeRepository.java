package com.othmane.employeemanager.repository;

import com.othmane.employeemanager.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
