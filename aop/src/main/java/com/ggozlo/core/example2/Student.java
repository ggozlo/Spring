package com.ggozlo.core.example2;

public class Student {
	private String name;
	private int kor,eng,mat;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public void out() {
		System.out.println( "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]");
	}
	
	
}
