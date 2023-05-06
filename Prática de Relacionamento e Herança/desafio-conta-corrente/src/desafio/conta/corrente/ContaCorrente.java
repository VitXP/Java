/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.conta.corrente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vitor
 */
public class ContaCorrente {

    private String titular;
    private Double saldo;
    private List<Historico> historicos;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.historicos = new ArrayList<>();
    }
    
    public List<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(List<Historico> historicos) {
        this.historicos = historicos;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Integer dia, Integer mes, Integer ano, Double valor) {

        if (valor > 0) {
             
            
            Double SaldoAtual = getSaldo() + valor;
            setSaldo(SaldoAtual);
            Historico depositar = new Historico(dia, mes, ano, valor, "depositar");
            historicos.add(depositar);
            
        } else {
            System.out.println("Valor Inválido");
        }
    }

    public void sacar(Integer dia, Integer mes, Integer ano, Double valor) {
        
         if (valor > 0 && valor <= getSaldo()) {

            Double SaldoAtual = getSaldo() - valor;
            setSaldo(SaldoAtual);
            Historico depositar = new Historico(dia, mes, ano, valor, "sacar");
            historicos.add(depositar);
            
        } else {
            System.out.println("Valor Inválido");
        }
    }
    
    

    public void exibirExtrato() {
        
        System.out.println("Histórico\n");
        
        for (int i = 0; i < historicos.size(); i++) {
        System.out.println(historicos.get(i));
        }
        
  
    }

    @Override
    public String toString() {
        return "ContaCorrente " + "titular= " + titular + ", saldo= " + saldo + ", historicos= " + historicos ;
    }
}
