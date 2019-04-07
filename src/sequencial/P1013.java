package sequencial;

import java.util.Scanner;

public class P1013 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int maior;
		
		if((a > b) && (a > c)) {
			maior = a;
		}else if((b > a) && (b > c)) {
			maior = b;
		}else {
			maior = c;
		}
		
		System.out.println(maior + " eh o maior");
		
		scn.close();

	}

}
