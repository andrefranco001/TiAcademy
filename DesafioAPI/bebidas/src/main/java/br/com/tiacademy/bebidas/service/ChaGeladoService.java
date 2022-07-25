package br.com.tiacademy.bebidas.service;

import br.com.tiacademy.bebidas.core.crud.CrudService;
import br.com.tiacademy.bebidas.domain.ChaGelado;
import org.springframework.stereotype.Service;

@Service
public class ChaGeladoService extends CrudService<ChaGelado, Long> {
    @Override
    protected ChaGelado editName(ChaGelado infos, ChaGelado entity) {
        infos.setNome(entity.getNome());
        infos.setData(entity.getData());
        return infos;
    }

    @Override
    protected ChaGelado setIsAlcoholic(ChaGelado entity) {
        entity.setAlcoolico("Não");
        return entity;
    }
}