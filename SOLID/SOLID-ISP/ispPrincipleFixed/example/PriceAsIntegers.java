package example;

import java.util.List;

public class PriceAsIntegers<T> extends Data<T> {
	
	public PriceAsIntegers(T theData) {
		super();
		this.theData = theData;
	}
	T theData;
	
	public T getTheData(){ 
		return theData;
	};
	
	public void setTheData(T someData){
		this.theData = someData;
	}

}
