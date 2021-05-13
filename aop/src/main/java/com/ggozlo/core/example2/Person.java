package com.ggozlo.core.example2;

public class Person {
	private String name, tel, email;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String tel, String email) {
		super();
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public void out() {
		System.out.println( "Person [name=" + name + ", tel=" + tel + ", email=" + email + "]");
	}
	
	
	
}
