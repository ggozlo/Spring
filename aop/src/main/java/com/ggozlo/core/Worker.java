package com.ggozlo.core;

public class Worker {
	private String name;
	private int age;
	private String job;
	
	
	
	public Worker(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}
	public Worker() {
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public void out() {
		System.out.println("Worker [name=" + name + ", age=" + age + ", job=" + job + "]");
	}
	
	
	
}
