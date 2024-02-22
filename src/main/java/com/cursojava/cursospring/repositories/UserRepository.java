package com.cursojava.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.cursospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
