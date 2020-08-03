package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class P1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float[] result = new float[n];

		for (int i = 0; i < n; i++) {
			float nota1 = scn.nextFloat();
			float nota2 = scn.nextFloat();
			float nota3 = scn.nextFloat();
			result[i] = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

		}

		for (int i = 0; i < result.length; i++) {
			System.out.printf("%.1f%n", result[i]);
		}

		scn.close();

	}

}
