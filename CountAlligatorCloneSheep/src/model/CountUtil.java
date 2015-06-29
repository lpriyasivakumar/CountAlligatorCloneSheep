package model;

/**
 * @author priya
 *
 */
public class CountUtil {
	
	public static void count(Countable c, int maxCount){
		while(c.getCount()< maxCount){
			c.incrementCount();
			System.out.println(c.getCountString());
		}
		c.resetCount();
			
	}

}
