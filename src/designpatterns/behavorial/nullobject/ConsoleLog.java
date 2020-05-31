package designpatterns.behavorial.nullobject;

public class ConsoleLog implements Log {

	@Override
	public void info(String message) {
		System.out.println(message);
	}

	@Override
	public void warn(String message) {
		System.out.println("WARNING : " + message);
	}

}