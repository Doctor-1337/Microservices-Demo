package com.example.Microservicesdepartmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Microservicesdepartmentservice.entity.Department;
import com.example.Microservicesdepartmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentRepository deptRepository;

	@Override
	public Department saveDepartment(Department dept) {
		
		log.info("Inside service");
		return deptRepository.save(dept);
		
	}

	
	@Override
	public Department findDepartmentById(Long deptId) {
		
		return deptRepository.findById(deptId).get();
		
	}

}
