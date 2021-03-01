package oops;

import java.util.ArrayList;
import java.util.List;

// Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.
// It represents part-of relationship.
// In composition, both the entities are dependent on each other.
// When there is a composition between two entities, the composed object cannot exist without the other entity.
// Library
class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
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
}

class Library {
	private final List<Book> books;

	public Library(List<Book> books) {
		this.books = books;
	}
	
	public List<Book> getBooks() {
		return books;
	}
}

public class Composition {

	public static void main(String[] args) {
		Book book1 = new Book("Java", "Niraj Thagunna");
		Book book2 = new Book("Python", "Niru");
		Book book3 = new Book("OOPs", "Michel");
		
		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		Library library = new Library(books);
		
		List<Book> bks = library.getBooks();
		
		for (Book bk : bks) {
			System.out.println("Title : " + bk.getTitle() + ", Author : " + bk.getAuthor());
		}
	}

}

/*
 * Dependency: Aggregation implies a relationship where the child can exist independently of the parent. 
 * For example, Bank and Employee, delete the Bank and the Employee still exist. 
 * whereas Composition implies a relationship where the child cannot exist independent of the parent. 
 * Example: Human and heart, heart don’t exist separate to a Human.
 * Type of Relationship: Aggregation relation is “has-a” and composition is “part-of” relation.
 * Type of association: Composition is a strong Association whereas Aggregation is a weak Association.
 */



