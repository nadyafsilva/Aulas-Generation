package ProjetoJava;

import java.util.Scanner;

public class Testedata {

	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Em qual dia da semana come�a o m�s?(considere domingo = 1 e s�bado = 7)");
	        int dia = scan.nextInt();
	        System.out.println("Quantos dias tem o m�s?");
	        int dias = scan.nextInt();
	        System.out.println("D S T Q Q S S");
	        System.out.println("-------------");
	        for(int i = 1; i < dia; i++){
	            System.out.print("  ");
	        }
	        for(int i = 1; i <= dias; i++){
	            System.out.print("|" + i);
	            if(dia == 7){
	                dia = 1;
	                System.out.print("\\n");
	            }else{
	                dia++;
	            }
	        }
	    }
	}

