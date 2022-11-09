package example;

public class Proxy extends Subject {

	private RealSubject realSubject;
	
	   @Override
	   public void request() {
	      // Use "lazy" initialization
	      if (realSubject == null)
	         realSubject = new RealSubject();
	      System.out.println("The call received by Proxy and dispatched to the back end - "
	      		+ "i.e to the Real Subject");

	      realSubject.request();
	   }

}
