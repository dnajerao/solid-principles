package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Book;
import com.example.demo.service.BookPersistance;
import com.example.demo.service.EmailSender;

@Service
public class InMemoryBookRepository implements BookPersistance {

	private List<Book> books;

	private EmailSender emailService;

	public InMemoryBookRepository(EmailSender emailService) {

		this.books = new ArrayList<>();
		books.add(new Book(1, "Cien años de soledad", "Gabriel García Márquez", "978-84-376-0494-7", 249.00));
		books.add(new Book(2, "Don Quijote de la Mancha", "Miguel de Cervantes", "978-84-376-0493-0", 199.00));
		books.add(new Book(3, "La sombra del viento", "Carlos Ruiz Zafón", "978-84-204-6728-3", 329.00));
		books.add(new Book(4, "El amor en los tiempos del cólera", "Gabriel García Márquez", "978-84-204-8355-9",
				239.00));
		books.add(new Book(5, "Rayuela", "Julio Cortázar", "978-84-376-0495-4", 179.00));

		this.emailService = emailService;

	}

	public List<Book> getBooks() {

		return this.books;

	}

	@Override
	public List<Book> findBooks() {

		return this.books;

	}

	@Override
	public Book save(Book book) {
		if (book.getId() == null || book.getId() == 0)
			book.setId(this.books.size() + 1);

		this.books.add(book);

		this.emailService.send(book, null);

		return book;
	}

}
