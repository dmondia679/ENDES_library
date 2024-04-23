package com.endes.library;

import java.util.List;
import java.util.Set;

public class BookItem extends Book{


	public BookItem(String isbn, String title, List<Author> autores, String summary, String publisher,
			String publicationDate, Integer nPages, Language language) {
		super(isbn, title, autores, summary, publisher, publicationDate, nPages, language);
		// TODO Auto-generated constructor stub
	}
	private String barcode;
	private Integer id;
	private boolean isReferenceOnly;
		

}
