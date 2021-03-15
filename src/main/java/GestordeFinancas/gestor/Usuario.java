/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestordeFinancas.gestor;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class Usuario {

    private String nome;
    private ArrayList<Transacao> extrato = new ArrayList<Transacao>();
    private float saldo = 0;

    public ArrayList<Transacao> getExtrato() {
        return extrato;
    }

    public void setExtrato(String[] parametros) {
        
        if ("0".equals(parametros[1])) {
            
            Transacao operacao = new Saque(Float.parseFloat(parametros[0]), parametros[2]);
            this.extrato.add(operacao);
        } else {
            
            Transacao operacao = new Deposito(Float.parseFloat(parametros[0]), parametros[2]);
            this.extrato.add(operacao);
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void calcularSaldo() {
        saldo = 0;
        for (int i = 0; i < extrato.size(); i++) {
            if (extrato.get(i).getTipo() == 0) {
                saldo = saldo - extrato.get(i).getValor();
            } else {
                saldo = saldo + extrato.get(i).getValor();
            }
        }
    }

    public float getSaldo() {
        calcularSaldo();
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
