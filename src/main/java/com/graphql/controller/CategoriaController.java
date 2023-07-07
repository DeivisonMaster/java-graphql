package com.graphql.controller;

import java.util.Optional;

import com.graphql.model.Categoria;
import com.graphql.repository.CategoriaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;


@Controller
public class CategoriaController {
	
	@Autowired
	private CategoriaRepositorio repositorio;
	
	@SchemaMapping(typeName = "Mutation", field = "adicionaCategoria")
	Categoria adicionaCategoria(@Argument CategoriaInput categoria){
		return this.repositorio.save(new Categoria(categoria.descricao));
	}
	
	@SchemaMapping(typeName = "Query", field = "categoriaPorId")
	Optional<Categoria> categoriaPorId(@Argument Long id) {
		return this.repositorio.findById(id);
	}
	
	record CategoriaInput(String descricao) {
	}
}
