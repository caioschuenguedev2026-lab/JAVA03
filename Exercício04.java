package javaAtv01;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner receba = new Scanner(System.in);

        int prato, sobremesa, bebida;
        int totalCalorias = 0;

     
        System.out.println("Escolha o prato que gostaria:");
        System.out.println("1 - Vegetariano (180 cal)");
        System.out.println("2 - Peixe (230 cal)");
        System.out.println("3 - Frango (250 cal)");
        System.out.println("4 - Carne (350 cal)");
        prato = receba.nextInt();

        switch (prato) {
            case 1: totalCalorias += 180; break;
            case 2: totalCalorias += 230; break;
            case 3: totalCalorias += 250; break;
            case 4: totalCalorias += 350; break;
        }

        
        System.out.println("\nEscolha a sobremesa que gostaria:");
        System.out.println("1 - Abacaxi (75 cal)");
        System.out.println("2 - Sorvete diet (110 cal)");
        System.out.println("3 - Mousse diet (170 cal)");
        System.out.println("4 - Mousse chocolate (200 cal)");
        sobremesa = receba.nextInt();

        switch (sobremesa) {
            case 1: totalCalorias += 75; break;
            case 2: totalCalorias += 110; break;
            case 3: totalCalorias += 170; break;
            case 4: totalCalorias += 200; break;
        }

       
        System.out.println("\nEscolha a bebida que gostaria:");
        System.out.println("1 - Chá (20 cal)");
        System.out.println("2 - Suco de laranja (70 cal)");
        System.out.println("3 - Suco de melão (100 cal)");
        System.out.println("4 - Refrigerante diet (65 cal)");
        bebida = receba.nextInt();

        switch (bebida) {
            case 1: totalCalorias += 20; break;
            case 2: totalCalorias += 70; break;
            case 3: totalCalorias += 100; break;
            case 4: totalCalorias += 65; break;
        }

        System.out.println("\nTotal de calorias: " + totalCalorias + " cal");

        receba.close();

         }

	}

