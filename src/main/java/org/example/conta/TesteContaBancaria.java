package org.example.conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("12345", "Fulano de Tal", 1000);
        contaBancaria.depositar(200);
        contaBancaria.sacar(500);
    }
}
