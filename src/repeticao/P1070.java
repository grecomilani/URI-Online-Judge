package repeticao;

import java.util.Scanner;

public class P1070 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int number = scn.nextInt();
		int cont = 0;
		while (cont < 6) {
			if (number % 2 == 1) {
				System.out.println(number);
				cont++;
			}
			number++;
		}

		scn.close();
	}

}
