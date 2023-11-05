package org.example.construtor;

public class Construtor {
    private Integer numero;
    private String palavra;

    public Construtor(Integer numero, String palavra) {
        this.numero = numero;
        this.palavra = palavra;
    }

    public Construtor() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
}
