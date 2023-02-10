/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.lista01.nivelamentotarefa;

import java.util.Scanner;

/**
 *
 * @author vitor
 */

// Atividade 9
public class Idade {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome?");
        String nomeDigitado = leitor.nextLine();
        
        System.out.println("Olá, " + nomeDigitado + "! Qual o ano de seu nascimento?");
        Integer nascimento = leitor.nextInt();
        
        Integer idade = 2030 - nascimento;
        
        System.out.println("Em 2030 você terá " + idade + " anos.");
    }
}
