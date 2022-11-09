package example;

public class Rectangle implements Shape {

	private String color;
	private int side1_length;
	private int side2_length;

	public Rectangle(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.side1_length = x;
	}

	public void setY(int y) {
		this.side2_length = y;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle: Draw() [Color : " + color + ", x : " + side1_length + ", y :");

	}

}
