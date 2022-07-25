package br.com.tiacademy.bebidas.repository;

import br.com.tiacademy.bebidas.core.crud.CrudRepository;
import br.com.tiacademy.bebidas.domain.ChaGelado;
import org.springframework.stereotype.Repository;

@Repository
public interface ChaGeladoRepository extends CrudRepository<ChaGelado, Long> {}
