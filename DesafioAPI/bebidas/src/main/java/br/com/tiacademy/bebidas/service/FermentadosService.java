package br.com.tiacademy.bebidas.service;

import br.com.tiacademy.bebidas.core.crud.CrudService;
import br.com.tiacademy.bebidas.domain.Fermentados;
import org.springframework.stereotype.Service;

@Service
public class FermentadosService extends CrudService<Fermentados, Long> {
    @Override
    protected Fermentados editName(Fermentados infos, Fermentados entity) {
        infos.setNome(entity.getNome());
        infos.setData(entity.getData());
        return infos;
    }

    @Override
    protected Fermentados setIsAlcoholic(Fermentados entity) {
        entity.setAlcoolico("Sim");
        return entity;
    }
}
