package com.biswaraj.SpringSecEx.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biswaraj.SpringSecEx.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{
	
	Users findByUsername(String username);

}
