package ProjetoJava;

import java.util.Scanner;

public class IntoExercicio3 {

public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com a quantidade de segundos: ");
		int segundos = in.nextInt();
		
		int horas = segundos/3600; segundos %= 3600;
		int minutos = segundos/60; segundos %= 60;
		
		System.out.println("\nO evento durou " + horas + " horas " + minutos + " minutos " + segundos + " segundos");
		
	
}

}
