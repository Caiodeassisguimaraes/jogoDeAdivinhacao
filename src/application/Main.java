package application;

import java.util.Scanner;

import service.GuessingGame;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		GuessingGame game = new GuessingGame(101, 10);
		System.out.println(game.getRandomNumber());
		game.startGame();

		sc.close();

	}
}
