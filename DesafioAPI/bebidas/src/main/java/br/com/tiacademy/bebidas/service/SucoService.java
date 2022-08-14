package br.com.tiacademy.bebidas.service;

import br.com.tiacademy.bebidas.core.crud.CrudService;
import br.com.tiacademy.bebidas.entity.Suco;
import br.com.tiacademy.bebidas.repository.SucoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucoService extends CrudService<Suco, Long> {

    @Override
    protected Suco editName(Suco infos, Suco entity) {
        infos.setNome(entity.getNome());
        infos.setData(entity.getData());
        return infos;
    }

    @Autowired
    protected SucoRepository sucoRepository;

    public Suco findByName(String name) {
        return sucoRepository.findByName(name);
    }
}