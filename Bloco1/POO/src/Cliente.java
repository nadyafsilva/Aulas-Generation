
public class Cliente {
	
	/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
     esta classe, em seguida crie um objeto cliente, defina as instancias deste
     objeto e apresente as informa��es deste objeto no console.*/
	
	private String nomeCliente;
	private int idade;
	private String sexo;
	private String endere�o;
	
	public Cliente(String nomeCliente,int idade,String sexo,String endere�o) 
	{
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.sexo = sexo;
		this.endere�o = endere�o;
	}
	public void printInfo()
	{
		
		
	System.out.println("\nNome do cliente: "+nomeCliente+"\nIdade: "+idade+"\nGenero: "+sexo+"\nEndere�o: "+endere�o);
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	
}
