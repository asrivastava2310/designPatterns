package designpatterns.behavorial.visitor;

public class Liquor implements Visitable {
	private double price;

	public Liquor(double price) {
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
