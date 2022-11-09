package example;

public class DataController {

	public DataController(SalesData theSalesData) {
		this.controllerForData = theSalesData;
	}
	
	private SalesData controllerForData;
	public void AddSalesData(float sales, int month) {
		
		controllerForData.getSalesPerMonth().add(month, sales);
	}
}
