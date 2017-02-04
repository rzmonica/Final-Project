package com.softtek.academy.service;

import java.util.List;

import com.softtek.academy.domain.BookEntity;

public interface BookService {
	
	/**
	 *Method to get the list of books
	 */
	public List<BookEntity> list(); 

	public boolean createBook(String code, String name, String editorial, String author, String gender,
			Integer year, String status); 
	
	public void delete(BookEntity book);
}

