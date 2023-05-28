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

	// This method tests the player's guess
	public boolean testGuess(int guess) {

		tries++;
		if (guess == randomNumber) {
			System.out.println("Parabéns! Você acertou o número em " + tries + " tentativas.");
			return true;
		} else if (guess < randomNumber) {
			System.out.println("O número é maior do que " + guess + ".");
			System.out.println();
		} else {
			System.out.println("O número é menor do que " + guess + ".");
			System.out.println();
		}

		return false;
	}

}
