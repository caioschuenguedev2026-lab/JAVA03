package javaAtv01;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner caio = new Scanner(System.in);

		     double valorCompra, valorFinal;

		System.out.print("Digite o valor da compra: ");
		      valorCompra = caio.nextDouble();
		      valorFinal = (valorCompra > 100) ? valorCompra * 0.90 : valorCompra;
		 System.out.println("Valor final: R$ " + valorFinal);

		        caio.close();
		    }
	}
