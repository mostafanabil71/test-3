package net.metapost.springboot_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.metapost.springboot_backend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}