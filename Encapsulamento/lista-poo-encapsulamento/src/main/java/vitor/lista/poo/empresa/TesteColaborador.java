/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.lista.poo.empresa;

/**
 *
 * @author vitor
 */
public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colab01 = new Colaborador();
        colab01.setNome("Alan");
        colab01.setCargo("Analista de Call Center");
        colab01.setSalario(1000.00);
        System.out.println(String.format("Nome: %s | Cargo: %s | Salário: %.2f", colab01.getNome(), colab01.getCargo(), colab01.getSalario()));

        Colaborador colab02 = new Colaborador();
        colab02.setNome("Moana");
        colab02.setCargo("Vendedora");
        colab02.setSalario(500.00);
        System.out.println(String.format("Nome: %s | Cargo: %s | Salário: %.2f", colab02.getNome(), colab02.getCargo(), colab02.getSalario()));

        RecursosHumanos recHum = new RecursosHumanos();

        recHum.promoverColaborador(colab01, "Gerente", 2000.00);
        recHum.promoverColaborador(colab02, "N2", 900.00);

        recHum.reajustarSalario(colab02, 10.00);
        System.out.println(String.format("Nome: %s | Cargo: %s | Salário: %.2f", colab01.getNome(), colab01.getCargo(), colab01.getSalario()));
        System.out.println(String.format("Nome: %s | Cargo: %s | Salário: %.2f", colab02.getNome(), colab02.getCargo(), colab02.getSalario()));

        System.out.println(String.format("Total de promovidos: %d", recHum.getTotalPromovido()));
        System.out.println(String.format("Total de salários reajustados: %d", recHum.getSalarioReajustado()));
    }
}
