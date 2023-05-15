/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtora;

/**
 *
 * @author vitor
 */
public class Ator {
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Ator(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Integer qtdHprasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHprasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
      public Double getSalario() {
        return valorHoraTrabalhada * qtdHorasTrabalhadas;
    }
      
     @Override
    public String toString() {
        return String.format("Nome: %s | qtdHorasTrabalhadas: %d | valorHoraTrabalhada: %.2f | Salario: %.2f", nome, qtdHorasTrabalhadas, valorHoraTrabalhada, this.getSalario());
    }
}
