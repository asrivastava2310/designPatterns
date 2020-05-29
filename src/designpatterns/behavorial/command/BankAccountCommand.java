package designpatterns.behavorial.command;

public class BankAccountCommand implements Command {
	private BankAccount ba;
	private Action action;
	private int amount;
	private boolean succeeded;

	public BankAccountCommand(BankAccount ba, Action action, int amount) {
		this.ba = ba;
		this.action = action;
		this.amount = amount;
	}

	@Override
	public void call() {
		switch (action) {
		case WITHDRAW:
			succeeded = ba.withdraw(amount);
			break;
		case DEPOSIT:
			ba.deposit(amount);
			break;
		}
	}

	@Override
	public void undo() {
		switch (action) {
		case WITHDRAW:
			if (!succeeded) {
				System.out.println("No need to undo this action : " + action);
				return;
			}
			ba.deposit(amount);
			break;
		case DEPOSIT:
			ba.withdraw(amount);
			break;
		}
	}

	public Action getAction() {
		return action;
	}
}
