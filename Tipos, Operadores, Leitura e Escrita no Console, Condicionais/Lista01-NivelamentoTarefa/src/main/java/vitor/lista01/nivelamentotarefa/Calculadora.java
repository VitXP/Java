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

// Atividade 5

public class Calculadora {
   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira um número real");
        Double numero1 = leitor.nextDouble();
        
        System.out.println("Insira um número real");
        Double numero2 = leitor.nextDouble();
        
        System.out.println("Resultado da soma:\n" + (numero1 + numero2));
        System.out.println("Resultado da Subtração:\n" + (numero1 - numero2));
        System.out.println("Resultado da multiplicação:\n" + (numero1 * numero2));
        System.out.println("Resultado da divisão:\n" + (numero1 / numero2));
    }
}


