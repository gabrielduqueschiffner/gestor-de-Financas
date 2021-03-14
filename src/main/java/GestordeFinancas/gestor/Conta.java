package GestordeFinancas.gestor;

public interface  Conta {
	public static final double saldo = 0;    
    public static double getSaldo() {
    	return saldo;
	}

	public static void setSaldo(double saldo) {
		saldo = saldo;
	}
	
	public static void retirada(double valor) {
		Conta.setSaldo(saldo - valor);
	}
	
}
