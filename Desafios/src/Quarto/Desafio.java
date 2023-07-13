package Quarto;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numLinhas = Integer.parseInt(sc.nextLine());
		String[] linhas = new String[numLinhas];

		String esquerda, direita;

		for (int i = 0; i < linhas.length; i++) {
			linhas[i] = sc.nextLine();
		}

		for (String l : linhas) {
			var meio = l.length() / 2;
			esquerda = l.substring(0, meio);
			direita = l.substring(meio, l.length());
			var uniao = direita + esquerda;
			var retorno = new StringBuilder(uniao).reverse().toString();
			System.out.println(retorno);
		}
		
		sc.close();
	}
}