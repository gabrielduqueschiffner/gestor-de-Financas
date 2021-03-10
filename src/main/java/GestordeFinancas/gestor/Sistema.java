package GestordeFinancas.gestor;
import java.util.Scanner;

public class Sistema {
	public void Menu() {
		int opc;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha uma das opções abaixo: \n,"
				+ "(1 - Nova Retirada) \n"
				+ "(2 - Nova Transferência) \n "
				+ "(3 - Novo Pagamento \n"
				+ "(4 - Extrato \n"
				+ "(5 - Saldo \n"
				+ "(6 - Relatório Mensal \n"
				+ "(7 - Fechar \n");
		opc = ler.nextInt();
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
		
	}
	public void retirada(){
		
	}
}
