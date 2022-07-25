package br.com.tiacademy.bebidas.repository;

import br.com.tiacademy.bebidas.core.crud.CrudRepository;
import br.com.tiacademy.bebidas.domain.Destilados;
import org.springframework.stereotype.Repository;

@Repository
public interface DestiladosRepository extends CrudRepository<Destilados, Long> {}
