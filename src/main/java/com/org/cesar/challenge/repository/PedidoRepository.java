package com.org.cesar.challenge.repository;

import com.org.cesar.challenge.model.Pedido;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel="pedido", path="pedido")
public interface PedidoRepository extends PagingAndSortingRepository<Pedido, Long> {
    Optional<Pedido> findById(@Param("id")Long id);
}

