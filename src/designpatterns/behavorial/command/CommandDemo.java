package designpatterns.behavorial.command;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommandDemo {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		System.out.println(ba);

		List<BankAccountCommand> commands = Arrays.asList(new BankAccountCommand(ba, Action.DEPOSIT, 100),
				new BankAccountCommand(ba, Action.WITHDRAW, 1000));

		// Perform above commands
		System.out.println("Performing commands");
		for (Command command : commands) {
			command.call();
			System.out.println(ba);
		}

		// Undo above commands
		Collections.reverse(commands);
		System.out.println("\nPerforming undo commands");
		for (Command command : commands) {
			command.undo();
			System.out.println(ba);
		}
	}

}
