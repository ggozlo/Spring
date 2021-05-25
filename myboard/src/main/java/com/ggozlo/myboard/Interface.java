package com.ggozlo.myboard;

import java.util.ArrayList;

public interface Interface {
	public ArrayList<DTO> list();
	
	
	public void write(String name, String content);
	
	public void delete( int num);
}
