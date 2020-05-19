package designpatterns.behavorial.templatemethod;

public class Ludo extends Game {
	
	private int maxTurns = 20;
	private int turn = 1;

	public Ludo() {
		super(4);
	}

	@Override
	protected int getWinningPlayer() {
		return 0;
	}

	@Override
	protected void takeTurn() {
		System.out.println("Turn " + (turn++) + " taken by player " + currentPlayer);
		currentPlayer = (currentPlayer+1)% numberOfPlayer;
	}

	@Override
	protected boolean haveWinner() {
		return turn == maxTurns;
	}

	@Override
	protected void start() {
         System.out.println("Starting a game of Ludo");
	}

}
