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

// Atividade 2
public class TesteIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite a sua idade");
        Integer idadeDigitada = leitor.nextInt();
        
        Idade idad = new Idade();
        
        idad.classificaIdade(idadeDigitada);
    }
  
}


//2) Classe Idade
//Escreva o método classificaIdade (não retorna nada) que recebe uma idade e imprime uma
//mensagem conforme a faixa etária à qual pertence a idade conforme regra abaixo:
//• 0 a 2 anos - “Bebê”
//• 3 a 11 anos -“Criança”
//• 12 a 19 anos -“Adolescente”
//• 20 a 30 anos - “Jovem”
//• 31 a 60 anos -“Adulto”
//• acima de 60 anos -“Idoso”.
//Crie uma classe TesteIdade, escreva o método main e solicite que o usuário digite a sua idade,
//testes os métodos da classe Idade