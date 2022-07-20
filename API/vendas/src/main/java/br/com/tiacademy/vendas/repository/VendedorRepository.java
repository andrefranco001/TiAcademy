package br.com.tiacademy.vendas.repository;

import br.com.tiacademy.vendas.core.crud.CrudRepository;
import br.com.tiacademy.vendas.domain.Vendedor;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository<T, ID> extends CrudRepository<Vendedor, Long> {}
