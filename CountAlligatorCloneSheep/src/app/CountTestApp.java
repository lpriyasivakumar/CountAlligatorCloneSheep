package app;

import model.*;

/**
 * @author priya
 *
 */
public class CountTestApp {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Counting Alligators.....");
		System.out.println();		
		Alligator alligator = new Alligator();		
		CountUtil.count(alligator, 3);
		System.out.println();
		
		System.out.println("Counting Sheep.........");
		System.out.println();
		Sheep sheep1 = new Sheep();
		sheep1.setName("Blackie");
		CountUtil.count(sheep1, 2);	
		System.out.println();
		
		Sheep sheep2 = (Sheep)sheep1.clone();
		sheep2.setName("Dolly");		
		CountUtil.count(sheep2, 3);	
		System.out.println();
		
		CountUtil.count(sheep1,1);
		System.out.println();
		
	}

}
