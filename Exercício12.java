package javaAtv01;

import java.util.Scanner;

public class Exercício12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Scanner receba = new Scanner(System.in);

	        System.out.print("Digite Um Número: ");
	        int num = receba.nextInt();

	        if (num % 3 == 0 && num % 5 == 0) {
	            System.out.println("Múltiplo de 3 e 5");
	        } else if (num % 3 == 0) {
	            System.out.println("Apenas Múltiplo de 3");
	        } else if (num % 5 == 0) {
	            System.out.println("Apenas Múltiplo de 5");
	        } else {
	            System.out.println("Nenhum");
	        }

	        receba.close();
	}
}
