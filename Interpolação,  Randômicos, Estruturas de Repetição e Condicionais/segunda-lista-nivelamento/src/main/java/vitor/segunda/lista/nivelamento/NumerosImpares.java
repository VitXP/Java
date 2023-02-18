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

// Atividade 4

public class NumerosImpares {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i <= 90; i++) {

            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}

//Crie uma classe chamada NumerosImpares que:
//• Usando “for”, exiba todos os números ímpares entre 0 e 90.