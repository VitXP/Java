/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultoria;

/**
 *
 * @author vitor
 */
public class DesenvolvedorMobile extends Desenvolvedor {

    private Integer qtdHoraTrabalhadasMobile;
    private Double valorHoraTrabalhadaMobile;

    public DesenvolvedorMobile(Integer qtdHoraTrabalhadasMobile, Double valorHoraTrabalhadaMobile, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHoraTrabalhadasMobile = qtdHoraTrabalhadasMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    
    public Integer getQtdHoraTrabalhadasMobile() {
        return qtdHoraTrabalhadasMobile;
    }

    public void setQtdHoraTrabalhadasMobile(Integer qtdHoraTrabalhadasMobile) {
        this.qtdHoraTrabalhadasMobile = qtdHoraTrabalhadasMobile;
    }

    public Double getValorHoraTrabalhadaMobile() {
        return valorHoraTrabalhadaMobile;
    }

    public void setValorHoraTrabalhadaMobile(Double valorHoraTrabalhadaMobile) {
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + (this.valorHoraTrabalhadaMobile * this.qtdHoraTrabalhadasMobile);
    }

    @Override
    public String toString() {
        return String.format("""
            qtdHoraTrabalhadasMobile: %d | valorHoraTrabalhadaMobile: %.2f | salario: %.2f
            """, qtdHoraTrabalhadasMobile, valorHoraTrabalhadaMobile, this.getSalario());
    }
}
