/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.atividade01.ac01;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer operacaoSelecionada = 0;

        do {

            System.out.println(" \n1 - Soma\n"
                    + "2 - Multiplicação\n"
                    + "3 - Divisão\n"
                    + "4 - Subtração\n"
                    + "5 - Potência\n"
                    + "6 - Resto\n"
                    + "0 – Sair");

            operacaoSelecionada = leitor.nextInt();
            Integer numeroInteiroDigitado = 0;

            switch (operacaoSelecionada) {

                //Soma
                case 1:
                    System.out.println("Digite um número inteiro:");
                    numeroInteiroDigitado = leitor.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        Integer resultadoSoma = numeroInteiroDigitado + i;
                        String fraseSoma = String.format("%d + %d = %d", numeroInteiroDigitado, i, resultadoSoma);
                        System.out.println(fraseSoma);
                    }

                    break;

                //Multiplicação
                case 2:
                    System.out.println("Digite um número inteiro:");
                    numeroInteiroDigitado = leitor.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        Integer resultadoMultiplicacao = numeroInteiroDigitado * i;
                        String fraseMultiplicacao = String.format("%d * %d = %d", numeroInteiroDigitado, i, resultadoMultiplicacao);
                        System.out.println(fraseMultiplicacao);
                    }

                    break;

                //Divisão
                case 3:
                    System.out.println("Digite um número inteiro:");
                    numeroInteiroDigitado = leitor.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        Integer resultadoDivisao = numeroInteiroDigitado / i;
                        String fraseDivisao = String.format("%d / %d = %d", numeroInteiroDigitado, i, resultadoDivisao);
                        System.out.println(fraseDivisao);
                    }

                    break;

                //Subtração
                case 4:
                    System.out.println("Digite um número inteiro:");
                    numeroInteiroDigitado = leitor.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        Integer resultadoSubtracao = numeroInteiroDigitado - i;
                        String fraseSubtracao = String.format("%d - %d = %d", numeroInteiroDigitado, i, resultadoSubtracao);
                        System.out.println(fraseSubtracao);
                    }

                    break;

                //Potência
                case 5:
                    System.out.println("Digite um número inteiro:");
                    numeroInteiroDigitado = leitor.nextInt();

                    Integer historico = 1;

                    for (int i = 1; i <= 10; i++) {
                        Integer resultadoPotencia = historico * numeroInteiroDigitado;
                        historico = resultadoPotencia;

                        String frasePotencia = String.format("%d ^ %d = %d", numeroInteiroDigitado, i, historico);
                        System.out.println(frasePotencia);
                    }

                    break;

                //Resto
                case 6:
                    System.out.println("Digite um número inteiro:");
                    numeroInteiroDigitado = leitor.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        Integer resultadoResto = numeroInteiroDigitado % i;
                        String fraseResto = String.format("%d / %d = %d", numeroInteiroDigitado, i, resultadoResto);
                        System.out.println(fraseResto);
                    }

                    break;

                //Sair
                case 0:
                    System.out.println("Até logo!");
                    break;

                //Default
                default:
                    System.out.println("Opção inválida, tente novamente");

            }
        } while (operacaoSelecionada != 0);

    }

}
