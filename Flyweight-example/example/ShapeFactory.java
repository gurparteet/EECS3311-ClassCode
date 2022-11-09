package example;

import java.util.HashMap;
import java.util.Random;

public class ShapeFactory {

	private Random rand = new Random();
	private int created;

	public int getCreated() {
		return created;
	}

	public Shape getShape(String color) {
		Shape shape = (Shape) ShapeRepo.getShapemap().get(color);

		int random_sel = rand.nextInt(2);

		if (shape == null) {
			created++;
			if (random_sel == 1) {
				shape = new Circle(color, 100);
				ShapeRepo.getShapemap().put(color, shape);
				System.out.println(
						"Creating object " + "\"" + shape.getClass().getName() + "\"" + " of color : " + color);
			} else {
				shape = new Rectangle(color);
				ShapeRepo.getShapemap().put(color, shape);
				System.out.println(
						"Creating object " + "\"" + shape.getClass().getName() + "\"" + " of color : " + color);
			}

			ShapeRepo.getShapemap().put(color, shape);
	
		}
		return shape;
	}

}
