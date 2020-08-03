package repeticao;

import java.util.Scanner;

public class P1072 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int in=0,out=0;
		int n = scn.nextInt();
		int[] vect = new int[n];
		for (int i = 0; i < vect.length; i++) {
			vect[i] = scn.nextInt();
		}
		for (int i = 0; i < vect.length; i++) {
			if((vect[i] >= 10) && (vect[i] <= 20)) {
				in++;
			}
			else {
				out++;
			}
		}
		
		
		System.out.printf("%d in%n",in);
		System.out.printf("%d out%n",out);
		
		
		scn.close();
	}

}
