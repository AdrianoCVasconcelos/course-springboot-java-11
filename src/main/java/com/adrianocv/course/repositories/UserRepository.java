package com.adrianocv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianocv.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
