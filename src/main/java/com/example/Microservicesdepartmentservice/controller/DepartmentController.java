package com.example.Microservicesdepartmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Microservicesdepartmentservice.entity.Department;
import com.example.Microservicesdepartmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	DepartmentService deptService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department dept) {
		
		log.info("Inside saveDept of DepartmentController");
		return deptService.saveDepartment(dept);
		
	} 
	
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long deptId) {
		
		log.info("Inside findDeptById in Controller");
		return deptService.findDepartmentById(deptId);
		
	}
	
	
	
	

}
