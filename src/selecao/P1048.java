package selecao;
import java.util.Locale;
import java.util.Scanner;

public class P1048 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		float salario = scn.nextFloat();
		float salarioAntigo = salario;
		
		if((salario > 0) && (salario <= 400.00)){
			salario = calculaPorcentagem(15,salario);
			retornaAjusteSalarial(15,salario,salarioAntigo);
		}
		else if((salario >= 400.01) && (salario <= 800.00)){
			salario = calculaPorcentagem(12,salario);
			retornaAjusteSalarial(12,salario,salarioAntigo);
		}
		else if((salario >= 800.00) && (salario <= 1200.00)){
			salario = calculaPorcentagem(10,salario);
			retornaAjusteSalarial(10,salario,salarioAntigo);
		}
		else if((salario >= 1200.01) && (salario <= 2000.00)){
			salario = calculaPorcentagem(7,salario);
			retornaAjusteSalarial(7,salario,salarioAntigo);
		}
		else if(salario > 2000.00){
			salario = calculaPorcentagem(4,salario);
			retornaAjusteSalarial(4,salario,salarioAntigo);
		}
		
		
		scn.close();

	}
	
	public static float calculaPorcentagem(int porcentagem,float salario) {
		salario = salario  + (salario * porcentagem / 100);
		return salario;
	}
	
	public static void retornaAjusteSalarial(int porcentagem,float salario,float salarioAntigo) {
		System.out.printf("Novo salario: %.2f%n", salario);
		System.out.printf("Reajuste ganho: %.2f%n" , (salario - salarioAntigo));
		System.out.printf("Em percentual: %d %c%n",porcentagem,'%');
	}
	
}
