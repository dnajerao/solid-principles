package com.example.demo.service;

import java.util.List;

import com.example.demo.Book;

public interface BookPersistance {

	List<Book> findBooks();

	Book save(Book book);

}
