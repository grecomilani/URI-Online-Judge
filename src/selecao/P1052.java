package selecao;

import java.util.Scanner;

public class P1052 {

	public static void main(String[] args) {

		String[] meses = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		Scanner scn = new Scanner(System.in);
		int mes = scn.nextInt();

		System.out.println(meses[mes - 1]);

		scn.close();

	}

}
