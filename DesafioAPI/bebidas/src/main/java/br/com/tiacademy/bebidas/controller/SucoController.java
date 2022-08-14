package br.com.tiacademy.bebidas.controller;

import br.com.tiacademy.bebidas.core.crud.CrudController;
import br.com.tiacademy.bebidas.dto.request.SucoDtoRequest;
import br.com.tiacademy.bebidas.entity.Distribuidora;
import br.com.tiacademy.bebidas.entity.Suco;
import br.com.tiacademy.bebidas.repository.DistribuidoraRepository;
import br.com.tiacademy.bebidas.service.SucoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Objects;

@RestController
@RequestMapping("/sucos")
public class SucoController extends CrudController<Suco, Long> {

    @Autowired
    public SucoService service;
    @Autowired
    public DistribuidoraRepository distribuidoraRepository;

    @PostMapping("/{distribuidoraId}")
    public ResponseEntity<Object> save(@RequestBody SucoDtoRequest sucoDto, @PathVariable("distribuidoraId") Long distribuidoraId) {
        Suco suco = new Suco();

        Distribuidora distribuidora = distribuidoraRepository.findById(distribuidoraId).orElse(null);
        if (Objects.isNull(distribuidora)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("distribuidora informada após /chas/ não existe, crie a distribuidora ou informe um id de distribuidora válido.");
        }
        suco.setNome(sucoDto.getNome());
        suco.setAlcoolico(suco.getAlcoolico());
        suco.setData(sucoDto.getData());
        suco.setDistribuidora(distribuidora);

        return ResponseEntity.ok(service.save(suco));
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