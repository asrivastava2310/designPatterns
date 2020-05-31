package designpatterns.behavorial.state;

public class LightSwitch {
	private State state; // OnState,OffState

	public LightSwitch() {
		state = new OffState();
	}

	public void on() {
		state.on(this);
	}

	public void off() {
		state.off(this);
	}

	public void setState(State state) {
		this.state = state;
	}
}
