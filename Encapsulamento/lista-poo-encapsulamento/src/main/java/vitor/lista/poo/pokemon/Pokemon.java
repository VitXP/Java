/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.lista.poo.pokemon;

/**
 *
 * @author vitor
 */
public class Pokemon {

    private String nome;
    private String tipo;
    private Double forca;
    private Integer Doce = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Integer getDoce() {
        return Doce;
    }

    public void setDoce(Integer Doce) {
        this.Doce = Doce;
    }

}
