package example;

import java.util.HashMap;

public class ShapeRepo {
	private static String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	private static final HashMap<String, Shape> ShapeMap = new HashMap<String, Shape>();

	public static HashMap<String, Shape> getShapemap() {
		return ShapeMap;
		
	}
	
	public static String[] getColors() {
		return colors;
	}
	
}
