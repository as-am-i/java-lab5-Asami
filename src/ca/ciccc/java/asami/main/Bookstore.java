package ca.ciccc.java.asami.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ca.ciccc.java.asami.model.Book;
import ca.ciccc.java.asami.model.InvalidArgumentException;
import ca.ciccc.java.asami.model.InvalidBookDateException;
import ca.ciccc.java.asami.model.Name;

/**
 * 
 * Lab5 Bookstore class
 * 
 * @author tanii_asami
 *
 */
public class Bookstore {
	private ArrayList<Book> books;

	/**
	 * Bookstore Constructor
	 */
	public Bookstore() {
		books = new ArrayList<>();

		addBook(new Name("Eric"), new Name("Carle"), "The Very Hungry Caterpillar", 1994);
		addBook(new Name("Maurice"), new Name("Sendak"), "Where the Wild Things Are", 2000);
		addBook(new Name("Margaret"), new Name("Wise Brown"), "Goodnight Moon", 2007);
		addBook(new Name("Shel"), new Name("Silverstein"), "The Giving Tree", 1964);
		addBook(new Name("Ludwig"), new Name("Bemelmans"), "Madeline", 1989);
		addBook(new Name("Don"), new Name("Freeman"), "Corduroy", 1968);

		// InvalidBookDateException
		addBook(new Name("asami"), new Name("tanii"), "Java picture book", 2019);

		// InvalidArgumentException
		addBook(new Name(""), new Name("nobody"), "no author's book", 2000);

	}

	/**
	 * Method which tries to create a new Book and adds it to the Bookstore
	 * 
	 * @param firstName
	 *            to be accepted
	 * @param lastName
	 *            to be accepted
	 * @param title
	 *            to be accepted
	 * @param yearPublished
	 *            to be accepted
	 */
	public void addBook(Name firstName, Name lastName, String title, int yearPublished) {
		try {
			Book book1 = new Book(firstName, lastName, title, yearPublished);
			books.add(book1);
		} catch (InvalidBookDateException ex) {
			System.out.println(ex.getMessage());
		} catch (InvalidArgumentException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Method which prints books before and after sorting them
	 */
	public void displayBooks() {
		System.out.println("--- Before sorting ---");
		printElementsOfBooks(books);

		Collections.sort(books);

		System.out.println("\n--- After sorting ---");
		printElementsOfBooks(books);
	}

	/**
	 * Method to print books
	 * 
	 * @param books
	 *            to be printed
	 */
	public void printElementsOfBooks(List<Book> books) {
		for (Book book : books) {
			System.out.println(book.getFirstName().getName() + " " + book.getLastName().getName() + " wrote - "
					+ book.getTitle() + ", published in " + book.getYearPublished());
		}
	}

	/*
	 * Method to run
	 */
	public void run() {
		displayBooks();
	}

	public static void main(String[] args) {
		Bookstore bookstore1 = new Bookstore();
		bookstore1.run();
	}
}
