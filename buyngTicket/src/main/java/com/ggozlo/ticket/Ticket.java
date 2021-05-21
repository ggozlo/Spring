package com.ggozlo.ticket;

public class Ticket {
	private String name;
	private int num;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	
}
