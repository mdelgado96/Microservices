package com.dmarvin96.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.dmarvin96.department.entity.Department;
import com.dmarvin96.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}
	
	public Department findDepartmentById(Long departmentId) {
		log.info("Inside saveDepartment method of DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}
	
}
