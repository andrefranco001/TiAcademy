package br.com.tiacademy.bebidas.service;

import br.com.tiacademy.bebidas.core.crud.CrudService;
import br.com.tiacademy.bebidas.entity.Distribuidora;
import br.com.tiacademy.bebidas.entity.Refrigerante;
import br.com.tiacademy.bebidas.repository.RefrigeranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefrigeranteService extends CrudService<Refrigerante, Long> {

    @Override
    protected Refrigerante editName(Refrigerante infos, Refrigerante entity) {
        infos.setNome(entity.getNome());
        infos.setData(entity.getData());
        return infos;
    }

    @Autowired
    protected RefrigeranteRepository refrigeranteRepository;

    public Refrigerante findByName(String name) {
        return refrigeranteRepository.findByName(name);
    }
}