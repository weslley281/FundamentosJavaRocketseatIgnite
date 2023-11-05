package org.example.pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("123.456.789-00");
        pessoa.setNome("Weslley");
        pessoa.setIdade(28);

        System.out.println(pessoa.getNome());

        Professor professor = new Professor();
        professor.setCpf("123.456.789-00");
        professor.setNome("Fulano");
        professor.setIdade(32);
        professor.setSalario(1246.18);

        System.out.println(professor.getSalario());

        Aluno aluno = new Aluno();
        aluno.setCpf("123.456.789-00");
        aluno.setNome("Cicrano");
        aluno.setIdade(32);
        aluno.setMatricula(256789);

        System.out.println(aluno.getMatricula());

        System.out.println(pessoa.imprimirDadosPessoa());
        System.out.println(professor.imprimirDadosPessoa());
        System.out.println(aluno.imprimirDadosPessoa());
    }
}