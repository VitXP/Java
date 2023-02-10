/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.lista01.nivelamentotarefa;

import java.util.Scanner;

/**
 *
 * @author vitor
 */

// Atividade 4

public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor unitário de um produto");
        Integer valorUnitarioDigitado = leitor.nextInt();
        
        System.out.println("Insira a quantidade vendida");
        Integer quantidadeVendidaDigitada = leitor.nextInt();
        
        System.out.println("Insira o valor pago pelo cliente");
        Integer valorPagoDigitado = leitor.nextInt();
        
        Integer troco =  valorPagoDigitado - (valorUnitarioDigitado * quantidadeVendidaDigitada);
        
        System.out.println("Seu troco será de R$ " + troco);
    }
}
