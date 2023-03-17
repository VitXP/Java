/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.lista.introducao.poo;

/**
 *
 * @author vitor
 */
// Atividade 4
public class Termometro {

    Integer temperaturaAtual;
    Integer temperaturaMax;
    Integer temperaturaMin;

    Integer aumentaTemperatura(Integer temperaturaDigitada) {
        temperaturaAtual += temperaturaDigitada;

        if (temperaturaAtual > temperaturaMax) {
            temperaturaMax = temperaturaAtual;

        }

        return temperaturaAtual;
    }

    Integer diminuiTemperatura(Integer temperaturaDigitada) {
        temperaturaAtual -= temperaturaDigitada;

        
        if (temperaturaAtual < temperaturaMin) {
            temperaturaMin = temperaturaAtual;

        }

        return temperaturaAtual;
    }
    
    void exibeFahreinheit() {
        Double fahrenheit = (temperaturaAtual * 1.8) + 32;
        System.out.println(String.format("Temperatura atual em Fahrenheit: %.0fºf\n", fahrenheit));
    }
}
