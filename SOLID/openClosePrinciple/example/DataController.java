package example;

public class DataController {

	public DataController(SalesData theSalesData) {
		this.theSalesData = theSalesData;
	}
	
	SalesData theSalesData;
	public void AddSalesData(float sales, int month) {
		
		theSalesData.getSalesPerMonth().add(month, sales);
	}
}
