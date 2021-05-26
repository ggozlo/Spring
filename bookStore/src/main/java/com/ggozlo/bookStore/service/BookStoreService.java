package com.ggozlo.bookStore.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ggozlo.bookStore.DTO.Book;
import com.ggozlo.bookStore.repository.BookRepository;

@Service
@Transactional
public class BookStoreService {

	private final SqlSession sqlSession;
	@Autowired
	public BookStoreService(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}
	
	@Transactional(readOnly = true)
	public List<Book> findAll()  {
		return  sqlSession.selectList("com.ggozlo.bookStore.repository.BookRepository.findAll");
	}
	
	@Transactional(readOnly = true)
	public Book findOne(String serial) {
		
		return sqlSession.selectOne("com.ggozlo.bookStore.repository.BookRepository.findOne", serial);
	}

	public void modifyOne(Book book) {
		sqlSession.update("com.ggozlo.bookStore.repository.BookRepository.updateBook", book);
	}

	public void deleteOne(String serial) {
		sqlSession.delete("com.ggozlo.bookStore.repository.BookRepository.DeleteOne", serial);
		
	}

	public void save(Book book) {
		sqlSession.getMapper(BookRepository.class).saveBook(book);
	}

}
