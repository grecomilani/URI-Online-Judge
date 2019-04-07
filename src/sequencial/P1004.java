package sequencial;
import java.util.Scanner;

public class P1004 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int prod = a * b;
		
		System.out.println("PROD = " + prod);
		
		scn.close();
	}

}
