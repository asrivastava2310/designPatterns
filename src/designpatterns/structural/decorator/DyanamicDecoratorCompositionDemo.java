package designpatterns.structural.decorator;

public class DyanamicDecoratorCompositionDemo {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println(circle.info());

		ColoredShape1 blueSquare = new ColoredShape1(new Square(20), "blue");
		System.out.println(blueSquare.info());

		TransparentShape1 myCircle = new TransparentShape1(new ColoredShape1(new Circle(5), "green"), 50);
		System.out.println(myCircle.info());
	}
}

class ColoredShape1 implements Shape {
	private Shape shape;
	private String color;

	public ColoredShape1(Shape shape, String color) {
		this.shape = shape;
		this.color = color;
	}

	@Override
	public String info() {
		return shape.info() + " has the color " + color;
	}
}

class TransparentShape1 implements Shape {
	private Shape shape;
	private int transparency;

	public TransparentShape1(Shape shape, int transparency) {
		this.shape = shape;
		this.transparency = transparency;
	}

	@Override
	public String info() {
		return shape.info() + " has " + transparency + "% transparency";
	}
}
