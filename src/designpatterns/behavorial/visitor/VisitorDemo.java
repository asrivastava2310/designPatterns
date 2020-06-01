package designpatterns.behavorial.visitor;

public class VisitorDemo {

	public static void main(String[] args) {

		Necessity milk = new Necessity(3.47);
		Liquor vodka = new Liquor(11.99);
		Tobacco cigars = new Tobacco(19.99);

		TaxVisitor taxCalc = new TaxVisitor();
		System.out.println("Necessity Item: Price with Tax : " + milk.calculate(taxCalc));
		System.out.println("Liquor Item: Price with Tax : " + vodka.calculate(taxCalc));
		System.out.println("Tobacco Item: Price with Tax : " + cigars.calculate(taxCalc));

		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
		System.out.println("\nHOLIDAY PRICES");

		System.out.println("Necessity Item: Price with Tax : " + milk.calculate(taxHolidayCalc));
		System.out.println("Liquor Item: Price with Tax : " + vodka.calculate(taxHolidayCalc));
		System.out.println("Tobacco Item: Price with Tax : " + cigars.calculate(taxHolidayCalc));

	}

}
