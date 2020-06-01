package designpatterns.behavorial.visitor;

import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor {
	private DecimalFormat df = new DecimalFormat("#.##");

	public TaxHolidayVisitor() {
	}

	@Override
	public double visit(Liquor liquorItem) {
		return Double.parseDouble(df.format((liquorItem.getPrice() * .10) + liquorItem.getPrice()));
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		return Double.parseDouble(df.format((tobaccoItem.getPrice() * .30) + tobaccoItem.getPrice()));
	}

	@Override
	public double visit(Necessity necessityItem) {
		return Double.parseDouble(df.format(necessityItem.getPrice()));
	}

}
