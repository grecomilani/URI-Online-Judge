package sequencial;
import java.util.Locale;
import java.util.Scanner;

public class P1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		double a = scn.nextDouble();
		double b = scn.nextDouble();
		double c = scn.nextDouble();
		
		double pi = 3.14159;
		
		//Calculo area
		
		//BASE * ALTURA / 2
		System.out.printf("TRIANGULO: %.3f\n",(a * c / 2));
		
		//PI * RAIO ao quadrado
		System.out.printf("CIRCULO: %.3f\n",pi * Math.pow(c, 2));
		
		//BASE Maior + BASE Menor / 2 * ALTURA
		System.out.printf("TRAPEZIO: %.3f\n",(a + b) / 2 * c);
		
		//LADO ao quadrado
		System.out.printf("QUADRADO: %.3f\n",Math.pow(b, 2));
		
		//BASE * ALTURA
		System.out.printf("RETANGULO: %.3f\n",a * b);
		
		
		
		scn.close();

	}

}
