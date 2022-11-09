package example;

public class PacketRouterB extends PacketRouter {

	//protected Route theImplementor;

	
	public void doRouting(Packet packet) {
		System.out.println("IBM's Driver Used on PacketID: " + packet.getId() + " With Contents: " + packet.getContents());
		System.out.println("----------");
		if(theImplementor.checkOrigin(packet)) {
			// This protocol does not do any check of CheckSum!!! as PacketRouterA does!
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
