
public class ContaPoupan�a extends Conta {

	// Construtor
	public ContaPoupan�a(int numero, int agencia, double saldo, String titularConta) {
		super(numero, agencia, saldo, titularConta);
	}

	// M�todos
	public double rendimentoPoupan�a() {
		return (this.saldo * 0.005);
	}

	@Override
	public void infoConta() {
		System.out.println("Nome do titular da conta: " + this.getTitularConta());
		System.out.println("N�mero da conta: " + this.getNumero());
		System.out.println("N�mero da ag�ncia: " + this.getAgencia());
		System.out.println("Rendimento da poupan�a: " + this.rendimentoPoupan�a());
		System.out.println("Saldo da conta: " + this.getSaldo());
	}
}