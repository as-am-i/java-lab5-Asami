package ca.ciccc.java.asami.model;

/**
 * Lab5 Book class
 * 
 * @author tanii_asami
 *
 */
public class Book implements Comparable<Book> {
	private Name firstName;
	private Name lastName;
	private String title;
	private int yearPublished;

	/**
	 * Book Constructor
	 * 
	 * @param firstName
	 *            to be set
	 * @param lastName
	 *            to be set
	 * @param title
	 *            to be set
	 * @param yearPublished
	 *            to be set
	 * @throws InvalidArgumentException
	 *             to be thrown
	 * @throws InvalidBookDateException
	 *             to be thrown
	 */
	public Book(Name firstName, Name lastName, String title, int yearPublished)
			throws InvalidArgumentException, InvalidBookDateException {
		setFirstName(firstName);
		setLastName(lastName);
		setTitle(title);
		setYearPublished(yearPublished);
	}

	/**
	 * 
	 * @param firstName
	 *            to be set
	 * @throws InvalidArgumentException
	 *             to be thrown
	 */
	public final void setFirstName(Name firstName) throws InvalidArgumentException {
		if (firstName == null || firstName.getName().isEmpty()) {
			// to check if Name object is Empty, use getName() method to get String
			throw new InvalidArgumentException("the first name cannot be null or empty");
		}
		this.firstName = firstName;
	}

	/**
	 * 
	 * @param lastName
	 *            to be set
	 * @throws InvalidArgumentException
	 *             to be thrown
	 */
	public final void setLastName(Name lastName) throws InvalidArgumentException {
		if (lastName == null || lastName.getName().isEmpty()) {
			throw new InvalidArgumentException("the last name cannot be null or empty");
		}
		this.lastName = lastName;
	}

	/**
	 * 
	 * @param title
	 *            to be set
	 * @throws InvalidArgumentException
	 *             to be thrown
	 */
	public final void setTitle(String title) throws InvalidArgumentException {
		if (title == null || title.isEmpty()) {
			throw new InvalidArgumentException("the title cannot be null or empty");
		}
		this.title = title;
	}

	/**
	 * 
	 * @param yearPublished
	 *            to be set
	 * @throws InvalidBookDateException
	 *             to be thrown
	 */
	public final void setYearPublished(int yearPublished) throws InvalidBookDateException {

		if (yearPublished <= 2017) {
			this.yearPublished = yearPublished;
		} else {
			throw new InvalidBookDateException("the date cannot be greater than 2017");
		}
	}

	/**
	 * 
	 * @return firstName
	 */
	public final Name getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @return lastName
	 */
	public final Name getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @return title
	 */
	public final String getTitle() {
		return title;
	}

	/**
	 * 
	 * @return yearPublished
	 */
	public final int getYearPublished() {
		return yearPublished;
	}

	/**
	 * more recent books are bigger
	 */
	public int compareTo(Book book) {
		return this.yearPublished - book.yearPublished;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearPublished;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		if (this.title.equals(other.title) && (this.yearPublished == other.yearPublished)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Book [firstName=" + firstName + ", lastName=" + lastName + ", title=" + title + ", yearPublished="
				+ yearPublished + "]";
	}

}
