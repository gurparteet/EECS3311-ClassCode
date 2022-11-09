package example;

import java.util.*;
import java.util.Date;
import java.util.List;

public class VideoSalesData <T extends Data> extends Sales {
	
	
	public VideoSalesData(List<T> salesPerMonth, Date creationDate, String productID, IPrinter aPrintStrategy) {
		super(salesPerMonth, creationDate, productID, aPrintStrategy );
//		this.salesPerMonth = salesPerMonth;
//		this.creationDate = creationDate;
//		this.productID = productID;
	//	this.aPrintStrategy = aPrintStrategy;
	}

	// An array of 12 numbers indicating total sales in dollars for each month
	private List<T> salesPerMonth;
	private Date creationDate;
	private String productID;
	//private IPrinter aPrintStrategy;

	public List<T> getSalesPerMonth() {
		return salesPerMonth;
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
		return super.getaPrintStrategy();
	}

	public void setaPrintStrategy(IPrinter aPrintStrategy) {
		super.setaPrintStrategy(aPrintStrategy);
	}

	
	


	
}
