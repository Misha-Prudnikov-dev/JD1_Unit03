package by.htp.book09.main;

import java.util.List;
import java.util.ArrayList;

public class BookListLogic {

	public static List<Book> listBookAuthor(String authorUser, BookList bookList) {

		List<Book> bookAuthor = new ArrayList<Book>();

		for (Book b : bookList.getBooks()) {

			if (b.getAuthor().compareTo(authorUser) == 0) {

				bookAuthor.add(b);
			}
		}

		return bookAuthor;
	}

	public static List<Book> listBookPublishingHouse(String publishingHouseUser, BookList bookList) {

		List<Book> bookPublishingHouse = new ArrayList<Book>();

		for (Book b : bookList.getBooks()) {

			if (b.getPublishingHouse().compareTo(publishingHouseUser) == 0) {

				bookPublishingHouse.add(b);
			}
		}

		return bookPublishingHouse;
	}
	public static List<Book> listBookYear(int yearUser, BookList bookList) {

		List<Book> bookYear = new ArrayList<Book>();

		for (Book b : bookList.getBooks()) {

			if (b.getTheYearOfPublishing()>yearUser) {

				bookYear.add(b);
			}
		}

		return bookYear;
	}
}
