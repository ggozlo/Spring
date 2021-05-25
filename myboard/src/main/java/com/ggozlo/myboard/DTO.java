package com.ggozlo.myboard;

public class DTO {
	private int num;
	private String name;
	private String content;
	
	public DTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DTO(int num, String name, String content) {
		super();
		this.num = num;
		this.name = name;
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}
