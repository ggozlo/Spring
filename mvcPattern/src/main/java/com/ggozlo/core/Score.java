package com.ggozlo.core;

public class Score {
	private String name;
	private int num, kor, eng, mat;
	
	
	
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Score(String name, int num, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.num = num;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	
	
}
