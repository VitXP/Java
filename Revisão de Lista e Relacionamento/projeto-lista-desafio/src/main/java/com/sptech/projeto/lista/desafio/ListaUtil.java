package com.sptech.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList<>();
    }

    public Integer count() {
        return inteiros.size();
    }

    public void add(Integer valor) {
        if (valor != null) {
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        for (int i = 0; i < inteiros.size(); i++) {

            if (inteiros.get(i) == valor) {
                inteiros.remove(i);
            }
        }

    }

    public Integer countPares() {

        Integer par = 0;

        for (int i = 0; i < inteiros.size(); i++) {

            if (inteiros.get(i) % 2 == 0) {
                par++;
            }
        }
        return par;

    }

    public Integer countImpares() {
        Integer impar = 0;

        for (int i = 0; i < inteiros.size(); i++) {

            if (inteiros.get(i) % 2 == 1) {
                impar++;
            }
        }
        return impar;
    }

    public Integer somar() {
        Integer soma = 0;

        for (Integer inteiro : inteiros) {

            if (inteiros.size() < 0) {
                return null;
            } else {
                soma += inteiro;
            }
        }

        return soma;
    }

    public Integer getMaior() {

        if (inteiros.isEmpty()) {
            return 0;
        } else {
            Integer maior = inteiros.get(0);
            for (int i = 0; i < inteiros.size(); i++) {

                if (inteiros.get(i) > maior) {
                    maior = inteiros.get(i);
                }
            }
            return maior;

        }
    }

    public Integer getMenor() {
        if (inteiros.isEmpty()) {
            return 0;
        } else {
            Integer menor = inteiros.get(0);
            for (int i = 0; i < inteiros.size(); i++) {

                if (inteiros.get(i) < menor) {
                    menor = inteiros.get(i);
                }
            }
            return menor;

        }

    }

    public Boolean hasDuplicidade() {

        for (int i = 0; i < inteiros.size(); i++) {
            for (int j = i + 1; j < inteiros.size(); j++) {
                if (inteiros.get(i) == inteiros.get(j)) {
                    return true;
                }
            }
        }
        return false;

    }
}
