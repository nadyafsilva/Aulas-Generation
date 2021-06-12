package ProjetoJava;

public class ArrayVetorExercicio1 {
	
	public static void main(String[] args){

        int[] vetor = {1, 0, 5, -2, -5, 7};
        int soma = vetor[0] + vetor[1] + vetor[5];
        System.out.println("A soma dos valores V[0], V[1] e V[5] é: " + soma);
        vetor[3] = 100;
        for(int i = 0; i<6; i++) System.out.println(vetor[i]);
        
	}
	

}
