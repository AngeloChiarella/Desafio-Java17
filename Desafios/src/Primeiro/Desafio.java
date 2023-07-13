package Primeiro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (num > 0) {
				if (num % 2 == 0)
					pares.add(num);

				else
					impares.add(num);
			}
		}

		Collections.sort(pares);
		Collections.sort(impares, Collections.reverseOrder());

		pares.forEach(valor -> System.out.println(valor));
		impares.forEach(valor -> System.out.println(valor));

		sc.close();
	}
}