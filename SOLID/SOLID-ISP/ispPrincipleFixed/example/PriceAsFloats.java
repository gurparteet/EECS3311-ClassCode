package example;

import java.util.List;

public class PriceAsFloats<T> extends Data<T> {

	public PriceAsFloats(T theData) {
		super();
		this.theData = theData;
	}
	T theData;
	
	public  T getTheData(){ 
		return theData;
	};
	
	public void setTheData(T someData){
		this.theData = someData;
	}
}
