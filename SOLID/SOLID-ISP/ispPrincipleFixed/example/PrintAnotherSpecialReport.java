package example;

import java.util.List;

public class PrintAnotherSpecialReport<T extends Data> implements ISpecialPrinter<T> {

	@Override
	public void executePrint(Sales sales) {

		List<T> theData = sales.getSalesPerMonth();
		System.out.println("Product ID: " + sales.getProductID());
		System.out.println("Sales Date " + sales.getCreationDate());
		int month = 0;
		for (int i = 0; i < theData.size(); i++) {
			month = month + 1;
			System.out.println("The Sales for Month " + month + " Were " + Float.parseFloat(theData.get(i).getTheData().toString()));
		}
		
		MinSale<PriceAsFloats> theMinSale = new MinSale<PriceAsFloats>();
		System.out.println("The Lowest Sales Were " + theMinSale.perform(sales));
		System.out.println("");
		
		
	}

	
	public void specialPrintingInstructions(Sales sales) {
		// Code here
	}
}
