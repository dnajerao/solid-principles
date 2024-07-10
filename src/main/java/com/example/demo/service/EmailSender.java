package com.example.demo.service;

import com.example.demo.Book;

public interface EmailSender {

	default void send(Book book, String email) {

		System.out.println("Enviar correo a " + email);

	}

}
