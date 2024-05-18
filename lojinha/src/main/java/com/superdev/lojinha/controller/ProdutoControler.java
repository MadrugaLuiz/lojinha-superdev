package com.superdev.lojinha.controller;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.superdev.lojinha.model.Produto;
import com.superdev.lojinha.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoControler {


    // @Autowired
    // private ProdutoRepository repository;
    private final ProdutoRepository repository = new ProdutoRepository();


    @GetMapping
    public List<Produto> listarProdutos() {
        ProdutoRepository repository = new ProdutoRepository();
        return repository.findAll();
    }

    public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto produto) {
        ProdutoRepository repository = new ProdutoRepository();
        Produto novoProduto = repository.create(produto);
        return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);


    }


}
