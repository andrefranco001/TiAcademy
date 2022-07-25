package br.com.tiacademy.bebidas.service;

import br.com.tiacademy.bebidas.core.crud.CrudService;
import br.com.tiacademy.bebidas.domain.Refrigerantes;
import org.springframework.stereotype.Service;

@Service
public class RefrigerantesService extends CrudService<Refrigerantes, Long> {
    @Override
    protected Refrigerantes editName(Refrigerantes infos, Refrigerantes entity) {
        infos.setNome(entity.getNome());
        infos.setData(entity.getData());
        return infos;
    }

    @Override
    protected Refrigerantes setIsAlcoholic(Refrigerantes entity) {
        entity.setAlcoolico("Não");
        return entity;
    }
}
