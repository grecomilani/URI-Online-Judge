package repeticao;

import java.util.Scanner;

public class P1075 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int i = 0; i <= 10000; i++) {
			if (i % n == 2) {
				System.out.println(i);
			}
		}

		scn.close();
	}

}
