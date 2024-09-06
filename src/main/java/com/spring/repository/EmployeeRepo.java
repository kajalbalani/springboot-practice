package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.EmployeeDAO;

public interface  EmployeeRepo extends JpaRepository<EmployeeDAO, Long> {

}
