/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.segunda.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
//Atividade 3
public class Login {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o Login");
        String loginDigitado = leitor.nextLine();

        System.out.println("Insira a senha");
        String senhaDigitada = leitor.nextLine();

        if (loginDigitado.equalsIgnoreCase("admin") && senhaDigitada.equalsIgnoreCase("#SPtech2022")) {
            System.out.println("Login realizado com sucesso");
        } else {
            System.out.println("Login e/ou senha inválidos");
        }
        
        
        
//        Versão Operador Ternário
//
//        String frase;
//
//        Boolean Desbloqueado = loginDigitado.equalsIgnoreCase("admin") && senhaDigitada.equalsIgnoreCase("#SPtech2022");
//
//        frase = Desbloqueado ? "Login realizado com sucesso" : "Login e/ou senha inválidos";
//        
//        System.out.println(frase);
    }
}

//Crie uma classe chamada Login que simule a autenticação de um usuário em um sistema:
//• Use como parâmetro de validação o login “admin” e a senha “#SPtech2022”
//• Solicite o nome de usuário e senha.
//• Exiba: “Login e/ou senha inválidos” caso os valores digitados sejam diferentes e
//solicite novamente.
//• Caso o usuário digite os campos corretamente, exiba: “Login realizado com sucesso”
