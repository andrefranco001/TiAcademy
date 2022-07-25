package br.com.tiacademy.bebidas.repository;

import br.com.tiacademy.bebidas.core.crud.CrudRepository;
import br.com.tiacademy.bebidas.domain.Refrigerantes;
import org.springframework.stereotype.Repository;

@Repository
public interface RefrigerantesRepository extends CrudRepository<Refrigerantes, Long> {}
