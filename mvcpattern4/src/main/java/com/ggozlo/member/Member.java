package com.ggozlo.member;

public class Member {
	private String name, tel, email;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String tel, String email) {
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
	
	

}
