package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class P1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		double km = scn.nextDouble();
		double litro = scn.nextDouble();
		
		System.out.printf("%.3f km/l\n",(km / litro));
		
		scn.close();

	}

}
