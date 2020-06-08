package designpatterns.structural.decorator;

public class Square implements Shape {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	public void resize(double factor) {
		side = side * factor;
	}

	@Override
	public String info() {
		return "A square of side " + side;
	}
}
