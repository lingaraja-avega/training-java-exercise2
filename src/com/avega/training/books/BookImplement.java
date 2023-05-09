package com.avega.training.books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookImplement implements BookService {

	Map<String, Book> map = new HashMap<>();

	public BookImplement() {
	}

	public BookImplement(Map<String, Book> map) {
		super();
		this.map = map;
	}

	public Map<String, Book> getMap() {
		return map;
	}

	public void setMap(Map<String, Book> map) {
		this.map = map;
	}

	@Override
	public List<String> getBooksByAuthorName(String authorName) {
		List<String> authorBybooks = new ArrayList<>();
		for (Book book : map.values()) {
			if (book.getAuthor().getAuthorName().equalsIgnoreCase(authorName))
				authorBybooks.add(book.getBookName());
		}
		return authorBybooks;
	}

	@Override
	public List<String> getBooksByPublisher(String publisherName) {
		List<String> publisherBybooks = new ArrayList<>();

		for (Book book : map.values()) {
			if (book.getPublisher().getPublisherName().equalsIgnoreCase(publisherName))
				publisherBybooks.add(book.getBookName());
		}
		return publisherBybooks;
	}

	@Override
	public List<String> getBooksByPublishedYear(int year) {
		List<String> yearBybooks = new ArrayList<>();

		for (Book book : map.values()) {
			if (book.getPublishedYear() == year)
				yearBybooks.add(book.getBookName());
		}
		return yearBybooks;
	}

	@Override
	public List<String> getBooksByPages(int pages) {
		List<String> pagesByBooks = new ArrayList<>();

		for (Book book : map.values()) {
			if (book.getNoOfPages() == pages)
				pagesByBooks.add(book.getBookName());
		}
		return pagesByBooks;
	}

	@Override
	public List<String> getBooksByBookName(String bookName) {
		List<String> bookByBooks = new ArrayList<>();

		for (Book book : map.values()) {
			if (book.getBookName().equalsIgnoreCase(bookName))
				bookByBooks.add(book.getBookName());
		}
		return bookByBooks;
	}

	@Override
	public List<String> getBooksByPrice(double price, String operation) {
		List<String> priceByBooks = new ArrayList<>();
		for (Book book : map.values()) {

			switch (operation.toLowerCase()) {
				case "greater than":
					if(book.getPrice() > price)
						priceByBooks.add(book.getBookName());
					break;
				case "lesser than":
					if(book.getPrice() < price)
						priceByBooks.add(book.getBookName());
					break;
				case "greater than or equal to":
					if(book.getPrice() >= price)
						priceByBooks.add(book.getBookName());
					break;
				case "lesser than or equal to":
					if(book.getPrice() <= price)
						priceByBooks.add(book.getBookName());
					break;
					
			}
		}
		return priceByBooks;
	}

}
