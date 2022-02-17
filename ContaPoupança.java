
public class ContaPoupança extends Conta {

	// Construtor
	public ContaPoupança(int numero, int agencia, double saldo, String titularConta) {
		super(numero, agencia, saldo, titularConta);
	}

	// Métodos
	public double rendimentoPoupança() {
		return (this.saldo * 0.005);
	}

	@Override
	public void infoConta() {
		System.out.println("Nome do titular da conta: " + this.getTitularConta());
		System.out.println("Número da conta: " + this.getNumero());
		System.out.println("Número da agência: " + this.getAgencia());
		System.out.println("Rendimento da poupança: " + this.rendimentoPoupança());
		System.out.println("Saldo da conta: " + this.getSaldo());
	}
}