package javaAtv01;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner receba = new Scanner(System.in);
	

        System.out.print("Digite O IMC: ");
        double imc = receba.nextDouble();

        if (imc < 18) {
            System.out.println("Magro");
        } else if (imc <= 25) {
            System.out.println("Normal");
        } else {
            System.out.println("Acima Do Peso");
        }

        receba.close();

	}

}
