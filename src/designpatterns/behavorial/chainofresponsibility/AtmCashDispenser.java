package designpatterns.behavorial.chainofresponsibility;

public class AtmCashDispenser {
	private DispenseChain c1;
	
	public AtmCashDispenser() {
		this.c1 = new Inr2000Dispenser();
		DispenseChain c2 = new Inr500Dispenser();
		DispenseChain c3 = new Inr200Dispenser();
		DispenseChain c4 = new Inr100Dispenser();
		
		//prepare chain of handlers
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		c3.setNextChain(c4);
	}
	
	public void dispense(Currency currency) {
		this.c1.dispense(currency);
	}
}
