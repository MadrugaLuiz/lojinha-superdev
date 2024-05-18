package com.superdev.lojinha.model;

public class Produto {

    private int id;
    private String nome;
    private  Double preco;
    private boolean status;

    public Produto() {

    }

    public Produto(int id, boolean status, Double preco, String nome) {
        this.id = id;
        this.status = status;
        this.preco = preco;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
