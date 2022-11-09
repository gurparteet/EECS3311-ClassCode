package example;

import java.util.List;

public class MaxSale<T extends Data> implements IBusinessUtilities {

	@Override
	public Float perform(Sales sales) {

		List<T> theData = sales.getSalesPerMonth();
		float maxSoFar = Float.parseFloat(theData.get(0).getTheData().toString());
		
		for (int i = 0; i < theData.size(); i++) {
			//System.out.println("THE MAX SALES DATA IS: " + theData.get(i).getTheData());
			if (maxSoFar < Float.parseFloat(theData.get(i).getTheData().toString())) {
				maxSoFar = Float.parseFloat(theData.get(i).getTheData().toString());
			}
		}
		System.out.println("The Max Sale was " + maxSoFar);
		return maxSoFar;


	}
}
