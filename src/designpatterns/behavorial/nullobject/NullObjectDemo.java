package designpatterns.behavorial.nullobject;

public class NullObjectDemo {

	public static void main(String[] args) {
		Log log = new ConsoleLog();
		BankAccount ba = new BankAccount(log);
		ba.deposit(100);
		
		//If we don't want any log
		Log nullLog = new NullLog();
		BankAccount ba2 = new BankAccount(nullLog);
		ba2.deposit(100);
	}

}
