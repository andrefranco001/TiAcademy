package br.com.tiacademy.bebidas.repository;

import br.com.tiacademy.bebidas.core.crud.CrudRepository;
import br.com.tiacademy.bebidas.domain.Fermentados;
import org.springframework.stereotype.Repository;

@Repository
public interface FermentadosRepository extends CrudRepository<Fermentados, Long> {}