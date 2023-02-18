/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.segunda.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
// Atividade 8
public class ContadorVariado {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Double historico = 0.0;        
        Integer limite = 33;
        
        for (int i = 1; i <= limite; i++) {
            Double soma = historico + 0.15;
            historico = soma;
            String frase = String.format("%.2f", historico);
            System.out.println(frase);

        }

    }
}

//8) Contador Variado
//Crie uma classe chamada ContadorVariado que:
//• Usando for, começe exibindo o valor 0.15 e depois 0.30, depois 0.45, depois 0.60... ou
//seja, aumente de 0.15 em 0.15 a cada iteração até que o último número seja menor que 5.
//• Use interpolação p/ exibir o número com 2 casas decimais
