package com.devsuperior.aularr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aularr.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
