package model;

/**
 * @author priya
 *
 */
public class Sheep implements Countable,Cloneable {
	private String name;
	private int Count;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
		return getCount()+" "+ name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
