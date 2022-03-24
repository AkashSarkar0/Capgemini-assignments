package com.SpringRest.springRestAnswers.controllers;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.springRestAnswers.models.Employee;
import com.SpringRest.springRestAnswers.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
public class EmployeeController {
	
@Autowired
public EmployeeRepository employeeRepository;


@GetMapping("/employee")
public ResponseEntity<?> getEmployee(){
return ResponseEntity.ok(this.employeeRepository.findAll());

}

 @GetMapping("/employee/{id}")
 public ResponseEntity<?> getDetails(@PathVariable Long id) {
	 return ResponseEntity.ok(this.employeeRepository.findById(id));
 }


@PostMapping("/employee/add")
public ResponseEntity<?> addEmployee(@RequestBody Employee emp) {
	Employee e=this.employeeRepository.save(emp);
	return ResponseEntity.ok(e);
}

@PutMapping("/employee/update")
public ResponseEntity<?> updateEmployee(@RequestBody Employee emp) {
	Employee save=this.employeeRepository.save(emp);
	return ResponseEntity.ok(save);
}


  @DeleteMapping("/employee/{id}") 
  public void deleteEmployee(@PathVariable Long id){
	  this.employeeRepository.deleteById(id);
  }

}
