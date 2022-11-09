package example;

import java.util.*;

public class TheClient {

	private DataController dataController;
	
	public static void main(String[] args) {
		AudioSalesData intData = new AudioSalesData(new ArrayList<PriceAsIntegers>(), new Date(), "Audio123",
				new PrintAnotherSpecialReport<PriceAsIntegers>());
		VideoSalesData flData = new VideoSalesData(new ArrayList<PriceAsFloats>(), new Date(), "Video456", new PrintSpecialReport<PriceAsFloats>());
       
		 DataController<AudioSalesData, PriceAsIntegers> dcIntData = new DataController<AudioSalesData, PriceAsIntegers>(intData);
         		
		
		intData.getSalesPerMonth().add(new PriceAsIntegers(100));

		intData.getaPrintStrategy().executePrint(intData);
		
		PriceAsFloats floatPrice = new PriceAsFloats(200.0f);
		flData.getSalesPerMonth().add(floatPrice);
		
		flData.getaPrintStrategy().executePrint(flData);
		
		dcIntData.addSalesData(new PriceAsIntegers(300), 1);
		intData.getaPrintStrategy().executePrint(intData);
		
		

	}

}
