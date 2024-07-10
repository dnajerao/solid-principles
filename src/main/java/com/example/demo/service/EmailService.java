package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.Book;

@Service
public class EmailService implements EmailSender {

	@Override
	public void send(Book book, String email) {

		// enviar correo por SMTP

	}

}
