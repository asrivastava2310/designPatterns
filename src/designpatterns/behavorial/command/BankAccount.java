package designpatterns.behavorial.command;

public class BankAccount {
	private int balance = 100;
	private int overdraftLimit = -500;

	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("Desposited " + amount + " , balance is now : " + balance);
	}

	public boolean withdraw(int amount) {
		if (balance - amount >= overdraftLimit) {
			this.balance -= amount;
			System.out.println("Withdrew " + amount + " , balance is now : " + balance);
			return true;
		} else {
			System.out.println("Cannot withdraw " + amount + " as balance is low : " + balance);
			return false;
		}
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
