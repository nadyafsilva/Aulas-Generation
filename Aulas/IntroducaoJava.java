package ProjetoJava;

import java.util.Scanner;

public class IntroducaoJava {
	
	public static void main (String[] args) {
		
		double nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("\nA media das notas foi: "+media);
		
		System.out.printf("\nMédia das notas arredondada: %2.2f",media);
		
		nota1 = Math.sqrt(Math.sqrt(nota2));
		nota3 = Math.pow(nota1,3);
		media = nota1 % nota2;
		
		
		
		
		
		
	
		
	}

}
