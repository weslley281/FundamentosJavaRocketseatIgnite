package org.example;

public class TiposPrimitivos {
    public static void main(String[] args) {
        int inteiro = 10;
        double pontoFlutuante = 3.14;
        long longo = 1000000000L;
        float flutuante = 2.5f;

        boolean booleano = true;

        char caractere = 'A';

        // Exibindo os valores
        System.out.println("Variável inteiro: " + inteiro);
        System.out.println("Variável pontoFlutuante: " + pontoFlutuante);
        System.out.println("Variável longo: " + longo);
        System.out.println("Variável flutuante: " + flutuante);
        System.out.println("Variável booleano: " + booleano);
        System.out.println("Variável caractere: " + caractere);

        if (inteiro >= 10){
            System.out.println("Entro no if");
        } else if (inteiro >= 20) {
            System.out.println("Entro no else if");
        } else {
            System.out.println("Entrou no else");
        }

        int valorIncial = 0;
        while (valorIncial <= 3){
            System.out.println("O valor inicial é menor que 3 = " + valorIncial);
        valorIncial++;
        }

        for (int i = 0; i <= 10; i++)
            System.out.printf("8 x %d = %d\n", i, (8 * i));
        }
    }
