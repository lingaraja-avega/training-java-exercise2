package com.avega.training.books;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Publisher publisher1 = new Publisher("P101", "Dan Rose", "Mumbai");
		Publisher publisher2 = new Publisher("P102", "Lee", "Delhi");

		Author author1 = new Author("A101", "Wil Smith", 9944519012L, "willsmith@gmail.com");
		Author author2 = new Author("A102", "Sam", 994434512L, "sam@gmail.com");

		Book book1 = new Book("B201", "Rich dad poor dad", author1, 604, 2012, 500, publisher1);
		Book book2 = new Book("B202", "All at Onces", author1, 404, 2019, 706, publisher2);
		Book book3 = new Book("B203", "Everything", author2, 204, 2012, 306, publisher2);

		Map<String, Book> totalBooks = new HashMap<>();
		totalBooks.put("Book 1", book1);
		totalBooks.put("Book 2", book2);
		totalBooks.put("Book 3", book3);

		BookImplement books = new BookImplement(totalBooks);

//		System.out.println(booksImp.getMap());

//		Question 1
//		books.getBooksByAuthorName("Wil Smith").forEach(book -> System.out.println(book));

//		Question 2 
//		books.getBooksByPublisher("Lee").forEach(book -> System.out.println(book));

//		Question 3
//		books.getBooksByPublishedYear(2012).forEach(book -> System.out.println(book));

//		Question 4
//		books.getBooksByPages(204).forEach(book -> System.out.println(book));

//		Question 5
//		books.getBooksByBookName("Everything").forEach(book -> System.out.println(book));

//		Question 6
//		books.getBooksByPrice(600, "lesser than or equal to").forEach(book -> System.out.println(book));

	}

}
