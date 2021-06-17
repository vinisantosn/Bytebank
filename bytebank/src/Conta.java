public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita(double valor) {
		this.saldo += valor;

	}

	public boolean saca(double valor) {
		if (this.saldo - valor >= 0) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfere(double valor, Conta nomeDaConta) {
		if (this.saldo >= valor) {
			this.saca(valor);// this.saldo -= valor;
			nomeDaConta.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

}