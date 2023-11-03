package org.example.primeirasAulas;

import java.util.HashSet;

public class ColecaoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(18);
        numeros.add(12);
        numeros.add(10);
        numeros.add(15);

        System.out.println(numeros.size());

        numeros.remove(10);

        for (Integer numero : numeros){
            System.out.println(numero);
        }

        System.out.println("Há 12?  " + numeros.contains(12) + ".");
    }
}
