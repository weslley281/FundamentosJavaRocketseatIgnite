package org.example.pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.cpf = "123.456.789-00";
        pessoa.nome = "Weslley";
        pessoa.idade = 28;

        System.out.println(pessoa.idade);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "123.456.789-00";
        pessoa1.nome = "Fulano";
        pessoa1.idade = 32;

        System.out.println(pessoa1.nome);

        System.out.println(pessoa.imprimirDadosPessoa());
        System.out.println(pessoa1.imprimirDadosPessoa());
    }
}
