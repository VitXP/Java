/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vitor
 */
public class Produtora {

    private String nome;
    private Integer vagas;
    private List<Ator> atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public Boolean existePorNome(String nome) {

        for (Ator ator : atores) {
            if (ator.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome " + nome + " Localizado!");
                return true;
            }
        }
        System.out.println("Nome " + nome + " Não foi Localizado!");

        return false;
    }

    public void contratar(Ator ato) {

        if (vagas > atores.size()) {
            atores.add(ato);
            System.out.println("Desenvolvedor contratado!");
        } else {
            System.out.println("Sem vagas disponíveis!");
        }
    }

    public Integer getQauntidadeAtores() {
        Integer qtdAtor = 0;

        for (Ator ator : atores) {
            if (!(ator instanceof Protagonista)) {
                qtdAtor++;

            }
        }

        System.out.println("A produtura possui " + qtdAtor + " Atores");
        return qtdAtor;
    }

    public Integer getQuantidadeProtagonistas() {

        Integer qtdProt = 0;

        for (Ator ator : atores) {
            if (ator instanceof Protagonista) {
                qtdProt++;

            }
        }

        System.out.println("A produtura possui " + qtdProt + " Protagonistas");
        return qtdProt;
    }

    public Double getTotalSalarios() {
        Double totalSalario = 0.0;

        for (Ator ator : atores) {
            totalSalario += ator.getSalario();
        }

        System.out.println("O total de salário da Produtora é equivalente à " + totalSalario);
        return totalSalario;
    }

    public Ator buscarAtorPorNome(String nome) {

        for (Ator ator : atores) {
            if (ator.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome " + nome + " Localizado!");
                return ator;
            }

        }

        System.out.println("Nome " + nome + " Não foi Localizado!");
        return null;

    }

    @Override
    public String toString() {
        return String.format("""
            nome: %s | vagas: %d | atores: %s
            """, nome, vagas, atores);
    }

}
