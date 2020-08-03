package selecao;

import java.util.Scanner;

public class P1047 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        int hora_start = scan.nextInt();
        int minu_start = scan.nextInt();
        int all_minu_start = hora_start * 60 + minu_start;

        int hora_end = scan.nextInt();
        int minu_end = scan.nextInt();
        int all_minu_end = hora_end * 60 + minu_end;
        System.out.println("all_minu_end " + all_minu_end );

        int all_minu_dif = (24 * 60 - all_minu_start) + all_minu_end;

        System.out.println("all_minu_dif " + all_minu_dif );
        int horas = all_minu_dif / 60;
        int minutos = all_minu_dif % 60;
       

        if (horas >= 24 && minutos >= 1) {
            horas = horas % 24;
        };
        System.out.println("horas " + horas);
        System.out.println("minutos " + minutos);
        System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)\n", horas, minutos);
        scan.close();
	}

}
