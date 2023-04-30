/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author vitor
 */
public class TesteLoja {

    public static void main(String[] args) {
        Produto produto01 = new Produto("Vassoura", "Limpeza", 20.0);
        Produto produto02 = new Produto("Funko Pop", "Descoração", 150.0);
        Produto produto03 = new Produto("Lixeira", "Limpeza", 90.0);

        Carrinho carrinho01 = new Carrinho("Vitor");
        Carrinho carrinho02 = new Carrinho("Alana");

        // Adicionar
        carrinho01.adicionar(produto01);
        carrinho01.adicionar(produto02);

        // Quantidade
        Integer quantidade = carrinho01.getQuantidade();

        //Existe por nome?
        carrinho01.existsPorNome("Vassoura");
        carrinho01.existsPorNome("Lixeira");

        // getQuantidadePorCategoria
        carrinho02.adicionar(produto03);
        carrinho02.getQuantidadePorCategoria("Limpeza");

        // Limpar
        carrinho02.limpar();
        System.out.println(carrinho02);

        // Remover Por nome
        carrinho02.adicionar(produto02);
        carrinho02.adicionar(produto01);
        carrinho02.removerPorNome("Funko Pop");
        System.out.println(carrinho02);

        // Pegar produto por nome
        carrinho02.getPorNome("Vassoura");

        // Valor total da lista
        carrinho02.adicionar(produto01);
        carrinho02.adicionar(produto02);
        carrinho02.valorTotal();
    }
}
