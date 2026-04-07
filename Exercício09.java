package javaAtv01;

import java.util.Scanner;

public class Exercício09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner receba = new Scanner(System.in);

        System.out.print("Digite Um Número: ");
        int num = receba.nextInt();

        if (num >= 10 && num <= 50) {
                System.out.println( "Dentro Do Intervalo" );
        } else {
          System.out.print("Fora Do Intervalo");
          
        receba.close();
	  }
         }
}
