/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle.de.estimativa;

/**
 *
 * @author vitor
 */
public class TesteAtividade {

    public static void main(String[] args) {
        Atividade atv01 = new Atividade("Criar Planner", "Allana", 5);
        Atividade atv02 = new Atividade("Estudar", "Breno", 10);
        Atividade atv03 = new Atividade("Criar Banner", "Victor", 4);

        atv01.terminarAtividade(6);
        atv02.terminarAtividade(10);
        atv03.terminarAtividade(3);

        atv01.exibirRelatorio();
        atv02.exibirRelatorio();
        atv03.exibirRelatorio();

        System.out.println(atv01);
        System.out.println(atv02);
        System.out.println(atv03);
    }
}
