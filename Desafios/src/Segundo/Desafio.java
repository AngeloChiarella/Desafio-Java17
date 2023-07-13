package Segundo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		BigDecimal n = sc.nextBigDecimal();

		int notasTroco = n.intValue();
		int moedasTroco = n.remainder(BigDecimal.ONE).multiply(BigDecimal.valueOf(100)).intValue();
		int[] notas = { 100, 50, 20, 10, 5, 2 };
		int[] moedas = { 100, 50, 25, 10, 5, 1 };

		System.out.println("NOTAS:");
		final int[] notasTrocoArray = { notasTroco };
		Arrays.stream(notas).forEach(nota -> {
			int qtdNotas = notasTrocoArray[0] / nota;
			notasTrocoArray[0] %= nota;
			System.out.println(qtdNotas + " nota(s) de R$" + nota + ".00");
		});

		moedasTroco += notasTroco * 100;

		System.out.println("MOEDAS:");
		for (int i = 0; i < moedas.length; i++) {
			int qtdMoedas = moedasTroco / moedas[i];
			moedasTroco = moedasTroco % moedas[i];
			double valorMoedaDouble = (double) moedas[i] / 100;
			System.out.println(qtdMoedas + " moeda(s) de R$" + String.format("%.2f", valorMoedaDouble));
		}
		sc.close();
	}
}