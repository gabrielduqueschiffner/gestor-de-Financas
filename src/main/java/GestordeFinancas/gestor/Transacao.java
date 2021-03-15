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
public abstract class Transacao {
    private float valor; 
    private String descricao;
    private int tipo; //0 para saque e 1 para despósito
    
    public void executar(float valor, String descricao){}

    public Transacao(float valor, int tipo, String descricao) {
        this.valor = valor;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
