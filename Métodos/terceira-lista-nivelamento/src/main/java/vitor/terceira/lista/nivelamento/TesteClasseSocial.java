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
public class TesteClasseSocial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua renda:");
        Double rendaDigitada = leitor.nextDouble();

        // Instância = Criação de objeto
        ClasseSocial classe = new ClasseSocial();

        Double quantidadeDeSalarioMinimo = classe.calcularQtdSalarioMinimo(rendaDigitada);
        String frase = String.format("Você recebe aproximadamente %.1f salários-mínimos", quantidadeDeSalarioMinimo);
        System.out.println(frase);

        String exibirClasseSocial = classe.identificarExibirClasse(quantidadeDeSalarioMinimo);
        String frase01 = String.format("Você pertence a classe social: %S", exibirClasseSocial);
        System.out.println(frase01);

    }
}
