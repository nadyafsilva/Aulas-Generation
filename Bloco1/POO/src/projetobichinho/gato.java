package projetobichinho;

public class gato extends ANIMAL{

	public gato(String nome, int idade, String especie, String porte, String raca, String cor, String doenca,
			String vacina, String castrado, String comportamento, String endereco, int telefone, String sexo) 
	{
		super(nome, idade, especie, porte, raca, cor, doenca, vacina, castrado, comportamento, endereco, telefone, sexo);		
	}
	public void imprimirInfo () 
	{
		System.out.println ("Ol�, eu sou um(a) "+getEspecie()+"da ra�a"+getRaca()+"de cor"+getCor()+",meu nome � "+getNome()+ " sou " +getSexo()+ " tenho "
				+getIdade()+"e sou de" +getPorte()+"sou muito"+getComportamento()+" e tenho "+getDoenca()+"ja fui "+getCastrado()+
				"voc� pode me encontrar no endere�o: "+getEndereco()+" ou pelo telefone: "+getTelefone()+ "Vem ser meu amigo!");
	}


}
