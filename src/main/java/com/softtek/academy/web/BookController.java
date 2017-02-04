package com.softtek.academy.web;

import java.awt.print.Book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import com.softtek.academy.domain.BookEntity;
import com.softtek.academy.service.BookService;
import com.softtek.academy.service.BookServiceImpl;

@RequestMapping(value = "/book")
@Controller
public class BookController {

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	BookServiceImpl bookService;

	@RequestMapping(value = "/list")
	public String ListView() {
		return "BookList";
	}

	@RequestMapping(value = "/bookList", method=RequestMethod.GET)
	public ResponseEntity<?> List() {
		List<BookEntity> books = bookService.list();
		if (books.isEmpty()) {

			return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<BookEntity>>(books, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value = "/create")
	public  String CreateView(){
		return "CreateBook"; 
	}
	
	@RequestMapping(value = "/createBook", method=RequestMethod.POST)
	public String CreateBook(@RequestBody BookEntity book){
	    bookService.createBook(book.getBookDetails().getCode(), book.getBookDetails().getName(), book.getBookDetails().getEditorial(), book.getBookDetails().getAuthor(), book.getBookDetails().getGender(), book.getBookDetails().getYear(), book.getBookDetails().getStatus()); 
	return "BookList"; 
	}
}
