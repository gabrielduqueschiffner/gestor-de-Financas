/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestordeFinancas.gestor;

/**
 *
 * @author Delage
 */
public class Saque extends Transacao{
    
    public Saque(float valor, String descricao) {
        super(valor, 0, descricao);
    }
    
    public void executar (float valor, int tipo, String descricao){
        
    }
}
