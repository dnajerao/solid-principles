package com.example.demo;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Invoice {

	private Integer id;

	private List<Book> books;

	private Double total;

	public Double calculateTotal() {

		Double total = 0d;

		for (Book book : this.books) {
			total += book.getPrice();
		}

		return total;

	}

	public void sendInvoice() {

		// TODO: sent invoice logic

	}

}
