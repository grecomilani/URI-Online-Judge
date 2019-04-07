package sequencial;
import java.util.Locale;
import java.util.Scanner;

public class P1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		double a = scn.nextFloat();
		double b = scn.nextFloat();
		double c = scn.nextFloat();
		
		double mpa = a * 2.0;
		double mpb = b * 3.0;
		double mpc = c * 5.0;
		
		double media = (mpa+mpb+mpc) / 10;
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		scn.close();
		
	}

}
