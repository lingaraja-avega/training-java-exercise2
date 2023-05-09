package com.avega.training.books;

import java.util.List;

public interface BookService {
	
	public List<String> getBooksByAuthorName(String authorName);
	
	public List<String> getBooksByPublisher(String publisherName);
	
	public List<String> getBooksByPublishedYear(int year);
	
	public List<String> getBooksByPages(int pages);
	
	public List<String> getBooksByBookName(String bookName);
	
	public List<String> getBooksByPrice(double price, String operation);
	

}
