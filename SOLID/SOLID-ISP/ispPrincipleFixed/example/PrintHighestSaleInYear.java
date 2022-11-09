package example;

import java.util.*;

public class PrintHighestSaleInYear<T extends Data> implements IPrinter<T> {
	
	public void executePrint(Sales sales) {
		
		System.out.println("Product ID: " + sales.getProductID());
	
		MaxSale<T> theMaxSale = new MaxSale<T>();
		System.out.println("The Highest Sale Was " + theMaxSale.perform(sales));
		
		System.out.println("");
	}

}
