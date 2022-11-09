package example;

public class Adaptee {
	//This simulates the back end using now one parameter 
	public void originalRequest(int i) {
		System.out.println("Original Back End Request Called With One Paremeter equal to : " + i);
	}

}
