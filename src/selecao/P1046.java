package selecao;

import java.util.Scanner;

public class P1046 {

	public static void main(String[] args) {
		int horaInicial,horaFinal;
		Scanner scan = new Scanner(System.in);
		
		horaInicial = scan.nextInt();
		horaFinal = scan.nextInt();
		
		if(horaInicial == horaFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else if(horaInicial < horaFinal){
			System.out.printf("O JOGO DUROU %d HORA(S)\n", horaFinal - horaInicial);
		}
		else if(horaInicial > horaFinal) {
			System.out.printf("O JOGO DUROU %d HORA(S)\n",(horaFinal+24) - horaInicial);
		}
		
		scan.close();

	}

}
