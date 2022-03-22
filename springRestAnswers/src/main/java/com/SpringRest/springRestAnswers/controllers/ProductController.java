package com.SpringRest.springRestAnswers.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.SpringRest.springRestAnswers.models.Product;
import com.SpringRest.springRestAnswers.repositories.ProductRepository;


@RestController
public class ProductController {
	
@Autowired
public ProductRepository productRepository;

@GetMapping("/products")
public ResponseEntity<?> getProducts(){
	return ResponseEntity.ok(this.productRepository.findAll());
}

@GetMapping("/products/{id}")
	public ResponseEntity<?> getDetails(@PathVariable Integer id) {
	return ResponseEntity.ok(this.productRepository.findById(id));
}

@PostMapping("products/add")
public ResponseEntity<?> addProduct(@RequestBody Product prd) {
	Product save=this.productRepository.save(prd);
	return ResponseEntity.ok(save);
}

@PutMapping("products/update")
public ResponseEntity<?> updateProduct(@RequestBody Product prd) {
	Product save=this.productRepository.save(prd);
	return ResponseEntity.ok(save);
}
@DeleteMapping("/products/delete/{productId}")
public void deleteProduct(@PathVariable Integer id){
	  this.productRepository.deleteById(id);
}
}
