package designpatterns.structural.decorator;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void resize(double factor) {
		radius = radius * factor;
	}

	@Override
	public String info() {
		return "A circle of radius " + radius;
	}
}