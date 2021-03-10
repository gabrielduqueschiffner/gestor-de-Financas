package GestordeFinancas.gestor;

public class ContaCorrente extends Conta{
	public static double limite;

	public static double getLimite() {
		return limite;
	}

	public static void setLimite(double limite) {
		ContaCorrente.limite = limite;
	}
	
	public static void transferencia(String nome, String conta, String valor) {
		System.out.println("Transferencia Feita: \n" + "Beneficiario:" + nome + "Valor:" + valor);
		double valor1 = Double.parseDouble(valor);
		retirada(valor1);
	}
	
	
	
}
