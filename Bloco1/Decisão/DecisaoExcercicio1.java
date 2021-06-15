package ProjetoJava;

import java.util.Scanner;

public class DecisaoExcercicio1 {
	

		public static void main (String [] args)
		{
			Scanner in = new Scanner(System.in);

	        int num1, num2;
	        System.out.println("Digite o primeiro número: ");
	        num1 = in.nextInt();
	        System.out.println("Digite o segundo número: ");
	        num2 = in.nextInt();
	        if(num2 > num1) num1 = num2;
	        System.out.println("Digite o terceiro número: ");
	        num2 = in.nextInt();
	        if(num2 > num1) num1 = num2;

	        System.out.println("O maior número é: " + num1);
		}
	}

