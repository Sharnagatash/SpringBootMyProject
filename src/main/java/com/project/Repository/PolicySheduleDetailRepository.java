package com.project.Repository;
/*
 *task no 160 Design the resful web service  for policy schedule detail operation  
 * @Author Hitesh.
 */
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.PolicySheduleDetail;

@Repository
public interface PolicySheduleDetailRepository extends JpaRepository<PolicySheduleDetail, Serializable> {
public PolicySheduleDetail findByName(String Name  );

}
