package GestordeFinancas.gestor;

public class ContaPoupanca implements  Conta {

    public static void Rendimento() {

        double rendimento;
        rendimento = Conta.getSaldo()*(1.9);

        System.out.println("Rendimento: " + rendimento);

        
    }

	@Override
	public String toString() {
		return "ContaPoupanca [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
