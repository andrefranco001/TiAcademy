package br.com.tiacademy.bebidas.service;

import br.com.tiacademy.bebidas.core.crud.CrudService;
import br.com.tiacademy.bebidas.domain.Sucos;
import org.springframework.stereotype.Service;

@Service
public class SucosService extends CrudService<Sucos, Long> {
    @Override
    protected Sucos editName(Sucos infos, Sucos entity) {
        infos.setNome(entity.getNome());
        infos.setData(entity.getData());
        return infos;
    }

    @Override
    protected Sucos setIsAlcoholic(Sucos entity) {
        entity.setAlcoolico("Não");
        return entity;
    }
}
