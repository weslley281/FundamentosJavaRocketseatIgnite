package org.example.excecoes;

public class Excecoes {
    public static void main(String[] args) {
        try {
            validarNumero();
        } catch (IllegalArgumentException exception) {
            System.out.println("O erro foi: " + exception.getMessage());
        }
    }

    public static void validarNumero() {
        int numero = 10;
        if (numero < 100) {
            throw new IllegalArgumentException("O número é menor que 100");
        }
    }
}
