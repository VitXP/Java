/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao.pet.shop;

/**
 *
 * @author vitor
 */
public class PetShop {

    private String nome;
    private Double faturamentoTotal;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamentoTotal = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void setFaturamentoTotal(Double faturamentoTotal) {
        this.faturamentoTotal = faturamentoTotal;
    }

    void darBanho(Pet pet, Double valor) {

        // Aumentar Visita do petshop
        pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);

        // Adicionar valor gasto com o Petshop (Pet)
        Double caixaAtualPet = pet.getValorGastoEmPetShop();
        pet.setValorGastoEmPetShop(caixaAtualPet += valor);

        // Adicionar valor na fatura total do PetShop
        setFaturamentoTotal(faturamentoTotal += valor);
    }

    void darBanho(Pet pet, Double valor, Integer desconto) {

        // Aumentar Visita do petshop
        pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);

        // Adicionar valor gasto com o Petshop com desconto (Pet)
        Double valorDesconto = valor - (valor * desconto / 100);
        Double caixaAtualPet = pet.getValorGastoEmPetShop();
        pet.setValorGastoEmPetShop(caixaAtualPet += valorDesconto);

        // Adicionar valor na fatura tptal do PetShop
        setFaturamentoTotal(faturamentoTotal += valorDesconto);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Faturamento Total: %.2f", nome, faturamentoTotal);
    }

}
