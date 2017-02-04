package com.softtek.academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.domain.BookEntity;
import com.softtek.academy.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public List<BookEntity> list() {
		return bookRepository.findAll();
	}

	@Override
	public boolean createBook(String code, String name, String editorial, String author, String gender,
			Integer year, String status) {
		if(this.validationBook(code, name, editorial, author, gender, year, status)){
			bookRepository.createBook(code, name, editorial, author, gender, year, status);
		}
		return true;
	}
	
	public boolean validationBook(String code, String name, String editorial, String author, String gender, Integer year, String status){
		if (code == null || code.isEmpty()){
			return false; 
		} if (name == null || name.isEmpty()){
			return false; 
		} if (editorial == null || editorial.isEmpty()){
			return false; 
		} if (author == null || author.isEmpty()){
			return false; 
		} if (year == null|| year == 0){
			return false;
		}if (status == null || status.isEmpty()){
			return false; 
		} else
	return true;
	}

	@Override
	public void delete(BookEntity book) {
	}

}
