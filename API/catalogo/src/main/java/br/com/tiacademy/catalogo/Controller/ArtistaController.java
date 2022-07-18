package br.com.tiacademy.catalogo.Controller;

import br.com.tiacademy.catalogo.Domain.Artista;
import br.com.tiacademy.catalogo.Service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/artista")
public class ArtistaController {

    @Autowired
    public ArtistaService artistaService;

    @GetMapping
    public ResponseEntity<List<Artista>> listAll() {
        return ResponseEntity.ok(artistaService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artista> listById(@PathVariable("id") Long id) {
        ResponseEntity<Artista> resultado = listById(id);

        if (Objects.isNull(resultado)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(artistaService.listById(id));
    }

    @PostMapping
    public ResponseEntity<Artista> salvar(Artista artista) {
        return ResponseEntity.ok(artistaService.salvar(artista));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Artista> editar(@PathVariable Long id, @RequestBody Artista editado){
        return ResponseEntity.ok(artistaService.editar(id, editado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        artistaService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
