 package com.project.Repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Premium;

public interface PremiumRepository extends CrudRepository<Premium, Serializable>{

}
