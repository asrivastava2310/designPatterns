package designpatterns.behavorial.state;

//Not abstract because don't want concrete implementations to override all methods
public class State {
	public void on(LightSwitch ls) {
		System.out.println("Light is already on");
	}

	public void off(LightSwitch ls) {
		System.out.println("Light is already off");
	}
}
