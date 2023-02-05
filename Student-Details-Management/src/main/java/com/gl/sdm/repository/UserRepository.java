package com.gl.sdm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.sdm.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User getUserByUsername(String username);
}
