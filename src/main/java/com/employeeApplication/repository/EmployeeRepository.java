package com.employeeApplication.repository;

import com.employeeApplication.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    @Query(value = "select * from employee_table e where e.employee_name like %:keyword% or e.employee_designation like %:keyword%", nativeQuery = true)
    List<Employee> findByKeyword(@Param("keyword") String keyword);


    @Override
    List<Employee> findAll();
}
