package selecao;

import java.util.Scanner;

public class P1035 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a,b,c,d;
		
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		d = scn.nextInt();
		
		if((b > c) && (d > a) && ((c + d) > (a + b)) && (a> 0)&& (d> 0) && (a % 2 == 0)){
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
		
		scn.close();

	}

}
