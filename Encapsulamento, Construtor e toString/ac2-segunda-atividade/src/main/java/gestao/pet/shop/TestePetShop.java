/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao.pet.shop;

/**
 *
 * @author vitor
 */
public class TestePetShop {

    public static void main(String[] args) {
        Pet pet01 = new Pet("Luna", "Yorkshire terrier");
        Pet pet02 = new Pet("Cassie", "Maltês");
        PetShop shop01 = new PetShop("Pet Feliz");

        // Dar Banho
        shop01.darBanho(pet01, 120.0);
        shop01.darBanho(pet02, 90.0);
        shop01.darBanho(pet01, 85.0);

        // Dar Banho com Desconto %
        shop01.darBanho(pet01, 80.0, 10);
        shop01.darBanho(pet02, 100.0, 20);
        shop01.darBanho(pet01, 60.0, 5);

        System.out.println(shop01);
        System.out.println(pet01);
        System.out.println(pet02);

    }
}
