package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        System.out.println("Bem-vindo ao jogo de adivinha��o!");
        System.out.println();
        System.out.println("Tente adivinhar um n�mero entre 1 e 100.");
        System.out.println("Voc� tem 10 tentativas.");
        System.out.println();
        int count = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o seu palpite: ");
            int a = sc.nextInt();
            
			if (a < 3) {
				System.out.println("O n�mero � menor do que " + 3 + ".");
				
			} else if (a > 3){
				System.out.println("O n�mero � maior do que " + 3 + ".");
			} if (a == 3){
				break;
			}
			count++;
			System.out.println();
        }
        
        System.out.println("Parab�ns! Voc� acertou o n�mero em " + count + " tentativas.");
                
        sc.close();
    }
}


