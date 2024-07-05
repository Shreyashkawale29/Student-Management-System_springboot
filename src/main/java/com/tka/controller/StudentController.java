package com.tka.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.tka.entity.Student;
import com.tka.service.StudentService;

import jakarta.validation.constraints.AssertFalse.List;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service; 
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		
		return service.saveStudent(student);
	}
	
	@PostMapping("/save/all")
	public java.util.List<Student> saveAll(@RequestBody java.util.List<Student> list) {
		
		return service.saveAll(list);
		
	}
	
	@DeleteMapping("/delete")
	public String deleteByID(@RequestParam int id) {
		
		
		return service.deleteByID(id);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Student student,@RequestParam int id) {
		return service.update(student, id);
	}
	
	@GetMapping("/find/all")
	public java.util.List<Student> findAll() {
		return service.findall();
	}
	
	@GetMapping("/find/id")
	public Optional<Student> findById(@RequestParam int id) {
		return service.findById(id);
		
	}
	
	@GetMapping("/find/name")
	public java.util.List<Student> findByname(@RequestParam String name) {
		return service.findByname(name);
		
	}
	
	@GetMapping("/find/email")
	public Student findByEmail(@RequestParam String email) {
		return service.findByEmail(email);
		
	}
	
	@GetMapping("/find/phone")
	public Student findByPhone(@RequestParam long phone) {
		return service.findByPhone(phone);
		
	}
	
	@GetMapping("/find/mark")
	public java.util.List<Student> findByMarks(@RequestParam int marks) {
		return service.findByMarks(marks);
		
	}
	
	@PatchMapping("/update/name")
	public String updateByName(@RequestParam String name,@RequestParam int id) {
		return service.updateByName(name,id);
		
	}
	
	@PatchMapping("/update/email")
	public String updateByEmail(@RequestParam String email,@RequestParam int id) {
		return service.updateByEmail(email,id);
		
	}

}
