package Terceiro;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] list = new int[n];

		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs(list[i] - list[j]) == k) count++;
			}
		}

		System.out.println(count);
		sc.close();
	}
}