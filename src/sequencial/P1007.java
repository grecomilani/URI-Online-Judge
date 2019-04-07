package sequencial;
import java.util.Scanner;

public class P1007 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		
		int diferenca = ((a * b) - (c * d));
		
		System.out.println("DIFERENCA = " + diferenca);
		
		scn.close();

	}

}
