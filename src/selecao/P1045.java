package selecao;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class P1045 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		float a, b, c;
		float[] numeros = new float[3];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = scan.nextFloat();
		}
		Arrays.sort(numeros);
		c = numeros[0];
		b = numeros[1];
		a = numeros[2];

		if (a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO RETANGULO");
		} else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		} else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}

		if (a == b && b == c) {
			System.out.println("TRIANGULO EQUILATERO");
		} else if (a == b || b == c || c == a) {
			System.out.println("TRIANGULO ISOSCELES");
		}

		scan.close();

	}

}
