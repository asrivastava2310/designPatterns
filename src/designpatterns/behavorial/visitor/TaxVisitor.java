package designpatterns.behavorial.visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {
	private DecimalFormat df = new DecimalFormat("#.##");

	public TaxVisitor() {
	}

	@Override
	public double visit(Liquor liquorItem) {
		return Double.parseDouble(df.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		return Double.parseDouble(df.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
	}

	@Override
	public double visit(Necessity necessityItem) {
		return Double.parseDouble(df.format(necessityItem.getPrice()));
	}

}
