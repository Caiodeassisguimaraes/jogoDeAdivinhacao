package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println();
        System.out.println("Tente adivinhar um número entre 1 e 100.");
        System.out.println("Você tem 10 tentativas.");
        System.out.println();
        int count = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o seu palpite: ");
            int a = sc.nextInt();
            
			if (a < 3) {
				System.out.println("O número é menor do que " + 3 + ".");
				
			} else if (a > 3){
				System.out.println("O número é maior do que " + 3 + ".");
			} if (a == 3){
				break;
			}
			count++;
			System.out.println();
        }
        
        System.out.println("Parabéns! Você acertou o número em " + count + " tentativas.");
                
        sc.close();
    }
}


