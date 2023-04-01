/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.lista.poo.empresa;

/**
 *
 * @author vitor
 */
public class RecursosHumanos {

    private Integer totalPromovido = 0;
    private Integer SalarioReajustado = 0;

    public Integer getTotalPromovido() {
        return totalPromovido;
    }

    public void setTotalPromovido(Integer totalPromovido) {
        this.totalPromovido = totalPromovido;
    }

    public Integer getSalarioReajustado() {
        return SalarioReajustado;
    }

    public void setSalarioReajustado(Integer SalarioReajustado) {
        this.SalarioReajustado = SalarioReajustado;
    }

    void reajustarSalario(Colaborador colab, Double valorReajuste) {
        Double novoSalario = colab.getSalario() + valorReajuste;
        colab.setSalario(novoSalario);

        SalarioReajustado++;
    }

    void promoverColaborador(Colaborador colab, String novoCargo, Double novoSalario) {
        String cargoAtual = colab.getCargo();
        Double salarioAtual = colab.getSalario();

        if (novoSalario > salarioAtual) {
            colab.setCargo(novoCargo);
            colab.setSalario(novoSalario);
            totalPromovido++;
        } else {
            System.out.println("operação inválida”");
        }
    }

}
