/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestordeFinancas.gestor;

/**
 *
 * @author Gabriel Duque
 */
public class Deposito extends Transacao{
    
    public Deposito(float valor, String descricao) {
        super(valor, 1, descricao);
    }
    
    public void executar (float valor, String descricao){
        
    }
}
