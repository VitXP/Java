/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vitor
 */
public class Carrinho {

    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getCarrinhos() {
        return produtos;
    }

    public void setCarrinhos(List<Produto> carrinhos) {
        this.produtos = carrinhos;
    }

    public Integer getQuantidade() {
        System.out.println(String.format("O carrinho possui %d produtos", produtos.size()));
        return produtos.size();
    }

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public Boolean existsPorNome(String nome) {

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("O carrinho possui esse produto na lista!");
                return true;

            }
        }
        System.out.println("O carrinho não possui esse produto na lista!");
        return false;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        Integer quantidade = 0;

        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(nome)) {
                quantidade++;
            }
        }
        System.out.println(String.format("O carrinho possui %d produtos nessa categoria!", quantidade));
        return quantidade;
    }

    public void limpar() {
        produtos.clear();
    }

    public void removerPorNome(String nome) {
        Integer possuiItem = 0;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println(String.format("O item %s foi removido do seu carrinho!", produto));
                produtos.remove(produto);
                possuiItem++;
            }
        }

        if (possuiItem <= 0) {
            System.out.println("Não possui nenhum item com esse nome para ser removido!");

        }

    }

    public List<Produto> getPorNome(String nome) {

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println(String.format("Item %s Localizado: ", nome));
                System.out.println(produtos);
                return produtos;
            }
        }

        System.out.println(String.format("Item %s não foi Localizado: ", nome));
        return produtos;

    }

    public double valorTotal() {

        Double valorTotal = 0.0;

        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }

        System.out.println("O valor total da sua lista de produtos é " + valorTotal);
        return valorTotal;
    }

    @Override
    public String toString() {
        return String.format("cliente: %s, carrinhos %s", cliente, produtos);
    }

}
