package javaAtv01;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner receba = new Scanner(System.in);

        String usuario, senha;

        System.out.print("Digite O Usuário: ");
        usuario = receba.nextLine();

        System.out.print("Digite A Senha: ");
        senha = receba.nextLine();

        if (usuario.equals("admin") && senha.equals("123")) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }

        receba.close();

	     }
	}
