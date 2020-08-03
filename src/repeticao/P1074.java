package repeticao;

import java.util.Scanner;

public class P1074 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = scn.nextInt();
		}

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] == 0) {
				System.out.println("NULL");
			} else {
				if (vect[i] % 2 == 0) {
					System.out.print("EVEN ");
				} else {
					System.out.print("ODD ");
				}
			}
			if (vect[i] > 0) {
				System.out.println("POSITIVE");
			} else if (vect[i] != 0 && vect[i] < 0) {
				System.out.println("NEGATIVE");
			}
		}

		scn.close();

	}

}
