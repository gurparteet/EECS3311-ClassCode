package example;

import java.util.List;

public class MinSale<T extends Data> implements IBusinessUtilities<T> {

	@Override
	public Float perform(Sales sales) {
		

		List<T> theData = sales.getSalesPerMonth();
		float minSoFar = Float.parseFloat(theData.get(0).getTheData().toString());
		
		for (int i = 0; i < theData.size(); i++) {
		//	System.out.println("IN MIN THE DATA IS: " + theData.get(i).getTheData());
			if (minSoFar > Float.parseFloat(theData.get(i).getTheData().toString())) {
				minSoFar = Float.parseFloat(theData.get(i).getTheData().toString());
			}
		}
		//System.out.println("The MIn Sale was " + minSoFar);
		return minSoFar;

	}

}
