package example;

// Here we simulate that the back end has changed and now has two parameters
// AdapteB handles that
// The client only sees the request() method
public class RevisedAdaptee {
	
	public void originalRequest(int i, int k) {
		System.out.println("Revised Back End Request Called With Two Paremeters equal to : " + i + " and " + k);
	}
}
