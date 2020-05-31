package designpatterns.behavorial.nullobject;

public final class NullLog implements Log{

	@Override
	public void info(String message) {
		//do nothing
	}

	@Override
	public void warn(String message) {
		//do nothing
	}

}
