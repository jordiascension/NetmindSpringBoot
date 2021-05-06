package com.netmind.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netmind.demo.model.Employee;

public interface UserRepository extends JpaRepository<Employee, Integer> {

}
