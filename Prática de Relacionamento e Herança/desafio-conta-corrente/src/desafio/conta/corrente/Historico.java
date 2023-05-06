/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.conta.corrente;

/**
 *
 * @author vitor
 */
public class Historico {
    private Integer dia;
    private Integer mes;
    private Integer ano;
    private Double valor;
    private String Operacao;

    public Historico(Integer dia, Integer mes, Integer ano, Double valor, String Operacao) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.Operacao = Operacao;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getOperacao() {
        return Operacao;
    }

    public void setOperacao(String Operacao) {
        this.Operacao = Operacao;
    }

    @Override
    public String toString() {
        return "Histórico {" + "dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", valor=" + valor + ", Operacao=" + Operacao +'}';
    }
    
    
    
}
