package com.springbootdatabase.learndatabase;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJPA extends JpaRepository<Course,Long>{
	List<Course> findByName(String name);
	List<Course> findByAuthor(String name);
}
