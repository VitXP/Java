/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.lista.introducao.poo;

/**
 *
 * @author vitor
 */
// Atividade02
public class Encomenda {

    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;

    Double calcularFrete() {
        Double frete = 0.0;

        //Camisa
        if (tamanho.equals("P")) {
            frete += (valorEncomenda * 0.1);
        } else if (tamanho.equals("M")) {
            frete += (valorEncomenda * 0.3);

        } else if (tamanho.equals("G")) {
            frete += (valorEncomenda * 0.5);

        }

        //Distância
        if (distancia <= 50) {
            frete += 3.00;
            return frete;
        } else if (distancia <= 200) {
            frete += 5.0;
            return frete;
        } else {
            frete += 7.0;
            return frete;
        }

    }

    void emitirEtiqueta() {
        Double frete = calcularFrete();
        Double total = frete + valorEncomenda;
        System.out.println(String.format("***** ETIQUETA PARA ENVIO *****\n"
                + "Endereço do remetente: %s\n"
                + "Endereço do destinatário: %s\n"
                + "Tamanho: %s\n"
                + "--------------------------------------------------\n"
                + "Valor encomenda: R$ %.2f\n"
                + "Valor frete: R$ %.2f\n"
                + "--------------------------------------------------\n"
                + "Valor total: R$ %.2f", enderecoRemetente, enderecoDestinatario, tamanho, valorEncomenda, frete, total));
    }

//        • P = 1% do valor da encomenda
//• M = 3% do valor da encomenda
//• G = 5% do valor da encomenda
//Distância:
//• Até 50km = R$3,00
//• Entre 51 e 200km = R$5,00
//• Mais de 201km = R$7,00
}
