package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class P1015 {
//DISTANCIA ENTRE DOIS PONTOS
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		double x1 = scn.nextFloat();
		double y1 = scn.nextFloat();
		
		double x2 = scn.nextFloat();
		double y2 = scn.nextFloat();
		
		double distancia = Math.sqrt((Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1), 2)));
		
		System.out.printf("%.4f\n",distancia);
		scn.close();
		

	}

}
