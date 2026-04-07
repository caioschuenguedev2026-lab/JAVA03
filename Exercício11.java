package javaAtv01;

import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1 - Ver Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sair");
        System.out.print("Escolha Uma Opção: ");

        int opcao = receba.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Seu Saldo é R$ 1000");
                break;
            case 2:
                System.out.println("Depósito Realizado");
                break;
            case 3:
                System.out.println("Saindo.");
                break;
            default:
                System.out.println("Opção Inválida");
        }

        receba.close();

	}

}
