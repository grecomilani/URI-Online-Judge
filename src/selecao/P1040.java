package selecao;

import java.util.Locale;
import java.util.Scanner;

public class P1040 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		float n1,n2,n3,n4;
		float nExame = 0;
		float mp,mf;
		boolean exame = false;
		
		n1 = scn.nextFloat();
		n2 = scn.nextFloat();
		n3 = scn.nextFloat();
		n4 = scn.nextFloat();
		
		mp = ((2 * n1) + (3 * n2) + (4 * n3) + (1 * n4)) / 10;
		
		System.out.printf("Media: %.1f%n",(mp));
		
		if(mp >= 7.0) {
			System.out.println("Aluno aprovado.");
		}else if(mp < 5.0) {
			System.out.println("Aluno reprovado.");
		}else if((mp >= 5.0) && (mp <= 6.9)) {
			System.out.println("Aluno em exame.");
			exame = true;
		}
		
		
		if(exame == true) {
			nExame = scn.nextFloat();
			System.out.printf("Nota do exame: %.1f%n",(nExame));
			mf = (mp + nExame) / 2;
			if(mf >= 5.0) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n",(mf));
		}
		mf = (nExame + mp) / 2;
		scn.close();
		
	}

}
