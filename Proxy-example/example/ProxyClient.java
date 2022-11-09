package example;

public class ProxyClient {

	public static void main(String[] args) {
	      // Create proxy and request a service
	      Subject proxy = new Proxy();
	      proxy.request();
	   }


}
