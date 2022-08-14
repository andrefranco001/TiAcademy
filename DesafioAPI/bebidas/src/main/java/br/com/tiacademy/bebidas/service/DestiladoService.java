package br.com.tiacademy.bebidas.service;

import br.com.tiacademy.bebidas.core.crud.CrudService;
import br.com.tiacademy.bebidas.entity.Destilado;
import br.com.tiacademy.bebidas.repository.DestiladoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DestiladoService extends CrudService<Destilado, Long> {
    @Override
    protected Destilado editName(Destilado infos, Destilado entity) {
        infos.setNome(entity.getNome());
        infos.setData(entity.getData());
        return infos;
    }

    @Autowired
    protected DestiladoRepository destiladoRepository;


    public Destilado findByName(String name) {
        return destiladoRepository.findByName(name);
    }
}