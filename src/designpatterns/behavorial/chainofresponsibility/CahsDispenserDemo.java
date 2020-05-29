package designpatterns.behavorial.chainofresponsibility;

public class CahsDispenserDemo {

	public static void main(String[] args) {
		AtmCashDispenser atmDispenser = new AtmCashDispenser();
		int amount = 2800;

		if (amount % 100 != 0) {
			System.out.println("Amount should be in multiple of 100s.");
			return;
		}
		// process the request
		atmDispenser.dispense(new Currency(amount));
	}

}

//Output
/*
 * Dispensing 1 2000 INR Notes 
 * Dispensing 1 500 INR Notes 
 * Dispensing 1 200 INR Notes 
 * Dispensing 1 100 INR Notes
 */