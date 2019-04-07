package sequencial;
import java.util.Locale;
import java.util.Scanner;

public class P1009 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		String nome = scn.next();
		double salario = scn.nextDouble();
		double totalVenda = scn.nextDouble();
		
		double x = salario + (totalVenda * 0.15);
		System.out.printf("TOTAL = R$ %.2f\n",x);
		
		scn.close();

	}

}
