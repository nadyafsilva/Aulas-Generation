package ProjetoJava;

import java.util.Scanner;

public class IntroExercicio2 {

public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int anos, meses, dias;
		System.out.println("Entre com a quantidade de dias: ");
		dias = in.nextInt();
		
		anos = dias/365; dias %= 365;
		meses = dias/30; dias %= 30;

		System.out.println("\nA sua idade é de " + anos + " anos, " + meses + " meses e " + dias + " dias.");
		
		
}

}
