package com.project.Repository;
/*
 *task no 138 Design API to delete the user detail from data base  
 * @Author Hitesh.
 */
	import java.io.Serializable;

	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

	import com.project.model.User;

	@Repository
	public interface UserRespository extends CrudRepository<User, Serializable> {

	}


