/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle.de.estimativa;

/**
 *
 * @author vitor
 */
public class Atividade {

    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

    void terminarAtividade(Integer diasUsados) {
        this.diasUsados = diasUsados;
        System.out.println("Tarefa terminada com Sucesso!");
    }

    void exibirRelatorio() {

        if (diasUsados > diasEstimados) {
            System.out.println(String.format("Você estimou %d dias, mas a tarefa "
                    + "foi feita em %d dias (%d dias a mais que o estimado)", diasEstimados, diasUsados, (diasUsados - diasEstimados)));
        } else if (diasUsados.equals(diasEstimados)) {
            System.out.println(String.format("Você estimou %d dias, e a tarefa foi "
                    + "feita em %d dias,  atendendo a estimativa precisão", diasEstimados, diasUsados));
        } else {
            System.out.println(String.format("Você estimou %d dias, e a tarefa foi "
                    + "feita em %d dias (%d dias a menos que o estimado). Parabéns!", diasEstimados, diasUsados, (diasEstimados - diasUsados)));
        }
    }

    @Override
    public String toString() {

        return String.format("responsável : %s | Atividade : %s | Dias Estimados: %d | Dias Usados: %d", responsavel, nomeAtividade, diasEstimados, diasUsados);

    }

}
