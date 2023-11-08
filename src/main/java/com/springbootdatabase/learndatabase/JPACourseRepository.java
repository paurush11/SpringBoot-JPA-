package com.springbootdatabase.learndatabase;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class JPACourseRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	public void delete(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}

}
