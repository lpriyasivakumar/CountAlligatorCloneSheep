package model;

/**
 * @author priya
 *
 */
public interface Countable {
	
	void incrementCount();

	void resetCount();

	int getCount();

	String getCountString();
}
