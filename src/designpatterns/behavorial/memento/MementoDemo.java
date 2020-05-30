package designpatterns.behavorial.memento;

public class MementoDemo {
	public static void main(String[] args) {
        BankAccount ba = new BankAccount(100);
        Memento m1 = ba.deposit(50);  //balance = 150
        Memento m2 = ba.deposit(25);  //balance = 175
        Memento m3 = ba.deposit(25);  //balance = 200
        System.out.println(ba);
        
        //restore to m1
        ba.restore(m1);
        System.out.println("After restoring Memento m1 : "+ba);
        
      //restore to m2
        ba.restore(m2);
        System.out.println("After restoring Memento m2 : "+ba);
	}
}
