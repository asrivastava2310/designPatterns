package designpatterns.structural.decorator;

import java.util.function.Supplier;

public class StaticDecoratorCompositionDemo {

	public static void main(String[] args) {
		ColoredShape<Square> blueSquare = new ColoredShape<>(() -> new Square(20), "blue");
		System.out.println(blueSquare.info());

		TransparentShape<ColoredShape<Circle>> myCircle = new TransparentShape<>(
				() -> new ColoredShape<>(() -> new Circle(5), "green"), 50);
		System.out.println(myCircle.info());
	}

}

class ColoredShape<T extends Shape> implements Shape {
	private Shape shape;
	private String color;

	public ColoredShape(Supplier<? extends T> ctor, String color) {
		this.shape = ctor.get();
		this.color = color;
	}

	@Override
	public String info() {
		return shape.info() + " has the color " + color;
	}
}

class TransparentShape<T extends Shape> implements Shape {
	private Shape shape;
	private int transparency;

	public TransparentShape(Supplier<? extends T> ctor, int transparency) {
		this.shape = ctor.get();
		this.transparency = transparency;
	}

	@Override
	public String info() {
		return shape.info() + " has " + transparency + "% transparency";
	}
}