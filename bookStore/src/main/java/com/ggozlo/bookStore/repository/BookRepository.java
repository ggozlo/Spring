package com.ggozlo.bookStore.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.ggozlo.bookStore.DTO.Book;

@Repository
public interface BookRepository {
	
	public ArrayList<Book> findAll();
	
	public Book findOne(String serial);
	
	public void updateBook(Book book);
	
	public void DeleteOne(String serial);
	
	public void saveBook(Book book);

}
