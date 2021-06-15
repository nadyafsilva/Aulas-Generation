package ProjetoJava;
import java.util.*;

public class  {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int anos, meses, dias;
		
		System.out.println("Entre a quantidade de anos: ");
		anos = in.nextInt();
		System.out.println("Entre a quantidade de meses: ");
		meses = in.nextInt();
		System.out.println("Entre a quantidade de dias: ");
		d = in.nextInt();
			
		System.out.println("A sua idade em dias é: " + (365*anos + 30*meses + dias));
		
		in.close();
		
	}

}