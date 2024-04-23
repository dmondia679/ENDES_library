package com.endes.library;

import java.util.List;
import java.util.Set;

public abstract class Book {
    private String isbn;
    private String title;
    private List<Author> autores;
    private String summary;
    private String publisher;
    private String publicationDate;
    private Integer nPages;
    private Language language;
  
	public Book(String isbn, String title, List<Author> autores, String summary, String publisher,
			String publicationDate, Integer nPages, Language language) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.autores = autores;
		this.summary = summary;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		this.nPages = nPages;
		this.language = language;
		
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	public Integer getnPages() {
		return nPages;
	}
	public void setnPages(Integer nPages) {
		this.nPages = nPages;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
    
    
    
}
