package repeticao;

import java.util.Scanner;

public class P1065 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int number, pairs = 0;

		for (int i = 0; i < 5; i++) {
			number = scn.nextInt();
			if (number % 2 == 0) {
				pairs++;
			}

		}

		System.out.printf("%d valores pares\n", pairs);

		scn.close();

	}

}
