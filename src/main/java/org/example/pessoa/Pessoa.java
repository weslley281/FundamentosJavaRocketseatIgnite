package org.example.pessoa;

public class Pessoa {
    String nome;
    Integer idade;
    String cpf;

    String imprimirDadosPessoa(){
        return "O nome é " + this.nome + " idade é " + this.idade;
    }
}
