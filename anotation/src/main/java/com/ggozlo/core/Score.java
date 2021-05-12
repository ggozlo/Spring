package com.ggozlo.core;

public class Score {
	private String name;
	private int kor, eng, mat;
	
	
	
	public Score(String name) {
		super();
		this.name = name;
	}
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Score(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int getTotal() {
		return kor+eng+mat;
	}
	
	public Double getAvg() {
		return (getTotal() / 3.) ;
	}
	
	
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", getTotal()=" + getTotal()
				+ ", getAvg()=" + getAvg() + "]";
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
	
	

}
