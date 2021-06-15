package ProjetoJava;

import java.util.Scanner;

public class RepetiçãoExercicio5 {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int x, num = 0;
	        do {
	            System.out.println("Entre com o seu número: ");
	            x = in.nextInt();
	            num += x;
	        } while (x != 0);
	        System.out.println(num);
	    }

}
