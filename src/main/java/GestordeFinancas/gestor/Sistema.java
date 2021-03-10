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
			case(1): retirada();
				break;
			case(2): transferencia();
				break;
			case(3): pagamento();
				break;
			case(4): extrato();
				break;
			case(5): saldo();
				break;
			case(6):relatorio();
				break;
			case(7):fechar();
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
		System.out.println("Digite o valor da retirada: ");
		Double valor = ler.nextDouble();
		switch(opc) {
		case(1): GestordeFinancas.gestor.Conta.retirada(valor);
			break;
		case(2):GestordeFinancas.gestor.ContaCorrente.retirada(valor);
			break;
		case(3):GestordeFinancas.gestor.ContaPoupanca.retirada(valor);
			break;
		}
		ler.close();
	}
	public void transferencia() {
		Scanner ler = new Scanner(System.in);
		String nome,conta,valor;
		System.out.println("Nome: ");
		nome = ler.nextLine();
		System.out.println("Conta: ");
		conta  = ler.nextLine();
		System.out.println("Valor: ");
		valor = ler.nextLine();
		GestordeFinancas.gestor.ContaCorrente.transferencia(nome,conta,valor);
		ler.close();
	}
	public void pagamento() {
		Scanner ler = new Scanner(System.in);
		
		
		
		ler.close();
	}
	public void extrato() {
		
	}
	public void saldo() {
		System.out.println("Conta Corrente");
		GestordeFinancas.gestor.ContaCorrente.getSaldo();
		System.out.println("Conta Poupanca");
		GestordeFinancas.gestor.ContaPoupanca.getSaldo();
		System.out.println("Conta Pessoal");
		GestordeFinancas.gestor.ContaPessoal.getSaldo();
	}
	public void relatorio() {
		
	}
	public void fechar() {
		
	}
}
