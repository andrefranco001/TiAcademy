package br.com.tiacademy.bebidas.repository;

import br.com.tiacademy.bebidas.core.crud.CrudRepository;
import br.com.tiacademy.bebidas.entity.Destilado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DestiladoRepository extends CrudRepository<Destilado, Long> {

    //Native Query
    @Query(value = "SELECT d.ID, d.NOME, d.ALCOOLICO, d.DATA, d.DISTRIBUIDORA_ID FROM destilado d WHERE upper(d.NOME) like %:name%", nativeQuery = true)
    Destilado findByName(@Param("name") String name);

}
