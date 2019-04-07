package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class P1016 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int d;
		
		Scanner scn = new Scanner(System.in);
		d = scn.nextInt();

		int t = (int) (d / ((90 / 60.0) - (60 / 60.0)));

		System.out.printf("%d minutos\n", t);

	}

}
