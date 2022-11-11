package com.org.cesar.challenge.repository;

import com.org.cesar.challenge.model.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel="produto", path="produto")
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Long> {
    List<Produto> findByNome(@Param("nome") String nome);
    List<Produto> findByValor(@Param("valor") double valor);
    List<Produto> findByFavorito(@Param("favorito")boolean favorito);
}
