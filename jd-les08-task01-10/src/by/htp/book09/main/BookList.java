package by.htp.book09.main;

import java.util.ArrayList;
import java.util.List;

public class BookList {

	private List<Book> books;

	public BookList() {
		books = new ArrayList<Book>();
	}

	public void add(Book newBook) {
		books.add(newBook);
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
