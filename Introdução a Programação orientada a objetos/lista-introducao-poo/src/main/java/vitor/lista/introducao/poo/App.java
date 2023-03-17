/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.lista.introducao.poo;

import java.util.Scanner;

/**
 *
 * @author vitor
 */

//Atividade01
public class App {

    public static void main(String[] args) {
        Bolo bolo01 = new Bolo();
        bolo01.sabor = "Maça";
        bolo01.valor = 45.0;
        bolo01.quantidadeComprada = 0;

        Bolo bolo02 = new Bolo();
        bolo02.sabor = "Laranja";
        bolo02.valor = 50.00;
        bolo02.quantidadeComprada = 0;

        Bolo bolo03 = new Bolo();
        bolo03.sabor = "Uva verde";
        bolo03.valor = 30.0;
        bolo03.quantidadeComprada = 0;

        System.out.println("Bolo 01");
        bolo01.comprarBolo(5);
        bolo01.comprarBolo(6);
        bolo01.comprarBolo(8);
        bolo01.comprarBolo(6);
        bolo01.comprarBolo(10);
        bolo01.exibirRelatorio();
        System.out.println("-------------------------");
        System.out.println("Bolo 02\n");

       
        bolo02.comprarBolo(5);
        bolo02.comprarBolo(15);
        bolo02.comprarBolo(60);
        bolo02.comprarBolo(10);
        bolo02.comprarBolo(90);
        bolo02.exibirRelatorio();

        System.out.println("-------------------------");

        System.out.println("Bolo 03\n");
        bolo03.comprarBolo(10);
        bolo03.comprarBolo(2);
        bolo03.comprarBolo(6);
        bolo03.comprarBolo(8);
        bolo03.comprarBolo(10);
        bolo03.exibirRelatorio();

    }
}
