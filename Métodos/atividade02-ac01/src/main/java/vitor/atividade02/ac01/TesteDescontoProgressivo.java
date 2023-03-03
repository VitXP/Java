/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
// Atividade 3
public class TesteDescontoProgressivo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor unitário do produto");
        Double valorUnitarioDigitado = leitor.nextDouble();
        
        System.out.println("Digite a quantidade do produto");
        Integer quantidadeDigitada = leitor.nextInt();
        
        DescontoProgressivo desc = new DescontoProgressivo();
        
        Double valorProdutoComDesconto = desc.calcularDesconto(valorUnitarioDigitado, quantidadeDigitada);
        desc.exibirNotaFiscal(valorUnitarioDigitado, quantidadeDigitada, valorProdutoComDesconto);
    }

}

//3) Classe DescontoProgressivo
//Um supermercado criou promoção onde comprando 1 produto o desconto será de 10%, 2
//produtos 20% e 3 ou mais produtos 30%.
//Para implementar o cálculo da promoção no sistema de caixa, crie uma classe que:
//• Contenha um método chamado calcularDesconto, que recebe o valor e quantidade, e
//retorna o valor final com desconto.
//• Contenha um método chamado exibirNotaFiscal, que possui a seguinte saída:
//• Em uma classe de teste chamada TesteDescontoProgressivo, solicite o valor unitário de
//um determinado produto e a quantidade.
