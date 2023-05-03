package com.alok.springboot.tutorial.service;

import com.alok.springboot.tutorial.entity.Department;
import com.alok.springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Optional<Department> fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
