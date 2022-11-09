package example;

import java.util.*;

public class Client {
	
	private ArrayList<Shape> theData;

	//private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	ShapeFactory shapeFactory = new ShapeFactory();
	public static void main(String[] args) {

		Random rand = new Random();
		ShapeFactory shapeFactory = new ShapeFactory();

		for (int i = 0; i < 1000; ++i) {
			Shape shape = shapeFactory.getShape(getRandomColor());
			// Here we modify on the fly either an existing object or a new one just created
			shape.setX(rand.nextInt(100));
			shape.setY(rand.nextInt(100));
			shape.draw();
		}
		
		System.out.println("Created " + shapeFactory.getCreated() + " Shapes ");
		System.out.println("Saved " + (1000 - shapeFactory.getCreated()) + " creations our of 1000 accesses and modifications");
		
	}

	private static String getRandomColor() {
		String[] colors = ShapeRepo.getColors();
		return colors[(int) (Math.random() * colors.length)];
	}

}
