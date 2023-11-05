package org.example.pessoa;

public class Aluno extends Pessoa {
    private Integer matricula;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    String imprimirDadosPessoa(){
        return "O nome é " + this.getNome() + " idade é " + this.getIdade() + " e sua matricula é " + this.getMatricula();
    }
}
