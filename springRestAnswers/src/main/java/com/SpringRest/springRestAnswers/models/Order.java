package com.SpringRest.springRestAnswers.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="orders")
public class Order {
	@Id
	public long id;
	String item;
	int quantity;
	public Order(long id, String item, int quantity) {
		super();
		this.id = id;
		this.item = item;
		this.quantity = quantity;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", item=" + item + ", quantity=" + quantity + "]";
	}
	
	
}
