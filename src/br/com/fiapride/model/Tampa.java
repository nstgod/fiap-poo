package br.com.fiapride.model;

public class Tampa {

    private String cor;
    private String tipo; // Ex: "Rosca", "Pressão", "Rolha"

    public Tampa(String cor, String tipo) {
        this.cor = cor;
        this.tipo = tipo;
    }

    public String getCor() {
        return this.cor;
    }

    public String getTipo() {
        return this.tipo;
    }
}