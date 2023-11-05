package org.example.pessoa;

public class Professor extends Pessoa {
    private Double Salario;

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    String imprimirDadosPessoa(){
        return "O nome é " + this.getNome() + " idade é " + this.getIdade() + " e seu sálario é " + this.getSalario();
    }
}
