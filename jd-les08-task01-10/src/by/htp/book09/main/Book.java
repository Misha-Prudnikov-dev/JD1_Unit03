package by.htp.book09.main;

/*9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/

public class Book {

	private String title;
	private String author;
	private String publishingHouse;
	private String bindingType;

	private int id;
	private int numberOfPages;
	private double price;
	private int theYearOfPublishing;

	public Book(String title, String author, String publishingHouse, String bindingType, int id, int numberOfPages,
			double price, int theYearOfPublishing) {

		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.bindingType = bindingType;
		this.id = id;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.theYearOfPublishing = theYearOfPublishing;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBildingType(String bildingType) {
		this.bindingType = bildingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTheYearOfPublishing() {
		return theYearOfPublishing;
	}

	public void setTheYearOfPublishing(int theYearOfPublishing) {
		this.theYearOfPublishing = theYearOfPublishing;
	}

	@Override
	public String toString() {
		return "Book [ Title : " + title + ", Author : " + author + ", Publishing House : " + publishingHouse
				+ ", Binding Type : " + bindingType + ", ID : " + id + ", Number Of Pages : " + numberOfPages
				+ ", Price : " + price + ", The Year of Publishing : " + theYearOfPublishing + " ]";
	}

}
