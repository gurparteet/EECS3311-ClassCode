package example;

public class RealSubject extends Subject {
	@Override
	public void request() {
		System.out.println("Called RealSubject.request()");
	}
}
