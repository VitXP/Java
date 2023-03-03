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
// Atividade 4
public class TesteCalculoNutricao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas");
        Integer quantidadePessoa = leitor.nextInt();

        for (int i = 1; i <= quantidadePessoa; i++) {
            System.out.println("\nPessoa" + i);

            System.out.println("Digite o peso");
            Double pesoDigitado = leitor.nextDouble();

            System.out.println("Digite a altura");
            Double alturaDigita = leitor.nextDouble();

            CalculoNutricao testeCal = new CalculoNutricao();

            testeCal.calculaIMC(pesoDigitado, alturaDigita);
        }

    }

}

//4) Classe CalculoNutricao
//• Escreva o método calculaIMC, que recebe o peso e a altura de uma pessoa.
//• Este método deverá calcular e exibir o IMC usando interpolação
//• Escreva também uma classe de teste chamada TesteCalculoNutricao que solicita que o
//usuário digite os valores correspondentes a pessoas diferentes e chame o método
//calcularIMC de cada uma delas.
//A fórmula para calcular o IMC é:
//• IMC = Peso ÷ (Altura × Altura)
