package com.SpringRest.springRestAnswers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.springRestAnswers.models.Customer;
import com.SpringRest.springRestAnswers.services.CustomerService;

@RestController
public class CustomerController {

@Autowired	
private CustomerService customerService;	
	
@GetMapping("/customer")	
public List<Customer> getCustomers(){
	return this.customerService.getCustomers();
}

@GetMapping("/customer/{id}")
public Customer find(@PathVariable String id ) {
	return this.customerService.find(Integer.parseInt(id));
}

@PostMapping("/customer/add")
public Customer add(@RequestBody Customer customer) {
	return this.customerService.add(customer);
}

@PutMapping("/customer/update")
public Customer updateCustomer(@RequestBody Customer customer) {
        return this.customerService.updateCustomer(customer);
}

@DeleteMapping("/customer/{id}")
public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String id) {
        try {
                this.customerService.deleteCustomer(Integer.parseInt(id));
                return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
}


}
