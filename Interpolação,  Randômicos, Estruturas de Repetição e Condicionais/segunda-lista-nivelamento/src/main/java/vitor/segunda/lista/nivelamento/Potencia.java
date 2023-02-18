/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.segunda.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author vitor
 */

// Atividade 6

public class Potencia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a base da potência");
        Integer baseDigitada = leitor.nextInt();

        System.out.println("Digite o expoente da potência");
        Integer expoenteDigitado = leitor.nextInt();

        Integer historico = 1;

        for (int i = 1; i <= expoenteDigitado; i++) {
            Integer potencia = historico * baseDigitada;
            historico = potencia;
        }

        System.out.println("O resultado da potência é " + historico);

    }
}


//Crie uma classe chamada Potencia que:
//• Apresente como resultado o valor de uma potência de uma base qualquer elevada a um
//expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor do expoente.
//• Considere apenas a entrada de valores inteiros e positivos.
//• Por exemplo: B = 2 e E = 5.
//• O programa deverá calcular e exibir o valor de 2 elevado a 5 = 32. (Não é para usar
//métodos que calculam a potência diretamente).