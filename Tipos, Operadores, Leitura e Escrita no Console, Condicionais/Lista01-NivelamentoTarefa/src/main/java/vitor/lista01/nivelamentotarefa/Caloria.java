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

// Atividade 3

public class Caloria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        Integer aquecimento = 12;
        Integer aerobico = 20;
        Integer musculacao = 25;

        
        
        System.out.println("Insira o tempo, em minutos que passou se aquecendo");
        Integer aquecimentoDigitado = leitor.nextInt();
        
        System.out.println("Insira o tempo em minutos que fez exercícios aeróbicos ");
        Integer aerobicoDigitado = leitor.nextInt();
        
        System.out.println("Insira o tempo em minutos que fez exercícios de musculação");
        Integer musculacaoDigitada = leitor.nextInt();
        
        
        Integer totalMinutos = aquecimentoDigitado + aerobicoDigitado + musculacaoDigitada;
        Integer PerdaCaloria = (aquecimento * aquecimentoDigitado) + (aerobico * aerobicoDigitado) + (musculacao * musculacaoDigitada);
        
        System.out.println("Olá, Jorge. Você fez um total de " 
                + totalMinutos + " minutos de exercícios e perdeu cerca de "
                + PerdaCaloria + " calorias");

    }
}
