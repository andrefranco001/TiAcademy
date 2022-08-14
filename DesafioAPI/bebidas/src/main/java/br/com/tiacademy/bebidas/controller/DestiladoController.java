package br.com.tiacademy.bebidas.controller;

import br.com.tiacademy.bebidas.core.crud.CrudController;
import br.com.tiacademy.bebidas.dto.request.DestiladoDtoRequest;
import br.com.tiacademy.bebidas.entity.Destilado;
import br.com.tiacademy.bebidas.entity.Distribuidora;
import br.com.tiacademy.bebidas.repository.DistribuidoraRepository;
import br.com.tiacademy.bebidas.service.DestiladoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Objects;

@RestController
@RequestMapping("/destilados")
public class DestiladoController extends CrudController<Destilado, Long> {

    @Autowired
    public DestiladoService service;
    @Autowired
    public DistribuidoraRepository distribuidoraRepository;

    @PostMapping("/{distribuidoraId}")
    public ResponseEntity<Object> save(@RequestBody DestiladoDtoRequest destiladosDto, @PathVariable("distribuidoraId") Long distribuidoraId) {
        Destilado destilados = new Destilado();

        Distribuidora distribuidora = distribuidoraRepository.findById(distribuidoraId).orElse(null);
        if (Objects.isNull(distribuidora)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("distribuidora informada após /destilados/ não existe, crie a distribuidora ou informe um id de distribuidora válido.");
        }
        destilados.setNome(destiladosDto.getNome());
        destilados.setAlcoolico(destilados.getAlcoolico());
        destilados.setData(destiladosDto.getData());

        destilados.setDistribuidora(distribuidora);
        return ResponseEntity.ok(service.save(destilados));
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