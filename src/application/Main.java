package application;

import java.util.Scanner;

import service.GuessingGame;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		GuessingGame game = new GuessingGame(101, 10);
		System.out.println(game.getRandomNumber());

		//char answer;
		//do {
			game.startGame();
		//	System.out.println("Quer jogar de novo? (s/n)");
		//	answer = sc.next().charAt(0);
		//} while (answer != 'n');

		sc.close();
	}
}
