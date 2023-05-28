package application;

import service.GuessingGame;

public class Main {
	public static void main(String[] args) {

		GuessingGame game = new GuessingGame(101, 10);
		game.startGame();

	}
}
