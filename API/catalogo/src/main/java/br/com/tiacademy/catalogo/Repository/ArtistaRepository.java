package br.com.tiacademy.catalogo.Repository;

import br.com.tiacademy.catalogo.Domain.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long> {

    @Query(value = " select a from Artista a where a.nome = :nome")
    Artista consultarPeloNome(@Param("nome") String nome);


}
