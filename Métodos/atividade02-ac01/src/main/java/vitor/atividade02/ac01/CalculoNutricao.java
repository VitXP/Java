/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.atividade02.ac01;

/**
 *
 * @author vitor
 */
public class CalculoNutricao {

    void calculaIMC(Double peso, Double altura) {
        Double imc = peso / (altura * altura);
        
        String frase = String.format("O IMC é equivalente à %.2f \n", imc);
        System.out.println(frase);
    }

}
