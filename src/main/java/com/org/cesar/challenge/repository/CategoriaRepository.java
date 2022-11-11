package com.org.cesar.challenge.repository;

import com.org.cesar.challenge.model.Categoria;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel="categoria", path="categoria")
public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Long> {
    List<Categoria> findByNome(@Param("nome") String nome);
}
