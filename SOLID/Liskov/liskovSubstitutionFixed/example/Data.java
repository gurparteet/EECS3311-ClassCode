package example;

import java.util.List;

public class Data<D> {
	

	private D theData;
	
	public  D getTheData(){ 
		return theData;
	};
	
	public void setTheData(D someData){
		this.theData = someData;
	}
}
