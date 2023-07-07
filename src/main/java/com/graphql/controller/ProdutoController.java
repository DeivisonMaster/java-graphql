package com.graphql.controller;

import java.math.BigDecimal;

import com.graphql.model.Produto;
import com.graphql.repository.ProdutoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoRepositorio repositorio;
	
	@MutationMapping
	Produto adicionaProduto(@Argument ProdutoInput produto){
		return repositorio.save(new Produto(produto.descricao, produto.valor, produto.categoriaId));
	}
	
	@QueryMapping
	Iterable<Produto> listarProdutos(){
		return repositorio.findAll();
	}
	
	record ProdutoInput(String descricao, BigDecimal valor, Long categoriaId) {
	}
}
