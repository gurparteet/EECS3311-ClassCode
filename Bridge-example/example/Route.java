package example;

public abstract class Route {
	
	public void performRouting(Packet packet) {
	};
	public Boolean performCheckSum(Packet packet) {
		return true;}
	public Boolean checkOrigin(Packet packet) {
		return true;}
	
}
