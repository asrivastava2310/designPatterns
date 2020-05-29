package designpatterns.behavorial.chainofresponsibility;

public class Inr100Dispenser implements DispenseChain {

	private DispenseChain nextChain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain = null; // end of chain
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 100) {
			int num = currency.getAmount() / 100;
			int remainder = currency.getAmount() % 100;
			System.out.println("Dispensing " + num + " 100 INR Notes");
			if (remainder != 0) {
				this.nextChain.dispense(new Currency(remainder));
			}
		} else {
			if (this.nextChain != null)
				this.nextChain.dispense(currency);
		}
	}

}
