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
public class TesteEncomenda {

    public static void main(String[] args) {
        Encomenda encomenda01 = new Encomenda();
        encomenda01.tamanho = "G";
        encomenda01.enderecoRemetente = "Rua Caraíva, 440";
        encomenda01.enderecoDestinatario = "Avenida Doutor Augusto de Toledo, 877";
        encomenda01.distancia = 50.0;
        encomenda01.valorEncomenda = 100.0;
        
       encomenda01.emitirEtiqueta();
    }
}
