package designpatterns.behavorial.chainofresponsibility;

public class Inr500Dispenser implements DispenseChain {

	private DispenseChain nextChain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 500) {
			int num = currency.getAmount() / 500;
			int remainder = currency.getAmount() % 500;
			System.out.println("Dispensing " + num + " 500 INR Notes");
			if (remainder != 0) {
				this.nextChain.dispense(new Currency(remainder));
			}
		} else {
			if (this.nextChain != null)
				this.nextChain.dispense(currency);
		}
	}

}
