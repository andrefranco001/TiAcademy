package br.com.tiacademy.bebidas.repository;

import br.com.tiacademy.bebidas.core.crud.CrudRepository;
import br.com.tiacademy.bebidas.entity.ChaGelado;
import br.com.tiacademy.bebidas.entity.Fermentado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FermentadoRepository extends CrudRepository<Fermentado, Long> {

    @Query(value = "SELECT f.ID, f.NOME, f.ALCOOLICO, f.DATA, f.DISTRIBUIDORA_ID FROM fermentado f WHERE f.NOME like %:name%", nativeQuery = true)
    Fermentado findByName(@Param("name") String name);

}
