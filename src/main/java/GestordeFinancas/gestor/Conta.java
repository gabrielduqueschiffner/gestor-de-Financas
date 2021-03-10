package GestordeFinancas.gestor;

public class Conta {
	private static double saldo;

	public static double getSaldo() {
		return saldo;
	}

	public static void setSaldo(double saldo) {
		Conta.saldo = saldo;
	}
	
	
}
