package example;

import java.util.*;

public class PrintSpecialReport<T extends Data> implements ISpecialPrinter<T> {

	public void executePrint(Sales sales) {

		System.out.println("Product ID: " + sales.getProductID());
		System.out.println("Sales Date " + sales.getCreationDate());
		int month = 0;
		List<T> theData = sales.getSalesPerMonth();
		for (int i = 0; i < theData.size(); i++) {
			month = month +1;
			System.out.println("The Sales for Month " + month + " were " + theData.get(i).getTheData());

		}
		System.out.println("");

	}

	public void specialPrintingInstructions(Sales sales) {
		// Code here
	}
};
