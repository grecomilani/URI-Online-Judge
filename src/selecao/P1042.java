package selecao;

import java.util.Scanner;

public class P1042 {

	public static void main(String[] args) {
		
			Scanner scn = new Scanner(System.in);
			int aux = 0;
			int vet[] = new int[3];
			int vetOrigin[] = new int[3];
			
			for(int i=0; i < vet.length; i++){
	            vet[i] = scn.nextInt();
	            vetOrigin[i] = vet[i];
	        }
			
			for(int i=0; i<vet.length; i++){
				for (int j = 0; j < vet.length; j++) {
					if(vet[i] < vet[j]) {
						aux = vet[i];
	                    vet[i] = vet[j];
	                    vet[j] = aux;
					}
				}
	        }
			
			for(int i=0; i<vet.length; i++){
	            System.out.println(vet[i]);
	        }
			
			System.out.println("");
			
			for(int i=0; i<vetOrigin.length; i++){
	            System.out.println(vetOrigin[i]);
	        }
			
			scn.close();

	}

}
