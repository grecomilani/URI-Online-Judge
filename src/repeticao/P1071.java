package repeticao;

import java.util.Scanner;

public class P1071 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int x = scn.nextInt();
		int y = scn.nextInt();
		int soma = 0;

		if (x < y) {
			for (int i = x + 1; i < y; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		} else {
			for (int i= y + 1; i < x; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}
		System.out.println(soma);


		scn.close();
	}

}
