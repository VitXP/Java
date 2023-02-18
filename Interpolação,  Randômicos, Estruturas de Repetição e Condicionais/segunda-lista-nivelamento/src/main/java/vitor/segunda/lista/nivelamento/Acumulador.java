package vitor.segunda.lista.nivelamento;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author vitor
 */
// Atividade 2

public class Acumulador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer historico = 0;

        System.out.println("Insira um Número");
        Integer numeroDigitado = leitor.nextInt();
        historico = historico + numeroDigitado;

        do {
            System.out.println("Insira um Número");
            numeroDigitado = leitor.nextInt();
            historico = historico + numeroDigitado;

        } while (numeroDigitado != 0);

        String frase = String.format("A soma dos números é %d", historico);
        System.out.println(frase);
    }
}


//Crie uma classe chamada Acumulador que:
//• Leia vários números até ler o número 0 e calcule a soma dos números lidos. (Não é para
//usar vetor).
//• Exiba: "A soma dos números é x"
