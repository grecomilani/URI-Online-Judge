package repeticao;

import java.util.Scanner;

public class P1067 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int number = scn.nextInt();

		if ((number >= 1) && (number <= 1000)) {

			for (int i = 1; i <= number; i++) {
				if (!((i % 2) == 0)) {
					System.out.println(i);
				}
			}

		}

		scn.close();

	}

}
