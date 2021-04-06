package com.adrianocv.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianocv.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
