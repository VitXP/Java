/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vitor
 */

// Atividade 1
public class Frutas {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Criando e Adicionando itens na lista
        List<String> frutas = new ArrayList();
        frutas.add("Maça");
        frutas.add("Uva");
        frutas.add("Pera");
        frutas.add("Laranja");
        frutas.add("Mexirica");
        frutas.add("Morango");
        frutas.add("Pitaya");
        
        System.out.println("Digite o nome da fruta:");
        String frutaDigitada = leitor.nextLine();

        Integer Validar = 0;

        for (String frutaDaVez : frutas) {
            if (frutaDaVez.equalsIgnoreCase(frutaDigitada)) {
                Validar++;
            }
        }

        if (Validar > 0) {
            System.out.println(String.format("A fruta %s existe na lista", frutaDigitada));
        } else {
            System.out.println(String.format("Não existe a fruta %s na lista", frutaDigitada));
        }
    }
}
