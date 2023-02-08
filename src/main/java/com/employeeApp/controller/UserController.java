package com.employeeApp.controller;

import com.employeeApp.entity.Employee;
import com.employeeApp.entity.User;
import com.employeeApp.service.EmployeeService;
import com.employeeApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private EmployeeService service;

    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }


    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }


    @GetMapping({"/forAdmin"})
    @PreAuthorize("hasRole('Admin')")
    public String forAdmin(){
        return "This is only accessible to the admin";
    }


    @GetMapping({"/forUser"})
    @PreAuthorize("hasRole('User')")
    public String forUser(){
        return "This is only accessible to the user";
    }


    @PostMapping("/employee")
    @PreAuthorize("hasRole('Admin')")
    public String saveEmployee(@RequestBody Employee employee){
        service.addEmployee(employee);
        return "Employee Record added. ";

    }


    @GetMapping("/employee")
    public List<Employee> getAllEmployeeDetails(){

        return service.getAllEmployees();
    }


    @GetMapping("/employee/{employee_id}")
    public Employee getEmployeeDetailById(@PathVariable("employee_id")  Integer employee_id, @RequestBody Employee employee){

        return service.getEmployeeById(employee_id);

    }

    @PutMapping("/employee/{employee_id}")
    @PreAuthorize("hasRole('Admin')")
    public String updateEmployee(@PathVariable("employee_id") Integer employee_id, @RequestBody Employee employee){

        Employee e = service.getEmployeeById(employee_id);
        e.setEmployee_name(employee.getEmployee_name());
        e.setEmployee_designation(employee.getEmployee_designation());
        e.setEmployee_salary(employee.getEmployee_salary());
        String id = service.addEmployee(e);
        service.updateEmployeeById(employee_id);
        return "Employee Record Updated." + service.getEmployeeById(employee_id);



    }
    @DeleteMapping("/employee/{employee_id}")
    @PreAuthorize("hasRole('Admin')")
    public String deleteEmployee(@PathVariable("employee_id") Integer employee_id, @RequestBody Employee employee){

        service.deleteEmployeeById(employee_id);

        return "Employee record deleted for id - "+employee_id;

    }


}
