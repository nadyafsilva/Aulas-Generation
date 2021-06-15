package ProjetoJava;

import java.util.Scanner;

public class IntroExercicio1 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int anos, meses, dias;
		
		System.out.println("Entre a quantidade de anos: ");
		anos = in.nextInt();
		System.out.println("\nEntre a quantidade de meses: ");
		meses = in.nextInt();
		System.out.println("\nEntre a quantidade de dias: ");
		dias = in.nextInt();
			
		System.out.println("\nA sua idade em dias é: " + (365*anos + 30*meses + dias));
		
	
}
}
