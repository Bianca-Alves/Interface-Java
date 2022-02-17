
public class ContaCorrente extends Conta implements Tributacao {

	// Construtor
	public ContaCorrente(int numero, int agencia, double saldo, String titularConta) {
		super(numero, agencia, saldo, titularConta);
	}

	// M�todos Override
	@Override
	public double calculaImposto() {
		return (this.saldo * 0.02);
	}

	@Override
	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("N�o � poss�vel sacar uma quantia menor ou igual a zero.");
			return;
		}

		valor += 5;

		if (valor > this.saldo) {
			System.out.println("N�o � poss�vel sacar uma quantia maior que a existente no saldo da conta.");
			return;
		}
		this.saldo -= valor;
	}

	@Override
	public void infoConta() {
		System.out.println("Nome do titular da conta: " + this.getTitularConta());
		System.out.println("N�mero da conta: " + this.getNumero());
		System.out.println("N�mero da ag�ncia: " + this.getAgencia());
		System.out.println("Taxa imposta a conta: " + this.calculaImposto());
		System.out.println("Saldo da conta: " + this.getSaldo());
	}
}