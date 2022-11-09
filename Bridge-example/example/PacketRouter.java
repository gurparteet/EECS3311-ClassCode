package example;

public abstract class PacketRouter {
	
	protected Route theImplementor;
	
	public void doRouting(Packet packet) {}

	public Route getTheImplementor() {
		return theImplementor;
	}

	public void setTheImplementor(Route theImplementor) {
		this.theImplementor = theImplementor;
	}

}
