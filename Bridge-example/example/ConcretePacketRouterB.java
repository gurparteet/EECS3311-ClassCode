package example;

public class ConcretePacketRouterB extends Route {

	
	@Override
	public void performRouting(Packet packet) {
		System.out.println("Perform Routing of packet : "  +  packet.getId() + " In Concrete Router B");
	}

	@Override
	public Boolean performCheckSum(Packet packet) {
		System.out.println("Perform CheckSum of packet : "  +  packet.getId() + " In Concrete Router B");
		return true;
		
	}

	@Override
	public Boolean checkOrigin(Packet packet) {
		System.out.println("Perform CheckOrigin of packet : "  +  packet.getId() + " In Concrete Router B");
		return true;
	
	}

}
