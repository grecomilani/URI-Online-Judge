package sequencial;

import java.util.Scanner;

public class P1020 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int a = n / 365;
		int rA = n % 365;
		int rM = rA % 30;
		int m = rA / 30;
		int d = rM % 30;
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",a,m,d);
		
		
		scn.close();
	}

}
