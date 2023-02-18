/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.segunda.lista.nivelamento;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author vitor
 */

// Atividade 1

public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 10");
        Integer numeroDigitado = leitor.nextInt();
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);

        int i = 0;

        while (numeroDigitado != numeroAleatorio) {
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            i++;
            System.out.println("Número sorteado! " + numeroAleatorio);

        }

        if (i <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (i <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}

//Crie uma classe chamada Loteria que:
//• Solicite apenas uma vez número entre 0 e 10 para o usuário.
//• Tente adivinhar o número digitado através de números randômicos.
//• A cada iteração exiba o número sorteado.
//• Quando acontecer o “acerto” se a quantidade de vezes necessárias for:
// Até 3: exiba "Você é MUITO sortudo"
// Entre 4 e 10: exiba "Você é sortudo"
// Mais de 10: exiba "É melhor você parar de apostar e ir trabalhar"
