/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio.conta.corrente;

/**
 *
 * @author vitor
 */
public class TesteContaCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Conta01
        ContaCorrente nubank = new ContaCorrente("Vitor");

        nubank.depositar(11, 01, 2003, 10.0);
        nubank.depositar(11, 01, 2003, 20.0);
        nubank.sacar(11, 01, 2003, 20.0);
        nubank.sacar(11, 01, 2003, 10.0);

        //Conta02
        ContaCorrente itau = new ContaCorrente("Mario");

        itau.depositar(05, 05, 2023, 25.0);
        itau.depositar(05, 05, 2023, 02.0);
        itau.sacar(07, 06, 2023, 15.0);
        itau.sacar(07, 06, 2023, 2.0);

        System.out.println("\n" + "-".repeat(150));

        System.out.println("Operação\n");
        
        System.out.println(nubank);
        System.out.println(itau);
        System.out.println("\n" + "-".repeat(150));

        itau.exibirExtrato();
        System.out.println("\n" + "-".repeat(150));

    }

}
