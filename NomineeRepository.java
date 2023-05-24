package com.project.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Nominee;

@Repository
public interface NomineeRepository extends CrudRepository<Nominee, Serializable> {

}
