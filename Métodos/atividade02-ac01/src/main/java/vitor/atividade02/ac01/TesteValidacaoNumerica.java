/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
// Atividade 5
public class TesteValidacaoNumerica {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ValidacaoNumerica valid = new ValidacaoNumerica();

        System.out.println("Digite um número positivo");
        Integer numeroDigitado = leitor.nextInt();

        if (numeroDigitado >= 0) {
            while (numeroDigitado >= 0) {
                valid.verificarPrimo(numeroDigitado);

                System.out.println("Digite um número positivo");
                numeroDigitado = leitor.nextInt();

                if (numeroDigitado < 0) {
                    System.out.println("Programa Finalizado");
                }
            }
        }
    }
}

//5) Classe ValidacaoNumerica
//• Escreva um método chamado verificarPrimo, que recebe um número inteiro e exibe se
//esse número é ou não primo (Dica: para saber se o número é primo, veja quantos
//divisores o número tem, ou seja, verifique se ele é divisível por 1, por 2, por 3, etc. até ele
//próprio, e conte quantos divisores são. Se o número de divisores for 2, então ele é primo.)
//• Em uma classe de teste chamada TesteValidacaoNumerica, solicite que o usuário digite
//vários valores positivos e chame o método verificaPrimo para exibir se o número lido é
//primo ou não. O programa deve encerrar quando o usuário digitar um valor negativo. 
