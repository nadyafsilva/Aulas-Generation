package ProjetoJava;

import java.util.Scanner;

public class DecisaoExcercicio1 {
	

		public static void main (String [] args)
		{
			Scanner in = new Scanner(System.in);

	        int num1, num2;
	        System.out.println("Digite o primeiro n�mero: ");
	        num1 = in.nextInt();
	        System.out.println("Digite o segundo n�mero: ");
	        num2 = in.nextInt();
	        if(num2 > num1) num1 = num2;
	        System.out.println("Digite o terceiro n�mero: ");
	        num2 = in.nextInt();
	        if(num2 > num1) num1 = num2;

	        System.out.println("O maior n�mero �: " + num1);
		}
	}

