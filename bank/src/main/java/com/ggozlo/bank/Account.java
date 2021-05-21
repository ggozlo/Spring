package com.ggozlo.bank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class Account {
	@NotNull
	private String name;
	@Positive
	private int money;
	public Account(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
}
