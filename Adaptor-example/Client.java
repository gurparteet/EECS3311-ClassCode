package example;

public class Client {

	public static void main(String[] args) {
		
		Target anAdapter = new AdapterA(new Adaptee());
		anAdapter.request();
		
		System.out.println("Now we simulate a change on the back end and now a new adapter is used.");
		Target anAdapterB = new AdapterB(new RevisedAdaptee());
		// The client code here just sees the request() method on any adapter used
		anAdapterB.request();

	}

}
