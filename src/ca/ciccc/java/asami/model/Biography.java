package ca.ciccc.java.asami.model;

/**
 * Lab5 Biography class
 * 
 * @author tanii_asami
 *
 */
public final class Biography extends Book {
	private Name subject;

	/**
	 * Biography Constructor
	 * 
	 * @param firstName
	 *            to be set
	 * @param lastName
	 *            to be set
	 * @param title
	 *            to be set
	 * @param yearPublished
	 *            to be set
	 * @param subject
	 *            to be set
	 * @throws InvalidArgumentException
	 *             to be set
	 * @throws InvalidBookDateException
	 *             to be set
	 */
	public Biography(Name firstName, Name lastName, String title, int yearPublished, Name subject)
			throws InvalidArgumentException, InvalidBookDateException {
		super(firstName, lastName, title, yearPublished);
		setSubject(subject);
	}

	/**
	 * 
	 * @param subject
	 *            to be set
	 */
	public void setSubject(Name subject) {
		this.subject = subject;
	}

	/**
	 * 
	 * @return subject to get
	 */
	public Name getSubject() {
		return subject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		if (!(obj instanceof Biography)) {
			return false;
		}
		Biography other = (Biography) obj;
		if (!(this.subject.equals(other.subject))) {
			// subject is an object, equals is the method from Object class
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Biography [subject=" + subject + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getTitle()=" + getTitle() + ", getYearPublished()=" + getYearPublished() + "]";
	}

}
