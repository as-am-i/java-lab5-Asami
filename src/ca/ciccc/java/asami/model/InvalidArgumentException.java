package ca.ciccc.java.asami.model;

/**
 * Lab5 InvalidArgumentException class
 * 
 * @author tanii_asami
 *
 */
public class InvalidArgumentException extends Exception {

	private static final long serialVersionUID = -2670877155821107552L;

	/**
	 * InvalidArgumentException Constructor
	 * 
	 * @param message
	 *            to be set
	 */
	public InvalidArgumentException(String message) {
		super(message);
	}
}
