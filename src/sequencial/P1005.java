package sequencial;
import java.util.Locale;
import java.util.Scanner;

public class P1005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
	     double a = scan.nextDouble();
	     double b = scan.nextDouble();
	     double x = a*3.5;
	     double y = b*7.5;
	     double z = (x+y)/11;

	     System.out.printf("MEDIA = %.5f%n", z);
	     scan.close();
	}

}
