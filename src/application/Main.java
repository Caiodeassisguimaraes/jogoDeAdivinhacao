package application;

import java.util.Scanner;

import service.GuessingGame;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		GuessingGame game = new GuessingGame(101, 10);
		//game.startGame();
		
		System.out.println("Bem-vindo ao jogo de adivinha��o!");
		System.out.println();
		System.out.println("Tente adivinhar um n�mero entre 1 e 100.");
		System.out.println("Voc� tem " + game.getMaxTries() + " tentativas.");
		System.out.println();
		while (game.getTries() < game.getMaxTries()) {
			System.out.print("Digite o seu palpite: ");
			int guess = sc.nextInt();
			if (game.testGuess(guess)) {
				break;
			}
		}
		if (game.getTries() == game.getMaxTries()) {
			System.out.println("Voc� perdeu! O n�mero era: " + game.getRandomNumber() + ".");
		}
		
		sc.close();

	}
}
