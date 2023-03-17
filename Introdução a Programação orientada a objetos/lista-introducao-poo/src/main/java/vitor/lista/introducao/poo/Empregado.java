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
public class Empregado {

    String nome;
    String cargo;
    Double salario;

    Integer reajusteSalario = 15;

    Double reajustarSalario() {
        
        
        Double salarioReajustado = salario + (reajusteSalario * salario) / 100;
        return salarioReajustado;
    }
}
