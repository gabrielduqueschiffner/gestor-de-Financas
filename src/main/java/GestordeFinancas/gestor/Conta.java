package GestordeFinancas.gestor;

public class Conta {
	private static double saldo;

	public static void getInfo(){
            System.out.println("Digite o Usuário");
            
        
        }
        
        
        public static double getSaldo() {
		return saldo;
	}

	public static void setSaldo(double saldo) {
		Conta.saldo = saldo;
	}
	
	public static void retirada(double valor) {
		Conta.setSaldo(saldo - valor);
	}
	
}
