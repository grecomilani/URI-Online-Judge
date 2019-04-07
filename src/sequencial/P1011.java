package sequencial;
import java.util.Locale;
import java.util.Scanner;

public class P1011 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = scn.nextFloat();
		
		
		double x = ((4.0 / 3) * pi * Math.pow(raio, 3));
		System.out.printf("VOLUME = %.3f\n",x);
		
		scn.close();
	}

}
