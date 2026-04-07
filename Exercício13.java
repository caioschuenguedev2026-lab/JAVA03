package javaAtv01;

import java.util.Scanner;

public class Exercício13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner receba = new Scanner(System.in);

        System.out.print("Digite O Primeiro Lado : ");
        double a = receba.nextDouble();

        System.out.print("Digite O Segundo lado : ");
        double b = receba.nextDouble();

        System.out.print("Digite O Terceiro lado : ");
        double c = receba.nextDouble();

        if (a == b && b == c) {
            System.out.println("Equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }

        receba.close();

    }
}
