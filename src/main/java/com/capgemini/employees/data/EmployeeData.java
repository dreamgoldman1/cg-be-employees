package com.capgemini.employees.data;

import com.capgemini.employees.model.EmployeeResponse;
import com.capgemini.employees.model.SingleEmployeeResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EmployeeData {
    @Autowired
    RestTemplate restTemplate;
    public EmployeeResponse getAllEmployees() throws JsonProcessingException {
        EmployeeResponse employeeResponse = restTemplate.getForObject("http://dummy.restapiexample.com/api/v1/employees", EmployeeResponse.class);
        return employeeResponse;
    }

    public SingleEmployeeResponse getEmployeeById(int id) throws JsonProcessingException {
        SingleEmployeeResponse singleEmployeeResponse = restTemplate.getForObject("http://dummy.restapiexample.com/api/v1/employee/" + id, SingleEmployeeResponse.class);
        return singleEmployeeResponse;
    }
}
