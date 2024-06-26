package com.superdev.lojinha.repository;


import com.superdev.lojinha.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdutoRepository {

    List<Produto> ListaProdutos = new ArrayList<>();
    int idSequence = 0;

    //findAll

    public List<Produto> findAll() {
        return this.ListaProdutos;
    }

    //findById

    public Produto findById(int id) {
        for (Produto produto : this.ListaProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
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
        if (produtoEncontrado == null) {
            return null;
        }
        this.ListaProdutos.remove(produtoEncontrado);
        this.ListaProdutos.add(produto);

        return produto;
    }

    //delete

    public Produto delete(int id) {
        Produto produtoEncontrado = this.findById(id);
        if (produtoEncontrado == null) {
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
