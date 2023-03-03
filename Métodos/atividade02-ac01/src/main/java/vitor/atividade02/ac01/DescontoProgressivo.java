/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.atividade02.ac01;

/**
 *
 * @author vitor
 */
public class DescontoProgressivo {

    Double calcularDesconto(Double numero01, Integer numero02) {

        Double valorSemDesconto = numero01 * numero02;

        if (numero02 == 1) {
            return valorSemDesconto - ((valorSemDesconto * 10) / 100);
        } else if (numero02 == 2) {
            return valorSemDesconto - ((valorSemDesconto * 20) / 100);
        } else {
            return valorSemDesconto - ((valorSemDesconto * 30) / 100);
        }
    }

    void exibirNotaFiscal(Double numero01, Integer numero02, Double numero03) {

        String frase = String.format("----------------------------------- \n "
                + "Valor do produto: %.2f "
                + "\n Quantidade do produto:¨%d "
                + "\n ----------------------------------- \n "
                + "Valor com o desconto: %.2f \n", numero01, numero02, numero03);

        System.out.println(frase);

    }

}
