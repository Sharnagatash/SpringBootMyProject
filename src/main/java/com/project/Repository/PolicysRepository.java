package com.project.Repository;
/*
 *task no 161 Design API to add branch detail into system  
 * @Author Hitesh.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Policys;

@Repository
public interface PolicysRepository extends JpaRepository<Policys, Integer> {

}
