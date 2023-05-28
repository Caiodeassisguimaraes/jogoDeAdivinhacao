package service;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	// Attributes

	private int randomNumber;
	private int maxRange;
	private int maxTries;
	private int tries;

	// Constructors

	public GuessingGame() {

	}

	public GuessingGame(int maxRange, int maxTries) {
		this.maxRange = maxRange;
		this.maxTries = maxTries;
		this.setRandomNumber(createRandomNumber(maxRange));
	}

	// Getters and Setters

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public int getMaxTries() {
		return maxTries;
	}

	public void setMaxTries(int maxTries) {
		this.maxTries = maxTries;
	}

	public int getTries() {
		return tries;
	}

	public void setTries(int tries) {
		this.tries = tries;
	}

	// Methods

	// This method generates a random number
	public int createRandomNumber(int randomNumber) {
		Random random = new Random();
		randomNumber = random.nextInt(maxRange);
		return randomNumber;
	}

	// This method starts the game
	public void startGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-vindo ao jogo de adivinha��o!");
		System.out.println();
		System.out.println("Tente adivinhar um n�mero entre 1 e 100.");
		System.out.println("Voc� tem " + getMaxTries() + " tentativas.");
		System.out.println();
		while (tries < maxTries) {
			System.out.print("Digite o seu palpite: ");
			int guess = sc.nextInt();
			if (testGuess(guess)) {
				break;
			}
		}
		if (tries == maxTries) {
			System.out.println("Voc� perdeu! O n�mero era: " + randomNumber + ".");
		}

		sc.close();
	}

	// This method tests the player's guess
	public boolean testGuess(int guess) {

		tries++;
		if (guess == randomNumber) {
			System.out.println("Parab�ns! Voc� acertou o n�mero em " + tries + " tentativas.");
			return true;
		} else if (guess < randomNumber) {
			System.out.println("O n�mero � maior do que " + guess + ".");
			System.out.println();
		} else {
			System.out.println("O n�mero � menor do que " + guess + ".");
			System.out.println();
		}

		return false;
	}

}
