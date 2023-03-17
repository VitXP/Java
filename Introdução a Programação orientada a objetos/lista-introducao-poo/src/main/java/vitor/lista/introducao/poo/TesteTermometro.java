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
public class TesteTermometro {
    public static void main(String[] args) {
        
        Termometro temperatura01 = new Termometro();
        temperatura01.temperaturaAtual = 0;
        temperatura01.temperaturaMax = 0;
        temperatura01.temperaturaMin = 999999999;
        
        
        
        temperatura01.aumentaTemperatura(10);
        temperatura01.aumentaTemperatura(20);
        temperatura01.aumentaTemperatura(5);
        temperatura01.diminuiTemperatura(0);
        temperatura01.diminuiTemperatura(100);
        temperatura01.aumentaTemperatura(90);
        temperatura01.exibeFahreinheit();
        
        System.out.println(String.format("Temperatura atual : %dºc | Temperatura Máxima: %dºc | Temperatura Mínima: %dºc ", temperatura01.temperaturaAtual, temperatura01.temperaturaMax, temperatura01.temperaturaMin));
    }
}
