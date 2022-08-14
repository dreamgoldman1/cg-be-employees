package com.capgemini.employees.model;

import java.io.Serializable;
import java.util.List;

public class SingleEmployeeResponse implements Serializable {
    private String status;
    private Employee data;

    public Employee getData() {
        return data;
    }

    public void setData(Employee data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
