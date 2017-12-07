package ca.ciccc.java.asami.model;

/**
 * Lab5 InvalidBookDateException class
 * 
 * @author tanii_asami
 *
 */
public class InvalidBookDateException extends Exception {

	private static final long serialVersionUID = 8388272865636577962L;

	/**
	 * InvalidBookDateException Constructor
	 * 
	 * @param message
	 *            to be set
	 */
	public InvalidBookDateException(String message) {
		super(message);
	}

}
