package br.com.tiacademy.bebidas.repository;

import br.com.tiacademy.bebidas.core.crud.CrudRepository;
import br.com.tiacademy.bebidas.domain.Sucos;
import org.springframework.stereotype.Repository;

@Repository
public interface SucosRepository extends CrudRepository<Sucos, Long> {}
