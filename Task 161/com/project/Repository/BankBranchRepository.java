package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.Model.BankBranch;
@Repository
public interface BankBranchRepository extends CrudRepository<BankBranch, Integer> {

}
