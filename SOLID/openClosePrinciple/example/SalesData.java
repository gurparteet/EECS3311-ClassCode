package example;

import java.util.ArrayList;
import java.util.Date;

public class SalesData {
	private ArrayList<Float> salesPerMonth;
	private Date creationDate;
	private String productID;
	private IPrinter aPrintStrategy;

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

	public IPrinter getaPrintStrategy() {
		return aPrintStrategy;
	}

	public void setaPrintStrategy(IPrinter aPrintStrategy) {
		this.aPrintStrategy = aPrintStrategy;
	}

	public void print(ArrayList<Float> salesPerMonth) {
		aPrintStrategy.executePrint(salesPerMonth);

	}
}
