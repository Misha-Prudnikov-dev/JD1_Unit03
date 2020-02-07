package by.htp.book09.main;

import java.util.List;
import java.util.Scanner;

/*9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/

public class Main {

	public static void main(String[] args) {

		BookList bookList = new BookList();

		BookListLogic bookListLog = new BookListLogic();

		bookList.add(new Book("Death is a Lonely Business", "Ray Bradbury", "Exmo", "Hard", 156, 352, 10, 2018));
		bookList.add(new Book("Sapiens", "Yuval Noah Harari", "Sindbad", "Hard", 154, 520, 15.70, 2019));
		bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", "ABC", "Soft", 152, 420, 8.40, 2017));
		bookList.add(new Book("Flowers for Algernon", "Daniel Keyes", "Exmo", "Hard", 155, 440, 6.50, 2017));
		bookList.add(new Book("Fahrenheit 451", "Ray Bradbury", "ABC", "Soft", 157, 270, 5.10, 2019));
		bookList.add(new Book("Ham on Rye", "Charles Bukowski", "Exmo", "Hard", 159, 350, 7.90, 2016));
		bookList.add(new Book("We", "Yevgeny Zamyatin", "ABC", "Soft", 153, 210, 4.80, 2018));

		List<Book> books;

		books = bookList.getBooks();

		System.out.println("Список книг : ");
		printBook(books);

		Scanner sc = new Scanner(System.in);

		System.out.println("Cписок книг заданного автора :");

		System.out.println("Введите автора");

		String authorUser = sc.nextLine();

		books = BookListLogic.listBookAuthor(authorUser, bookList);

		printBook(books);

		System.out.println("Список книг, выпущенных заданным издательством :");

		System.out.println("Введите издательство");

		String publishingHouseUser = sc.nextLine();

		books = BookListLogic.listBookPublishingHouse(publishingHouseUser, bookList);

		printBook(books);

		System.out.println("Список книг, выпущенных после заданного года :");

		System.out.println("Введите год ");

		int yearUser = sc.nextInt();

		books = BookListLogic.listBookYear(yearUser, bookList);

		printBook(books);

	}

	public static void printBook(List<Book> books) {

		System.out.println(" ");

		for (Book bk : books) {

			System.out.println(bk.getTitle() + ", " + bk.getAuthor() + ", " + bk.getPublishingHouse() + ", "
					+ bk.getBindingType() + ", " + bk.getId() + ", " + bk.getNumberOfPages() + ", " + bk.getPrice()
					+ ", " + bk.getTheYearOfPublishing());
		}
		System.out.println(" ");
	}

}
