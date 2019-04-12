package sequencial;

import java.util.Scanner;

public class P1019 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int h;
		int m;
		int s = scn.nextInt();
		
		h = s / 3600;
		m = (s % 3600) / 60;
		s = s % 60;

		
		System.out.printf("%d:%d:%d\n", h, m, s);

		
		scn.close();
	}

}
