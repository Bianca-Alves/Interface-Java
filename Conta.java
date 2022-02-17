
public abstract class Conta {

	int numero;
	int agencia;
	double saldo;
	String titularConta;

	// Construtor
	public Conta(int numero, int agencia, double saldo, String titularConta) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.titularConta = titularConta;
	}

	// Getters e Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	// M�todos
	public void sacar(double valor) {
		if (valor > this.saldo) {
			System.out.println("N�o � poss�vel sacar uma quantia maior que a existente no saldo da conta.");
			return;
		}
		if (valor <= 0) {
			System.out.println("N�o � poss�vel sacar uma quantia menor ou igual a zero.");
			return;
		}
		this.saldo -= valor;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("N�o � poss�vel depositar uma quantia menor ou igual a zero.");
			return;
		}
		this.saldo += valor;
	}

	public void infoConta() {
		System.out.println("Nome do titular da conta: " + this.titularConta);
		System.out.println("N�mero da conta: " + this.numero);
		System.out.println("N�mero da ag�ncia: " + this.agencia);
		System.out.println("Saldo da conta: " + this.saldo);
	}
}