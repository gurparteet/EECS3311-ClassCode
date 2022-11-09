package example;

import java.util.Date;
import java.util.List;

public class Sales <D>{
	
	public Sales(List<D> salesPerMonth, Date creationDate, String productID, IPrinter aPrintStrategy) {
		super();
		this.salesPerMonth = salesPerMonth;
		this.creationDate = creationDate;
		this.productID = productID;
		this.aPrintStrategy = aPrintStrategy;
	}

	private List<D> salesPerMonth; 
	private Date creationDate;
	private String productID;
	private IPrinter aPrintStrategy;
	
	public void setSalesPerMonth(List<D> theSales) {
		this.salesPerMonth = theSales;
	};
	
	public List<D> getSalesPerMonth() {
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
		return aPrintStrategy;
	}

	public void setaPrintStrategy(IPrinter aPrintStrategy) {
		this.aPrintStrategy = aPrintStrategy;
	};

}
