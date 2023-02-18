/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.segunda.lista.nivelamento;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author vitor
 */
// Atividade 7
public class Sorteio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 100");
        Integer numeroDigitado = leitor.nextInt();

        Integer par = 0;
        Integer impar = 0;
        Integer primeiraPosicaoSorteado = 0;
        Integer adicao = 0;

        for (int i = 1; i <= 200; i++) {
            Integer sorteio = ThreadLocalRandom.current().nextInt(1, 200);
            System.out.println(i + " - " + sorteio);

            if (numeroDigitado.equals(sorteio) && adicao == 0) {
                primeiraPosicaoSorteado = i;
                adicao++;
            }

            if (sorteio % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("O número foi sorteado pela 1ª vez na posição " + primeiraPosicaoSorteado + ". Foram sorteados " + par + " Números pares e " + impar + " Números Impares.");

    }
}

//Crie uma classe chamada Sorteio que:
//• Solicite um número de 1 a 100 apenas uma vez.
//• Realize 200 sorteios.
//Ao final, exibir:
//• Quando o número foi sorteado pela 1ª vez (apresente a posição do sorteio)
//• Quantos números pares foram sorteados.
//• Quantos números ímpares foram sorteados.
