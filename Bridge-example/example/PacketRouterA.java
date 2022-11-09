package example;

public class PacketRouterA extends PacketRouter{
	
	//protected Route theImplementor;
	
	
	public void doRouting(Packet packet) {
		System.out.println("Cisco's Driver Used on PacketID: " + packet.getId() + " With Contents: " + packet.getContents());
		System.out.println("----------");
		if(theImplementor.checkOrigin(packet)) {
			theImplementor.performCheckSum(packet);
			theImplementor.performRouting(packet);
		}
	}

	public Route getTheImplementor() {
		return theImplementor;
	}

	public void setTheImplementor(Route theImplementor) {
		this.theImplementor = theImplementor;
	}

}
