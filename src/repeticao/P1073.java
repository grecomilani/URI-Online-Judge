package repeticao;

import java.util.Scanner;

public class P1073 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "^" + "2" + " = " + (int) Math.pow(i, 2));
			}
		}
		scn.close();

	}

}
