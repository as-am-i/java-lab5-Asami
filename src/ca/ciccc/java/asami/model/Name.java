package ca.ciccc.java.asami.model;

/**
 * Lab5 Name class
 * 
 * @author tanii_asami
 *
 */
public class Name {

	private String name;

	/**
	 * Name Constructor
	 * 
	 * @param name
	 *            to be set
	 */
	public Name(String name) {
		setName(name);
	}

	/**
	 * 
	 * @param name
	 *            to be set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (!(obj instanceof Name)) {
			return false;
		}
		Name other = (Name) obj;
		if (!(this.name.equals(other.name))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}

}
