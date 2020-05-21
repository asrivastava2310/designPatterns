package designpatterns.behavorial.mediator;

import java.util.HashMap;
import java.util.Map;

//Concrete Mediator
public class ChatRoom implements ChatRoomMediator {
	private Map<String, User> usersMap = new HashMap<>();

	@Override
	public void sendPrivateMessage(String message, User user) {
		User u = usersMap.get(user.getUserId());
		u.receive(message);
	}

	@Override
	public void addUser(User user) {
		this.usersMap.put(user.getUserId(), user);
	}
}
