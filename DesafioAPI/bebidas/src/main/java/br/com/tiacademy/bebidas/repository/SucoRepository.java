package br.com.tiacademy.bebidas.repository;

import br.com.tiacademy.bebidas.core.crud.CrudRepository;
import br.com.tiacademy.bebidas.entity.Suco;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SucoRepository extends CrudRepository<Suco, Long> {

    //Native Query
    @Query(value = "SELECT s.ID, s.NOME, s.ALCOOLICO, s.DATA, s.DISTRIBUIDORA_ID FROM suco s WHERE s.NOME like %:name%", nativeQuery = true)
    Suco findByName(@Param("name") String name);

}
