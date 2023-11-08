package com.springbootdatabase.learndatabase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {


	private JDBCCourseRepository repository;
	private JPACourseRepository jpa_repository;
	private CourseSpringDataJPA courseSpringDataJPA;
	
	public CourseJDBCCommandLineRunner(JDBCCourseRepository repository,JPACourseRepository jpa_repository, CourseSpringDataJPA courseSpringDataJPA) {
		this.repository = repository;
		this.jpa_repository = jpa_repository;
		this.courseSpringDataJPA = courseSpringDataJPA;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		repository.insert(new Course(1, "India and Pak", "Paurush Batish"));
//		repository.insert(new Course(2, "India and Pak and china", "Paurush Batish"));
//		repository.insert(new Course(3, "India and Pak and your mum", "Paurush Batish"));
//		
//		System.out.println(
//				
//				repository.select(1)
//				);
		courseSpringDataJPA.save(new Course(1, "India and Pak", "Paurush Batish"));
		courseSpringDataJPA.save(new Course(2, "India and Pak and china", "Paurush Batish"));
		courseSpringDataJPA.save(new Course(3, "India and Pak and your mum", "Paurush Batish"));
		
		System.out.println(
				
				courseSpringDataJPA.findById(1l)
				);
		
		System.out.println(courseSpringDataJPA.findByAuthor("Paurush Batish"));
		System.out.println(courseSpringDataJPA.count());
		System.out.println(courseSpringDataJPA.toString());
		
		
//		jpa_repository.insert(new Course(1, "India and Pak", "Paurush Batish"));
//		jpa_repository.insert(new Course(2, "India and Pak and china", "Paurush Batish"));
//		jpa_repository.insert(new Course(3, "India and Pak and your mum", "Paurush Batish"));
//		
//		System.out.println(
//				
//				jpa_repository.findById(1)
//				);

	}

}
