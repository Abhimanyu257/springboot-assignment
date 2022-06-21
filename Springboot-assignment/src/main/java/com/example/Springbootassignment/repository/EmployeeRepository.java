package com.example.Springbootassignment.repository;

import com.example.Springbootassignment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {

    public boolean existsByEmail(String email);
    public List<Employee> findByEmail(String email);

    public void deleteByEmail(String email);
}
