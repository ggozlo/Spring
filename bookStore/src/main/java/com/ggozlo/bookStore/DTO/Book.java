package com.ggozlo.bookStore.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;



public class Book {
	
	@NotNull
	private String serial;
	
	@NotNull
	private String name;
	
	@NotNull
	private String author;
	
	@Positive
	private int price;
	
	private String image;

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Book(String serial, String name, String author, int price, String image) {
		super();
		this.serial = serial;
		this.name = name;
		this.author = author;
		this.price = price;
		this.image = image;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [serial=" + serial + ", name=" + name + ", author=" + author + ", price=" + price + ", image="
				+ image + "]";
	}
	
	
	
}
