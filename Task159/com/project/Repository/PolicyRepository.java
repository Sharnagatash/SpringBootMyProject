package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Integer> {

}
