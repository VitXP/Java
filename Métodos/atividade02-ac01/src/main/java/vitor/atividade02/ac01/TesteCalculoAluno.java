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

// Atividade 1
public class TesteCalculoAluno {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        Double notaDigitada1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota:");
        Double notaDigitada2 = leitor.nextDouble();

        CalculoAluno calc = new CalculoAluno();

        Double mediaFinal = calc.calcularMedia(notaDigitada1, notaDigitada2);
        
        String frase = String.format("A média final do Aluno foi %.2f", mediaFinal);
        System.out.println(frase);
        
    }
}


//1) Classe CalculoAluno
//• Escreva um método chamado calcularMedia, que recebe duas notas e retorna a
//média das notas, como é calculada a média da Faculdade SPTech((nota1 * 0.4) + (nota2
//* 0.6)).
//• Crie uma classe TesteCalculoAluno, no método main, solicite que o usuário digite 2
//notas, chame o método calcularMedia passando as notas digitadas como argumento e
//exiba o valor retornado pelo método.