package javaAtv01;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Scanner caio = new Scanner(System.in);

	    double peso, altura, imc;

		    System.out.print("Digite seu peso kg : ");
		      peso = caio.nextDouble();

		    System.out.print("Digite sua altura m : ");
		      altura = caio.nextDouble();
		    
		      imc = peso / (altura * altura);

		    System.out.printf("Seu IMC é: %.2f\n", imc);
		      if (imc < 18.5) {
		    System.out.println("Classificação: Abaixo do peso");
		       } else if (imc >= 18.5 && imc < 25) {
		    System.out.println("Classificação: Normal");
		       } else if (imc >= 25 && imc < 30) {
		    System.out.println("Classificação: Sobrepeso");
		       } else if (imc >= 30 && imc < 40) {
		    System.out.println("Classificação: Obesidade");
		       } else {
		    System.out.println("Classificação: Obesidade Mórbida");
		    
		        }

		        caio.close();
		    }
		

	}


