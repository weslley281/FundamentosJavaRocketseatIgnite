package org.example.construtor;

public class TesteConstrutor {
    public static void main(String[] args) {
        Construtor construtor = new Construtor();
        Construtor construtor1 = new Construtor(10, "Alguma coisa");

        System.out.println(construtor.getNumero());
        System.out.println(construtor.getPalavra());

        construtor.setNumero(12);
        construtor.setPalavra("AAAAAAAAAAA");

        System.out.println(construtor.getNumero());
        System.out.println(construtor.getPalavra());

        System.out.println(construtor1.getNumero());
        System.out.println(construtor1.getPalavra());
    }
}
