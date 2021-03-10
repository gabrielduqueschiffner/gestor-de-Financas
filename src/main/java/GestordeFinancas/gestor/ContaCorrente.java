package GestordeFinancas.gestor;

public class ContaCorrente extends Conta{
	public static double limite;

	public static double getLimite() {
		return limite;
	}

	public static void setLimite(double limite) {
		ContaCorrente.limite = limite;
	}
	
	
}
