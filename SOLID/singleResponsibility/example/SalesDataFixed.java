package example;

import java.util.ArrayList;
import java.util.Date;

public class SalesDataFixed {

	private ArrayList<Float> salesPerMonth;
	private Date creationDate;
	private String productID;
	private PrintStrategy aPrintStrategy;

	// An array of 12 numbers indicating total sales in dollars for each month
	public ArrayList<Float> getSalesPerMonth() {
		return salesPerMonth;
	}

	public void setSalesPerMonth(ArrayList<Float> salesPerMonth) {
		this.salesPerMonth = salesPerMonth;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public PrintStrategy getaPrintStrategy() {
		return aPrintStrategy;
	}

	public void setaPrintStrategy(PrintStrategy aPrintStrategy) {
		this.aPrintStrategy = aPrintStrategy;
	}

	public float averageSalesPerYear() {
		float totalSales = 0.0f;
		for (Float aSale : salesPerMonth) {
			totalSales = totalSales + aSale;
		}
		return totalSales / salesPerMonth.size();

	}

}
