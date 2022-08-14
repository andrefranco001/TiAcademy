package br.com.tiacademy.bebidas.controller;

import br.com.tiacademy.bebidas.core.crud.CrudController;
import br.com.tiacademy.bebidas.dto.request.FermentadoDtoRequest;
import br.com.tiacademy.bebidas.entity.Distribuidora;
import br.com.tiacademy.bebidas.entity.Fermentado;
import br.com.tiacademy.bebidas.repository.DistribuidoraRepository;
import br.com.tiacademy.bebidas.service.FermentadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Objects;

@RestController
@RequestMapping("/fermentados")
public class FermentadoController extends CrudController<Fermentado, Long> {

    @Autowired
    public FermentadoService service;
    @Autowired
    public DistribuidoraRepository distribuidoraRepository;

    @PostMapping("/{distribuidoraId}")
    public ResponseEntity<Object> save(@RequestBody FermentadoDtoRequest fermentadoDto, @PathVariable("distribuidoraId") Long distribuidoraId) {
        Fermentado fermentado = new Fermentado();

        Distribuidora distribuidora = distribuidoraRepository.findById(distribuidoraId).orElse(null);
        if (Objects.isNull(distribuidora)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("distribuidora informada após /chas/ não existe, crie a distribuidora ou informe um id de distribuidora válido.");
        }
        fermentado.setNome(fermentadoDto.getNome());
        fermentado.setAlcoolico(fermentado.getAlcoolico());
        fermentado.setData(fermentadoDto.getData());
        fermentado.setDistribuidora(distribuidora);

        return ResponseEntity.ok(service.save(fermentado));
    }

    @GetMapping("/nome={name}")
    public ResponseEntity<Object> findByName(@PathVariable("name") String name) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findByName(name));
        }
        catch (RuntimeException runtimeException) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.findAll());
        }
    }
}