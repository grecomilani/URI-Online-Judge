package selecao;

import java.util.Locale;
import java.util.Scanner;

public class P1041 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		double x, y;
		x = scn.nextDouble();
		y = scn.nextDouble();
		if((x == 0) && (y == 0)){
			System.out.print("Origem\n");
		}else if(x == 0){
			System.out.print("Eixo Y\n");
		}else if(y == 0){
			System.out.print("Eixo X\n");
		}else if((x > 0) && (y > 0)){
			System.out.print("Q1\n");
		}else if((x < 0) && (y > 0)){
			System.out.print("Q2\n");
		}else if((x < 0) && (y < 0)){
			System.out.print("Q3\n");
		}else if((x > 0) && (y < 0)){
			System.out.print("Q4\n");
		}
		
		scn.close();

	}

}
