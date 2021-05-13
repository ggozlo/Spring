package com.ggozlo.core;

public class Student {
	private	 String name;
	private int age;
	private String tel;
	
	
	
	
	public Student(String name, int age, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public void out() {
		System.out.println("Student [name=" + name + ", age=" + age + ", tel=" + tel + "]");
	}
	
	

}
