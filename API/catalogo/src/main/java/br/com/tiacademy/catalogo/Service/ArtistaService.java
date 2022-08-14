package br.com.tiacademy.catalogo.Service;

import br.com.tiacademy.catalogo.Domain.Artista;
import br.com.tiacademy.catalogo.Repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class ArtistaService {

    @Autowired
    public ArtistaRepository artistaRepository;

    public List<Artista> listAll() {
        return artistaRepository.findAll();
    }

    public Artista listById(Long id) {
        return artistaRepository.findById(id).orElse(null);
    }

    public Artista salvar(Artista artista){
        return artistaRepository.save(artista);
    }

    public Artista editar(Long id, Artista editado){
        Artista recuperado = listById(id);

        if (Objects.isNull(recuperado)) {
            throw new RuntimeException("Artista não existe");
        }
        editado.setNome(recuperado.getNome());
        return artistaRepository.save(editado);
    }

    public void excluir(Long id) {
        artistaRepository.deleteById(id);
    }
}
