package com.tka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;
@Service
public class StudentService {

	@Autowired
	StudentDao dao;
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.saveStudent(student);
	}
	public List<Student> saveAll(List<Student> list) {
		// TODO Auto-generated method stub
		return dao.saveAll(list);
	}
	public String deleteByID(int id) {
		// TODO Auto-generated method stub
		return dao.deleteByID(id);
	}
	public String update(Student student,int id) {
		// TODO Auto-generated method stub
		return dao.update(student, id);
	}
	public List<Student> findall() {
		// TODO Auto-generated method stub
		return dao.findall();
	}
	public Optional<Student> findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}
	public List<Student> findByname(String name) {
		// TODO Auto-generated method stub
		return dao.findByname(name);
	}
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return dao.findByEmail(email);
	}
	public Student findByPhone(long phone) {
		// TODO Auto-generated method stub
		return dao.findByPhone(phone);
	}
	public List<Student> findByMarks(int marks) {
		// TODO Auto-generated method stub
		return dao.findByMarks(marks);
	}
	public String updateByName(String name, int id) {
		// TODO Auto-generated method stub
		return dao.updateByName(name,id);
	}
	public String updateByEmail(String email, int id) {
		// TODO Auto-generated method stub
		return dao.updateByEmail(email,id);
	}
	
 
}
