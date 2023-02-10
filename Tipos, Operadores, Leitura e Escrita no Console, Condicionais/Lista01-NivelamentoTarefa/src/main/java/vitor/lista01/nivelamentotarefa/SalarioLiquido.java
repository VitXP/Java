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

// Atividade 6

public class SalarioLiquido {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o salário bruto");
        Double salarioBrutoDigitado = leitor.nextDouble();
        
        Double inss = (salarioBrutoDigitado * 10) / 100;
        Double ir = (salarioBrutoDigitado * 20) / 100;
        
        System.out.println("Insira o custa a condução diária");
        Double custoDigitado = leitor.nextDouble();
        
        Double valorConducao = (custoDigitado * 2) * 22;
        Double valorDesconto = inss + ir + valorConducao;
        Double salarioLiquido = salarioBrutoDigitado - valorDesconto;
        
        System.out.println("Seu salário bruto é R$"
                + salarioBrutoDigitado + " , tem um total de R$"
                + valorDesconto + " em descontos e receberá um líquido de R$"
                + salarioLiquido);
    }
}
