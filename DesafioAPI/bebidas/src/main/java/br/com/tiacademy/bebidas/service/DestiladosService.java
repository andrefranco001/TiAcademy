package br.com.tiacademy.bebidas.service;

import br.com.tiacademy.bebidas.core.crud.CrudService;
import br.com.tiacademy.bebidas.domain.Destilados;
import org.springframework.stereotype.Service;

@Service
public class DestiladosService extends CrudService<Destilados, Long> {
    @Override
    protected Destilados editName(Destilados infos, Destilados entity) {
        infos.setNome(entity.getNome());
        infos.setData(entity.getData());
        return infos;
    }

    @Override
    protected Destilados setIsAlcoholic(Destilados entity) {
        entity.setAlcoolico("Sim");
        return entity;
    }
}
