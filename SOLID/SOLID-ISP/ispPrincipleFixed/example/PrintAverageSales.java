package example;

import java.util.*;

public class PrintAverageSales<T> implements IPrinter<T> {

	public void executePrint(Sales sales) {
		
		System.out.println("Product ID: " + sales.getProductID());

		SalesAverage<Integer> avgSale = new SalesAverage<Integer>();
		System.out.println("The Average Sale Was " + avgSale.perform(sales));
		
		System.out.println("");
	};
}
