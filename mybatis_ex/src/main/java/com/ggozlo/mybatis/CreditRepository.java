package com.ggozlo.mybatis;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository {
	
	public ArrayList<Credit> creditList();
	
	public void deleteOne(String name); 
	
	public void addCredit(Credit credit);

}
