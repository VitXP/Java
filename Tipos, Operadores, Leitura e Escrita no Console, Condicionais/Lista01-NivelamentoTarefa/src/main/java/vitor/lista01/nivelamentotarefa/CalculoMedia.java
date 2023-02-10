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

// Atividade 8

public class CalculoMedia {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Insira o nome");
        String nomeDigitado = leitor.nextLine();
        
        System.out.println("Insira a primeira nota");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Insira a segunda nota");
        Double nota2 = leitor.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
                
        System.out.println("Olá, "
                + nomeDigitado + ". Sua média foi de "
                + media);
    }
}
