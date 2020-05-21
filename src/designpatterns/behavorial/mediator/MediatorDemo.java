package designpatterns.behavorial.mediator;

import java.util.Arrays;

public class MediatorDemo {

	public static void main(String[] args) {
		ChatRoomMediator chatroom = new ChatRoom();

		User alex = new ChatUser(chatroom, "1", "Alex");
		User brian = new ChatUser(chatroom, "2", "Brian");
		User charles = new ChatUser(chatroom, "3", "Charles");
		User david = new ChatUser(chatroom, "4", "David");

		chatroom.addUser(alex);
		chatroom.addUser(brian);
		chatroom.addUser(charles);
		chatroom.addUser(david);

		alex.sendPrivate("Can you call me in the evening?", brian);

		System.out.println();

		alex.sendToAll("Hello there! Howz everyone?", Arrays.asList(alex, brian, charles, david));

	}

}
