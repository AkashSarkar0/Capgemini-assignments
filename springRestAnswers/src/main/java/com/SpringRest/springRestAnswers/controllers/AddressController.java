package com.SpringRest.springRestAnswers.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.springRestAnswers.models.address;


@RestController
public class AddressController {
	
@RequestMapping(value ="/712103",method=RequestMethod.GET)
public List<address> getDetails(){
	List<address> addr=new ArrayList<>();
	address a1=new address();
	a1.setCountry("India");
	a1.setState("WEst Bengal");
	a1.setCity("Bandel");
	
	addr.add(a1);
	return addr;
}
}
