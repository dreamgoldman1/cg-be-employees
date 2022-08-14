package com.capgemini.employees.bussiness;

import com.capgemini.employees.data.EmployeeData;
import com.capgemini.employees.model.Employee;
import com.capgemini.employees.model.EmployeeResponse;
import com.capgemini.employees.model.SingleEmployeeResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeBussiness {
    @Autowired
    private EmployeeData employeeData;
    public EmployeeResponse getAllEmployees () throws JsonProcessingException {
        return employeeData.getAllEmployees();
    }

    public SingleEmployeeResponse getEmployeeById(int id) throws JsonProcessingException {
        return employeeData.getEmployeeById(id);
    }
}
