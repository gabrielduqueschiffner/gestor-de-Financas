package GestordeFinancas.gestor;

import java.util.Scanner;

public class Sistema {

    public void Menu(int opc) {
        //botão 1 Pagamento
        //botão 2 Saque & depósito
        //botão 3 Extrato
        //botão 4 Relatório
        try {
            switch (opc) {
                case 1:
                    //chamada para outra tela
                    //
                    break;
    
                case 2:
    
                    break;
    
                case 3:
    
                    break;
    
                case 4:
    
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void retirada(int opc,double valor) {  
        try {
            switch (opc) {
                case (1):
                    GestordeFinancas.gestor.Conta.retirada(valor);
                    escrever(src\main\java\GestordeFinancas\arquivos\extrato,null); //alterar depois com o swing
                    escrever(src\main\java\GestordeFinancas\arquivos\Relatorio,null)//alterar depois com o swing
                    break;
                case (2):
                    GestordeFinancas.gestor.ContaCorrente.retirada(valor);
                    escrever(src\main\java\GestordeFinancas\arquivos\extrato,null); //alterar depois com o swing
                    escrever(src\main\java\GestordeFinancas\arquivos\Relatorio,null)//alterar depois com o swing
                    break;
                case (3):
                    GestordeFinancas.gestor.ContaPoupanca.retirada(valor);
                    escrever(src\main\java\GestordeFinancas\arquivos\extrato,null); //alterar depois com o swing
                    escrever(src\main\java\GestordeFinancas\arquivos\Relatorio,null)//alterar depois com o swing
                    break;
            }
        } catch (Exception e) {
            //TODO: handle exception
        }

    }

    public void transferencia(String nome, Double valor) {
        escrever(src\main\java\GestordeFinancas\arquivos\extrato,null); //alterar depois com o swing
        escrever(src\main\java\GestordeFinancas\arquivos\Relatorio,null);//alterar depois com o swing
    }

    public void pagamento(int opc) { 
        // pagamento de boleto e transferencia
      try {
        if(opc == 1){
        
        }
        if else (opc == 2){

        }
      } catch (Exception e) {
          //TODO: handle exception
      }
    }

    public void extrato() {
        //lerArquivo(src\main\java\GestordeFinancas\arquivos\extrato)
    }
    public void relatorio() {
        //lerArquivo(src\main\java\GestordeFinancas\arquivos\Relatorio)
    }
}
