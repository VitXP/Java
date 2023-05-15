/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtora;

/**
 *
 * @author vitor
 */
public class TesteProdutora {

    public static void main(String[] args) {
        Ator ator01 = new Ator("Maria", 20, 10.0);
        Ator ator02 = new Ator("Clara", 20, 10.0);

        Protagonista prota01 = new Protagonista(40, 20.0, "Victor", 20, 10.0);
        Produtora prod = new Produtora("E6B Music", 2);

        prod.contratar(ator01);
        prod.contratar(prota01);

        prod.contratar(ator02);
        prod.existePorNome("Maria");
        prod.getQauntidadeAtores();
        prod.getQuantidadeProtagonistas();

        prod.buscarAtorPorNome("Alan");
        prod.buscarAtorPorNome("Victor");

        prod.getTotalSalarios();
    }
}
