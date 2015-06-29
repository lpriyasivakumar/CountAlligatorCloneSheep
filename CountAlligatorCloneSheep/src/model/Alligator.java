package model;

/**
 * @author priya
 *
 */
public class Alligator implements Countable {
	private int Count = 0;
	
	@Override
	public void incrementCount() {
		Count++;
	}
	
	@Override
	public void resetCount() {
		Count = 0;
	}
	
	@Override
	public int getCount() {
		return Count;
	}
	
	@Override
	public String getCountString() {
		return getCount()+" alligator";
	}

}
