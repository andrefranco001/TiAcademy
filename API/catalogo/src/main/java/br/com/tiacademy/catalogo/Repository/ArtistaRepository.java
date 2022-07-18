package br.com.tiacademy.catalogo.Repository;

import br.com.tiacademy.catalogo.Domain.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long> {}
