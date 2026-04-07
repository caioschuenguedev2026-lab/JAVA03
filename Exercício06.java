package javaAtv01;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner caio = new Scanner(System.in);

		     double num1, num2, resultado;
		       char operacao;

		   System.out.print("Digite o primeiro número: ");
		     num1 = caio.nextDouble();

		   System.out.print("Digite o segundo número: ");
		     num2 = caio.nextDouble();

		   System.out.print("Digite a operação (+, -, *, /): ");
		     operacao = caio.next().charAt(0);

		       switch (operacao) {

		           case '+':
		              resultado = num1 + num2;
		   System.out.println("Resultado: " + resultado);
		           break;

		           case '-':
		              resultado = num1 - num2;
		   System.out.println("Resultado: " + resultado);
		           break;
		           case '*':
		              resultado = num1 * num2;
		     System.out.println("Resultado: " + resultado);
		             break;

		            case '/':
		                if (num2 != 0) {
		                    resultado = num1 / num2;
		      System.out.println("Resultado: " + resultado);
		              } else {
		            System.out.println("Erro: divisão por zero!");
		                }
		             break;
		            default:
		  System.out.println("Operação inválida!");
		        }
		        caio.close();
		   }		
	}

