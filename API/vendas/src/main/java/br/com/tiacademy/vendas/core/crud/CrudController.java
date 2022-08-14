package br.com.tiacademy.vendas.core.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class CrudController<T extends CrudDomain<ID>, D, ID> {

    @Autowired
    protected CrudService<T, ID> service;

    @Autowired
    protected  CrudConverter<T, D> converter;

    @GetMapping
    public ResponseEntity<Page<D>> paginada(Pageable pageable) {
        Page<D> listaPaginada = service.paginada(pageable).map(converter::entidadeParaDto);
        return ResponseEntity.ok(listaPaginada);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<D>> listar() {

        List<D> listaDto = service.listar().stream()
                .map(converter::entidadeParaDto)
                .collect(Collectors.toList());

        return ResponseEntity.ok(listaDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> porId(@PathVariable("id") ID id) {
        T entidade = service.porId(id);

        if (Objects.isNull(entidade)) {
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok(converter.entidadeParaDto(entidade));
        }
    }

    @PostMapping
    public ResponseEntity<D> salvar(@RequestBody D dto) {

        T entidade = converter.dtoParaEntidade(dto);
        T salvo = service.criar(entidade);

        ServletUriComponentsBuilder builder = ServletUriComponentsBuilder.fromCurrentRequest();
        URI uri = builder.path("/{id}").buildAndExpand(salvo.getId()).toUri();

        return ResponseEntity.created(uri).body(converter.entidadeParaDto(salvo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> editar(@PathVariable("id") ID id, @RequestBody D dto){

        T novaEntidade = converter.dtoParaEntidade(dto);
        T salvo = service.editar(id, novaEntidade);

        return ResponseEntity.ok(converter.entidadeParaDto(salvo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") ID id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
