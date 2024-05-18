package com.superdev.lojinha.repository;


import com.superdev.lojinha.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    List<Produto> ListaProdutos = new ArrayList<>();
    int idSequence = 0;

    //findAll

    public List<Produto> findAll() {
        return this.ListaProdutos;
    }

    //findById

    public Produto findById(int id) {
        Produto produtoEncontrado = new Produto();
        this.ListaProdutos.forEach(produto -> {
            if (produto.getId() == id) {
                produtoEncontrado.setId(produto.getId());
                produtoEncontrado.setNome(produto.getNome());
                produtoEncontrado.setPreco(produto.getPreco());
                produtoEncontrado.setStatus(produto.isStatus());
            }
        });
        return produtoEncontrado;
    }

    //create
    public Produto create(Produto produto) {
        produto.setId(this.getIdSequence());
        this.ListaProdutos.add(produto);
        return produto;
    }


    //alter

    public Produto alter(Produto produto) {
        Produto produtoEncontrado = this.findById(produto.getId());
        if (produtoEncontrado.getId() == 0) {
            return null;
        }
        this.ListaProdutos.remove(produtoEncontrado);
        this.ListaProdutos.add(produto);

        return produto;
    }

    //delete

    public Produto delete(int id) {
        Produto produtoEncontrado = this.findById(id);
        if (produtoEncontrado.getId() == 0) {
            return null;
        }

        this.ListaProdutos.remove(produtoEncontrado);
        return produtoEncontrado;

    }


    private int getIdSequence() {
        this.idSequence++;
        return this.idSequence;

    }

}
