/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtora;

/**
 *
 * @author vitor
 */
public class Protagonista extends Ator {

    private Integer qtdHoraTrabalhadasProtagonista;
    private Double valorHoraTrabalhadaProtagonista;

    public Protagonista(Integer qtdHoraTrabalhadasProtagonista, Double valorHoraTrabalhadaProtagonista, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHoraTrabalhadasProtagonista = qtdHoraTrabalhadasProtagonista;
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    public Integer getQtdHoraTrabalhadasProtagonista() {
        return qtdHoraTrabalhadasProtagonista;
    }

    public void setQtdHoraTrabalhadasProtagonista(Integer qtdHoraTrabalhadasProtagonista) {
        this.qtdHoraTrabalhadasProtagonista = qtdHoraTrabalhadasProtagonista;
    }

    public Double getValorHoraTrabalhadaProtagonista() {
        return valorHoraTrabalhadaProtagonista;
    }

    public void setValorHoraTrabalhadaProtagonista(Double valorHoraTrabalhadaProtagonista) {
        this.valorHoraTrabalhadaProtagonista = valorHoraTrabalhadaProtagonista;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + (this.valorHoraTrabalhadaProtagonista * this.qtdHoraTrabalhadasProtagonista);
    }

    @Override
    public String toString() {
        return String.format("""
            qtdHoraTrabalhadasProtagonista: %d | valorHoraTrabalhadaProtagonista: %.2f | salario: %.2f
            """, qtdHoraTrabalhadasProtagonista, valorHoraTrabalhadaProtagonista, this.getSalario());
    }
}
