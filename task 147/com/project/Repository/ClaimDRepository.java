package com.project.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.ClaimD;
@Repository
public interface ClaimDRepository extends JpaRepository<ClaimD,Serializable>{
public ClaimD findById(Integer id);
}
;