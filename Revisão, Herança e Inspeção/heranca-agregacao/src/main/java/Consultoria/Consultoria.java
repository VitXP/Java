/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultoria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vitor
 */
public class Consultoria {

    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<>();
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

    public Boolean existePorNome(String nome) {

        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if (desenvolvedor.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome " + nome + " Localizado!");
                return true;
            }
        }
        System.out.println("Nome " + nome + " Não foi Localizado!");

        return false;
    }

    public void contratar(Desenvolvedor dev) {

        if (vagas > desenvolvedores.size()) {
            desenvolvedores.add(dev);
            System.out.println("Desenvolvedor contratado!");
        } else {
            System.out.println("Sem vagas disponíveis!");
        }
    }

    public Integer getQuantidadeDesenvolvedores() {
        Integer qtdDev = 0;

        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if (!(desenvolvedor instanceof DesenvolvedorMobile)) {
                qtdDev++;

            }
        }

        System.out.println("A consultoria possui " + qtdDev + " Desenvolvedores");
        return qtdDev;
    }

    public Integer getQuantidadeDesenvolvedoresMobile() {

        Integer devMobile = 0;

        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if (desenvolvedor instanceof DesenvolvedorMobile) {
                devMobile++;
            }
        }

        System.out.println("A consultoria possui " + devMobile + " Desenvolvedores Mobile");
        return devMobile;
    }

    public Double getTotalSalarios() {
        Double totalSalario = 0.0;

        for (Desenvolvedor desenvolvedores : desenvolvedores) {
            totalSalario += desenvolvedores.getSalario();
        }

        System.out.println("O total de salário da consultoria é equivalente à " + totalSalario);
        return totalSalario;
    }

    public Desenvolvedor buscarDesenvolvedorPorNome(String nome) {

        for (Desenvolvedor desenvolvedores : desenvolvedores) {
            if (desenvolvedores.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome " + nome + " Localizado!");
                return desenvolvedores;
            }
        }

        System.out.println("Nome " + nome + " Não foi Localizado!");
        return null;

    }

    @Override
    public String toString() {
        return String.format("""
            nome: %s | vagas: %d | desenvolvedores: %s
            """, nome, vagas, desenvolvedores);
    }

}
