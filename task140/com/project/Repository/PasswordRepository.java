package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Password;

public interface PasswordRepository extends JpaRepository<Password, Integer> {

}
