package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Book;
import com.example.demo.service.BookPersistance;

@RestController
@RequestMapping("book")
public class BookController {

	BookPersistance bookPersistance;

	public BookController(BookPersistance bookPersistance) {

		this.bookPersistance = bookPersistance;

	}

	@GetMapping("book")
	public List<Book> getBooks() {

		return this.bookPersistance.findBooks();

	}

	@PostMapping("book")
	public Book saveBook(@RequestBody Book book) {

		return this.bookPersistance.save(book);

	}

}
