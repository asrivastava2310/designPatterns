package designpatterns.behavorial.memento;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public Memento deposit(int amount) {
		this.balance += amount;
		return new Memento(balance);
	}
	
	public void restore(Memento memento) {
		this.balance = memento.getBalance();
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
