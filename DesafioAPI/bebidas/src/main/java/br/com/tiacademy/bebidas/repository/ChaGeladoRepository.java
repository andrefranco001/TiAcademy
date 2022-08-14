package br.com.tiacademy.bebidas.repository;

import br.com.tiacademy.bebidas.core.crud.CrudRepository;
import br.com.tiacademy.bebidas.entity.ChaGelado;
import br.com.tiacademy.bebidas.entity.Distribuidora;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ChaGeladoRepository extends CrudRepository<ChaGelado, Long> {

    //Native Query
    @Query(value = "SELECT cg.ID, cg.NOME, cg.ALCOOLICO, cg.DATA, cg.DISTRIBUIDORA_ID FROM cha_gelado cg WHERE cg.NOME like %:name%", nativeQuery = true)
    ChaGelado findByName(@Param("name") String name);
}