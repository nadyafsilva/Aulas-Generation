
public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Felipe Giacomelli",25,"Masculino","Rua celso...");

		cliente1.printInfo();
		
		System.out.println("\nMudan�a de endere�o");
		
		cliente1.setEndere�o("\nRua Juventos...");
		cliente1.printInfo();
		
		
	}

}
