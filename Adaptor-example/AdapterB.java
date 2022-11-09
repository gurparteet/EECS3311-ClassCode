package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//This adapter calls the back end with two parameters (RevisedAdaptee.java)
//again exposes request() so the client does not see the change between Adaptee and RevisedAdaptee

public class AdapterB implements Target {

	private RevisedAdaptee adaptee;

	public AdapterB(RevisedAdaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		int i = 0;
		int k = 0;
		// Here we simulate the logic of changing the request interface and add a
		// parameter
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number to add as a first parameter:");
		try {
			i = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter a number to add as a second parameter:");
		try {
			k = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.adaptee.originalRequest(i, k);

		// Here we call the back end with two parameters

	}
}
