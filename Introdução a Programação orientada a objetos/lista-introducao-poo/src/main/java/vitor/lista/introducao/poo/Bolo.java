/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.lista.introducao.poo;

/**
 *
 * @author vitor
 */

// Atividade01
public class Bolo {

    String sabor;
    Double valor;
    Integer quantidadeComprada;

    void comprarBolo(Integer quantidadeVendida) {
        if ((quantidadeComprada + quantidadeVendida) > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo");
        } else {
           quantidadeComprada += quantidadeVendida;
            System.out.println("Compra realizada");
        }
    }

    void exibirRelatorio() {
        valor = quantidadeComprada * valor;
        System.out.println(String.format("\nO bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f", sabor, quantidadeComprada, valor));
    }
}
