package com.employeeApplication.service;

import com.employeeApplication.Entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getByKeyword(String keyword);
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);

    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
