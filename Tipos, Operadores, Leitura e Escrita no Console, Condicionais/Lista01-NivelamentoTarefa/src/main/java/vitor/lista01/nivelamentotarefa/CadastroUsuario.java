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

// Exercício 1

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o login");
        String loginDigitado = leitor.nextLine();
        
        System.out.println("Insira a senha");
        Integer senhaDigitada = leitor.nextInt();
        
        System.out.println("Insira a quantidade de vezes que é aceitavél errar a senha antes do bloqueio");
        Integer quantidadeDigitada = leitor.nextInt();
        
        System.out.println("Seu login é " 
                + loginDigitado + " e sua senha é " 
                + senhaDigitada + ". Você tem " 
                + quantidadeDigitada + " tentativas antes de ser bloqueado");
    
                
    }
}
