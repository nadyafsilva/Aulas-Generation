package ProjetoJava;

import java.util.Scanner;

public class Repeti��oExercicio5 {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int x, num = 0;
	        do {
	            System.out.println("Entre com o seu n�mero: ");
	            x = in.nextInt();
	            num += x;
	        } while (x != 0);
	        System.out.println(num);
	    }

}
