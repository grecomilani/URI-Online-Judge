package sequencial;
import java.util.Locale;
import java.util.Scanner;

public class P1010 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		String values1,values2;
		
		values1 = scn.nextLine();
		values2 = scn.nextLine();
		
		String arrayValues1[] = values1.split(" ");
		String arrayValues2[] = values2.split(" ");
		
		int cod1 = Integer.parseInt(arrayValues1[0]);
		int qtd1 = Integer.parseInt(arrayValues1[1]);
		double valor1 = Double.parseDouble(arrayValues1[2]);
		
		int cod2 = Integer.parseInt(arrayValues2[0]);
		int qtd2 = Integer.parseInt(arrayValues2[1]);
		double valor2 = Double.parseDouble(arrayValues2[2]);
		
		double total = ((qtd1 * valor1) + (qtd2 * valor2));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
		
		scn.close();

	}

}
