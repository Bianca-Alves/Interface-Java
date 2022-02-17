
public class ContaPremium extends Conta implements Tributacao {

	double credito;

	// Construtor
	public ContaPremium(int numero, int agencia, double saldo, double credito, String titularConta) {
		super(numero, agencia, saldo, titularConta);
		this.credito = credito;
	}

	// Getters e Setters
	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	// Métodos Override
	@Override
	public double calculaImposto() {
		return this.saldo * 0.01;
	}

	@Override
	public void infoConta() {
		System.out.println("Nome do titular da conta: " + this.getTitularConta());
		System.out.println("Número da conta: " + this.getNumero());
		System.out.println("Número da agência: " + this.getAgencia());
		System.out.println("Crédito da conta: " + this.getCredito());
		System.out.println("Taxa imposta a conta: " + this.calculaImposto());
		System.out.println("Saldo da conta: " + this.getSaldo());
	}
}