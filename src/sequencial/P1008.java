package sequencial;
import java.util.Locale;
import java.util.Scanner;

public class P1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
	    int a = scn.nextInt();
	    int b = scn.nextInt();
	    float c = scn.nextFloat();
		
	    System.out.printf("NUMBER = %d\n", a);
	    System.out.printf("SALARY = U$ %.2f\n", b * c);
		
		scn.close();
	}

}
