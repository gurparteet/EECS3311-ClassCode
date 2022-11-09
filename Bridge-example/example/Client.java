package example;

public class Client {

	private static PacketRouter abstraction;
	private static Packet packet;
	
	public static void main(String[] args) {
		
		// The packet comes from a network source
		
		packet = new Packet("Content-X", 111);
		// You choose to do routing using Cisco's (say) routing driver
		abstraction = new PacketRouterA();

		// You decide the first packet has to be handled by the first tye of routing
		// protocol using Cisco's driver
		Route implementor;
		implementor = new ConcretePacketRouterA();

		// You assign this type of routing protocol to your task
		abstraction.setTheImplementor(implementor);
		abstraction.doRouting(packet);

		// A new packet comes in
		packet = new Packet("Content-X", 222);
		// You decide the second packet has to be handled by a second type of routing
		// protocol on Cisco's driver
		implementor = new ConcretePacketRouterB();

		// You assign this type of routing protocol to your task
		abstraction.setTheImplementor(implementor);
		abstraction.doRouting(packet);

		// Now a third packet comes in
		packet = new Packet("Content-Z", 333);
		// You choose to do routing using IBM's (say) routing driver
		abstraction = new PacketRouterB();

		// You decide the second packet has to be handled by the second type of routing
		// protocol on IBM's driver
		implementor = new ConcretePacketRouterA();

		// You assign this type of routing protocol to your task
		abstraction.setTheImplementor(implementor);
		abstraction.doRouting(packet);

	}

}
