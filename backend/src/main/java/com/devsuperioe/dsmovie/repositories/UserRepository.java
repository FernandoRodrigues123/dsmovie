package com.devsuperioe.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperioe.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
