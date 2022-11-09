package example;

import java.util.List;

public class SalesAverage<T> implements IBusinessUtilities {

	public Float perform(Sales sales) {

		Float totalSales = 0.0f;
		List<T> theData = sales.getSalesPerMonth();
		for(int i=0; i<theData.size(); i++) {
			totalSales = totalSales + (Float)theData.get(i);
		}
		return totalSales;
	}
}
