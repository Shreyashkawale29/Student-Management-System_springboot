package com.tka.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tka.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	List<Student> findByname(String name);
	Student findByEmail(String email);
	Student findByPhone(long phone);
	
	List<Student> findByMarks(int marks);
	
	@Query("select e from Student e where e.id=?1 and e.name=?2")
	String updateByName(String name, int id);
	
	String save(String name);
	
	

	

}
