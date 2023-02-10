package vitor.lista01.nivelamentotarefa;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */

// Exercício 2

public class BolsaFilho {
    public static void main(String[] args) {
        
        
        Double numero01 = 25.12; 
        Double numero02 = 15.88;
        Double numero03 = 12.44;

        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira quantos filhos de 0 a 3 anos possui.");
        Integer quantidade1Digitada = leitor.nextInt();
        
        System.out.println("Insira quantos filhos de 4 a 16 anos possui.");
        Integer quantidade2Digitada = leitor.nextInt();
        
        System.out.println("Insira quantos filhos de 17 a 18 anos possui");
        Integer quantidade3Digitada = leitor.nextInt();
        
        
        Integer soma = quantidade1Digitada + quantidade2Digitada + quantidade3Digitada;
        Double valorBolsa = (quantidade1Digitada * numero01) + (quantidade2Digitada * numero02) + (numero03 * quantidade3Digitada);
       
        System.out.println("Você tem um total de "
                + soma + " filhos e vai receber "
                + valorBolsa + " de bolsa");
    }
}
