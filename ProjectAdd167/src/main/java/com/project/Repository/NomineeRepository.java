package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Nominee;
@Repository
public interface NomineeRepository extends JpaRepository<Nominee, Integer> {

}
