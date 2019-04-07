package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class P1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double a, b, r;

		Scanner scn = new Scanner(System.in);
		a = scn.nextDouble();
		b = scn.nextDouble();

		r = (a * b)/12;
		
		System.out.printf("%.3f\n", r);
		
		
	}

}
