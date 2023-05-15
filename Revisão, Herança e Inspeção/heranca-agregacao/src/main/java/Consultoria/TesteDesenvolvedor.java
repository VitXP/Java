/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultoria;

/**
 *
 * @author vitor
 */
public class TesteDesenvolvedor {

    public static void main(String[] args) {
        Desenvolvedor dev01 = new Desenvolvedor("Alan", 20, 10.0);
        Desenvolvedor dev02 = new Desenvolvedor("Mandy", 20, 10.0);

        DesenvolvedorMobile mob01 = new DesenvolvedorMobile(40, 20.0, "Victor", 20, 10.0);
        Consultoria const01 = new Consultoria("Deloitte", 3);

        const01.contratar(dev01);
        const01.contratar(dev02);
        const01.contratar(mob01);
        const01.existePorNome("Alan");
        const01.getQuantidadeDesenvolvedores();
        const01.getQuantidadeDesenvolvedoresMobile();

        const01.buscarDesenvolvedorPorNome("Alan");
        const01.buscarDesenvolvedorPorNome("Victor");

        const01.getTotalSalarios();
    }
}
