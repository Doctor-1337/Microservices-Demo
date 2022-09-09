package com.example.Microservicesdepartmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Microservicesdepartmentservice.entity.Department;

 @Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

}
