package com.org.jpa.dao;

import java.util.List;
import com.org.jpa.entity.EmployeeEntity;

public interface EmployeeDAO {
    List<EmployeeEntity> getAllEmployees();

    List<EmployeeEntity> getAllEmployeesByDeptId(Integer id);

    EmployeeEntity getEmployeeById(Integer id);

    boolean addEmployee(EmployeeEntity employee);

    boolean removeEmployee(EmployeeEntity employee);

    boolean removeAllEmployees();
}