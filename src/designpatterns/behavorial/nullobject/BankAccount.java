package designpatterns.behavorial.nullobject;

public class BankAccount {
	private Log log;
	private int balance;

	public BankAccount(Log log) {
		this.log = log;
	}

	public void deposit(int amount) {
		this.balance += amount;
		log.info("Deposited " + amount);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankAccount [balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}
	
}
