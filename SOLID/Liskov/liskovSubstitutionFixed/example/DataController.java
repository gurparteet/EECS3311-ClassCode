package example;

public class DataController <T extends Sales, D extends Data> {

	private  T controllerForData;

	public DataController(T sales) {
		this.controllerForData = sales;
	}

	public void addSalesData(D aSale, int month) {
		controllerForData.getSalesPerMonth().add(month, aSale);

	}

}
