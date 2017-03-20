package com.org.jpa.dao;

import java.util.List;
import com.org.jpa.entity.DepartmentEntity;

public interface DepartmentDAO {
    List<DepartmentEntity> getAllDepartments();

    DepartmentEntity getDepartmentById(Integer id);

    boolean addDepartment(DepartmentEntity dept);

    boolean removeDepartment(DepartmentEntity dept);

    boolean removeAllDepartments();
}
