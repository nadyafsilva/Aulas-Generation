package projetobichinho;

public class AnimaisSilvestres extends ANIMAL 
{
	
	       private String pFaunaPais;
	       private String pAdaptacao;

           /*TESTE DO GITHUB*/
	
	       public AnimaisSilvestres(String nome, int idade, String especie, String porte, String raca, String cor, String doenca,
			String vacina, String castrado, String comportamento,String endereco, int telefone,String sexo,String pFaunaPais,String pAdaptacao) 
	       {
	    	 
		
		     super(nome, idade, especie, porte, raca, cor, doenca, vacina, castrado, comportamento, sexo,telefone,endereco);
		     this.pFaunaPais = pFaunaPais;
		     this.pAdaptacao = pAdaptacao;
	       }
	
		public void imprimirInfo () 
		   {
			System.out.println ("Ol�, eu sou um(a) "+getEspecie()+"da ra�a"+getRaca()+"de cor"+getCor()+",meu nome � "+
		   getNome()+ " sou " +getSexo()+ " tenho "+getIdade()+"e sou de" +getPorte()+"sou muito"+getComportamento()+
		   " e tenho "+getDoenca()+"ja fui "+getCastrado()+"Meu pais de origem e: "+pFaunaPais+"Meu nivel de adapta��o:"+pAdaptacao);
	
		   }

		public String getpFaunaPais() {
			return pFaunaPais;
		}

		public void setpFaunaPais(String pFaunaPais) {
			this.pFaunaPais = pFaunaPais;
		}

		public String getpAdaptacao() {
			return pAdaptacao;
		}

		public void setpAdaptacao(String pAdaptacao) {
			this.pAdaptacao = pAdaptacao;
		}
		
		
}
