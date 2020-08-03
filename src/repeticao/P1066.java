package repeticao;

import java.util.Scanner;

public class P1066 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int number, impar = 0, par = 0, positivo = 0, negativo = 0;

		for (int i = 0; i < 5; i++) {
			number = scn.nextInt();
			if (number % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			if (number > 0) {
				positivo++;
			} else if (number < 0) {
				negativo++;
			}
		}

		System.out.printf("%d valor(es) par(es)\n", par);
		System.out.printf("%d valor(es) impar(es)\n", impar);
		System.out.printf("%d valor(es) positivo(s)\n", positivo);
		System.out.printf("%d valor(es) negativo(s)\n", negativo);

		scn.close();

	}

}
