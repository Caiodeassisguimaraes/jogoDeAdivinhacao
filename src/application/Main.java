package application;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Random random = new Random();
    	int randomNumber = random.nextInt(101);    	
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println();
        System.out.println("Tente adivinhar um número entre 1 e 100.");
        System.out.println("Você tem 10 tentativas.");
        System.out.println();
        System.out.println(randomNumber);
        int count = 0;
        for (int i = 0; i < 10; i++) {
        	count++;
            System.out.print("Digite o seu palpite: ");
            int guess = sc.nextInt();
            
			if (guess < randomNumber) {
				System.out.println("O número é maior do que " + guess + ".");
				
			} else if (guess > randomNumber){
				System.out.println("O número é menor do que " + guess + ".");
			} if (guess == randomNumber){
				System.out.println("Parabéns! Você acertou o número em " + count + " tentativas.");
				break;
			}
			
			System.out.println();
        }
                                
        sc.close();
    }
}


