package designpatterns.behavorial.chainofresponsibility;

public class Inr200Dispenser implements DispenseChain {

	private DispenseChain nextChain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= 200) {
			int num = currency.getAmount() / 200;
			int remainder = currency.getAmount() % 200;
			System.out.println("Dispensing " + num + " 200 INR Notes");
			if (remainder != 0) {
				this.nextChain.dispense(new Currency(remainder));
			}
		} else {
			if (this.nextChain != null)
				this.nextChain.dispense(currency);
		}
	}

}
