
public class Principal {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente(1, 3011, 5000, "Bianca Santos Alves");
		ContaPremium conta2 = new ContaPremium(2, 4319, 5000, 1000, "Suzana Pinheiro Santos Alves");
		ContaPoupança conta3 = new ContaPoupança(3, 8534, 5000, "Alex Sandro Santos Alves");

		conta1.infoConta();
		System.out.println("-------------------------------------------------------");
		conta2.infoConta();
		System.out.println("-------------------------------------------------------");
		conta3.infoConta();
	}

	public static void Imprimir(Conta conta) {
		System.out.println();
		conta.infoConta();
		System.out.println();
		conta.sacar(510);
		System.out.println();
		conta.infoConta();
		System.out.println();
		conta.depositar(350);
		conta.infoConta();
	}
}