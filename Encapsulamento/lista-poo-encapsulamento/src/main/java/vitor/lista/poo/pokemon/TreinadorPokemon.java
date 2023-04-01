/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.lista.poo.pokemon;

/**
 *
 * @author vitor
 */
public class TreinadorPokemon {

    private String nome;
    private Integer nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    void treinarPokemon(Pokemon poke) {

        Double aumentarForca = poke.getForca() + (poke.getForca() * 0.1);
        poke.setForca(aumentarForca);

        Integer doceAtual = poke.getDoce() + 10;
        poke.setDoce(doceAtual);

        Integer nivelTreinadorAtual = getNivel() + 2;
        setNivel(nivelTreinadorAtual);
        System.out.println(String.format("Treino Realizado!"));
    }

    void evoluirPokemon(Pokemon poke, String nomeEvolucao) {

        String nomePokemon = poke.getNome();
        Integer quantidadeDoce = poke.getDoce();

        if (quantidadeDoce >= 50) {
            poke.setNome(nomeEvolucao);
            poke.setDoce(quantidadeDoce - 50);
            Integer expTreinador = getNivel() + 10;
            setNivel(expTreinador);
            System.out.println(String.format("“Pokémon %s evoluiu para -> %s", nomePokemon, nomeEvolucao));
        } else {
            System.out.println("“Não foi possível realizar operação");
        }

    }
}
