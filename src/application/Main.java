package application;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Random random = new Random();
    	int randomNumber = random.nextInt(101);    	
        System.out.println("Bem-vindo ao jogo de adivinha��o!");
        System.out.println();
        System.out.println("Tente adivinhar um n�mero entre 1 e 100.");
        System.out.println("Voc� tem 10 tentativas.");
        System.out.println();
        System.out.println(randomNumber);
        int count = 0;
        for (int i = 0; i < 10; i++) {
        	count++;
            System.out.print("Digite o seu palpite: ");
            int guess = sc.nextInt();
            
			if (guess < randomNumber) {
				System.out.println("O n�mero � maior do que " + guess + ".");
				
			} else if (guess > randomNumber){
				System.out.println("O n�mero � menor do que " + guess + ".");
			} if (guess == randomNumber){
				System.out.println("Parab�ns! Voc� acertou o n�mero em " + count + " tentativas.");
				break;
			}
			
			System.out.println();
        }
                                
        sc.close();
    }
}


