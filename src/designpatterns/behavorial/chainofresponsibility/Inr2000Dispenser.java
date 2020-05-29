package designpatterns.behavorial.chainofresponsibility;

public class Inr2000Dispenser implements DispenseChain {

	private DispenseChain nextChain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 2000) {
			int num = currency.getAmount() / 2000;
			int remainder = currency.getAmount() % 2000;
			System.out.println("Dispensing " + num + " 2000 INR Notes");
			if (remainder != 0) {
				this.nextChain.dispense(new Currency(remainder));
			}
		} else {
			if (this.nextChain != null)
				this.nextChain.dispense(currency);
		}
	}

}
