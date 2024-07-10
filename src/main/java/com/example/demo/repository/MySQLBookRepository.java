package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Book;
import com.example.demo.service.BookPersistance;

@Service
public class MySQLBookRepository implements BookPersistance {

	@Override
	public List<Book> findBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
