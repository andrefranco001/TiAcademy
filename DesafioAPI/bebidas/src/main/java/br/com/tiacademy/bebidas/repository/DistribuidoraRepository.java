package br.com.tiacademy.bebidas.repository;

import br.com.tiacademy.bebidas.core.crud.CrudRepository;
import br.com.tiacademy.bebidas.entity.Distribuidora;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DistribuidoraRepository extends CrudRepository<Distribuidora, Long> {

    //HQL
    @Query(value = "SELECT distribuidora from Distribuidora distribuidora where upper(distribuidora.nome) like %:name%")
    Distribuidora findByName(@Param("name")String name);

}