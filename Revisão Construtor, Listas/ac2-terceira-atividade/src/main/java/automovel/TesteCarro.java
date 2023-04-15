/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automovel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vitor
 */
//Atividade 3
public class TesteCarro {

    public static void main(String[] args) {

        Carro car01 = new Carro("Hatch", 60.000, 2015, "Honda");
        Carro car02 = new Carro("SUV", 80.000, 2020, "Gol");
        Carro car03 = new Carro("Esportivo", 120.000, 2023, "Jeep");
        Carro car04 = new Carro("Crossover", 50.000, 2023, "Honda");
        Carro car05 = new Carro("Perua", 20.000, 2023, "Fusca");

        List<Carro> carros = new ArrayList();
        carros.add(car01);
        carros.add(car02);
        carros.add(car03);
        carros.add(car04);
        carros.add(car05);

        System.out.println("\nCarros com ano maior que 2018");
        for (Carro carro : carros) {
            if (carro.getAno() > 2018) {
                System.out.println(carro);
            }
        }
        System.out.println("------------------------------------------------------------------------");

        System.out.println("\nCarros com valor menor que 60.000");
        for (Carro carro : carros) {
            if (carro.getValor() < 60.000) {
                System.out.println(carro);
            }
        }

        System.out.println("------------------------------------------------------------------------");

        System.out.println("\nCarros apenas da Marca Honda");
        for (Carro carro : carros) {
            if (carro.getMarca().equalsIgnoreCase("Honda")) {
                System.out.println(carro);
            }
        }
        
        System.out.println("\n");

    }
}
