package com.SpringRest.springRestAnswers.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.SpringRest.springRestAnswers.models.Customer;

@Service
public class CustomerService {

	List<Customer> custList;
	public CustomerService(){
	custList= new ArrayList<>();	
	custList.add(new Customer(1,"Akash",123456789));
	custList.add(new Customer(2,"Aritra",789456130));
	custList.add(new Customer(3,"Afan",1234567890));
	}
	
	public List<Customer> getCustomers() {
		return custList;
	}

	public Customer find(int id) {
		 Customer c=null;
		 for(Customer customer:custList) {
			 if(customer.getId()==id) {
				 c=customer;
				 break;
			 }
		 }
		 return c;
	}

	public Customer add(Customer customer) {
		custList.add(customer);
		return customer;
	}

	public Customer updateCustomer(Customer customer) {
		  for(Customer c:custList) {
              if(c.getId()==customer.getId()) {
                      c.setName(customer.getName());
                      c.setContactNo(customer.getContactNo());
              }
      }
      return customer;
      }

	public void deleteCustomer(int parseInt) {
		   custList=this.custList.stream().filter(c->c.getId()!=parseInt).collect(Collectors.toList());
	}
}
