/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.terceira.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class ClasseSocial {

    // Assinatura do método (Retorno, Nome, Argumento)
    Double calcularQtdSalarioMinimo(Double renda) {
        return renda / 1045.0;
    }
    
     // Método sobrecarregado, o mesmo método com argumentos difertes.
    Double calcularQtdSalarioMinimo(Double renda, Double salarioMin) {
        return renda / salarioMin;
    }

    String identificarExibirClasse(Double numero01) {

        Double classeE = 2.09;
        Double classeD = 4.18;
        Double classeC = 10.45;
        Double classeB = 20.90;

        if (numero01 <= classeE) {
            return "Classe E";
        } else if (numero01 <= classeD) {
            return "Classe D";
        } else if (numero01 <= classeC) {
            return "Classe C";
        } else if (numero01 <= classeB) {
            return "Classe B";
        } else {
            return "Classe A";
        }

    }
}
