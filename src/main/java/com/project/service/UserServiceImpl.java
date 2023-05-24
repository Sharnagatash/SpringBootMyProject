package com.project.service;
/*
 *task no 138 Design API to delete the user detail from data base  
 * @Author Hitesh.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.UserRespository;
@Service
public class UserServiceImpl implements UserService {

		// inject the repository reference
		@Autowired
		private UserRespository userRespository;

		@Override
		public void deleteById(Integer id) { 
			userRespository.deleteById(id);
		}

	}

