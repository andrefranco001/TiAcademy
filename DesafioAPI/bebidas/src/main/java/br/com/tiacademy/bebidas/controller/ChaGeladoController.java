package br.com.tiacademy.bebidas.controller;

import br.com.tiacademy.bebidas.core.crud.CrudController;
import br.com.tiacademy.bebidas.dto.request.ChaGeladoDtoRequest;
import br.com.tiacademy.bebidas.entity.ChaGelado;
import br.com.tiacademy.bebidas.entity.Distribuidora;
import br.com.tiacademy.bebidas.repository.DistribuidoraRepository;
import br.com.tiacademy.bebidas.service.ChaGeladoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Objects;

@RestController
@RequestMapping("/chas")
public class ChaGeladoController extends CrudController<ChaGelado, Long> {

    @Autowired
    public ChaGeladoService service;
    @Autowired
    public DistribuidoraRepository distribuidoraRepository;

    @PostMapping("/{distribuidoraId}")
    public ResponseEntity<Object> save(@RequestBody ChaGeladoDtoRequest chaGeladoDto, @PathVariable("distribuidoraId") Long distribuidoraId) {
       ChaGelado chaGelado = new ChaGelado();

       Distribuidora distribuidora = distribuidoraRepository.findById(distribuidoraId).orElse(null);
        if (Objects.isNull(distribuidora)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("distribuidora informada após /chas/ não existe, crie a distribuidora ou informe um id de distribuidora válido.");
        }
        chaGelado.setNome(chaGeladoDto.getNome());
        chaGelado.setAlcoolico(chaGelado.getAlcoolico());
        chaGelado.setData(chaGeladoDto.getData());
        chaGelado.setDistribuidora(distribuidora);

       return ResponseEntity.ok(service.save(chaGelado));
    }

    @GetMapping("/nome={name}")
    public ResponseEntity<Object> findByName(@PathVariable("name") String name) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findByName(name));
        }
        catch (RuntimeException runtimeException) {
            return ResponseEntity.status(HttpStatus.FOUND).body(service.findAll());
        }

    }
}