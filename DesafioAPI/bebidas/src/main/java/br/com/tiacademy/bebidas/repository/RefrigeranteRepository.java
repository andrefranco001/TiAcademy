package br.com.tiacademy.bebidas.repository;

import br.com.tiacademy.bebidas.core.crud.CrudRepository;
import br.com.tiacademy.bebidas.entity.Refrigerante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RefrigeranteRepository extends CrudRepository<Refrigerante, Long> {


    //Native Query
    @Query(value = "SELECT r.ID, r.NOME, r.ALCOOLICO, r.DATA, r.DISTRIBUIDORA_ID FROM refrigerante r WHERE r.NOME like %:name%", nativeQuery = true)
    Refrigerante findByName(@Param("name") String name);
}
