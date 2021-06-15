package ProjetoJava;

import java.util.Scanner;

public class DecisaoExercicio2 {

	 public static void main(String[] args){

	        Scanner in = new Scanner(System.in);

	        int num1, num2, num3, resultado;
	        System.out.println("Entre com o primeiro número: ");
	        num1 = in.nextInt();
	        System.out.println("Entre com o segundo número: ");
	        num2 = in.nextInt();
	        System.out.println("Entre com o terceiro número: ");
	        num3 = in.nextInt();

	        if(num3 < num1){
	        	resultado = num1; num1 = num3; num3 = resultado;
	        }
	        if(num2 < num1){
	        	resultado = num1; num1 = num2; num2 = resultado;
	        }
	        if(num3 < num2){
	        	resultado = num2; num2 = num3; num3 = resultado;
	        }

	        System.out.println(num1 + " " + num2 + " " + num3 + "\n");
	 }
	 
}
