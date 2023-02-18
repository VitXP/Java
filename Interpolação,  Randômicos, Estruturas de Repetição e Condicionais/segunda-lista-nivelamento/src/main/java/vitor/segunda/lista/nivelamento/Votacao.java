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
// Atividade 9
public class Votacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer votacaoMussarela = 0;
        Integer votacaoCalabresa = 0;
        Integer votacaoQuatroQueijos = 0;
        Integer votoDoSaborFavorito = 0;
        String saborFavorito = "";

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o número do seu sabor de Pizza predileto");
            Integer numeroDigitado = leitor.nextInt();

            switch (numeroDigitado) {
                case 5:
                    System.out.println("");
                    votacaoMussarela++;
                    break;

                case 25:
                    System.out.println("");
                    votacaoCalabresa++;
                    break;

                case 50:
                    System.out.println("");
                    votacaoQuatroQueijos++;
                    break;

                default:
                    System.out.println("Número Inválido (Voto Anulado) \n");
            }

            if (votacaoMussarela > votoDoSaborFavorito) {
                votoDoSaborFavorito = votacaoMussarela;
                saborFavorito = "Sabor Mussarela";
            } else if (votacaoCalabresa > votoDoSaborFavorito) {
                votoDoSaborFavorito = votacaoCalabresa;
                saborFavorito = "Sabor Calabresa";
            } else if (votacaoQuatroQueijos > votoDoSaborFavorito) {
                votoDoSaborFavorito = votacaoQuatroQueijos;
                saborFavorito = "Sabor Quatro Queijos";
            }

        }

        System.out.println(" Cada sabor obteve: \n Mussarela: "
                + votacaoMussarela + "\n Calabresa: "
                + votacaoCalabresa + "\n Quatro Queijos: "
                + votacaoQuatroQueijos + "\n Sabor de Pizza Favorito: " + saborFavorito);
    }

}

//9) Votação
//Foi feita uma pesquisa para saber qual o sabor de pizza favorito entre os alunos da Faculdade:
//• Para votar no sabor mussarela, deve-se digitar o valor 5.
//• Para votar no sabor calabresa, deve-se digitar o valor 25.
//• Para votar no sabor quatro queijos, deve- se digitar o valor 50.
//Leia os votos de 10 alunos diferentes (sem usar vetor) e exiba:
//• Quantos votos obteve cada sabor.
//• Qual o sabor favorito segundo a pesquisa.
