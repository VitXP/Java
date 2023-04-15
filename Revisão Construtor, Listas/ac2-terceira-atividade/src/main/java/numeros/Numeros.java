/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vitor
 */
//Atividade 2
public class Numeros {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Integer numeroDigitado;
        List<Integer> numeros = new ArrayList();
        Integer menor = Integer.MAX_VALUE;
        Integer maior = Integer.MIN_VALUE;

        do {
            System.out.println("Digite números inteiros:");
            numeroDigitado = leitor.nextInt();

            if (numeroDigitado > 0) {
                numeros.add(numeroDigitado);
            }

        } while (numeroDigitado != 0);
        {

            
            System.out.println("\n------------------------------------------------------------------------");
            System.out.println("Números pares da lista:");
            for (Integer numeroAtual : numeros) {
                if (numeroAtual % 2 == 0) {
                    System.out.println(numeroAtual);
                }
            }

            
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Números ímpares da lista:");
            for (Integer numeroAtual : numeros) {
                if (numeroAtual % 2 == 1) {
                    System.out.println(numeroAtual);
                }
            }

            
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Soma de todos os números da lista:");
            Integer soma = 0;

            for (Integer numeroAtual : numeros) {
                soma += numeroAtual;
            }
            System.out.println(soma);

            
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Menor número da lista:");
            for (Integer numeroAtual : numeros) {

                if (numeroAtual < menor) {
                    menor = numeroAtual;
                }
            }
            System.out.println(menor);

            
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Maior número da lista:");
            for (Integer numeroAtual : numeros) {

                if (numeroAtual > maior) {
                    maior = numeroAtual;
                }
            }
            System.out.println(maior);

        }
    }
}
