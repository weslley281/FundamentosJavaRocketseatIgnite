package org.example.primeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Fulano");
        nomes.add("Cicrano");
        nomes.add("Deltrano");

        System.out.println(nomes.get(0));
        System.out.println("-----------------------------------");
        for (String nome : nomes){
            System.out.println(nome);
        }
        System.out.println("-----------------------------------");
        nomes.forEach(nome -> System.out.println(nome));
    }
}
