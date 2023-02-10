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

// Atividade 7

public class Elevador {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Insira o limite de peso de um elevador");
        Double pesoDigitado = leitor.nextDouble();
        
        System.out.println("Insira o limite de pessoas em um elevador");
        Integer limiteDigitado = leitor.nextInt();
        
        System.out.println("Insira o peso da 1ª pessoa que entrou no elevador");
        Double peso1 = leitor.nextDouble();
        
        System.out.println("Insira o peso da 2ª pessoa que entrou no elevador");
        Double peso2 = leitor.nextDouble();
        
        System.out.println("Insira o peso da 3ª pessoa que entrou no elevador");
        Double peso3 = leitor.nextDouble();
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem "
                + limiteDigitado + " pessoas. O peso total no elevador é de "
                + (peso1 + peso2 + peso3) + ", sendo que ele suporta " 
                + pesoDigitado);

    }
   
}
