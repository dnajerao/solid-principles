package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Invoice;

@RestController
@RequestMapping("invoice")
public class InvoiceController {

	private List<Invoice> invoices;

	public InvoiceController() {

		this.invoices = new ArrayList<>();

	}

	@PostMapping("invoice")
	public Invoice makeInvoice(Invoice invoice) {

		if (invoice.getId() == null || invoice.getId() == 0)
			invoice.setId(this.invoices.size() + 1);

		this.invoices.add(invoice);

		invoice.sendInvoice();

		return invoice;

	}

}
