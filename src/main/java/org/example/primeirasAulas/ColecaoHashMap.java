package org.example.primeirasAulas;

import java.util.HashMap;
import java.util.Map;

public class ColecaoHashMap {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Fulano", 10);
        notas.put("Cicrano", 8);
        notas.put("Deltrano", 7);

        System.out.printf("A nota do Fulano é: %d\n", notas.get("Fulano"));

        for (Map.Entry<String, Integer> entrada : notas.entrySet()){
            String chave = entrada.getKey();
            Integer valor = entrada.getValue();

            System.out.printf("A chave é %s e o valor é %d\n", chave, valor);
        }
    }
}
