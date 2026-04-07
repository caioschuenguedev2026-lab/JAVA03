package javaAtv01;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		System.out.println("Digite um numero para ver se é divisivel por 10,5 ou 2:");
		int num = receba.nextInt();

        if (num % 10 == 0) {
            System.out.println("O número é divisível por 10, 5 e 2.");
        } else if (num % 5 == 0) {
            System.out.println("O número é divisível por 5.");
        } else if (num % 2 == 0) {
            System.out.println("O número é divisível por 2.");
        } else {
            System.out.println("O número não é divisível por 10, 5 ou 2.");
        }

        receba.close();

      
        


	}

}
