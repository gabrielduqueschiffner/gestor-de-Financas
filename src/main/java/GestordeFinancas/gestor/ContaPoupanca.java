package GestordeFinancas.gestor;

public class ContaPoupanca extends Conta {

    public static void Rendimento() {

        double rendimento;
        rendimento = Conta.getSaldo()*(1.9);

        System.out.println("Rendimento: " + rendimento);

    }
}
