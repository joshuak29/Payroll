package com.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

// we create an interface of stroring employees. Specify the domian type as "Employee" and id type as "Long"
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
