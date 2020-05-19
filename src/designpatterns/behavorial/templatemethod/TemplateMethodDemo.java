package designpatterns.behavorial.templatemethod;

public class TemplateMethodDemo {

	public static void main(String[] args) {
		Chess gameOfChess = new Chess();
		gameOfChess.run();
		
		System.out.println();
		
		Ludo gameOfLudo = new Ludo();
		gameOfLudo.run();
	}

}
