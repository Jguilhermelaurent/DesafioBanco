package BancoDigitalContas;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente  cliente = new Cliente();
		cliente.setNome("joao");
		
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}
