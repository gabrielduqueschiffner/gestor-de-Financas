package GestordeFinancas.gestor;
import java.util.Scanner;

public class Sistema {
	public void Menu() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha uma das opções abaixo: \n,"
				+ "(1 - Nova Retirada) \n"
				+ "(2 - Nova Transferência) \n "
				+ "(3 - Novo Pagamento \n"
				+ "(4 - Extrato) \n"
				+ "(5 - Saldo) \n"
				+ "(6 - Relatório Mensal) \n"
				+ "(7 - Fechar) \n ");
		int opc = ler.nextInt();
		switch(opc) {
			case(1):
				break;
			case(2):
				break;
			case(3):
				break;
			case(4):
				break;
			case(5):
				break;
			case(6):
				break;
			case(7):
				break;
		}
		ler.close();
	}
	public void retirada(){
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha uma das opções abaixo: \n,"
				+ "(1 - Retirada em Conta Corrente) \n"
				+ "(2 - Retirada em conta Poupança) \n "
				+ "(3 - Retirada em caixa pessoal \n");
		int opc = ler.nextInt();
		switch(opc) {
		case(1): GestordeFinancas.gestor.Conta.retirada(0);
			break;
		case(2):GestordeFinancas.gestor.ContaCorrente.retirada(0);
			break;
		case(3):GestordeFinancas.gestor.ContaPoupanca.retirada(0);
			break;
		}
		ler.close();
	}
	public void transferencia() {
		
	}
	public void pagamento() {
		
	}
	public void extrato() {
		
	}
	public void saldo() {
		
	}
	public void relatorio() {
		
	}
	public void fechar() {
		
	}
}
