package example;

import java.util.*;

public class BusinessLogicUtilities {

	private SalesData theSalesData;
	
	public SalesData getTheSalesData() {
		return theSalesData;
	}

	public void setTheSalesData(SalesData theSalesData) {
		this.theSalesData = theSalesData;
	}
	
	public float averageSalesPerYear() {
		ArrayList<Float> salesPerMonth = theSalesData.getSalesPerMonth();
		float totalSales = 0.0f;
		for (float aSale : salesPerMonth) {
			totalSales = totalSales + aSale;
		}
		return totalSales / salesPerMonth.size();
	}

	public float getMaxSalesData() {
		ArrayList<Float> salesPerMonth = theSalesData.getSalesPerMonth();
		return Collections.max(salesPerMonth);
	}
	
	public float getMinSalesData() {
		ArrayList<Float> salesPerMonth = theSalesData.getSalesPerMonth();
		return Collections.min(salesPerMonth);
	}
}
