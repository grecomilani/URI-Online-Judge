package repeticao;

import java.util.Scanner;

public class P1078 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d%n", i, n, (i * n));
		}

		scn.close();

	}

}
