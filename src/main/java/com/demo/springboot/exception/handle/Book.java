package com.demo.springboot.exception.handle;



public class Book {
	
	
	private int id;
	private String name;
	private long price;
	
	
	Book(){
		super();
	}
	
	
	public Book(int id, String name, long price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	

}
