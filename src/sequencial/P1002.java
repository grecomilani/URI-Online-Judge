package sequencial;
import java.util.Locale;
import java.util.Scanner;

public class P1002 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		double area;
		double n = 3.14159;
		double raio = scn.nextDouble();
		
		area = n * Math.pow(raio,2);
		
		System.out.printf("A=%.4f%n",area);
		
		scn.close();
	}
}
