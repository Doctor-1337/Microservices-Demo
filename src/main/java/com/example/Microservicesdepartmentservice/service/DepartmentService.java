package com.example.Microservicesdepartmentservice.service;

import com.example.Microservicesdepartmentservice.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department dept);

	Department findDepartmentById(Long deptId);

}
