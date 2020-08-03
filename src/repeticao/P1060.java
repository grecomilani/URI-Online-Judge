package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class P1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		float number;
		int positive = 0;
		
		
		for (int i = 1; i <= 6; i++) {
			number = scn.nextFloat();
			if(number > 0) {
				positive++;
			}
		}
		
		System.out.printf("%d valores positivos\n",positive);
		
		scn.close();
		
	}

}
