package javaAtv01;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner caio = new Scanner(System.in);

		   int numero;

		  System.out.print("Digite um número de 1 a 7: ");
		      numero = caio.nextInt();

		    switch (numero) {

		        case 1:
		        case 2:
		        case 3:
		        case 4:
		        case 5:
		   System.out.println("Dia útil");
		         break;

		        case 6:
		        case 7:
		   System.out.println("Fim de semana");
		         break;

		         default:
		   System.out.println("Número inválido!");
		    }
		        caio.close();
		    }
	}

