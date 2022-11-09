package example;
import java.io.*;

// This adapter calls the back end with one parameter (Adaptee.java)
// exposes request()
public class AdapterA implements Target {
	
	private Adaptee adaptee;
	
	public AdapterA(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		int i=0;
		// Here we simulate the logic of changing the request interface and add a parameter
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number to add as a new parameter:");
		
        try {
			i = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        // Here we call the 
		this.adaptee.originalRequest(i);
		

	}

}
