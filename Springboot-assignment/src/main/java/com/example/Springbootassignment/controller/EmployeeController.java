package com.example.Springbootassignment.controller;


import com.example.Springbootassignment.model.EmployeeModel;
import com.example.Springbootassignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(){
        return "The application is up...";
    }

    @RequestMapping(value = "addEmployee", method = RequestMethod.POST)
    public String createEmployee(@RequestBody EmployeeModel employeeModel){
        return employeeService.addEmployee(employeeModel);
    }

    @RequestMapping(value = "readEmployee", method = RequestMethod.GET)
    public List<EmployeeModel> readEmployee(){
        return employeeService.readEmployee();
    }

    @RequestMapping(value = "updateEmployee", method = RequestMethod.PUT)
    public String updateStudent(@RequestBody EmployeeModel employeeModel){
        return employeeService.updateEmployee(employeeModel);
    }

    @RequestMapping(value = "deleteEmployee", method = RequestMethod.DELETE)
    public String deleteStudent(@RequestBody EmployeeModel employeeModel){
        return employeeService.deleteEmployee(employeeModel);
    }

}
