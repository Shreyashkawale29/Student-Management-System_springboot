package com.tka.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Student;
import com.tka.repo.StudentRepo;
@Repository
public class StudentDao {

	@Autowired
	StudentRepo repo;
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}
	public List<Student> saveAll(List<Student> list) {
		// TODO Auto-generated method stub
		return repo.saveAll(list);
	}
	public String deleteByID(int id) {
		// TODO Auto-generated method stub
		 Student student =repo.findById(id).get();
		 if(student!=null) {
			 repo.deleteById(id);
			 return "Student deleted Successfully...";
		 }
		return "Student Not Found with ID";
	}
	public String update(Student student, int id) {
		// TODO Auto-generated method stub
		Student mystudent =repo.findById(id).get();
		if(mystudent!=null) {
			student.setId(id);
			 repo.save(student);
			 return "Student Update Successfully...";
		  }else
		return "Student Not Found with ID";
		
	}
	public List<Student> findall() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}
	public Optional<Student> findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}
	public List<Student> findByname(String name) {
		// TODO Auto-generated method stub
		return repo.findByname(name);
	}
	
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
	}
	public Student findByPhone(long phone) {
		// TODO Auto-generated method stub
		return repo.findByPhone(phone);
	}
	public List<Student> findByMarks(int marks) {
		// TODO Auto-generated method stub
		return repo.findByMarks(marks);
	}
	public String updateByName(String name, int id) {
		// TODO Auto-generated method stub
		Student student =repo.findById(id).get();
		
		if(student!=null) {
			 student.setName(name);
			 repo.save(student);
			 return "Update Name Successfully... ";
		}else
		{
			return "student not found by id"+id;
	}}
	public String updateByEmail(String email, int id) {
		
		Student student=repo.findById(id).get();
		
		if(student!=null) {
			student.setEmail(email);
			repo.save(student);
			return "Update Email Successfully... ";
		}
		return "student not found by id"+id;
	}

}
