package com.ankit.employee_management_webapp.repository;


import com.ankit.employee_management_webapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}