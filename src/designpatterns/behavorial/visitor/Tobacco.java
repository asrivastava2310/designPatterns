package designpatterns.behavorial.visitor;

public class Tobacco implements Visitable {
	private double price;

	public Tobacco(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public double calculate(Visitor visitor) {
		return visitor.visit(this);
	}
}
