package br.com.tiacademy.bebidas.service;

import br.com.tiacademy.bebidas.core.crud.CrudService;
import br.com.tiacademy.bebidas.entity.Distribuidora;
import br.com.tiacademy.bebidas.repository.DistribuidoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistribuidoraService extends CrudService<Distribuidora, Long> {

    @Override
    protected Distribuidora editName(Distribuidora infos, Distribuidora entity) {
        infos.setNome(entity.getNome());
        return infos;
    }

    @Autowired
    public DistribuidoraRepository repository;

    public Distribuidora findByName(String nome) {
        return repository.findByName(nome);
    }
}