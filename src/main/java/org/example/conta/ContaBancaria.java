package org.example.conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private Double saldo;
    ContaBancaria(String numero, String titular, double saldo){
        this.saldo = saldo;
        this.numero = numero;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    void depositar(double valor){
        if (valor > 0){
            saldo = saldo + valor;
            System.out.printf("Deposito de %f realizado\n", valor);
            System.out.printf("Novo saldo atualizado é de %f\n", this.saldo);
        }else {
            System.out.println("Valor não foi alterado");
        }
    }

    void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo = saldo - valor;
            System.out.printf("Saque de %f realizado\n", valor);
            System.out.printf("Novo saldo atualizado é de %f\n", this.saldo);
        }else {
            System.out.println("Valor não foi alterado");
        }
    }
}
