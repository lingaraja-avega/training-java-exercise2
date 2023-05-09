package com.avega.training.books;

import java.util.Objects;

public class Book {

	private String bookId;
	private String bookName;
	private Author author;
	private int noOfPages;
	private int publishedYear;
	private double price;
	private Publisher publisher;

	public Book() {
	};

	public Book(String bookId, String bookName, Author author, int noOfPages, int publishedYear, double price,
			Publisher publisher) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.noOfPages = noOfPages;
		this.publishedYear = publishedYear;
		this.price = price;
		this.publisher = publisher;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", noOfPages=" + noOfPages
				+ ", publishedYear=" + publishedYear + ", price=" + price + ", publisher=" + publisher + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bookId == other.bookId;
	}

}
