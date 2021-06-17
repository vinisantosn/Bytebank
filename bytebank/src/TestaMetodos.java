
public class TestaMetodos {
	
	public static void main(String[] args) {
		Conta conta00 = new Conta();
		conta00.deposita(10);
		System.out.println("Saldo da conta 00: " + conta00.saldo);
		
		Conta conta01 = new Conta();
		conta01.deposita(50);
		System.out.println("Saldo da conta 01: " + conta01.saldo);
		conta01.transfere(41.45,conta00);
		
		System.out.println("TESTE DE TRANSFERÊNCIA");
		System.out.println("Saldo da conta 00: " + conta00.saldo);
		System.out.println("Saldo da conta 01: " + conta01.saldo);
		
		
	}

}
