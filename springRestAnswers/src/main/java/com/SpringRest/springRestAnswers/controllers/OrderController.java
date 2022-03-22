package com.SpringRest.springRestAnswers.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.springRestAnswers.models.Order;
import com.SpringRest.springRestAnswers.repositories.OrderRepository;



import org.springframework.http.ResponseEntity;

@RestController
public class OrderController {
	
@Autowired
public OrderRepository orderRepository;


@GetMapping("/orders")
public ResponseEntity<?> getOrders(){
return ResponseEntity.ok(this.orderRepository.findAll());
}

@GetMapping("/orders/{id}")
public ResponseEntity<?> getDetails(@PathVariable Long id) {
	 return ResponseEntity.ok(this.orderRepository.findById(id));

}

@PostMapping("/orders/add")
public ResponseEntity<?> addOrder(@RequestBody Order ord) {
	Order save=this.orderRepository.save(ord);
	return ResponseEntity.ok(save);

}

@PutMapping("/orders/update")
public ResponseEntity<?> updateOrder(@RequestBody Order ord) {
	Order save=this.orderRepository.save(ord);
	return ResponseEntity.ok(save);
}

@DeleteMapping("/orders/{orderId}")
public void deleteOrder(@PathVariable Long id){
	  this.orderRepository.deleteById(id);


}
}
