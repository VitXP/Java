/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.lista.introducao.poo;

/**
 *
 * @author vitor
 */ 
// Atividade 3
public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado funcionario01 = new Empregado();
        funcionario01.nome = "João";
        funcionario01.cargo = "Analista de Sistemas";
        funcionario01.salario = 5.400;

        Empregado funcionario02 = new Empregado();
        funcionario02.nome = "Victor";
        funcionario02.cargo = "DBA";
        funcionario02.salario = 2.400;

        Double salarioFinal = funcionario01.reajustarSalario();
        System.out.println(String.format("%s”, salário inicial de R$ %.3f e cargo “%s”.", funcionario01.nome, salarioFinal, funcionario01.cargo));

        System.out.println("\n---------------------------------------\n");
        Double salarioFinal02 = funcionario02.reajustarSalario();
        System.out.println(String.format("%s”, salário inicial de R$ %.3f e cargo “%s”.", funcionario02.nome, salarioFinal02, funcionario02.cargo));
    }

}
